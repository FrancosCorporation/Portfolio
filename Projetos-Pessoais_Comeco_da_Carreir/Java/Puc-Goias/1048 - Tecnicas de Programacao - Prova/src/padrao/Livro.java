package padrao;

public class Livro extends Produto {
	private String autor;
	private int paginas;
	
	
	public Livro() {
	}
	
	public Livro(String autor, int paginas,String nome, double preco, String status) {
		super(nome, preco, status);
		this.autor = autor;
		this.paginas = paginas;
	}
	
	protected String getLivro() {
		return "Livro - nome: "+super.getNome()+" Preco: "+super.getPreco()+" Status:"+
	super.getStatus()+" Autor: "+this.autor+" N° de paginas: "+this.paginas;
	}

}
