package painelCentral;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backEnd.CadastroAnimal;
import backEnd.ListarCadastros;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private static TelaPrincipal frame;
	private int count = 1;
	private ArrayList<CadastroAnimal> lista = new ArrayList<CadastroAnimal>();

	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { frame = new TelaPrincipal(null, null);
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */
	public TelaPrincipal(String nome, ArrayList<CadastroAnimal> arrayList) {
		if (arrayList != null) {
			lista.addAll(arrayList);

		}
		setTitle("Clina Veterinaria Animal Sensation");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 569, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TelaCadastro cadastro = new TelaCadastro(nome, lista);
					cadastro.setVisible(true);
					dispose();
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btnCadastrar.setBounds(32, 74, 88, 35);
		contentPane.add(btnCadastrar);

		JLabel lblTelaBoasVindas = new JLabel("");
		lblTelaBoasVindas.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTelaBoasVindas.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaBoasVindas.setForeground(Color.RED);
		lblTelaBoasVindas.setBounds(10, 10, 534, 54);
		contentPane.add(lblTelaBoasVindas);
		lblTelaBoasVindas.setText(nome + " Seja Bem Vindo(a)!! ");

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(32, 119, 88, 35);
		contentPane.add(btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(142, 119, 95, 35);
		contentPane.add(btnExcluir);

		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarCadastros listar = new ListarCadastros(nome, lista);
				listar.setVisible(true);
				listar.requestFocus();
				dispose();
			}
		});
		btnListar.setBounds(411, 74, 105, 77);
		contentPane.add(btnListar);

		JButton btnGravardados = new JButton("Gravar Dados");
		btnGravardados.setBounds(142, 74, 95, 35);
		contentPane.add(btnGravardados);

		JButton btnImportardados = new JButton("Importar Dados");
		btnImportardados.setBounds(255, 119, 127, 35);
		contentPane.add(btnImportardados);

		JButton btnSelecionarPasta = new JButton("Selecionar Pasta");
		btnSelecionarPasta.setBounds(255, 74, 127, 35);
		contentPane.add(btnSelecionarPasta);
	}
}
