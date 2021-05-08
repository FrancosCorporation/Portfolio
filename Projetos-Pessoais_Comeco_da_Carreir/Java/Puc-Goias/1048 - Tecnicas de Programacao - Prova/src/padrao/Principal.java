package padrao;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Principal {
	static ArrayList<Produto> book= new ArrayList<Produto>();
	static ArrayList<Produto> Cd= new ArrayList<Produto>();
	static ArrayList<Produto> Dvd= new ArrayList<Produto>();
	public static void main(String[] args) {
		
		int n;
		do {
			switch (n = Integer.parseInt(JOptionPane.showInputDialog(
					"Selecione sua opcao:\n1- Add Livro.\n2- Add Cd.\n3- Add Dvd.\n4- Listar Produtos.\n9- Sair"))) {
			case 1: {
				book.add(retornaLivro());

				break;
			}
			case 2: {
				Cd.add(retornaCd());
				break;
			}
			case 3: {
				Dvd.add(retornaDvd());
				break;
			}
			case 4: {
				information(retornaListar());

				break;
			}
			case 9: {
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

	public static Livro retornaLivro() {
		return new Livro(retornaString("Insira o autor: "), retornaInt("Insira o N° de paginas: "),
				retornaString("Insira o nome do Livro: "), retornaDouble("Insira o preco de venda:"),
				retornaString("Insira o Status: "));
	}

	public static Cd retornaCd() {
		return new Cd(retornaInt("Insira Qnt de Faixas: "), retornaString("Insira o artista: "),
				retornaString("Insira o nome do Cd: "), retornaDouble("Insira o preco de venda:"),
				retornaString("Insira o Status: "));
	}

	public static Dvd retornaDvd() {
		return new Dvd(retornaBoxes(), retornaInt("Insira a quantidade de horas: "), retornaString("Insira o artista: "),
				retornaString("Insira o nome do Dvd: "), retornaDouble("Insira o preco de venda:"),
				retornaString("Insira o Status: "));
	}

	public static String retornaString(String message) {
		return JOptionPane.showInputDialog(message);

	}

	public static double retornaDouble(String message) {
		return Float.parseFloat(JOptionPane.showInputDialog(message).replace(",", "."));
	}

	public static int retornaInt(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));

	}

	public static ArrayList<Box> retornaBoxes() {
		ArrayList<Box> Boxes = new ArrayList<Box>();
		Box setandoTitulo = new Box();
		String ajuda = "";
		do {
			ajuda = retornaString("Insira o titulo do Box ou 1 para sair: ");
			if (!ajuda.equalsIgnoreCase("1")) {
				setandoTitulo.setTitulo(ajuda);
				Boxes.add(setandoTitulo);
			}
			else
				break;

		} while (true);
		return Boxes;
	}

	public static void information(String message) {
		JOptionPane.showMessageDialog(null, message);

	}
	public static String retornaListar() {
		String ajuda ="";
		
		
		Produto produto = new Produto();
		for (int i = 0; i < book.size(); i++) {
			
			produto = book.get(i);
			Livro livro = Livro.class.cast(produto);
			ajuda+=livro.getLivro()+"\n";
		}
		for (int i = 0; i < Cd.size(); i++) {
			produto= Cd.get(i);
			Cd cdnovo = Cd.class.cast(produto);
			ajuda+=cdnovo.getCd()+"\n";
		}
		for (int i = 0; i < Dvd.size(); i++) {
			produto= Dvd.get(i);
			Dvd dvdNovo = Dvd.class.cast(produto);
			ajuda+=dvdNovo.getDvd()+"\n";
		}
		return ajuda;
	}

	public static void desligando() throws InterruptedException {
		JFrame oi = null;
		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(5, 1, 0, 0));
		String comp[] = new String[] { "Vejo", " Voce ", " Em ", " Uma ", " Proxima?" };
		for (int i = 4; i > 0; i--) {
			JLabel lbl = new JLabel();
			oi = new JFrame();
			oi.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
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
