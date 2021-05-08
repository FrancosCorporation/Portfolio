package Class_poo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.Box;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controle_custos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Controle_custos frame = new Controle_custos();
					if(frame.isActive()) {
						frame.requestFocus();
					}
					else {
					frame.setVisible(true);}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Controle_custos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInserir = new JButton("Editar");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInserir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInserir.setBounds(270, 481, 104, 40);
		contentPane.add(btnInserir);
		
		JButton button = new JButton("Inserir");
		Controle_custos2 novo;
		button.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(116, 481, 104, 40);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Delete");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_1.setBounds(424, 481, 104, 40);
		contentPane.add(button_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 10, 990, 461);
		contentPane.add(textArea);
	}
}
