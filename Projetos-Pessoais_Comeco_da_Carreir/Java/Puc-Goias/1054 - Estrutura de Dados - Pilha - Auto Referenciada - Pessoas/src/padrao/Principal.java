package padrao;

import javax.swing.JOptionPane;

public class Principal {

	public static class Main {

		
		public static void main(String[] args) {
			Pilha pilha = new Pilha();
			int n;
			Pessoa novo = null;
			do {
                switch (n=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite:\n1 - para empilhar um Pessoa.\n2 - para desempilhar a ultima Pessoa.\n3 - para encerrar o programa."))) {
				case 1:
					novo = obtemLivro();
					pilha.push(novo);
					JOptionPane.showMessageDialog(null, "Pilha com " + pilha.getTam() + " Pessoa.");
					novo = null;
					break;

				case 2:
					novo = pilha.pop();
					if (novo == null)
						JOptionPane.showMessageDialog(null, "Erro, sem ninguem empilhado !!, insira pessoas !!");
					else
						JOptionPane.showMessageDialog(null, novo.getNome()+"\nFoi Desempilhado.");
					novo = null;
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Programa encerrando!");
				}

			} while (n != 3);
		}
		public static Pessoa obtemLivro() {
			Pessoa aux = new Pessoa();
			aux.setNome(JOptionPane.showInputDialog("Digite o Nome da pessoa para adicionar !!"));
			return aux;
		}


	}

}
