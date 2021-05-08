package exercicio2;

public class Pokemon {
	private String nome;
	private int pontosDeVida;
	private int dano;

	public String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	protected void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

	public int getDano() {
		return dano;
	}

	protected void setDano(int dano) {
		this.dano = dano;
	}
	protected String aplicaGolpe(String nome) {
		return nome+" aplicou golpe.";
	}
	
}
