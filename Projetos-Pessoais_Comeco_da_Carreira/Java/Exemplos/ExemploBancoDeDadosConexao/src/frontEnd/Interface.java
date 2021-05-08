package frontEnd;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import backEnd.AcessoNoBanco;
import backEnd.ConexaoBd;

public class Interface extends JFrame {

	private JPanel contentPane;
	private JLabel lblOff;
	private JLabel lblQntCadastros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
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
	public Interface() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 511, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblBd = new JLabel("BD:");
		lblBd.setHorizontalAlignment(SwingConstants.CENTER);
		lblBd.setBounds(216, 90, 24, 13);
		contentPane.add(lblBd);
		
		lblOff = new JLabel("OFF");
		lblOff.setHorizontalAlignment(SwingConstants.CENTER);
		lblOff.setForeground(Color.RED);
		lblOff.setBounds(239, 90, 35, 13);
		contentPane.add(lblOff);
		
		JLabel lblQnt_1 = new JLabel("Qnt:");
		lblQnt_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblQnt_1.setBounds(433, 20, 24, 13);
		contentPane.add(lblQnt_1);
		
		lblQntCadastros = new JLabel("0");
		lblQntCadastros.setHorizontalAlignment(SwingConstants.CENTER);
		lblQntCadastros.setForeground(Color.RED);
		lblQntCadastros.setBounds(452, 20, 35, 13);
		contentPane.add(lblQntCadastros);
		
		JLabel lblApresentacao = new JLabel("Bem Vindo Ao Cadastro No Banco De Dados");
		lblApresentacao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblApresentacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblApresentacao.setBounds(10, 10, 484, 30);
		contentPane.add(lblApresentacao);
		
		JButton btnTestarConexo = new JButton("Testar Conexão");
		btnTestarConexo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConexaoBd Conexao = new ConexaoBd();
				try {
					if(Conexao.getConnection() != null) {
						lblOff.setForeground(Color.GREEN);
						lblOff.setText("ON");
					}
				} catch (ClassNotFoundException | SQLException e1) {
					lblOff.setForeground(Color.RED);
					lblOff.setText("Erro !");
					JOptionPane.showMessageDialog(null, "Talvez fosse interessante conferir se o Banco De Dados esta ligado");
				}
			}
		});
		btnTestarConexo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTestarConexo.setBounds(171, 50, 151, 30);
		contentPane.add(btnTestarConexo);
		
		JButton btnInserirDados = new JButton("Inserir Dados");
		btnInserirDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InserirDados inserir = new InserirDados();
				inserir.setVisible(true);
				dispose();
			}
		});
		btnInserirDados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnInserirDados.setBounds(10, 50, 151, 30);
		contentPane.add(btnInserirDados);
		
		JButton btnMaximoId = new JButton("Qntde de Cadastros");
		btnMaximoId.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(AcessoNoBanco.retornaUltimoId()>0) {
					lblQntCadastros.setText(AcessoNoBanco.retornaUltimoId()+"");
					lblQntCadastros.setForeground(Color.GREEN);
				}
				else {
					lblQntCadastros.setText("Err");
				}
			}
		});
		btnMaximoId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnMaximoId.setBounds(332, 50, 151, 30);
		contentPane.add(btnMaximoId);
	}
}
