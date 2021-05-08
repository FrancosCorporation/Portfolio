package padrao;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		UtilizandoVetores x = new UtilizandoVetores();
		String[] lista = new String[] { "wilson","rodolfo","Yago", "ana", "raquel", "sonia" };
		do {
			lista = x.listaOrdenada(lista, JOptionPane.showInputDialog("Insira um nome para inserir na lista !!"));
		} while (Integer.parseInt(
				JOptionPane.showInputDialog("Digite 0 para sair ou qualquer outro numero para continuar !!")) != 0);
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

}
