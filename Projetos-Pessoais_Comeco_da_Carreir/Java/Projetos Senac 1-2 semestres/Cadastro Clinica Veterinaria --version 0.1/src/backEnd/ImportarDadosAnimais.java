package backEnd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ImportarDadosAnimais {
	public void gravarArquivo(ArrayList<CadastroAnimal> lista, String locarq, String nomearq, boolean criarNovoArq)
			throws IOException {
		FileWriter fw = new FileWriter(locarq + nomearq, criarNovoArq);
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i = 0; i < lista.size(); i++) {
			bw.write(lista.get(i).getNome() + "," + lista.get(i).getTipo() + "," + lista.get(i).getRaca() + ","
					+ lista.get(i).getCor() + "," + lista.get(i).getPeso() + "," + lista.get(i).getAltura() + ","
					+ lista.get(i).getAnoNasc() + "\n");
		}
		// bw.write(conteudo + "\n");
		if (!criarNovoArq) {
			JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Arquivo Subscrito e salvo com sucesso!");
		}
		bw.close();
		fw.close();

	}

	public ArrayList<CadastroAnimal> lerArquivo(String locarq, String nomearq, String separacao)
			throws FileNotFoundException, IOException {
		int id = 1;
		ArrayList<CadastroAnimal> listanimal = new ArrayList<CadastroAnimal>();
		FileReader fr = new FileReader(locarq + nomearq);
		BufferedReader br = new BufferedReader(fr);
		CadastroAnimal novoanimal;
		String[] linha;
		int i = 0;
		while (br.ready()) {
			if (listanimal.size() > 0) {
				id = listanimal.get((listanimal.size() - 1)).getId() + 1;
			}
			linha = br.readLine().split(separacao);
			novoanimal = new CadastroAnimal(id, linha[0], linha[1],
					linha[2], linha[3], Float.parseFloat(linha[4]), Float.parseFloat(linha[5]),
					Integer.parseInt(linha[6]));
			listanimal.add(novoanimal);
		}
		br.close();
		fr.close();
		JOptionPane.showMessageDialog(null,
				"Leitura realizada com sucesso, foram encontrados: " + listanimal.size() + " Cadastros !!");
		return listanimal;
	}

}
