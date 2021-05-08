package exerc1;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Pessoa {
	private String nome, dataNascimento, altura;
	private int idade;
	private int[] dataAtual = new int[3];
	GregorianCalendar data = new GregorianCalendar();
	SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getAltura() {
		return altura;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public Pessoa returnDate(Pessoa p) {
		JOptionPane.showMessageDialog(null, "Vamos Começar o Calculo da sua idade? ");
		p.setNome(JOptionPane.showInputDialog(null, "Insira seu Nome: "));
		p.setAltura(JOptionPane.showInputDialog(null, "Insira sua Altura: "));
		p.setDataNascimento(JOptionPane.showInputDialog(null, "Formato,DD/MM/YYYY --- Insira sua Data De Nascimento:"));
		return p;

	}

	public int retornaIdade(String dataNascimento) throws IOException {
		String dataAtual[] = fmt.format(data.getTime()).split("/");
		String dataUser[] = dataNascimento.split("/");
		this.idade += ((Integer.parseInt(dataAtual[2]) - 1) - (Integer.parseInt(dataUser[2])));
		if (Integer.parseInt(dataAtual[1]) == Integer.parseInt(dataUser[1])) {
			JOptionPane.showMessageDialog(null, "Engraçado, pelos meus calculos, voce faz aniversario esse mes !!");
			JOptionPane.showMessageDialog(null, "Vamos conferir o dia agora, ok!?");
			if (Integer.parseInt(dataAtual[0]) == Integer.parseInt(dataUser[0])) {
				JOptionPane.showMessageDialog(null,
						"Parabens voce esta fazendo aniversario hoje, Congratulations My Friend !!");

				congratulations();

			} else if (Integer.parseInt(dataUser[0]) < Integer.parseInt(dataAtual[0])) {
				JOptionPane.showMessageDialog(null,
						"Parabens voce esta fazendo aniversario esse Mes mas ainda nao chegou o dia faltam: "
								+ (Integer.parseInt(dataAtual[0]) - Integer.parseInt(dataUser[0]))
								+ " dias, Congratulations My Friend !!");
				this.idade--;
			} else
				JOptionPane.showMessageDialog(null,
						"Parabens voce esta fazendo aniversario esse Mes mas ja passou, por: "
								+ (Integer.parseInt(dataUser[0]) - Integer.parseInt(dataAtual[0]))
								+ " dias, Congratulations My Friend !!");
			this.idade++;
		}

		return idade;

	}

	public void congratulations() throws IOException {

		ImageIcon image = new ImageIcon(System.getProperty("user.dir") + "\\Biblioteca\\congratulations.jpg");
		JLabel lbl = new JLabel(image);
		JFrame oi = new JFrame();
		oi.add(lbl);
		oi.setSize(image.getIconWidth(), image.getIconHeight());
		oi.setVisible(true);
		oi.setLocationRelativeTo(null);
	}

	public void sound() throws IOException {
		// FileInputStream som = new FileInputStream("\\Biblioteca\\som.mp3");
		// player
		// Runtime.getRuntime().exec(som);

		/*
		 * javax.sound.sampled.AudioInputStream; javax.sound.sampled.AudioSystem;
		 * javax.sound.sampled.Clip;
		 * 
		 * String resource = "./sound/battle.wav"; inputStream input =
		 * getclass().getresourceasStream(resource); clip oclip = audiosystem.getclp();
		 * audioinputStream audioinput = audioSystem.getaudioinputStream(input);
		 * oclip.open(audioinput); oclip.loop(0); //tocar uma vez
		 */
	}

}
