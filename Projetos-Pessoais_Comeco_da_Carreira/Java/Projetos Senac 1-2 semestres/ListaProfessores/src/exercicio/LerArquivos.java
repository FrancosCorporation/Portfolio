package exercicio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class LerArquivos {

	private String idstri = "Professor: id=";
	private String nstri = ", nome=";
	private String distri = ", disciplina=";
	private String forstri = ", formacao=";
	private String peristri = ", periodo=";

	public ArrayList<CadastroAnimal> lerArquivo(String nomearq) throws FileNotFoundException, IOException {
		GravarArquivo gv = new GravarArquivo();
		ArrayList<CadastroAnimal> listprof = new ArrayList<CadastroAnimal>();
		FileReader fr = new FileReader(nomearq + gv.getNarq());
		BufferedReader br = new BufferedReader(fr);
		CadastroAnimal prof = new CadastroAnimal();
		String linha;
		int i = 0;
		while (br.ready()) {
			linha = br.readLine();
			if (linha.length() > 10) {
				prof = new CadastroAnimal();
				String nome = linha.substring(linha.indexOf(nstri), linha.lastIndexOf(distri));
					prof.setNome(nome = nome.replaceAll(nstri, ""), i);
					String disciplina = linha.substring(linha.indexOf(distri), linha.lastIndexOf(forstri));
					prof.setDisciplina(disciplina = disciplina.replaceAll(distri, ""));
					String formacao = linha.substring(linha.indexOf(forstri), linha.lastIndexOf(peristri));
					prof.setFormacao(formacao = formacao.replaceAll(forstri, ""));
					String periodo = linha.substring(linha.indexOf(peristri), linha.lastIndexOf(""));
					prof.setPeriodo(Integer.parseInt(periodo = periodo.replaceAll(peristri, "")));
				listprof.add(prof);
				
			}
			i++;
		}
		br.close();
		fr.close();
		JOptionPane.showMessageDialog(null, "Leitura realizada com sucesso, fique a vontade para desfrutar.");
		return listprof;
	}

}
