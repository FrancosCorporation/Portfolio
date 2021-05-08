

import java.net.*;
import java.io.*;
import java.util.Vector;

public class Server {
    private static byte[] dadosCifradosTodos;
    private static ServerSocket clienteEnvia;
    private static ServerSocket clienteRecebe;
    private static Vector<DataOutputStream> clientes = new Vector<DataOutputStream>(); 
    private static DataOutputStream socketError;

    private static void envia(DataOutputStream me) {
        try{
            //Recebe msg do cliente e replica para todos os outros
            //INICIO
            int i=0;
            while(i < clientes.size()){
                DataOutputStream saida = clientes.get(i);
                
                    socketError=saida;
                    saida.writeInt(dadosCifradosTodos.length);
                    saida.write(dadosCifradosTodos);                    
                
                i++;
            }
            //FIM 
        } catch (IOException e) {
            //Caso algum cliente saida, ele remove o socket do mesmo
            int i = clientes.indexOf(socketError);
            while(i < clientes.size()){
                DataOutputStream saida = clientes.get(i);
                if(me != saida){
                    try{
                        saida.writeInt(dadosCifradosTodos.length);
                        saida.write(dadosCifradosTodos);
                    } catch (IOException a){}                    
                }
                i++;
            }
            clientes.removeElement(socketError);
        }
    }


    public static void main(String[] args) throws Exception {
        //Recebe as conexoes
        clienteEnvia = new ServerSocket(8888);
        clienteRecebe = new ServerSocket(8889);

        Runnable cliente = new Runnable(){     
            @Override
            public void run() {
                while(true){
                    try{
                        System.out.println("Aguardando conexoes.. ");
                        Socket conexao1 = clienteEnvia.accept();
                        Socket conexao2 = clienteRecebe.accept();
                        clientes.addElement(new DataOutputStream(conexao2.getOutputStream()));
                        DataOutputStream meDOS = clientes.get(clientes.size()-1);
                        System.out.println("Cliente Conectado "+conexao1.getInetAddress()+", "+conexao1.getPort()+", "+conexao2.getPort());   

                        Runnable recebe = new Runnable(){                            
                            @Override
                            public void run() {
                                try{
                                    while(true){
                                        DataInputStream entrada = new DataInputStream(conexao1.getInputStream());
                                        int tamanho = entrada.readInt();
                                        if (tamanho > 0) {
                                            byte[] dadosCifrados = new byte[tamanho];                            
                                            entrada.readFully(dadosCifrados, 0, dadosCifrados.length);    
                                            dadosCifradosTodos = dadosCifrados;
                                            envia(meDOS);
                                        }
                                    }
                                } catch (Exception e){}
                            }
                        };

                        Thread rec = new Thread(recebe);
                        rec.start();

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