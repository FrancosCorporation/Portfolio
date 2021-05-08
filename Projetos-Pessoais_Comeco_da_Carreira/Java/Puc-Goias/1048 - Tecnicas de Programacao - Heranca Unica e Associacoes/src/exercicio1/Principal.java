package exercicio1;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Principal {

	public static void main(String[] args) {
		String menu = "Selecione sua opcao:\n1- Adicionar um Produto.\n2- Ver Produtos.\n3- Consultar Produtos.\n4- Sair do Programa.";
		Mercado superZe = new Mercado(retornaString("Insira o nome do Supermercado !!"));

		do {
			switch (retornaFloat(menu).intValue()) {
			case 1: {
				superZe.addProduto(retornaProduto());
				break;
			}
			case 2: {
				information(superZe.verProdutos());
				break;
			}
			case 3: {
				information(superZe.consulta(retornaString("Insira o nome do produto para consulta: ")));
				break;
			}
			case 4: {
				try {
					desligando();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0); 
				break;
			}
			default:
				information("As opcões validas são apenas as que serão mostradas a seguir !!");
			}

		} while (true);

	}

	public static String retornaString(String message) {
		return JOptionPane.showInputDialog(message);
	}
	
	public static Float retornaFloat(String message) {
		return Float.parseFloat(JOptionPane.showInputDialog(message).replace(",", "."));
		
	}
	
	public static void information(String message) {
		JOptionPane.showMessageDialog(null, message);

	}
	public static Produto retornaProduto() {
		return new Produto(retornaString("Insira o nome do produto: "), retornaFloat("Insira o valor do produto: "));
		
	}

	public static void desligando() throws InterruptedException {
		JFrame oi = null;
		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(5, 1, 0, 0));
		String comp[] = new String[] { "Vejo", " Voce ", " Em ", " Uma ", " Proxima?" };
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
			JLabel lbl2 = new JLabel();
			lbl2.setText(comp[i]);
			lbl2.setHorizontalAlignment(SwingConstants.CENTER);
			painel.add(lbl2);
		}
		oi.add(painel);
		oi.setVisible(true);
		Thread.sleep(5000);
	}

}
