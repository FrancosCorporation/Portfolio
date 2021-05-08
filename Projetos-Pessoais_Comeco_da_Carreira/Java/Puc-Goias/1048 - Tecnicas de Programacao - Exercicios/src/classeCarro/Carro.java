package classeCarro;

public class Carro {
	private String ligado;
	private int[] pneu = new int[4];

	public Carro() {
			setPneu(30);
	}
	
	public String getLigado() {
		return ligado;
	}

	public void setLigado(String ligado) {
		this.ligado = ligado;
	}

	public int[] getPneu() {
		return this.pneu;
	}

	public void setPneu(int valor) {
		for (int i = 0; i < pneu.length; i++) 
		   this.pneu[i] = valor;
	}
	
	
	
}
