package exercicio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExcluirProf {
	ArrayList<CadastroAnimal>listprof = new ArrayList<CadastroAnimal>();
	public void excluirProf(ArrayList<CadastroAnimal> tamanho) {
		JOptionPane.showMessageDialog(null, "Escolha na lista o id a ser excluido !!");
		Listar listar = new Listar();
		listprof.addAll(tamanho);
		listar.listar(listprof);
		int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Passe o parametro do ID do prof: ","Cuidado",JOptionPane.ERROR_MESSAGE));
		if(op<=listprof.size()) {
			listprof.remove(op-1);
			JOptionPane.showMessageDialog(null, "Removido Com Sucesso !!");
		}
		else {
		JOptionPane.showMessageDialog(null, "Parametro errado !! numero maior que a lista existente !!");
		}
	}
}
