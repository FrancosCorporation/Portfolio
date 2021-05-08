package FrontEnd;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import Logica.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NewFrontEnd extends JFrame {

	private JPanel contentPane;
	private JTextField txtBinario;
	private JTextField txtOctal;
	private JTextField txtDecimal;
	private JTextField txtHexadecimal;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPane.showMessageDialog(null, "Este programa ira converter as bases !!");
					NewFrontEnd frame = new NewFrontEnd();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public NewFrontEnd() {
		setTitle("Conversao de bases");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtBinario = new JTextField();
		txtBinario.setFont(new Font("Arial Black", Font.PLAIN, 20));
		txtBinario.setEditable(false);
		txtBinario.setHorizontalAlignment(SwingConstants.CENTER);
		txtBinario.setText("Binario");
		txtBinario.setBounds(24, 10, 200, 50);
		contentPane.add(txtBinario);
		txtBinario.setColumns(10);

		txtOctal = new JTextField();
		txtOctal.setText("Octal");
		txtOctal.setHorizontalAlignment(SwingConstants.CENTER);
		txtOctal.setFont(new Font("Arial Black", Font.PLAIN, 20));
		txtOctal.setEditable(false);
		txtOctal.setColumns(10);
		txtOctal.setBounds(24, 70, 200, 50);
		contentPane.add(txtOctal);

		txtDecimal = new JTextField();
		txtDecimal.setText("Decimal");
		txtDecimal.setHorizontalAlignment(SwingConstants.CENTER);
		txtDecimal.setFont(new Font("Arial Black", Font.PLAIN, 20));
		txtDecimal.setEditable(false);
		txtDecimal.setColumns(10);
		txtDecimal.setBounds(24, 125, 200, 50);
		contentPane.add(txtDecimal);

		txtHexadecimal = new JTextField();
		txtHexadecimal.setText("Hexadecimal");
		txtHexadecimal.setHorizontalAlignment(SwingConstants.CENTER);
		txtHexadecimal.setFont(new Font("Arial Black", Font.PLAIN, 20));
		txtHexadecimal.setEditable(false);
		txtHexadecimal.setColumns(10);
		txtHexadecimal.setBounds(24, 182, 200, 50);
		contentPane.add(txtHexadecimal);

		JTextArea Octalcampo = new JTextArea();

		Octalcampo.setFont(new Font("Monospaced", Font.PLAIN, 15));
		Octalcampo.setLineWrap(true);
		Octalcampo.setBounds(255, 70, 321, 50);
		contentPane.add(Octalcampo);

		JTextArea Binariocampo = new JTextArea();

		Binariocampo.setFont(new Font("Monospaced", Font.PLAIN, 15));
		Binariocampo.setLineWrap(true);
		Binariocampo.setBounds(255, 10, 321, 50);
		contentPane.add(Binariocampo);
		JTextArea Decimalcampo = new JTextArea();

		Decimalcampo.setFont(new Font("Monospaced", Font.PLAIN, 15));
		Decimalcampo.setLineWrap(true);
		Decimalcampo.setBounds(255, 125, 321, 50);
		contentPane.add(Decimalcampo);

		JTextArea Hexadecimalcampo = new JTextArea();

		Hexadecimalcampo.setFont(new Font("Monospaced", Font.PLAIN, 15));
		Hexadecimalcampo.setLineWrap(true);
		Hexadecimalcampo.setBounds(255, 182, 321, 50);
		contentPane.add(Hexadecimalcampo);

		Binariocampo.addKeyListener(new KeyAdapter() {
			// neste local ele fica escutando o campo binario, quando o usuario digita ele
			// joga esse texto primeiramente na funcao designada para o campo como esse no
			// binario
			// ele chama a funcao binario, e seta os valores a partir do campo binario para
			// os outros.
			@Override
			public void keyReleased(KeyEvent e) {
				Logica_1 lg = new Logica_1();
				// funcao que capta o campo binario
				lg.funcaoBinarioResto(Binariocampo.getText());
				// funcao que puxa da outra classe os valores e seta nos devidos campos
				Decimalcampo.setText(Integer.toString(lg.getDecimal()));
				Hexadecimalcampo.setText(lg.getHexadecimal());
				Octalcampo.setText(lg.getOctal());
			}

		});
		Decimalcampo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Logica_1 lg = new Logica_1();
				lg.funcaoDecimalResto(Decimalcampo.getText());
				Binariocampo.setText(lg.getBinario());
				Hexadecimalcampo.setText(lg.getHexadecimal());
				Octalcampo.setText(lg.getOctal());
			}
		});
		Hexadecimalcampo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Logica_1 lg = new Logica_1();
				lg.funcaoHexadecimalResto(Hexadecimalcampo.getText());
				Binariocampo.setText(lg.getBinario());
				Decimalcampo.setText(Integer.toString(lg.getDecimal()));
				Octalcampo.setText(lg.getOctal());

			}
		});
		Octalcampo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				Logica_1 lg = new Logica_1();
				lg.funcaoOctalResto(Octalcampo.getText());
				Decimalcampo.setText(Integer.toString(lg.getDecimal()));
				Hexadecimalcampo.setText(lg.getHexadecimal());
				Binariocampo.setText(lg.getBinario());
			}
		});

	}
}
