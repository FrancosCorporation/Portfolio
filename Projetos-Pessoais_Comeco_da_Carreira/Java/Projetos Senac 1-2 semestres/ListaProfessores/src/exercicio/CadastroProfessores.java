package exercicio;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CadastroProfessores {
	static CadastroAnimal prof;
	static ArrayList<CadastroAnimal> listprof;
	static String NOME_ARQ = System.getProperty("user.home");

	public static void main(String args[]) {
		int op = 1;
		listprof = new ArrayList<CadastroAnimal>();
		JOptionPane.showMessageDialog(null, "Este programa Vai cadastrar os Alunos !!");
		while (op != 0) {
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"Insira uma op��o:\n0 - Sair\n1 - Inserir Prof\n2 - Listar Prof\n3 - Alterar Prof\n4 - Excluir Prof\n5 - Gravar Dados\n6 - Ler Arquivo\n7 - Modificar Pasta Aonde salva."));
			if (op == 0) {
				JOptionPane.showMessageDialog(null, "Este programa Foi Finalizado !!");
			}
			if (op == 1) {
				prof = new CadastroAnimal();
				AdicionarProf adicionarProf = new AdicionarProf();
				prof = adicionarProf.adicionarProf(listprof);
				listprof.add(prof);
			}
			if (op == 2) {
				Listar listar = new Listar();
				listar.listar(listprof);
			}
			if (op == 3) {
				AlterarProf alterarProf= new AlterarProf();
				CadastroAnimal novo = alterarProf.alterarProf(listprof);
				listprof.set(alterarProf.getOp(), novo);
			}
			if (op == 4) {
				ExcluirProf excluirProf = new ExcluirProf();
				excluirProf.excluirProf(listprof);
			}
			if (op == 5) {
				String opcao = JOptionPane.showInputDialog(null,
						"Escolha se voce deseja subscrever digite (Sim) o arquivo ou criar um novo digite (Nao):");
				boolean verdadeiro = false;
				if (opcao.equalsIgnoreCase("sim")) {
					verdadeiro = true;
				}
				Listar listar = new Listar();
				opcao = listar.listar(listprof);
				try {
					GravarArquivo gravarArquivo= new GravarArquivo();
					gravarArquivo.gravarArquivo(opcao, verdadeiro, NOME_ARQ);
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
			if (op == 6) {
				LerArquivos lerArquivos= new LerArquivos();
				try {
					listprof = lerArquivos.lerArquivo(NOME_ARQ);
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
			if (op == 7) {
				EscolherPasta escolherPasta = new EscolherPasta();
			    NOME_ARQ = escolherPasta.escolherPasta();
			}
		}
	}
}
