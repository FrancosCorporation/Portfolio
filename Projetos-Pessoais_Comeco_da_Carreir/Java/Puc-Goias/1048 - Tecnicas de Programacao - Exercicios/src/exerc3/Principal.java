package exerc3;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[]args) {
		Lampada lp = new Lampada(false);
		JOptionPane.showMessageDialog(null, lp.getStatus());
		Lampada lp1 = new Lampada(true);
		JOptionPane.showMessageDialog(null, lp1.getStatus());
	}
}
