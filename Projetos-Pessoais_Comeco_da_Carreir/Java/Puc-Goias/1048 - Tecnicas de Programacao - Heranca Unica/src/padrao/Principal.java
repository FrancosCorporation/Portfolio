package padrao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {
	static List<ContaPoupanca> bancoDeClientes = new ArrayList<ContaPoupanca>();
	public static void main(String[] args) {
		int n;
		
		while (4> (n = Integer.parseInt(JOptionPane.showInputDialog(
				"Insina a Opcao:\n1- Inserir novo cliente.\n2- Buscar pelo CPF.\n3- Fazer deposito.\n4- sair do programa.")))||n<0) {
			if (n == 1) {
				ContaPoupanca contaNova= new ContaPoupanca(bancoDeClientes.size()+1,"go");
				contaNova.setCliente(retornaString("Insira o CPF da pessoa a ser adicionada: "), retornaString("Insira o nome da pessoa: "), retornaString("Insira o telefone da pessoa: "));
				bancoDeClientes.add(contaNova);
			} else if (n == 2) {
				ContaPoupanca contausada;
				String tela="";
					if((contausada=retornaConta(retornaString("Insira o CPF a pesquisa: ")))!=null) {
						tela +="Nome: "+contausada.getCliente().getNome()+"\nTelefone: "+contausada.getCliente().getTelefone()+"\nAgencia: "+contausada.getAgencia()+"\nConta Corrente N: "+contausada.getcontaCorrente();
						JOptionPane.showMessageDialog(null, tela);
						contausada.verLucro();
					}
					else
						information("Conta nao encontrada !! ");
			} else if (n == 3) {
				ContaPoupanca contausada;
				if((contausada=retornaConta(retornaString("Insira o CPF a pesquisa: ")))!=null) {
					contausada.depositar(retornaFloat("Insira o valor do deposito: "));
					contausada.setDiaDeposito(retornaInt("Insira o dia do deposito: "));
				}
				else
					information("Conta nao encontrada !!");

			}
		}
		JOptionPane.showMessageDialog(null, "Vejo Voce Em Uma Proxima.");
	}
	public static String retornaString(String message) {
		return JOptionPane.showInputDialog(message);
		
	}
	public static float retornaFloat(String message) {
		return Float.parseFloat(JOptionPane.showInputDialog(message).replace(",", "."));
		
	}
	public static int retornaInt(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));
		
	}
	public static ContaPoupanca retornaConta(String cpf) {
		for (int i = 0; i < bancoDeClientes.size(); i++) {
			if(bancoDeClientes.get(i).getCliente().getCpf().equalsIgnoreCase(cpf)) {
				return bancoDeClientes.get(i);
			}
		}
		return null;
		
	}
	public static void information(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
}
