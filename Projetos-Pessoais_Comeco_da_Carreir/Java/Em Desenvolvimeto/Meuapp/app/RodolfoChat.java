package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.crypto.Cipher;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.Key;
import java.util.Scanner;

public class RodolfoChat extends JFrame {
	Scanner in = new Scanner(System.in);
	public static String name = "Cliente", msg,soma, ipvizinho = "localhost";
	Socket conexao;
	ServerSocket server;
	DataInputStream entrada;
	DataOutputStream saida;
	Cipher cifra;
	Key chave;
	int porta=8888,n;
	byte[] eita;
	DatagramSocket socket;
	private JPanel contentPane;
	
	
	public void  cliente()throws Exception{
		conexao = new Socket (ipvizinho, porta);
		System.out.println("Conectado.. ");
		entrada = new DataInputStream(conexao.getInputStream());
		saida = new DataOutputStream(conexao.getOutputStream());
	}

	public static void main(String[] args) throws Exception{
		name = JOptionPane.showInputDialog(null,"Digite aqui seu nome: ");
		if (name.equalsIgnoreCase("")) {
			name = "Cliente";
		
		} else {
		}}


	public RodolfoChat() throws Exception {
		
		JFrame chat1 = new JFrame();
        chat1.setVisible(true);
		setTitle("Chat: " + name);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 394);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 581, 303);
		contentPane.add(scrollPane);

		JTextArea textmensagens = new JTextArea();
		textmensagens.setEditable(false);
		scrollPane.setViewportView(textmensagens);
		textmensagens.setLineWrap(true);
		textmensagens.setFont(new Font("Dialog", Font.BOLD, 16));

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 309, 491, 40);
		contentPane.add(scrollPane_1);

		JTextArea textenviar = new JTextArea("Escreva aqui suas Mensagens..");
		textenviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textenviar.setText("");
			}
		});
		textenviar.setFont(new Font("Dialog", Font.BOLD, 16));
		scrollPane_1.setViewportView(textenviar);
		textenviar.setLineWrap(true);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msg = textenviar.getText();
				msg= name+ " : " + msg;
				soma=textmensagens.getText()+msg+"\n";
				eita=soma.getBytes();
				textmensagens.setText(soma+eita.toString()+"\n");
				textenviar.setText("");
				textenviar.requestFocus();
			}

		});
		btnNewButton.setIcon(new ImageIcon("E:\\Eclipse\\Sem T\u00EDtulo-1.png"));
		btnNewButton.setBounds(497, 309, 90, 40);
		contentPane.add(btnNewButton);
	}
}
