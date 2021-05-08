package padrao;

public class Fila {
	private Celula[] veritens;
	private int frente, atras, maxTam;

	public Fila() {
		maxTam = 100;
		veritens = new Celula[maxTam];
		frente = 0;
		atras = frente;
	}

	public Fila(int tamanhoFila) {
		maxTam = tamanhoFila;
		veritens = new Celula[maxTam];
		frente = 0;
		atras = frente;
	}

	public boolean enfileira(Celula x) {
		if ((this.atras + 1) % this.maxTam == this.frente) {
			return false;
		}
		this.veritens[this.atras] = x;
		this.atras = (this.atras + 1) % this.maxTam;
		return true;
	}

	public Celula desenfileira() {
		if (this.vazia()) {
			return null;
		}
		Celula item = this.veritens[this.frente];
		this.veritens[this.frente]= null;
		this.frente= (this.frente+1)% this.maxTam;
		return item;
	}

	private boolean vazia() {
		return this.frente == this.atras;

	}
	public String imprime() {
		String total="";
		if(!this.vazia()) {
			for (int i = this.frente; i !=this.atras; i= (i+1)%this.maxTam) {
				total+=this.veritens[i].toString();
			}
		}
		return total;
	}
	
	

}
