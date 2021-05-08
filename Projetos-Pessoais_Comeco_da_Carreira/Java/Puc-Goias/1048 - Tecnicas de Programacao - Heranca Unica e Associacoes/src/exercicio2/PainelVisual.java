package exercicio2;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PainelVisual extends JFrame {
	private Pokemon ponyta;
	private Pokemon rapidash;
	private Pokemon picachu;
	private Pokemon raichu;
	private JPanel contentPane;
	private String texto;
	private JTextArea textLuta;

	public static void main(String[] args) {
		new PainelVisual();

	}

	public PainelVisual() {
		new PainelVisual(new Pikachu(), new Raichu(), new Rapidash(), new Ponyta(), "");

	}

	public PainelVisual(Pokemon picachu, Pokemon raichu, Pokemon rapidash, Pokemon ponyta, String texto) {
		this.picachu = picachu;
		this.raichu = raichu;
		this.rapidash = rapidash;
		this.ponyta = ponyta;
		this.texto = texto;
		setTitle("New Game A batalha Pokemon");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 791, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				if (retornapergunta("Deseja Reiniciar a Partida? ", "Restart")) {
					new PainelVisual();
				}
			}
		});

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 394, 757, 97);
		contentPane.add(scrollPane);

		textLuta = new JTextArea();
		scrollPane.setViewportView(textLuta);

		texto += selecionandoFight(gerandoNumeroAleatorio()) + "\n";

		JLabel lblImagemPikachu = new JLabel("Pikachu");
		lblImagemPikachu.setBounds(26, 65, 162, 197);
		lblImagemPikachu.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagemPikachu.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\biblioteca\\Pikachu.png"));
		contentPane.add(lblImagemPikachu);

		JLabel lblImagemPonyta = new JLabel("Ponyta");
		lblImagemPonyta.setBounds(214, 65, 162, 197);
		lblImagemPonyta.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagemPonyta.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\biblioteca\\Ponyta.png"));
		contentPane.add(lblImagemPonyta);

		JLabel lblRaichu = new JLabel("Raichu");
		lblRaichu.setBounds(406, 65, 162, 197);
		lblRaichu.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaichu.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\biblioteca\\Raichu.png"));
		contentPane.add(lblRaichu);

		JLabel lblRapidash = new JLabel("Rapidash");
		lblRapidash.setBounds(603, 65, 162, 197);
		lblRapidash.setHorizontalAlignment(SwingConstants.CENTER);
		lblRapidash.setIcon(new ImageIcon(System.getProperty("user.dir") + "\\biblioteca\\Rapidash.png"));
		contentPane.add(lblRapidash);

		JProgressBar progressBarPikachu = new JProgressBar();
		progressBarPikachu.setMaximum(160);
		int n = picachu.getPontosDeVida();
		if (n < 0) {
			n = 0;
		}
		progressBarPikachu.setValue(n);
		setCorDoForeground(picachu, progressBarPikachu, 160, ponyta.getDano());
		progressBarPikachu.setBounds(10, 307, 183, 37);
		contentPane.add(progressBarPikachu);

		JProgressBar progressBarPonyta = new JProgressBar();
		progressBarPonyta.setMaximum(150);
		int n1 = ponyta.getPontosDeVida();
		if (n1 < 0) {
			n1 = 0;
		}
		progressBarPonyta.setValue(n1);
		setCorDoForeground(ponyta, progressBarPonyta, 150, picachu.getDano());
		progressBarPonyta.setBounds(203, 307, 183, 37);
		contentPane.add(progressBarPonyta);

		JProgressBar progressBarRaichu = new JProgressBar();
		progressBarRaichu.setMaximum(200);
		int n2 = raichu.getPontosDeVida();
		if (n2 < 0) {
			n2 = 0;
		}
		progressBarRaichu.setValue(n2);
		setCorDoForeground(raichu, progressBarRaichu, 200, rapidash.getDano());
		progressBarRaichu.setBounds(396, 307, 183, 37);
		contentPane.add(progressBarRaichu);

		JProgressBar progressBarRapidash = new JProgressBar();
		progressBarRapidash.setMaximum(250);
		int n3 = rapidash.getPontosDeVida();
		if (n3 < 0) {
			n3 = 0;
		}
		progressBarRapidash.setValue(n3);
		setCorDoForeground(rapidash, progressBarRapidash, 250, rapidash.getDano());
		progressBarRapidash.setBounds(589, 307, 183, 37);
		contentPane.add(progressBarRapidash);

		JLabel lblNomePicachu = new JLabel("Picachu");
		lblNomePicachu.setBounds(63, 272, 76, 25);
		lblNomePicachu.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNomePicachu);

		JLabel lblNomePonyta = new JLabel("Ponyta");
		lblNomePonyta.setBounds(256, 272, 76, 25);
		lblNomePonyta.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNomePonyta);

		JLabel lblNomeRaichu = new JLabel("Raichu");
		lblNomeRaichu.setBounds(448, 272, 76, 25);
		lblNomeRaichu.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNomeRaichu);

		JLabel lblNomeRapidash = new JLabel("Rapidash");
		lblNomeRapidash.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeRapidash.setBounds(642, 272, 76, 25);
		contentPane.add(lblNomeRapidash);

		JLabel lblHpPicachu = new JLabel("" + picachu.getPontosDeVida());
		lblHpPicachu.setHorizontalAlignment(SwingConstants.CENTER);
		lblHpPicachu.setBounds(63, 346, 76, 25);
		contentPane.add(lblHpPicachu);

		JLabel lblHpPonyta = new JLabel("" + ponyta.getPontosDeVida());
		lblHpPonyta.setHorizontalAlignment(SwingConstants.CENTER);
		lblHpPonyta.setBounds(256, 352, 76, 25);
		contentPane.add(lblHpPonyta);

		JLabel lblHpRaichu = new JLabel("" + raichu.getPontosDeVida());
		lblHpRaichu.setHorizontalAlignment(SwingConstants.CENTER);
		lblHpRaichu.setBounds(448, 354, 76, 25);
		contentPane.add(lblHpRaichu);

		JLabel lblHpRapidash = new JLabel("" + rapidash.getPontosDeVida());
		lblHpRapidash.setHorizontalAlignment(SwingConstants.CENTER);
		lblHpRapidash.setBounds(642, 354, 76, 25);
		contentPane.add(lblHpRapidash);

		setVisible(true);
		setLocationRelativeTo(null);

		textLuta.setText(texto);
		checkLife();

	}

	public void setCorDoForeground(Pokemon x, JProgressBar progressBarPikachu, int max, int decrement) {
		if (x.getPontosDeVida() <= max) {
			progressBarPikachu.setForeground(Color.green);
			if (x.getPontosDeVida() <= (max -= decrement)) {
				progressBarPikachu.setForeground(Color.yellow);
			}
			if (x.getPontosDeVida() <= (max -= decrement)) {
				progressBarPikachu.setForeground(Color.red);
			}

		}
	}

	public String selecionandoFight(int id) {
		if (id == 1) {

			Ponyta novoPonyta = Ponyta.class.cast(ponyta);
			return novoPonyta.aplicaGolpe(picachu.getNome(), picachu.getDano());

		} else if (id == 2) {

			Rapidash novoRapidash = Rapidash.class.cast(rapidash);
			return novoRapidash.aplicaGolpe(raichu.getNome(), raichu.getDano());

		} else if (id == 3) {

			Pikachu novoPikachu = Pikachu.class.cast(picachu);
			return novoPikachu.aplicaGolpe(ponyta.getNome(), ponyta.getDano());

		} else {
			Raichu novoRaichu = Raichu.class.cast(raichu);
			return novoRaichu.aplicaGolpe(rapidash.getNome(), rapidash.getDano());

		}

	}

	public void checkLife() {
		sleeppp();
		String nome = "";
		if (picachu.getPontosDeVida() <= 0 || raichu.getPontosDeVida() <= 0 || ponyta.getPontosDeVida() <= 0
				|| rapidash.getPontosDeVida() <= 0) {
			if (picachu.getPontosDeVida() <= 0) {
				nome = picachu.getNome();
			} else if (raichu.getPontosDeVida() <= 0) {
				nome = raichu.getNome();
			} else if (ponyta.getPontosDeVida() <= 0) {
				nome = ponyta.getNome();
			} else if (rapidash.getPontosDeVida() <= 0) {
				nome = rapidash.getNome();
			}
			textLuta.setText(
					textLuta.getText() + "\nA batalha foi encerrada !!\n" + nome + " não resistiu a batalha !!");

		} else {
			dispose();
			new PainelVisual(picachu, raichu, rapidash, ponyta, textLuta.getText());
		}

	}

	public boolean retornapergunta(String message, String opcao1) {
		Object[] options = { opcao1, "Cancelar" };
		int op = JOptionPane.showOptionDialog(null, message, "Atenção", JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, options, 0);
		if (op == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int gerandoNumeroAleatorio() {
		return new Random().nextInt(4) + 1;
	}

	public void sleeppp() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			JOptionPane.showMessageDialog(null, "Infelizmente algo saiu errado na checagem de pontos de vida !!");
		}
	}
}
