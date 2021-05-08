package padrao;

import javax.swing.JOptionPane;

public class Principal {

	public static class Main {

		public static Livro obtemLivro() {
			Livro aux = new Livro();
			String str;
			aux.setTitulo(JOptionPane.showInputDialog("Digite o Título do Livro."));
			aux.setAutor(JOptionPane.showInputDialog("Digite o Autor do Livro.\n"));
			aux.setEditora(JOptionPane.showInputDialog("Digite a Editora do Livro."));
			return aux;
		}

		public static void main(String[] args) {
			Pilha pilha = new Pilha();
			int n;
			Livro novo = null;
			do {
                switch (n=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite:\n1 - para empilhar um livro.\n2 - para desempilhar um livro.\n3 - para encerrar o programa."))) {
				case 1:
					novo = obtemLivro();
					pilha.push(novo);
					JOptionPane.showMessageDialog(null, "Pilha com " + pilha.getTam() + " livros.");
					novo = null;
					break;

				case 2:
					novo = pilha.pop();
					if (novo == null)
						JOptionPane.showMessageDialog(null, "Erro!");
					else
						JOptionPane.showMessageDialog(null, "Foi Desempilhado: \n"+novo.getLivro());
					novo = null;
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "Programa encerrando!");
				}

			} while (n != 3);
		}

	}

}
