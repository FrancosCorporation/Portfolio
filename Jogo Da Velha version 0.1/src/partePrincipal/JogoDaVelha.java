package partePrincipal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JogoDaVelha extends JFrame {
	ImageIcon iconCirculo = new ImageIcon(getClass().getResource("brl.png"));
	ImageIcon iconX = new ImageIcon(getClass().getResource("xis.png"));

	JPanel pTela = new JPanel(new GridLayout(3, 3, 10, 10));

	Bloco[] blocos = new Bloco[9];
	//haha
	

	int rodadas = 0;

	final int JOGADOR_1 = 1;
	final int JOGADOR_2 = 2;

	int jogadorVez = JOGADOR_1;
	static int contra = 1;

	JLabel lInformacao = new JLabel("Jogador " + JOGADOR_1);

	public JogoDaVelha() {
		boolean resp = retornapergunta("Voce deseja Jogar contra Alguem ou Sozinho?", "Player Vs Pc",
				"Player Vs Player");
		if (resp) {
			configurarJanela();
			configurarTela();
			contra = 2;
		} else {
			configurarJanela();
			configurarTela();
			contra = 1;

		}

	}

	public void configurarTela() {
		for (int i = 0; i < 9; i++) {
			Bloco bloco = new Bloco();
			blocos[i] = bloco;
			pTela.add(bloco);
			bloco.setText(i + "");
		}
		add(BorderLayout.CENTER, pTela);
		add(BorderLayout.NORTH, lInformacao);
		lInformacao.setBackground(Color.black);
		lInformacao.setFont(new Font("Arial", Font.BOLD, 35));
		lInformacao.setForeground(new Color(50, 200, 50));
		lInformacao.setHorizontalAlignment(SwingConstants.CENTER);
	}

	public void mudarVez() {
		if (jogadorVez == 1) {
			jogadorVez = 2;
			lInformacao.setText("Jogador 2");
			lInformacao.setForeground(Color.RED);
		} else {
			jogadorVez = 1;
			lInformacao.setText("Jogador 1");
			lInformacao.setForeground(new Color(50, 200, 50));
		}
	}

	public boolean testarVitoria(int jog) {
		if (blocos[0].quem == jog && blocos[1].quem == jog && blocos[2].quem == jog) {
			return true;
		}
		if (blocos[3].quem == jog && blocos[4].quem == jog && blocos[5].quem == jog) {
			return true;
		}
		if (blocos[6].quem == jog && blocos[7].quem == jog && blocos[8].quem == jog) {
			return true;
		}
		if (blocos[0].quem == jog && blocos[3].quem == jog && blocos[6].quem == jog) {
			return true;
		}
		if (blocos[1].quem == jog && blocos[4].quem == jog && blocos[7].quem == jog) {
			return true;
		}
		if (blocos[2].quem == jog && blocos[5].quem == jog && blocos[8].quem == jog) {
			return true;
		}
		if (blocos[0].quem == jog && blocos[4].quem == jog && blocos[8].quem == jog) {
			return true;
		}
		if (blocos[2].quem == jog && blocos[4].quem == jog && blocos[6].quem == jog) {
			return true;
		}
		return false;
	}

	public void configurarJanela() {
		setTitle("Jogo da Velha");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JogoDaVelha();
	}

	public class Bloco extends JButton {
		int quem = 0;

		public Bloco() {
			setBackground(Color.WHITE);
			addActionListener(e -> {
				if (contra == 1) {
					if (quem == 0) {
						if (jogadorVez == JOGADOR_1) {
							setIcon(iconCirculo);
							quem = JOGADOR_1;
						} else {
							setIcon(iconX);
							quem = JOGADOR_2;
						}
						mudarVez();
						if (testarVitoria(quem)) {
							boolean resp = retornapergunta("Jogador " + quem + " Venceu!", "Restart", "Sair");
							if (resp) {
								if (quem == JOGADOR_1) {
									mudarVez();
								}
								resetgame();

							} else {
								System.exit(0);
							}
						}
					}

					rodadas++;
				}
				if (contra == 2) {
					if (getIcon() == null) {
						quem = JOGADOR_1;
						inteligenciaAtificial();
						if (testarVitoria(JOGADOR_1)) {
							boolean resp = retornapergunta("Jogador " + quem + " Venceu!", "Restart", "Sair");
							if (resp) {
								resetgame();

							} else {
								System.exit(0);
							}
						}
						if (testarVitoria(JOGADOR_2)) {
							boolean resp = retornapergunta("Jogador " + JOGADOR_2 + " Venceu!", "Restart", "Sair");
							if (resp) {
								resetgame();

							} else {
								System.exit(0);
							}
						}

					}
				}
				rodadas++;
				if (rodadas >= 9) {
					boolean resp = retornapergunta("Deu velha!", "Restart", "Sair");
					if (resp) {
						if (quem == JOGADOR_1) {
							mudarVez();
						}
						resetgame();
					} else {
						System.exit(0);
					}
				}

			});
		}

	}

	public boolean retornapergunta(String message, String botao1, String botao2) {
		boolean resposta = false;
		Object[] options = { botao1, botao2 };
		int op = JOptionPane.showOptionDialog(null, message, "Atenção", JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, 0);
		if (op == 0) {
			return resposta = true;
		} else {
			return resposta;
		}

	}

	public void resetgame() {
		jogadorVez = JOGADOR_1;
		rodadas = 0;
		pTela.removeAll();
		dispose();
		new JogoDaVelha();
	}

	public void inteligenciaAtificial() {
		int rnd = (int) (Math.random() * 9); // gera um valor randomico de 0.0 ate menores q 1.0, multiplica por 100 e
		if (rnd % 2 != 0) {
			rnd -= 1;
		}
		for (int i = 0; i < blocos.length; i++) {
			if (blocos[i].quem == JOGADOR_1) {
				if (blocos[i].getIcon() == null) {
					blocos[i].setIcon(iconCirculo);
				}
			}
			if(blocos[4].quem != JOGADOR_1 && blocos[4].getIcon() == null) {
				blocos[4].quem = JOGADOR_2;
				blocos[4].setIcon(iconX);
			}
			if (blocos[4].quem == JOGADOR_1 && blocos[4].getIcon() == null) {
				blocos[rnd].quem = JOGADOR_2;
				blocos[rnd].setIcon(iconX);
			}
			if (blocos[i].quem == JOGADOR_1 && blocos[i].quem == JOGADOR_2) {
				if(blocos[i].getIcon()!=null) {
					blocos[2].quem = JOGADOR_2;
					blocos[2].setIcon(iconX);
				}
				
			}
		}

	}
	
}