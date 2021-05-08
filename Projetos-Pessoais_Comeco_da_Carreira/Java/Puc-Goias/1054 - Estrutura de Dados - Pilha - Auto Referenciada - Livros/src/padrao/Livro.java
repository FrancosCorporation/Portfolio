package padrao;

public class Livro {
	private String autor, editora, titulo;

	public void setAutor(String aux) {
		autor = aux;
	}

	public void setEditora(String aux) {
		editora = aux;
	}

	public void setTitulo(String aux) {
		titulo = aux;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditora() {
		return editora;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getLivro() {
		return ("Titulo: "+titulo + "\n" +"Autor: " +autor + "\n" +"Editora: "+ editora + "\n");
	}
}