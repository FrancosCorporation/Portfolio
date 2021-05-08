package Exercicioslista7;

import java.awt.BorderLayout;
import java.util.concurrent.TimeUnit;
import java.text.DecimalFormat;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import javax.swing.JScrollPane;
import java.time.*;
import javax.swing.JScrollBar;
public class Exercicio7_3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws InterruptedException {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Exercicio7_3 frame = new Exercicio7_3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});}

	/**
	 * Create the frame.
	 */
	public Exercicio7_3() {
		setTitle("Rodolfo.exe \uD83D\uDE0E");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 11, 470, 209);
		contentPane.add(scrollPane);
		
		JTextArea txt1 = new JTextArea();
		scrollPane.setViewportView(txt1);
		txt1.setRows(10);
		txt1.setText("Valor do ingresso = R$ 6,00\nQuantidades de ingressos = 130\r\nDespesas = R$ 300,00\r\nDiferenca de preco a diminuir = R$ 0,60\r\nDiminuir ate chegar a R$ 1,00");
		txt1.setLineWrap(true);
		
		
		JButton btn = new JButton("Calcular");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String lucro1 = "", txt2;
				long start = System.currentTimeMillis();
				int desp = 300, quantfixa= 130, aumentoing = 30;
				double valoring= 6.00,dif=0.60, lucro;
				DecimalFormat d= new DecimalFormat("#.##");
				lucro=((valoring*quantfixa)-desp);
				JOptionPane.showMessageDialog(null, "Este programa ira calcular se compensa que os precos do ingressos\nsejam abaixados em 0,60 centavos para que seja vendido a mais 30 ingressos");
				while (valoring>=1 & lucro>0) {
						txt2=("O valor do ingresso a: "+d.format(valoring)+" numero de ingressos: "+d.format(quantfixa)+" Tera uma valor de lucro de: "+d.format(lucro));
						lucro=(((valoring-=dif)*(quantfixa+aumentoing))-desp);
						lucro1+= txt2 +"\n" ;
						quantfixa+=aumentoing;
							try {
								Thread.sleep(1000);
								JOptionPane.showMessageDialog(null, "Processando");
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						txt1.setText(lucro1);
						}
				}
			});
		btn.setBounds(197, 223, 108, 40);
		contentPane.add(btn);

	
	}	
}