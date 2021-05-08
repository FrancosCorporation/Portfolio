package padrao;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;

public class FazDownload {
	public static void main(String[] args) {
		try {
			//https://web.microsoftstream.com/video/2c75c399-8afb-450d-b5c6-91b8ee7ee3d8
			// cria URL
			String url = JOptionPane.showInputDialog("Insira a Url para baixar !!");
			String[] separacao = url.split("/");
			URL url1 = new URL(url);
			// abre uma conexao na url criada àcima
			URLConnection con = url1.openConnection();
			// tenta conectar.
			con.connect();
			// arquivo de saida
			FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.home")+"\\Downloads\\"+separacao[separacao.length-1]);
			int c = 0;
			do {
				// le o byte
				c = con.getInputStream().read();
				// escreve o byte no arquivo saida
				fileOut.write(c);
			} while (c != -1);
			// fecha o arquivo de saida
			fileOut.close();
			System.out.println("Arquivo baixado com sucesso");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
