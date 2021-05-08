package Escola;

public abstract class Profissional {
	private String nome;
	private String escolaridade;
	
	public Profissional() {
		
	}
	public Profissional(String nome, String escolaridade) {
		this.nome = nome;
		this.escolaridade = escolaridade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	@Override
	public String toString() {
		return "Profissional\nnome: " + nome + ", escolaridade: " + escolaridade + " ";
	}

}
