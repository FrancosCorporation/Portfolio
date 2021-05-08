package exercicio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MenuAlterarProf {
	ArrayList<CadastroAnimal> listprof = new ArrayList<CadastroAnimal>();
	CadastroAnimal prof;
	public CadastroAnimal menuAlterarProf(ArrayList<CadastroAnimal> tamanho,int posArray,CadastroAnimal posicao) {
		prof = new CadastroAnimal();
		listprof.addAll(tamanho);
		listprof.get(posArray);
		prof.setNome(JOptionPane.showInputDialog("Altere o nome do prof de: " + (posicao.getNome()) + " Para: "),
				posArray + 1);
		prof.setDisciplina(JOptionPane.showInputDialog("Altere a Disciplina que o " + prof.getNome() + " domina."));
		prof.setFormacao(JOptionPane.showInputDialog("Altere Qual a forma��o do " + prof.getNome()));
		prof.setPeriodo(Integer.parseInt(JOptionPane.showInputDialog(
				"Altere o periodo em que o " + prof.getNome() + " esta na materia " + prof.getDisciplina())));
		return prof;
	}
}
