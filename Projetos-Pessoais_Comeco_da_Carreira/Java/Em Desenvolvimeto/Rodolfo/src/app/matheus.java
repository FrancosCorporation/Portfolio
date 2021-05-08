
package app;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.security.Key;
import javax.crypto.Cipher;

/*public class chat extends JFrame implements Runnable{
	public static String direto="", ipvizinho = "172.16.1.160",mais="", sub = "rodolfinholindoefofomeuamorzinnho", completo,nomediretorio,name = "Cliente", soma, eita="",mensagemRecebida;
	static Socket clienteenvia,clienterecebe,clienteenviaarq,clienterecebearq;
	JTextArea painelmensagens;
	Cipher cifra;
	Key chave;
	static int portaenvia=8888,portarecebe=8889,portaenviarq=8887,portarecebearq=8886;
	private JPanel contentPane;
	DataOutputStream saida;
	JFileChooser diretorio,enviararq;

	public static void main(String[] args) throws Exception{
		direto = System.getProperty("user.home")+"\\";
		chat frame= new chat();
		/*name= JOptionPane.showInputDialog("Digite aqui seu nome: ");
		while(name.equals(null)) {
			name= JOptionPane.showInputDialog("Digite aqui seu nome: ");
		}*//*
		if (name.equalsIgnoreCase("") || name==null) {
			name = "Cliente";

		} else  {

		}

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run()  {
				try {
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});}

	public JFileChooser escolherPastas(){ 
		JFileChooser pastaarq = new JFileChooser();
		pastaarq.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		pastaarq.showSaveDialog(null);
		pastaarq.setDialogTitle("Selecione o arquivo.");
		//File salvarArquivoEscolhido = localarq.getSelectedFile();
		return pastaarq;
	} 
	public void escolherArquivos() throws HeadlessException, InterruptedException{ 
		JFileChooser diretoriointeiro = new JFileChooser();
		diretoriointeiro.showSaveDialog(diretoriointeiro);
		diretoriointeiro.setDialogTitle("Selecione o arquivo.");
		completo= diretoriointeiro.getSelectedFile().getAbsolutePath();
		nomediretorio = diretoriointeiro.getSelectedFile().getName();
	} 

	public void enviandoarquivos() throws Exception{
		escolherArquivos();
		ObjectInputStream arquivoChave = new ObjectInputStream(new FileInputStream("Chave.key"));
		chave = (Key) arquivoChave.readObject();
		Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, chave);
		DataOutputStream saida = new DataOutputStream(clienteenviaarq.getOutputStream());
		nomediretorio=sub+nomediretorio;
		enviamensagem(cifrarmensagem(nomediretorio));
		DataInputStream fis =new  DataInputStream(new FileInputStream(completo));
		int tam = fis.available();
		byte[]	bytearquivo = new byte[tam];
		byte[] dadoscifrados = cipher.doFinal(bytearquivo);
		fis.read(dadoscifrados,0,dadoscifrados.length);
		saida.writeInt(tam);
		saida.write(dadoscifrados);
		saida.flush();
		fis.close();
	}

	public byte[] cifrarmensagem(String msg_) throws Exception{
		ObjectInputStream arquivoChave = new ObjectInputStream(new FileInputStream("Chave.key"));
		chave = (Key) arquivoChave.readObject();
		arquivoChave.close();
		Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, chave);
		byte[] bytesMensagem = new byte[msg_.length()];
		bytesMensagem = msg_.getBytes("UTF8");
		byte[] dadosCifrados = cipher.doFinal(bytesMensagem);
		return dadosCifrados;

	}
	public void enviamensagem(byte[] dadosenvio_) {
		try {
			DataOutputStream saida= new DataOutputStream(clienteenvia.getOutputStream());
			saida.writeInt(dadosenvio_.length);
			saida.write(dadosenvio_);}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	public String recebermensagem() throws Exception {
		ObjectInputStream in = new ObjectInputStream( new FileInputStream("Chave.key"));
		chave = (Key)in.readObject();
		in.close(); 
		Cipher decipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		decipher.init(Cipher.DECRYPT_MODE, chave);
		DataInputStream entrada= new DataInputStream(clienterecebe.getInputStream());
		int tam = entrada.readInt();
		byte [] dadosrecebido= new byte [tam];
		entrada.readFully(dadosrecebido, 0, dadosrecebido.length);
		byte[] dadospuros = decipher.doFinal(dadosrecebido);
		String oi = new String(dadospuros);
		return oi;

	}
	
	public chat() throws Exception{
		setResizable(false);
		setTitle("Chat: " + name);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600,200,610, 420);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);

		JMenuItem mntmAlterarNome = new JMenuItem("Alterar nome");
		mntmAlterarNome.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				name= JOptionPane.showInputDialog("Digite aqui seu nome: ");
				if(name.equalsIgnoreCase("")) {
					name="Cliente";
				}
				setTitle("Chat: " + name);
			}

		});

		contentPane = new JPanel();
		contentPane.setForeground(new Color(128, 128, 128));
		contentPane.setBackground(new Color(51, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);



		painelmensagens = new JTextArea();
		DefaultCaret auto = (DefaultCaret)painelmensagens.getCaret();
		auto.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		painelmensagens.setEditable(false);
		painelmensagens.setForeground(new Color(0, 153, 255));
		painelmensagens.setTabSize(10);
		painelmensagens.setRows(10);
		painelmensagens.setBackground(Color.WHITE);
		painelmensagens.setLineWrap(true);
		painelmensagens.setFont(new Font("Dialog", Font.BOLD, 16));

		JScrollPane scrollPane = new JScrollPane(painelmensagens);
		scrollPane.setViewportView(painelmensagens);
		painelmensagens.getFocusTraversalPolicy();
		scrollPane.addHierarchyListener(null);
		scrollPane.setBounds(6, 11, 582, 287);
		contentPane.add(scrollPane);


		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 309, 463, 46);
		contentPane.add(scrollPane_1);

		JTextArea textenviar = new JTextArea("");
		textenviar.setWrapStyleWord(true);
		textenviar.setLineWrap(true);
		textenviar.setBackground(Color.WHITE);
		textenviar.setFont(new Font("Dialog", Font.BOLD, 16));
		scrollPane_1.setViewportView(textenviar);

		textenviar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER){
					try {
						String msg;
						msg = textenviar.getText();
						msg= name+ " : " + msg;
						enviamensagem(cifrarmensagem(msg));
						textenviar.setText(null);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}});

		JButton btnenviar = new JButton("");
		btnenviar.setSelectedIcon(new ImageIcon("enviarslec.png"));
		btnenviar.setIcon(new ImageIcon("enviar.png"));
		btnenviar.setBounds(506, 309, 81, 46);
		contentPane.add(btnenviar);
		btnenviar.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				btnenviar.setIcon(new ImageIcon("enviarslec.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnenviar.setIcon(new ImageIcon("enviar.png"));
			}
		});
		btnenviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String msg;
					msg = textenviar.getText();
					msg= name+ " : " + msg;
					textenviar.setText(null);
					enviamensagem(cifrarmensagem(msg));

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		mnOptions.add(mntmAlterarNome);

		JMenuItem mntmArquivoSalve = new JMenuItem("Diretorio");
		mntmArquivoSalve.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				chatoptions cha= new chatoptions();

				if(!cha.isVisible()) {
					cha.setVisible(true);
				}else {
				}
			}
		});
		mnOptions.add(mntmArquivoSalve);

		JRadioButtonMenuItem rdbtnmntmLigarServico = new JRadioButtonMenuItem("Ligar Servico");
		rdbtnmntmLigarServico.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				
				try {
					clienteenvia = new Socket(ipvizinho, portaenvia);
					clienteenviaarq = new Socket(ipvizinho, portaenviarq );
					clienterecebe = new Socket(ipvizinho, portarecebe );
					clienterecebearq = new Socket(ipvizinho, portarecebearq );
					Runnable send = new Runnable(){        
						@Override
						public void run() {
							try{             
								
								while(true) {
									String oi = recebermensagem();
									if(oi.length()>=sub.length()) {
										if(sub.equals(oi.substring(0, sub.length()))) {
									Runnable sendarq = new Runnable(){        
										@Override
										public void run() {
											try{
												
												while(true) {
													DataInputStream entrada = new DataInputStream(clienterecebearq.getInputStream());
													String nome2=oi.replaceAll(sub, "");
													ObjectInputStream in = new ObjectInputStream( new FileInputStream("Chave.key"));
													chave = (Key)in.readObject();
													in.close(); 
													Cipher decipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
													decipher.init(Cipher.DECRYPT_MODE, chave);
															int tqm = entrada.readInt();
															if(tqm>0){
																byte[] str2= new byte[tqm];
																File junto = new File(direto+nome2);
																DataOutputStream fos =new DataOutputStream( new FileOutputStream(junto));
																entrada.readFully(str2, 0, str2.length);
																byte[] dadospuros = decipher.doFinal(str2);
																fos.write(dadospuros);
																fos.flush();
																fos.close();}
															
												                }
											} catch (Exception e){e.printStackTrace();}
										}
									};
									Thread v = new Thread(sendarq);
									v.start();
									}
										else {
											String oi1 = oi.replaceAll("\n", "");
											mais +=oi1+"\n";
											painelmensagens.setText(mais);
										}}
									
										else {
											String oi1 = oi.replaceAll("\n", "");
											mais +=oi1+"\n";
											painelmensagens.setText(mais);
										}
									
								}}
								
								 catch (Exception e){e.printStackTrace();}
						}
					};
					Thread t = new Thread(send);
					t.start();
					
					rdbtnmntmLigarServico.setVisible(false);
				}catch (Exception e1) {
					rdbtnmntmLigarServico.setVisible(true);
					e1.printStackTrace();
				}

			}
		});

		JMenuItem mntmGerarChave = new JMenuItem("Gerar Chave");
		mntmGerarChave.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				chatgerarchave gerarchave = new chatgerarchave();
				gerarchave.setVisible(true);
			}
		});
		mnOptions.add(mntmGerarChave);
		mnOptions.add(rdbtnmntmLigarServico);

		JButton btnanexo = new JButton("");
		btnanexo.setSelectedIcon(new ImageIcon("slecanexo.png"));
		btnanexo.setBounds(467, 309, 39, 46);
		contentPane.add(btnanexo);

		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(btnanexo, popupMenu);

		JMenuItem mntmEnviarAquivo = new JMenuItem("Enviar aquivo");
		mntmEnviarAquivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					enviandoarquivos();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		popupMenu.add(mntmEnviarAquivo);

		JMenuItem mntmLimparOChat = new JMenuItem("Limpar o Chat");
		mntmLimparOChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painelmensagens.setText(null);
				mais = "";
			}
		});

		popupMenu.add(mntmLimparOChat);

		btnanexo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnanexo.setIcon(new ImageIcon("anexo.png"));
		btnanexo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnanexo.setIcon(new ImageIcon("slecanexo.png"));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnanexo.setIcon(new ImageIcon("anexo.png"));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				btnanexo.setIcon(new ImageIcon("anexo.png"));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				btnanexo.setIcon(new ImageIcon("slecanexo.png"));

			}
		});		
	}
	private Rectangle getBounds(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	private Dimension getPreferredSize(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}


}*/

