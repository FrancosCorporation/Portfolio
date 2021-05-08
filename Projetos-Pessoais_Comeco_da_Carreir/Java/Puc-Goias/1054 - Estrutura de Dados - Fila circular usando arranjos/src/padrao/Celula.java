package padrao;

public class Celula {
	
	private int chave;
	private String nome;
	
	public Celula() {
		chave=0;
		nome = null;
	}
	
	public Celula(String nome, int key) {
		this.chave = key;
		this.nome = nome;
	}
	
	
	public int getChave() {
		return chave;
	}
	public boolean setChave(int chave) {
		return this.chave == chave;
	}
	public String getNome() {
		return nome;
	}
	public boolean setNome(String nome) {
		return this.nome == nome;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nchave=" + this.chave+"\n";
	}
	
	
	
}
