package padrao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	static Scanner leia = new Scanner(System.in);

	public static Item obtemItem(int n) {
		if(n==0) {
			return new Item(retornaString("Insira uma Descrição: "), retornaInt("Quantidade de itens a inserir: "),
					retornaInt("Inserir a prioridade do Item(s): "));
		}
		else if(n==1) {
			return new Item(retornaString("Insira uma Descrição: "));
		}
		return null;
		
	}

	public static int menu() {
		return retornaInt(
				"Digite:\n1 - para adicionar um item.\n2 - para remover um item.\n3 - para pesquisar um item.\n4 - para imprimir a lista.\n5 - para encerrar o programa.");
	}

	public static void main(String[] args) {

		Lista lista = new Lista();

		int n;

		Item novo = null;
		do {
			switch (n = menu()) {

			case 1:
				lista.adicionaOrdenado(obtemItem(0));
				information("Lista com " + lista.getTam() + " itens.");
				break;

			case 2:

				if ((novo = lista.retira(obtemItem(1))) != null)
					information("Voce deletou:\n"+novo.toString());
				information("Lista " + lista.getTam() + " itens.");
				
				break;
			case 3:

				if ((novo = lista.busca(obtemItem(1))) == null)
					information("Erro!");

				else
					information(novo.toString());

				information("Lista " + lista.getTam() + " itens.");
				break;

			case 4:
				information("Lista " + lista.getTam() + " itens.");
				information(lista.imprima());
				break;

			case 5:
				information("Lista com " + lista.getTam() + " itens.\nPrograma encerrando!");

			} // fim switc() … case

		} while (n != 5); // fim do .. while

	} // fim da função main

	public static String retornaString(String message) {
		return JOptionPane.showInputDialog(message);
	}

	public static int retornaInt(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}

	public static void information(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
} // fim classe Main
