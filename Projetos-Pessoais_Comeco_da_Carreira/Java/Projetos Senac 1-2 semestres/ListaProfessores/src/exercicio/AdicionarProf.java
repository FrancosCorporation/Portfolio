package exercicio;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class AdicionarProf {
	ArrayList<CadastroAnimal> listprof = new ArrayList<CadastroAnimal>();
	CadastroAnimal prof;

	public CadastroAnimal adicionarProf(ArrayList<CadastroAnimal> tamanho) {
		prof = new CadastroAnimal();
		listprof.addAll(tamanho);
		prof.setNome(JOptionPane.showInputDialog("Insira o nome do prof."), listprof.size() + 1);
		prof.setDisciplina(JOptionPane.showInputDialog("Insira a Disciplina que o " + prof.getNome() + " domina."));
		prof.setFormacao(JOptionPane.showInputDialog("Defina Qual a forma��o do " + prof.getNome()));
		prof.setPeriodo(Integer.parseInt(JOptionPane.showInputDialog(
				"Insira o periodo em que o " + prof.getNome() + " esta na materia " + prof.getDisciplina())));
		return prof;
	}
}
