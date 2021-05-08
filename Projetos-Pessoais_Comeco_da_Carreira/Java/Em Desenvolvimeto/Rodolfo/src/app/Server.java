package app;

import java.net.*;
import java.io.*;
import java.util.Vector;

public class Server {
	private static byte[] dadosCifradosTodos;
	private static byte[] dadosCifradosTodosarq;
	private static ServerSocket clienteEnvia;
	private static ServerSocket clienteenviaarq;
	private static ServerSocket clienterecebearq;
	private static ServerSocket clienteRecebe;
	private static Vector<DataOutputStream> clientes = new Vector<DataOutputStream>();
	private static Vector<DataOutputStream> clientesarq = new Vector<DataOutputStream>();
	private static DataOutputStream socketError;
	private static DataOutputStream socketErrorarq;

	private static void envia(DataOutputStream me) {
		try {
			// Recebe msg do cliente e replica para todos os outros
			// INICIO
			int i = 0;
			while (i < clientes.size()) {
				DataOutputStream saida = clientes.get(i);

				socketError = saida;
				saida.writeInt(dadosCifradosTodos.length);
				saida.write(dadosCifradosTodos);
				saida.flush();
				i++;
			}
			// FIM
		} catch (IOException e) {
			// Caso algum cliente saida, ele remove o socket do mesmo
			int i = clientes.indexOf(socketError);
			DataOutputStream saida = clientes.get(i);
			while (i < clientes.size()) {
				if (me != saida) {
					try {
						saida.writeInt(dadosCifradosTodos.length);
						saida.write(dadosCifradosTodos);
					} catch (IOException a) {
					}
				}
				i++;
			}
			clientes.removeElement(socketError);
		}
	}

	private static void enviaarq(DataOutputStream me) {
		try {
			// Recebe msg do cliente e replica para todos os outros
			// INICIO
			int i = 0;
			DataOutputStream saida = clientesarq.get(i);
			while (i < clientesarq.size()) {
				

				socketErrorarq = saida;
				saida.writeInt(dadosCifradosTodosarq.length);
				saida.write(dadosCifradosTodosarq);
				saida.flush();
				i++;
			}
			saida.close();
			// FIM
		} catch (IOException e) {
			// Caso algum cliente saida, ele remove o socket do mesmo
			int i = clientesarq.indexOf(socketErrorarq);
			while (i < clientesarq.size()) {
				DataOutputStream saida = clientes.get(i);
				try {
					saida.writeInt(dadosCifradosTodosarq.length);
					saida.write(dadosCifradosTodosarq);
				} catch (IOException a) {
				}

				i++;
			}
			clientesarq.removeElement(socketError);
		}
	}

	public static void main(String[] args) throws Exception {
		// Recebe as conexoes
		clienteEnvia = new ServerSocket(8888);
		clienteRecebe = new ServerSocket(8889);
		clienteenviaarq = new ServerSocket(8887);
		clienterecebearq = new ServerSocket(8886);

		Runnable cliente = new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						System.out.println("Aguardando conexoes.. ");
						Socket conexao1 = clienteEnvia.accept();
						Socket conexao2 = clienteRecebe.accept();
						Socket conexao3 = clienteenviaarq.accept();
						Socket conexao4 = clienterecebearq.accept();
						clientes.addElement(new DataOutputStream(conexao2.getOutputStream()));
						clientesarq.addElement(new DataOutputStream(conexao4.getOutputStream()));
						DataOutputStream msg = clientes.get(clientes.size() - 1);
						DataOutputStream msgarq = clientesarq.get(clientesarq.size() - 1);
						System.out.println("Cliente Conectado " + conexao1.getInetAddress() + ", " + conexao1.getPort()
								+ ", " + conexao2.getPort() + ", " + conexao3.getPort() + ", " + conexao4.getPort());

						Runnable recebe = new Runnable() {
							@Override
							public void run() {
								try {
									while (true) {
										DataInputStream entrada = new DataInputStream(conexao1.getInputStream());
										int tamanho = entrada.readInt();
										if (tamanho > 0) {
											byte[] dadosCifrados = new byte[tamanho];
											entrada.readFully(dadosCifrados, 0, dadosCifrados.length);
											dadosCifradosTodos = dadosCifrados;
											envia(msg);
										}

									}

								} catch (Exception e) {
								}
							}
						};

						Thread rec = new Thread(recebe);
						rec.start();

						Runnable recebearq = new Runnable() {
							@Override
							public void run() {
								try {
									while (true) {
										DataInputStream arquivo = new DataInputStream(conexao3.getInputStream());
										int tamanhoarq = arquivo.readInt();
										if (tamanhoarq > 0) {
											byte[] dadosCifradosarq = new byte[tamanhoarq];
											arquivo.readFully(dadosCifradosarq, 0, dadosCifradosarq.length);
											dadosCifradosTodosarq = dadosCifradosarq;
											enviaarq(msgarq);
										}

									}

								} catch (Exception e) {
								}
							}
						};

						Thread recarq = new Thread(recebearq);
						recarq.start();

					} catch (Exception e) {
						System.out.println(e);
					}
				}
			}
		};

		Thread cli = new Thread(cliente);
		cli.start();
	}
}