package padrao;

public class Cd extends Midia {
	private int faixas;
	
	public Cd() {
		super("", "", 1, "");
	}

	public Cd(int faixas, String artista, String nome, double preco, String status) {
		super(artista, nome, preco, status);
		this.faixas = faixas;
	}
	protected String getCd() {
		return "Cd - nome: "+super.getNome()+" Preco: "+super.getPreco()+" Status:"+
				super.getStatus()+" Artista: "+super.getArtista()+" N° de faixas: "+this.faixas;
	}

}
