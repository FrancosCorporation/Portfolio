package painelCentral;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import backEnd.CadastroAdm;
import backEnd.CadastroAnimal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {
	private JPanel contentPane;
	private JTextField txtlogin;
	private JTextField txtsenha;
	private static TelaLogin frame;
	private ArrayList<CadastroAnimal> lista = new ArrayList<CadastroAnimal>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TelaLogin();
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
	public TelaLogin() {
		setTitle("Clina Veterinaria Animal Sensation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 278);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblLogin.setBounds(42, 51, 81, 26);
		contentPane.add(lblLogin);
		
		txtlogin = new JTextField();
		txtlogin.setBounds(114, 51, 181, 33);
		contentPane.add(txtlogin);
		txtlogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblSenha.setBounds(42, 110, 81, 26);
		contentPane.add(lblSenha);
		
		
		txtsenha = new JPasswordField();
		txtsenha.setColumns(10);
		txtsenha.setBounds(114, 110, 181, 33);
		contentPane.add(txtsenha);
		
		JButton btnLogar = new JButton("Entrar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroAdm cdadm = new CadastroAdm();
				//if(txtlogin.getText().equals(cdadm.CadastroAdmin().getNome())&&txtsenha.getText().equals(cdadm.CadastroAdmin().getSenha())) {
					TelaPrincipal tela = new TelaPrincipal(cdadm.CadastroAdmin().getNome(),lista);
					tela.setVisible(true);
					frame.setVisible(false);
					/*
				}
				else {
				JOptionPane.showMessageDialog(null, "Combinação inexata !!", "Error!!", JOptionPane.ERROR_MESSAGE);
				txtsenha.setText("");
				}*/
			}
		});
		btnLogar.setFont(new Font("Arial", Font.PLAIN, 18));
		btnLogar.setBounds(146, 177, 92, 26);
		contentPane.add(btnLogar);
		
		
	}
}
