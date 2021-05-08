package padrao;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		String url = JOptionPane.showInputDialog("Insira a Url para baixar !!");
		String[] separacao = url.split("/");
		System.out.println(separacao[separacao.length - 1]);
		System.out.println(url);

		// System.out.println(System.getProperty("user.home") + "\\Downloads");

	}

}
