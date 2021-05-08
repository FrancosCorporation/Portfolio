package Padrao;

import java.awt.Desktop;
import java.awt.EventQueue;
import java.net.URI;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NovaAba extends JFrame {

	private JPanel contentPane;
	private String site = JOptionPane.showInputDialog("Insira a Url !!");
	private JButton btnIniciar, btnParar;
	private Thread acao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					NovaAba frame = new NovaAba();
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
	public NovaAba() {
		if(site==null) {
			JOptionPane.showMessageDialog(null, "Infelizmente url vazia nao é valida, saindo..");
			System.exit(0);
		}
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 404, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acao = new Thread(new Runnable() {

					@Override
					public void run() {
						while(true) {
						openWebpage(site);
						try {
							Thread.sleep(3420000);
						} catch (InterruptedException e1) { // TODO Auto-generated catch block
							e1.printStackTrace();
						}
						}
					}

				});
				btnIniciar.setVisible(false);
				btnParar.setVisible(true);
				if(!acao.isAlive()) {
					acao.start();
				}
			}
		});

		btnParar = new JButton("Stop");
		btnParar.setVisible(false);
		btnParar.setBounds(164, 210, 85, 21);
		contentPane.add(btnParar);
		btnParar.setVisible(false);
		btnParar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnIniciar.setVisible(true);
				btnParar.setVisible(false);
				Thread.currentThread().stop();
				if(!acao.isAlive()) {
					System.out.println("oi");
				}
				
			}
		});

		btnIniciar.setBounds(164, 210, 85, 21);
		contentPane.add(btnIniciar);
		setLocationRelativeTo(null);

	}

	public static void openWebpage(String site) {
		Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
		if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
			try {
				desktop.browse(new URI(site));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