public class matheus {
    public static void main(String[] args) throws Exception {        
        Key chave;
        ObjectInputStream in = new ObjectInputStream( new FileInputStream("Chave.key"));
        chave = (Key)in.readObject();
        in.close(); 
        Cipher decipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        decipher.init(Cipher.DECRYPT_MODE, chave);
        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, chave);

        Runnable send = new Runnable(){        
            @Override
            public void run() {
                try{            
                    Socket conexao = new Socket("189.123.132.78", 8881);
                    while(true){
                        //Envia msg para o servidor
                        //INICIO
                        DataOutputStream saida = new DataOutputStream(conexao.getOutputStream());
                        
                        System.out.println("Digite uma mensagem a ser cifrada: ");
                        String mensagem = new java.util.Scanner(System.in).nextLine();
            
                        byte[] bytesMensagem = mensagem.getBytes("UTF8");
                        
                        byte[] dadosCifrados = cipher.doFinal(bytesMensagem);
                        saida.writeInt(dadosCifrados.length);
                        saida.write(dadosCifrados);  
                    }
                    //FIM 
                } catch (Exception e){System.out.println(e);}
            }
        };

        Runnable receive = new Runnable(){
            @Override
            public void run() {
                try{
                    Socket conexao = new Socket("189.123.132.78", 8882);
                    while(true){
                        //Resposta do servidor
                        //INICIO
                        DataInputStream entrada = new DataInputStream(conexao.getInputStream());
                        int tamanho = entrada.readInt();
                        byte[] dadosCifrados2 = new byte[tamanho];
                        entrada.readFully(dadosCifrados2, 0, dadosCifrados2.length);

                        byte[] dadosDecifrados2 = decipher.doFinal(dadosCifrados2);
                        System.out.println("Cliente: " + new String(dadosDecifrados2));
                    }
                    //FIM                     
                } catch (Exception e){System.out.println(e);}
            }
        };


        Thread sendt = new Thread(send);
        sendt.start();
        Thread receivet = new Thread(receive);
        receivet.start();
    }    
}