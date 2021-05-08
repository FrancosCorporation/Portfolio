package ExemplosCapitulo11;

import javax.swing.JOptionPane;

public class AssertTest {

	public static void main(String[] args) {
		
		
		JOptionPane.showMessageDialog(null,"Digite um numero entre 0 e 10:");
		int number = Integer.parseInt(JOptionPane.showInputDialog("Insira seu numero: "));
		
		assert (number >= 0 && number <= 10) : "numero errado " + number;
		
		JOptionPane.showMessageDialog(null,"Voce digitou o n " + number);

	}

}
