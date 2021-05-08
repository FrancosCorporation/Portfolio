package exerc2;

import javax.swing.JOptionPane;

public class FuncaoPrincipal {

	public static void main(String[] args) {

		AdivinhaNumero jogo = new AdivinhaNumero();
		int i, n = 5;
		for (i=0; i < n; i++) {
			if(jogo.dica(Integer.parseInt(JOptionPane.showInputDialog("Tente acertar o numero.\nInsira o numero: ")))==true) {
				break;
			}

		}
		JOptionPane.showMessageDialog(null, "O numero era: "+jogo.getNumero());

	}

}
