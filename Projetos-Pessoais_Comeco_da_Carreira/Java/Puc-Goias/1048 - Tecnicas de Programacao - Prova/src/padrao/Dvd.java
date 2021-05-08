package padrao;

import java.util.ArrayList;

public class Dvd extends Midia {

	private int duracao;
	private ArrayList<Box> boxes;
	
	
	public Dvd() {
		super("", "", 1, "");
	}

	public Dvd(ArrayList<Box> boxes, int duracao, String artista, String nome, double preco, String status) {
		super(artista, nome, preco, status);
		this.duracao = duracao;
		this.boxes = boxes;
	}

	protected String getDvd() {
		String ajuda = "";
		for (int i = 0; i < boxes.size(); i++) {
			ajuda += " Boxe n:" + (i+1) + ", nome: " + boxes.get(i).getTitulo();
		}
		return "Dvd - nome: " + super.getNome() + " Preco: " + super.getPreco() + " Status:" + super.getStatus()
				+ " Artista: " + super.getArtista() + " Duração: " + this.duracao + ajuda;
	}
}
