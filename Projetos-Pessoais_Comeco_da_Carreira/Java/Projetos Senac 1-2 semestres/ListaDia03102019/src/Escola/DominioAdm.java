package Escola;

import javax.swing.JOptionPane;

public interface DominioAdm {
	public static void organizarTarefas() {
		JOptionPane.showMessageDialog(null, "Organizando as Tarefas. ");

	}

	public static void redigirRedacao() {
		JOptionPane.showMessageDialog(null, "Redigindo Redação. ");
	}

	public static void designarCargos() {
		JOptionPane.showMessageDialog(null, "Designando Cargos. ");
	}

	public static void contratarFuncionarios() {
		JOptionPane.showMessageDialog(null, "Contratando funcionarios. ");
	}
}
