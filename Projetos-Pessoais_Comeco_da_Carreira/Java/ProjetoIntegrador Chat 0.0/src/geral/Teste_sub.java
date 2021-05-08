package geral;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Teste_sub {

	public static void main(String args[]) {
		FileReader fr;
		String nstri = ", nome=";
		String distri = ", disciplina=";
		String forstri = ", formacao=";
		String peristri = ", periodo=";
		try {
			fr = new FileReader("C:\\Users\\rodol\\Desktop\\arq.txt");
		BufferedReader br = new BufferedReader(fr);
		String linha = "";
			while (br.ready()) {
				linha = br.readLine();
				if(linha.length()>10) {
					String nome = linha.substring(linha.indexOf(nstri), linha.lastIndexOf(distri));
					nome =nome.replaceAll(nstri, "");
					String disciplina = linha.substring(linha.indexOf(distri), linha.lastIndexOf(forstri));
					disciplina = disciplina.replaceAll(distri, "");
					String formacao = linha.substring(linha.indexOf(forstri), linha.lastIndexOf(peristri));
					formacao = formacao.replaceAll(forstri, "");
					String periodo = linha.substring(linha.indexOf(peristri), linha.lastIndexOf(""));
					periodo = periodo.replaceAll(peristri, "");
					System.out.println(nome+disciplina+formacao+periodo);}
				}
			
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "errou");
		}
		
	}
}
