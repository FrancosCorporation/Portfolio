package classeCarro;

import javax.swing.JOptionPane;

public class ClassePrincipal {
	public static void main(String[] args) {
		Carro fusca = new Carro();
		fusca.setLigado("Desligado");
		int op = 0;
		while (op != 4) {
			op = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Qual opcao deseja ?? \n 1 - Liga - Desliga O carro !!\n 2 - Calibre os Pneus !!\n 3 - Imprima O Status !!\n 4 - Para Sair !!"));
			if (op == 1) {
				if (fusca.getLigado().equals("Ligado")) {
					fusca.setLigado("Desligado");
				} else {
					fusca.setLigado("Ligado");
				}

			} else if (op == 2) {
				fusca.setPneu(Integer
						.parseInt(JOptionPane.showInputDialog(null, "Insira a pressao que deseja nos pneus !!")));

			} else if (op == 3) {
				
				JOptionPane.showMessageDialog(null, "Vamos Verificar os status ok!?");
				JOptionPane.showMessageDialog(null, "O carro esta: "+fusca.getLigado());
				JOptionPane.showMessageDialog(null, "Nivel dos Pneus: "+ fusca.getPneu()[1]);

			} else if (op == 4) {

			} else {
				op = Integer
						.parseInt(JOptionPane.showInputDialog("Voce Digitou uma opcao invalida !! Tente novamente !!"));
			}

		}
	}

}
