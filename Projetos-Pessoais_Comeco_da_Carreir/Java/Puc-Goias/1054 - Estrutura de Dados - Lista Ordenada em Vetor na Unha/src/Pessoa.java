

public class Pessoa {
	String nome;
	int ultimo;
	int primeiro;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Nome: " + nome;
	}

	public int getUltimo() {
		return ultimo;
	}

	public void setUltimo(int ultimo) {
		this.ultimo = ultimo;
	}

	public int getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(int primeiro) {
		this.primeiro = primeiro;
	}

	

}
