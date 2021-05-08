package padrao;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class App {
	static public int menu() {
		return Integer.parseInt(JOptionPane.showInputDialog(
				"1. Adicionar\n" + "2. Retirar\n" + "3. Consultar\n" + "4. Modificar\n" + "5. Sair\n" + "Digite:"));
	}

	public static void main(String[] args) {
		Lista lista = new Lista(retornaInteiro("Insira o tamanho da fila !!"));
		int n;
	    
	    //switch para o menu
		do {
			n = menu(); // recebe o valor do menu
			switch (n) {
			case 1:
				if (lista.enfileira(lista.addItem())) {
					JOptionPane.showMessageDialog(null, "Sucesso!");
				} else
					JOptionPane.showMessageDialog(null, "Lista cheia");
				break;

			// retirar e consultar pede novamente descrição, quantidade e prioridade //
			// não retira e não faz consulta //

			case 2: // bug
				
				if (lista.desenfileira()==null) {
					JOptionPane.showMessageDialog(null, "Insucesso!");
				} else {
					JOptionPane.showMessageDialog(null, "Item retirado com sucesso !!");
					
				}
				break;
			case 3: // bug
				Item novo;
				if ((novo = lista.verificaItem()) == null) {
					JOptionPane.showMessageDialog(null, "Insucesso!");
					
				}
				else
					JOptionPane.showMessageDialog(null, novo.getItem());
				break;

			case 4:
				if (!lista.modificarItem(lista.verificaItem()))
					JOptionPane.showMessageDialog(null, "Voce Cancelou a operação !!");
				else
					JOptionPane.showMessageDialog(null, "Modificado com Sucesso !!");
				break;
			case 5:
				try {
					desligando();
					System.exit(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		} while (n != 5);
	}
	public static int retornaInteiro(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));
		
	}
	public static void desligando() throws InterruptedException {
		JFrame oi = null;
		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(5, 1, 0, 0));
		String comp[]= new String[] {"Vejo"," Voce "," Em "," Uma "," Proxima?"};
		for (int i = 4; i > 0; i--) {
			JLabel lbl = new JLabel();
			oi = new JFrame();
			lbl.setText("" + i);
			lbl.setHorizontalAlignment(SwingConstants.CENTER);
			lbl.setFont(new Font("Ubuntu", Font.BOLD, 50));
			oi.add(lbl);
			oi.setSize(200, 200);
			oi.setVisible(true);
			oi.setLocationRelativeTo(null);
				Thread.sleep(1000);
			oi.dispose();
			oi.remove(lbl);
		}
		oi.setFont(new Font("Ubuntu", Font.BOLD, 12));
		for (int i = 0; i < comp.length; i++) {
			JLabel lbl2= new JLabel();
			lbl2.setText(comp[i]);
			lbl2.setHorizontalAlignment(SwingConstants.CENTER);
			painel.add(lbl2);
		}
		oi.add(painel);
		oi.setVisible(true);
			Thread.sleep(5000);
		}
}
