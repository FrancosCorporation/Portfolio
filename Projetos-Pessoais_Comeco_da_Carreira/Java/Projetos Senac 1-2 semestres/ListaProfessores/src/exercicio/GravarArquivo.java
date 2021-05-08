package exercicio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class GravarArquivo {
	private String narq = "/arq.txt";
	public String getNarq() {
		return narq;
	}
	public void gravarArquivo(String conteudo, boolean criarNovoArq, String nomString) throws IOException {
		FileWriter fw = new FileWriter(nomString + narq, criarNovoArq);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(conteudo + "\n");
		JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso!");
		bw.close();
		fw.close();
	}
}
