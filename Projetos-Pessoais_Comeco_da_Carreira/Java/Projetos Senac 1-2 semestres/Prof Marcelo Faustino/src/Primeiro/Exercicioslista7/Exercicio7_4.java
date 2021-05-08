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
public class Exercicio7_4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws InterruptedException {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Exercicio7_4 frame = new Exercicio7_4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});}

	/**
	 * Create the frame.
	 */
	public Exercicio7_4() {
		setTitle("Rodolfo.exe \uD83D\uDE0E");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 29, 597, 261);
		contentPane.add(scrollPane);
		
		JTextArea txt1 = new JTextArea();
		scrollPane.setViewportView(txt1);
		txt1.setRows(10);
		txt1.setText("Tokio contem motocicletas = 55.000\r\nAp de gyn contem motocicletas = 1.500\r\r\nTaxa de crescimento = 0,5% a.m. para Tokio e 0,89% a.m. para Aparecida de Goi\u00E2nia");
		txt1.setLineWrap(true);
		
		
		JButton btn = new JButton("Calcular");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String l = "", txt;
				int anos = 0, meses=0,mesescom = 1;
				double totalap, totalto, soma, mototok=55000, motoap=1500;
				float jurostok=0.005f, jurosap=0.0089f;
				DecimalFormat d= new DecimalFormat("#.##");
				JOptionPane.showMessageDialog(null, "Este programa ira calcular em quantos anos sera superada o numero de motocicletas em Tokio por Aparecida de Goiania !!");
				while (motoap<mototok) {
					mototok += ((jurostok)*mototok);
					motoap += ((jurosap)*motoap);
					meses++;
					mesescom++;
					anos=(meses/12);
					if(mesescom==13) {
						mesescom=1;						
					}
					txt=("Em quanto em tokio tem: "+d.format(mototok)+" Em Aparecida Existem:"+d.format(motoap)+" No ano: "+anos+" Mes, n: "+mesescom+"\n\n");
					l+=txt;
						}
				JOptionPane.showMessageDialog(null, "No ano numero: "+anos+" Aparecida superou Tokio em numero de motocicletas, Tokio: "+mototok+" Aparecida: "+motoap+"\n\n");
				txt1.setText(l);
				}
			});
		btn.setBounds(270, 301, 108, 40);
		contentPane.add(btn);
		
		JLabel lblDados = new JLabel("Dados");
		lblDados.setBounds(289, 11, 46, 14);
		contentPane.add(lblDados);

	
	}	
}