package painelCentral;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import backEnd.CadastroAnimal;
import backEnd.ImportarDadosAnimais;
import backEnd.ListarCadastros;
import backEnd.LogicaClinica;
import backEnd.TelaCadastro;
import backEnd.TelaExcluir;
import backEnd.AlteracoesDiretorios;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private static TelaPrincipal frame;
	private int count = 1;
	private ArrayList<CadastroAnimal> lista;
	private ImportarDadosAnimais imp;
	private String locarq = System.getProperty("user.home");
	private String nomearq = "arq";
	private String extencao = "\\" + nomearq + ".txt";
	private String separacao = ",";

	public TelaPrincipal(String nome, ArrayList<CadastroAnimal> arrayList) {
		lista = new ArrayList<CadastroAnimal>();
		this.lista = arrayList;
		setTitle("Clina Veterinaria Animal Sensation");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 520, 195);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					TelaCadastro cadastro = new TelaCadastro(nome, lista, -1);
					cadastro.setVisible(true);
					dispose();
				} catch (Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btnCadastrar.setBounds(20, 96, 100, 35);
		contentPane.add(btnCadastrar);

		JLabel lblTelaBoasVindas = new JLabel("");
		lblTelaBoasVindas.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTelaBoasVindas.setHorizontalAlignment(SwingConstants.CENTER);
		lblTelaBoasVindas.setForeground(Color.RED);
		lblTelaBoasVindas.setBounds(10, 32, 486, 54);
		contentPane.add(lblTelaBoasVindas);
		lblTelaBoasVindas.setText(nome + " Seja Bem Vindo(a)!! ");

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarCadastros listar = new ListarCadastros(nome, lista);
				listar.setVisible(true);
				int op = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Escolha na lista qual o id que deseja alterar !!"));
				TelaCadastro cadastro = new TelaCadastro(nome, lista, op);
				cadastro.setVisible(true);
				listar.setVisible(false);
				dispose();
			}
		});
		btnAlterar.setBounds(134, 96, 100, 35);
		contentPane.add(btnAlterar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaExcluir excluir = new TelaExcluir(lista, nome);
				excluir.setVisible(true);
				excluir.requestFocus();
				dispose();
			}
		});
		btnExcluir.setBounds(244, 96, 115, 35);
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
		btnListar.setBounds(369, 97, 117, 32);
		contentPane.add(btnListar);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 53, 22);
		contentPane.add(menuBar);

		JMenu mnOpes = new JMenu("Opções");
		menuBar.add(mnOpes);

		JMenuItem mnGravarDados = new JMenuItem("Gravar Dados");
		mnGravarDados.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imp = new ImportarDadosAnimais();
				LogicaClinica lg = new LogicaClinica();
				try {
					imp.gravarArquivo(lista, locarq, extencao,
							lg.retornapergunta("Voce deseja Subscrever o arquivo se ele existir?"));
				} catch (IOException e1) {
					System.out.println(e1);
				}
			}
		});
		mnOpes.add(mnGravarDados);

		JMenuItem mnImportarDados = new JMenuItem("Importar Dados");
		mnImportarDados.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				imp = new ImportarDadosAnimais();
				try {
					lista.clear();
					lista = imp.lerArquivo(locarq, extencao, separacao);
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "Verifique, a pasta destino parece nao conter o arquivo!! ");
				}
			}
		});
		mnOpes.add(mnImportarDados);

		JMenuItem mnSelecionarPastaDestino = new JMenuItem("Selecionar pasta Destino");
		mnSelecionarPastaDestino.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				AlteracoesDiretorios altera = new AlteracoesDiretorios();
				locarq = altera.escolherPasta();
			}
		});
		mnOpes.add(mnSelecionarPastaDestino);

		JMenuItem mnAlterarNomeDo = new JMenuItem("Alterar Nome do Arquivo");
		mnAlterarNomeDo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				nomearq = JOptionPane.showInputDialog("Insira o nome do arquivo para que seja alterado: ");
			}
		});
		mnOpes.add(mnAlterarNomeDo);
	}

}
