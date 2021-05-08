package soma;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class calc extends JFrame {
	private JPanel contentPane;
	private JTextField text;
	private JTextField text1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc frame = new calc();
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
	public calc() {
		setTitle("Calculadora de soma");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		text = new JTextField();
		text.setBounds(51, 95, 86, 20);
		contentPane.add(text);
		text.setColumns(10);

		text1 = new JTextField();
		text1.setColumns(10);
		text1.setBounds(205, 95, 86, 20);
		contentPane.add(text1);

		JLabel label = new JLabel("+");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(147, 98, 46, 14);
		contentPane.add(label);
		
		JLabel result = new JLabel("0");
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setBounds(301, 98, 46, 14);
		contentPane.add(result);

		JButton soma = new JButton("=");
		soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1,n2,s;
				n1 = Integer.parseInt(text.getText());
				n2 = Integer.parseInt(text1.getText());
				s = n1 + n2;
				result.setText(Integer.toString(s));
			}
		});

	

		soma.setBounds(130, 161, 89, 23);
		contentPane.add(soma);
	}

}

