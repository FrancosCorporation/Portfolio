package listaDeChamada;

import javax.swing.JOptionPane;

public class ClassePrincipal {
	public static void main(String[]args) {
		ListaDeChamada oi = new ListaDeChamada();
		oi.setNome1(JOptionPane.showInputDialog("Insira um nome: "));
		oi.setNome2(JOptionPane.showInputDialog("Insira um nome: "));
		//oi
		
		System.out.println(oi.getNome1().toLowerCase().compareTo(oi.getNome2().toLowerCase()));
	}

}
