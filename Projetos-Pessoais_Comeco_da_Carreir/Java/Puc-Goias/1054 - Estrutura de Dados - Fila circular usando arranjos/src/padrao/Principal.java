package padrao;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Principal {
	static Fila fila;
	static Celula x;

	public static void main(String[] args) {
		int n;
		fila = new Fila(Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho da lista: ")));
		do {
			switch (n = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione sua opcao:\n1- Enfileirar um elemento.\n2- Desenfileirar.\n3- Imprimi lista de elemento.\n4- Sair do Programa."))) {
			case 1: {
				if (fila.enfileira(retornaElemeneto()) == false) {
					information("Seu item não foi inserido a lista, Sua lista esta cheia !!");
				} else
					information("Inserido com sucesso !! ");

				break;
			}
			case 2: {
				if ((x = fila.desenfileira()) != null) {
					information(x.toString());
				} else {
					information("Sua lista esta vazia, tente adicionar itens !!");
				}
				x = null;
				break;
			}
			case 3: {
				information("Itens Enfileirados:\n" + fila.imprime());
				break;
			}
			case 4: {
				try {
					desligando();
				} catch (InterruptedException e) {
					information("Nao foi possivel finalizar normalmente o seu programa !!");
				}
				System.exit(0);

			}
			default:
				information("As opcões validas são apenas as que serão mostradas a seguir !!");
				break;
			}
		} while (true);

	}

	static private Celula retornaElemeneto() {
		return new Celula(JOptionPane.showInputDialog("Insira o nome para o elemento: "),
				Integer.parseInt(JOptionPane.showInputDialog("Insira a chave do elemento: ")));
	}

	public static void information(String message) {
		JOptionPane.showMessageDialog(null, message);

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