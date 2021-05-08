package Escola;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Empresa.ArmarioBanheiro;
import Empresa.Cama;
import Empresa.Estante;
import Empresa.GuardaRoupa;
import Empresa.Mesa;

public class Escola {
	static ProfessorMatematica profm;
	static ProfessorCompleto profcom;
	static ProfessorPortugues profp;
	static Diretor dir;
	static ArrayList<Profissional> ListaProfissional = new ArrayList<Profissional>();
public static void main (String args[]) {
	int op = 1;

	while (op != 3) {
		op = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Escolha uma opção: " + "\n1 - Inserir Profissional: " + "\n2 - Listar Profissional" + "\n3 - Sair"));
		while (op < 0 || op > 3) {
			op = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Voce digitou uma opção invalida, tente novamente: "
							+ "\n1 - Inserir Profissional: " + "\n2 - Listar Profissional" + "\n3 - Sair"));
		}
		if (op == 1) {
			op = 0;
			op = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Insira qual tipo de profissional: " + "\n1 - Professor Portugues, 2 - Professor Matematica, 3 - Professor Completo, 4 - Diretor."));
			if (op == 1) {
				op = 0;
				inserirProfessorPortugues();
			}
			if (op == 2) {
				inserirProfessorMatematica();
			}
			if (op == 3) {
				inserirProfessorCompleto();
			}
			if(op == 4) {
				inserirDiretor();
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

private static void inserirProfessorPortugues() {
	profp = new ProfessorPortugues();
	profp.setNome(JOptionPane.showInputDialog(null, "Insira o nome do Professor de Portugues."));
	profp.setEscolaridade(JOptionPane.showInputDialog(null, "Insira a Escolaridade do Professor de Portugues."));
	ListaProfissional.add(profp);
	
}

private static void inserirProfessorMatematica() {
	profm = new ProfessorMatematica();
	profm.setNome(JOptionPane.showInputDialog(null, "Insira o nome do Professor de Matematica."));
	profm.setEscolaridade(JOptionPane.showInputDialog(null, "Insira a Escolaridade do Professor de Matematica."));
	ListaProfissional.add(profm);
}

private static void inserirProfessorCompleto() {
	profcom = new ProfessorCompleto();
	profcom.setNome(JOptionPane.showInputDialog(null, "Insira o nome do Professor de Todas as materias."));
	profcom.setEscolaridade(JOptionPane.showInputDialog(null, "Insira a Escolaridade do Professor de Todas as materias."));
	ListaProfissional.add(profcom);
}

private static void inserirDiretor() {
	dir = new Diretor();
	dir.setNome(JOptionPane.showInputDialog(null, "Insira o nome do Diretor."));
	dir.setEscolaridade(JOptionPane.showInputDialog(null, "Insira a Escolaridade do Diretor."));
	ListaProfissional.add(dir);
}
private static void listarItens() {

	for (int i = 0; i < ListaProfissional.size(); i++) {
		JOptionPane.showMessageDialog(null, ListaProfissional.get(i));
	}
}
}

