package backEnd;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import painelCentral.TelaPrincipal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtTipo;
	private JTextField txtRaca;
	private JTextField txtCor;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtAnoNasc;
	private ArrayList<CadastroAnimal>lista = new ArrayList<CadastroAnimal>();
	private int id = 1;
	
	
	public TelaCadastro(String nome, ArrayList<CadastroAnimal> arrayList, int op) {
		if(arrayList!=null) {
			this.lista =arrayList;
		}
		if(lista.size()>0) {
			id = lista.get((lista.size()-1)).getId()+1;
		}
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				TelaPrincipal tela = new TelaPrincipal(nome, lista);
				setBounds(100, 100, 747, 598);
				tela.setVisible(true);
				tela.requestFocus();
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 599, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		

		JLabel lblBoasVindas = new JLabel("Vamos Cadastrar Seu, " + (id) + "º Pet ?? =)");
		lblBoasVindas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBoasVindas.setHorizontalAlignment(SwingConstants.CENTER);
		lblBoasVindas.setBounds(10, 10, 565, 52);
		contentPane.add(lblBoasVindas);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setBounds(54, 92, 102, 33);
		contentPane.add(lblNome);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTipo.setBounds(54, 135, 102, 33);
		contentPane.add(lblTipo);

		JLabel lblRaca = new JLabel("Raça:");
		lblRaca.setHorizontalAlignment(SwingConstants.CENTER);
		lblRaca.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRaca.setBounds(54, 178, 102, 33);
		contentPane.add(lblRaca);

		JLabel lblCor = new JLabel("Cor:");
		lblCor.setHorizontalAlignment(SwingConstants.CENTER);
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCor.setBounds(54, 221, 102, 33);
		contentPane.add(lblCor);

		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setHorizontalAlignment(SwingConstants.CENTER);
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPeso.setBounds(54, 264, 102, 33);
		contentPane.add(lblPeso);

		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltura.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAltura.setBounds(54, 307, 102, 33);
		contentPane.add(lblAltura);

		JLabel lblAnoDeNascimento = new JLabel("Ano de Nascimento:");
		lblAnoDeNascimento.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnoDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAnoDeNascimento.setBounds(35, 350, 149, 33);
		contentPane.add(lblAnoDeNascimento);
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroAnimal pet;
				try {
					if(lista.size()>0) {
						id = lista.get((lista.size()-1)).getId()+1;
					}
					if(op>0) {
						lista.set((op-1),pet = new CadastroAnimal((op-1),txtNome.getText(), txtTipo.getText(), txtRaca.getText(),
								txtCor.getText(), Float.parseFloat(txtPeso.getText()),
								Float.parseFloat(txtAltura.getText()), Integer.parseInt(txtAnoNasc.getText())));
						JOptionPane.showMessageDialog(null, "Pet Alterado Com Sucesso !!", "Parabens.",
								JOptionPane.INFORMATION_MESSAGE);
						lblBoasVindas.setText("Vamos Alterar Seu, " + (op) + "º Pet ?? =)");
						LimparCampos();
						dispose();
					}
					else {
						lista.add(pet = new CadastroAnimal(id,txtNome.getText(), txtTipo.getText(), txtRaca.getText(),
								txtCor.getText(), Float.parseFloat(txtPeso.getText()),
								Float.parseFloat(txtAltura.getText()), Integer.parseInt(txtAnoNasc.getText())));
						JOptionPane.showMessageDialog(null, "Pet Cadastrado Com Sucesso !!", "Parabens.",
								JOptionPane.INFORMATION_MESSAGE);
						lblBoasVindas.setText("Vamos Cadastrar Seu, " + (id+1) + "º Pet ?? =)");
						LimparCampos();
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null,
							"Infelizmente nao aceitamos letras nos campos, Peso, Altura e Ano, Reveja os dados e tente novamente !!",
							"Cuidado.", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCadastrar.setBounds(316, 489, 155, 33);
		contentPane.add(btnCadastrar);

		JButton btnLimparCampos = new JButton("Limpar Campos");
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimparCampos();
			}
		});
		btnLimparCampos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLimparCampos.setBounds(108, 489, 155, 33);
		contentPane.add(btnLimparCampos);

		txtNome = new JTextField();
		txtNome.setBounds(222, 94, 301, 33);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		txtTipo = new JTextField();
		txtTipo.setColumns(10);
		txtTipo.setBounds(222, 135, 301, 33);
		contentPane.add(txtTipo);

		txtRaca = new JTextField();
		txtRaca.setColumns(10);
		txtRaca.setBounds(222, 178, 301, 33);
		contentPane.add(txtRaca);

		txtCor = new JTextField();
		txtCor.setColumns(10);
		txtCor.setBounds(222, 221, 301, 33);
		contentPane.add(txtCor);

		txtPeso = new JTextField();
		txtPeso.setColumns(10);
		txtPeso.setBounds(222, 264, 301, 33);
		contentPane.add(txtPeso);

		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(222, 309, 301, 33);
		contentPane.add(txtAltura);

		txtAnoNasc = new JTextField();
		txtAnoNasc.setColumns(10);
		txtAnoNasc.setBounds(222, 350, 301, 33);
		contentPane.add(txtAnoNasc);

		JLabel lblKg = new JLabel("Kg");
		lblKg.setHorizontalAlignment(SwingConstants.CENTER);
		lblKg.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKg.setBounds(533, 264, 42, 33);
		contentPane.add(lblKg);

		JLabel lblEx = new JLabel("Cm");
		lblEx.setHorizontalAlignment(SwingConstants.CENTER);
		lblEx.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEx.setBounds(520, 307, 63, 33);
		contentPane.add(lblEx);
		if(op>0) {
			atribuircontatods(op,lista);
		}
	}

	public void LimparCampos() {
		txtNome.setText("");
		txtTipo.setText("");
		txtRaca.setText("");
		txtCor.setText("");
		txtPeso.setText("");
		txtAltura.setText("");
		txtAnoNasc.setText("");
	}
	public void atribuircontatods(int op, ArrayList<CadastroAnimal>lista) {
		txtNome.setText(lista.get((op-1)).getNome());
		txtTipo.setText(lista.get((op-1)).getTipo());
		txtRaca.setText(lista.get((op-1)).getRaca());
		txtCor.setText(lista.get((op-1)).getCor());
		txtPeso.setText(lista.get((op-1)).getPeso()+"");
		txtAltura.setText(lista.get((op-1)).getAltura()+"");
		txtAnoNasc.setText(lista.get((op-1)).getAnoNasc()+"");
	}
}
