package frontEnd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import backEnd.AcessoNoBanco;
import backEnd.CadastroDePessoas;
import backEnd.ListarCadastros;

public class InserirDados extends JFrame {
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtFone;
	private JTextField txtRg;
	private int count = 0, tamanhojlabel = 14, tamanhojanela, largurabtn = 3;
	private ListarCadastros lt;

	public String inserirPessoa() {
		try {
			/*
			 * if(txtNome.getText().equals("")||txtFone.getText().equals("")||txtCpf.getText
			 * ().equals("")||txtRg.getText().equals("")) { Exception Campovazio = new
			 * Exception(); Campovazio. }
			 */
			CadastroDePessoas p = new CadastroDePessoas(txtNome.getText(), txtFone.getText(), txtCpf.getText(),
					txtRg.getText());
			AcessoNoBanco.inserir(p);
			limparCampos();
			return "Pessoa inserida com sucesso";

		} catch (Exception e) {
			return "Erro ao Inserir! Favor " + "" + "Não Deixar Vazios !!";
		}
	}

	public void limparCampos() {
		txtFone.setText("");
		txtNome.setText("");
		txtRg.setText("");
		txtCpf.setText("");
		txtNome.requestFocus();
	}

	public InserirDados() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
					Interface inter = new Interface();
					inter.setVisible(true);
					inter.requestFocus();
			}
		});
		setTitle("Cadastrar Pessoas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, botaolblaltura(), 66, 14);
		contentPane.add(lblNome);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, botaolblaltura(), 66, 14);
		contentPane.add(lblTelefone);

		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(10, botaolblaltura(), 66, 14);
		contentPane.add(lblCpf);

		JLabel lblRg = new JLabel("Rg:");
		lblRg.setBounds(10, botaolblaltura(), 66, 14);
		contentPane.add(lblRg);

		count = 0;
		tamanhojlabel = 11;
		txtNome = new JTextField();
		txtNome.setBounds(86, botaolblaltura(), 225, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtFone = new JTextField();
		txtFone.setBounds(86, botaolblaltura(), 126, 20);
		contentPane.add(txtFone);
		txtFone.setColumns(10);

		txtCpf = new JTextField();
		txtCpf.setBounds(86, botaolblaltura(), 225, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);

		txtRg = new JTextField();
		txtRg.setBounds(86, botaolblaltura(), 126, 20);
		contentPane.add(txtRg);

		txtRg.setColumns(10);
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String mens = inserirPessoa();
				JOptionPane.showMessageDialog(null, mens);
			}
		});
		count++;
		btnInserir.setBounds(largurabtn, botaolblaltura(), 89, 23);
		contentPane.add(btnInserir);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			CadastroDePessoas p = AcessoNoBanco.retornaPorId();
			if(p !=null) {
				setarCampos(p);
			}
			
			}
		});
		count--;
		btnAlterar.setBounds(largurabtn += 90, botaolblaltura(), 89, 23);
		contentPane.add(btnAlterar);

		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(AcessoNoBanco.excluir()) {
				JOptionPane.showMessageDialog(null, "Foi Excluida Com Sucesso !!");
				}
			}
		});
		count--;
		btnDeletar.setBounds(largurabtn += 90, botaolblaltura(), 89, 23);
		contentPane.add(btnDeletar);

		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 lt= new ListarCadastros(AcessoNoBanco.listagem());
				lt.setVisible(true);
				setVisible(false);
			}
		});
		count--;
		btnListar.setBounds(largurabtn += 90, botaolblaltura(), 89, 23);
		contentPane.add(btnListar);
		setBounds(100, 100, 377, (botaolblaltura() + 40));
		setLocationRelativeTo(null);
	}

	public int botaolblaltura() {
		if (count > 0) {
			int total = tamanhojlabel + (28 * count);
			count++;
			return total;
		} else {
			count++;
			return tamanhojlabel;

		}

	}
	public void setarCampos(CadastroDePessoas p) {
		txtFone.setText(p.getTelefone());
		txtNome.setText(p.getNome());
		txtRg.setText(p.getRg());
		txtCpf.setText(p.getCpf());
		txtNome.requestFocus();
	}
}
