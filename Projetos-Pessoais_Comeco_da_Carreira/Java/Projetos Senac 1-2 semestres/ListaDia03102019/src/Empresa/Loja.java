package Empresa;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Loja {
	static Cama cama;
	static GuardaRoupa guardaroupas;
	static Estante estante;
	static ArmarioBanheiro armariobanheiro;
	static Mesa mesa;
	static ArrayList<Movel> listaMovel = new ArrayList<Movel>();

	public static void main(String args[]) {
		int op = 1;

		while (op != 3) {
			op = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Escolha uma opção: " + "\n1 - Inserir movel: " + "\n2 - Listar movel" + "\n3 - Sair"));
			while (op < 0 || op > 3) {
				op = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Voce digitou uma opção invalida, tente novamente: "
								+ "\n1 - Inserir movel" + "\n2 - Listar movel" + "\n3 - Sair"));
			}
			if (op == 1) {
				op = 0;
				op = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Insira qual tipo de material o movel deve ter: " + "\n1 - Madeira, 2 - Metal, 3 - Plastico."));
				if (op == 1) {
					op = 0;
					menuMadeira(op);
				}
				if (op == 2) {
					menuMetal(op);
				}
				if (op == 3) {
					menuPlastico(op);
				}

			}
			if (op == 2) {
				listarItens();
			}
			if(op==3) {
				JOptionPane.showMessageDialog(null, "Este programa Terminou !!");
			}
		}

	}

	private static void menuMetal(int op) {
		op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o movel:" + "\n 1 - Estante"));
		if (op == 1) {
			inserirEstante();
		}
	}

	private static void menuMadeira(int op) {
		op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o movel:" + "\n 1 - Guarda Roupa, 2 - Cama"));
		if (op == 1) {
			inserirGuardaRoupas();

		}
		if (op == 2) {
			inserirCama();

		}
	}

	private static void menuPlastico(int op) {
		op = Integer.parseInt(
				JOptionPane.showInputDialog(null, "Escolha o movel:" + "\n 1 - Mesa, 2 - Armario do Banheiro "));
		if (op == 1) {
			inserirMesa();

		}
		if (op == 2) {
			inserirArmarioDeBanheiro();

		}
	}

	private static void inserirArmarioDeBanheiro() {
		armariobanheiro = new ArmarioBanheiro();
		armariobanheiro.setMaterial(
				JOptionPane.showInputDialog(null, "Insira o tipo de material que foi utilizado para a construção !!"));
		armariobanheiro.setDescricao(JOptionPane.showInputDialog(null, "Insira uma descrição para o produto !!"));
		armariobanheiro.setQualidade(Integer
				.parseInt(JOptionPane.showInputDialog(null, "Insira a qualidade do produto em numero de 1 a 10 !!")));
		armariobanheiro.setCusto(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o custo do produto !!")));
		armariobanheiro.setPrecoVenda(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o preço do produto !!")));
		listaMovel.add(armariobanheiro);
		
	}

	private static void inserirMesa() {
		mesa = new Mesa();
		mesa.setMaterial(
				JOptionPane.showInputDialog(null, "Insira o tipo de material que foi utilizado para a construção !!"));
		mesa.setDescricao(JOptionPane.showInputDialog(null, "Insira uma descrição para o produto !!"));
		mesa.setQualidade(Integer
				.parseInt(JOptionPane.showInputDialog(null, "Insira a qualidade do produto em numero de 1 a 10 !!")));
		mesa.setCusto(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o custo do produto !!")));
		mesa.setPrecoVenda(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o preço do produto !!")));
		listaMovel.add(mesa);
	}

	private static void inserirEstante() {
		estante = new Estante();
		estante.setMaterial(JOptionPane.showInputDialog(null, "Insira o tipo de material que foi utilizado para a construção !!"));
		estante.setCor(JOptionPane.showInputDialog(null, "Insira a cor do produto !!"));
		estante.setDescricao(JOptionPane.showInputDialog(null, "Insira uma descrição para o produto !!"));
		estante.setEspessura(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a espessura do produto !!")));
		estante.setCusto(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o custo do produto !!")));
		estante.setPrecoVenda(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o preço do produto !!")));
		listaMovel.add(estante);
	}

	private static void inserirGuardaRoupas() {
		guardaroupas = new GuardaRoupa();
		guardaroupas.setMaterial(JOptionPane.showInputDialog(null, "Insira o tipo de madeira !!"));
		guardaroupas.setTipoMadeira(JOptionPane.showInputDialog(null,
				"Insira o tipo de material usado para construir este Guarda Roupas !!"));
		guardaroupas.setDescricao(JOptionPane.showInputDialog(null, "Insira uma descrição para o produto !!"));
		guardaroupas.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a Altura do produto !!")));
		guardaroupas.setLargura(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a Largura do produto !!")));
		guardaroupas.setNumPortas(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o numero de portas !!")));
		guardaroupas.setCusto(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o custo do produto !!")));
		guardaroupas.setPrecoVenda(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o preço de venda !!")));
		listaMovel.add(guardaroupas);
	}

	private static void inserirCama() {
		cama = new Cama();
		cama.setTipoMadeira(JOptionPane.showInputDialog(null, "Insira o tipo de madeira !!"));
		cama.setMaterial(
				JOptionPane.showInputDialog(null, "Insira o tipo de material usado para construir esta Cama !!"));
		cama.setDescricao(JOptionPane.showInputDialog(null, "Insira uma descrição para o produto !!"));
		cama.setCusto(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o custo do produto !!")));
		cama.setPrecoVenda(Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o preço de venda !!")));
		String v = JOptionPane.showInputDialog(null, "Insira se é uma cama de casal (Sim ou Não) !!");
		if(v.equalsIgnoreCase("sim")) {
			cama.setCasal(true);
		}
		listaMovel.add(cama);
	}
	private static void listarItens() {

		for (int i = 0; i < listaMovel.size(); i++) {
			JOptionPane.showMessageDialog(null, listaMovel.get(i));
		}
	}
}
