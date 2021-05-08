package backEnd;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import painelCentral.TelaLogin;
import painelCentral.TelaPrincipal;

public class ListarCadastros extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private static ListarCadastros frame;

	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ListarCadastros(lista,null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	public ListarCadastros(String nome, ArrayList<CadastroAnimal> lista) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 700, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		this.setLocationRelativeTo(null);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				try{
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				modelo.setRowCount(0);
				for (int i = 0; i < lista.size(); i++) {
					modelo.addRow(new Object[] { lista.get(i).getId(),lista.get(i).getNome(), lista.get(i).getTipo(), lista.get(i).getRaca(),
							lista.get(i).getCor(), lista.get(i).getPeso(), lista.get(i).getAltura(),
							lista.get(i).getAnoNasc() });
				}
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Verifique se adicinou algum cadastro, no momento não consta nenhum no sistema, ou contate o Administrador do Sistema !!","Error, Grave !!", JOptionPane.WARNING_MESSAGE);
				}
			}
			@Override
			public void windowClosed(WindowEvent e) {
				TelaPrincipal tela = new TelaPrincipal(nome, lista);
				setBounds(100, 100, 747, 598);
				tela.setVisible(true);
			}
		});

		
		// declascao do scroll pane com o jpnael fazendo implemento
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Id","Nome", "Tipo", "Raça", "Cor", "Peso", "Altura", "Ano De Nascimento" }));
		scrollPane.setViewportView(table);
		
			
	
	}

}
