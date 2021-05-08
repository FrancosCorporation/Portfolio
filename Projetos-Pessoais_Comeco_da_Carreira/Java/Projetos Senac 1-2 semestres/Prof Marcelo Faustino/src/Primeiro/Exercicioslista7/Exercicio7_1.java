package Exercicioslista7;

import java.awt.BorderLayout;
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

public class Exercicio7_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio7_1 frame = new Exercicio7_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});}

	/**
	 * Create the frame.
	 */
	public Exercicio7_1() {
		setTitle("Rodolfo.exe \uD83D\uDE0E");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt = new JTextField();
		txt.setText("0");
		txt.setHorizontalAlignment(SwingConstants.CENTER);
		txt.setBounds(182, 30, 71, 20);
		contentPane.add(txt);
		txt.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 59, 414, 145);
		contentPane.add(scrollPane);
		
		JTextArea txt1 = new JTextArea();
		scrollPane.setViewportView(txt1);
		txt1.setRows(10);
		txt1.setText("Insira um numero para que seja calculado os numeros pares inferiores a ele e seja mostrados na tela !!");
		txt1.setLineWrap(true);
		
		
		JButton btn = new JButton("Calcular");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n;
				String contagem = "";
				n = Integer.parseInt(txt.getText());
			while(n<=1) {	
				JOptionPane.showMessageDialog(null, "Voce digitou um valor menor que o permitido, insira um valor acima de 1.", "", JOptionPane.ERROR_MESSAGE);
				return;
			}
                while (n>=2) {
                	if((n%2)==0) {
                	contagem += n +"\n";
                	n+=-2;}
                	if ((n%2)==1) {
                		n--;
                	}
                txt1.setText(contagem);}
		}});
		btn.setBounds(163, 210, 108, 40);
		contentPane.add(btn);
	
	}	
}