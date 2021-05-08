package agenda;
import java.awt.EventQueue;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class FrmContatos extends JFrame {
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtBairro;
	private JTextField txtEndereco;
	private JTextField txtCidade;
	private JTextField txtCep;
	private JTextField txtUf;

	private JTextField txtFone;
	private int count = 0, tamanhojlabel = 14, tamanhojanela;

	private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	private JTextField txtMatricula;

	public String inserirPessoa() {
		try {
			Pessoa p = new Pessoa(txtNome.getText(), txtFone.getText(), Integer.parseInt(txtMatricula.getText()),
					txtEmail.getText(), txtEndereco.getText(), txtBairro.getText(), txtCidade.getText(),
					txtUf.getText(), Integer.parseInt(txtCep.getText()));
			lista.add(p);
			/*
			 * p.setNome(txtNome.getText()); p.setTelefone(txtFone.getText());
			 * p.setMatricula(Integer.parseInt(txtMatricula.getText()));
			 * p.setBairro(txtBairro.getText()); p.setEmail(txtEmail.getText());
			 * p.setEndereco(txtEndereco.getText()); p.setCidade(txtCidade.getText());
			 * p.setUf(txtUf.getText()); p.setCep(Integer.parseInt(txtCep.getText()));
			 * lista.add(p);
			 */
			/*
			 * ou Pessoa x = new Pessoa(txtNome.getText(), txtFone.getText()); lista.add(x);
			 */
			limparCampos();
			return "Pessoa inserida com sucesso";
		} catch (Exception e) {
			return "Erro ao Inserir! Favor digitar apenas n�meros na matr�cula! e cep !! (Não Deixar Vazios !!)";
		}
	}

	public void listarPessoas(ArrayList<Pessoa>lista) {
		MostrarListaEmTabela mos = new MostrarListaEmTabela(lista);
		mos.setVisible(true);
	}

	public void limparCampos() {
		txtFone.setText("");
		txtNome.setText("");
		txtMatricula.setText("0");
		txtEmail.setText("");
		txtUf.setText("");
		txtEndereco.setText("");
		txtBairro.setText("");
		txtCep.setText("");
		txtCidade.setText("");
		txtNome.requestFocus();
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmContatos frame = new FrmContatos();
					//frame.setBounds(100,
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
	public FrmContatos() {
		setTitle("Agenda - Contatos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, botaolbldistancia(), 66, 14);
		contentPane.add(lblNome);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, botaolbldistancia(), 66, 14);
		contentPane.add(lblEmail);

		JLabel lblEndereco = new JLabel("Endereço:");
		lblEndereco.setBounds(10, botaolbldistancia(), 66, 14);
		contentPane.add(lblEndereco);

		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, botaolbldistancia(), 66, 14);
		contentPane.add(lblBairro);

		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, botaolbldistancia(), 66, 14);
		contentPane.add(lblCidade);

		JLabel lblUf = new JLabel("Uf:");
		lblUf.setBounds(10, botaolbldistancia(), 66, 14);
		contentPane.add(lblUf);

		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(10, botaolbldistancia(), 66, 14);
		contentPane.add(lblCep);

		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, botaolbldistancia(), 66, 14);
		contentPane.add(lblTelefone);

		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(10, botaolbldistancia(), 66, 14);
		contentPane.add(lblMatricula);

		
		count = 0;
		tamanhojlabel = 11;
		txtNome = new JTextField();
		txtNome.setBounds(86, botaolbldistancia(), 225, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setBounds(86, botaolbldistancia(), 225, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		txtEndereco = new JTextField();
		txtEndereco.setBounds(86, botaolbldistancia(), 225, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);

		txtBairro = new JTextField();
		txtBairro.setBounds(86, botaolbldistancia(), 225, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);

		txtCidade = new JTextField();
		txtCidade.setBounds(86, botaolbldistancia(), 225, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);

		txtUf = new JTextField();
		txtUf.setBounds(86, botaolbldistancia(), 225, 20);
		contentPane.add(txtUf);
		txtUf.setColumns(10);

		txtCep = new JTextField();
		txtCep.setBounds(86, botaolbldistancia(), 225, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);

		txtFone = new JTextField();
		txtFone.setBounds(86, botaolbldistancia(), 126, 20);
		contentPane.add(txtFone);
		txtFone.setColumns(10);

		txtMatricula = new JTextField();
		txtMatricula.setBounds(86, botaolbldistancia(), 126, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);

		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/* In�cio - C�digo desenvolvido */
				String mens = inserirPessoa();
				JOptionPane.showMessageDialog(null, mens);
				/* Fim - C�digo desenvolvido */
			}
		});
		count++;
		btnInserir.setBounds(66, botaolbldistancia(), 89, 23);
		contentPane.add(btnInserir);

		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* In�cio - C�digo desenvolvido */
				listarPessoas(lista);
				/* Fim - C�digo desenvolvido */
			}
		});
		count-=1;
		btnListar.setBounds(166, botaolbldistancia(), 89, 23);
		contentPane.add(btnListar);
		
		JLabel lblDigitarApenasNmeros = new JLabel("Digitar apenas numeros !!");
		lblDigitarApenasNmeros.setForeground(new Color(255, 0, 255));
		lblDigitarApenasNmeros.setBounds(86, botaolbldistancia(), 150, 14);
		contentPane.add(lblDigitarApenasNmeros);
	}

	public int botaolbldistancia() {
		if (count > 0) {
			int total = tamanhojlabel + (28 * count);
			count++;
			return total;
		} else {
			count++;
			return tamanhojlabel;

		}

	}
}
