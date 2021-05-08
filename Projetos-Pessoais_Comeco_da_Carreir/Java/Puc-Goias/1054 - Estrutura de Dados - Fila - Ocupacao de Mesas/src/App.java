import javax.swing.JOptionPane;

/*
 * Escreva um programa em Java para gerenciar um sistema de reservas de mesas numa casa de Shows. 
 * A casa possui 100 mesas de 6 lugares cada uma, numeradas de 1 a 100. 
 * O programa devera permitir que o usuário escolha o código de uma mesa e forneça a quantidade de lugares desejados. 
 * O programa devera informar se foi possível realizar e atualizar a reserva, 
 * informando "reserva realizada com sucesso" ou "não há lugares suficiente na mesa pretendida".
 * O programa devera encerrar quando for digitado o código 0 ( zero ) para uma mesa ou quando todos os 600 lugares já estiverem reservados.
 * 
 */
public class App {

	public static void main(String[] args) {
		Casa c = new Casa();

		int mesa = -1; 
		int lugares;

		do {
			try {
				mesa = Integer.parseInt(JOptionPane.showInputDialog("Qual mesa deseja reservar (entre 1 a "+c.getQuantMesas()+"):"));
				if (mesa == 0) {
					JOptionPane.showMessageDialog(null, "Fim do Programa");
					continue;
				}
				lugares = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cadeiras: (entre 1 a 6)"));

				if (c.reservar(mesa, lugares)) {
					JOptionPane.showMessageDialog(null, "Mesa " + mesa + " com " + lugares + " lugares reservados.");
				}
							else {
					JOptionPane.showMessageDialog(null, "Lugares indisponível");
				}

			} catch (NumberFormatException nfex) {
				JOptionPane.showMessageDialog(null, "Insira a quantidade de cadeiras (entre 1 a 6");
			}

		} while (mesa != 0);
	}

}
