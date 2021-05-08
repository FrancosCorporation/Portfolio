package modelo;

public class CadastroDePessoas {

	private int id;
	private String nome;
	private String origem;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Marca [id=" + id + ", nome=" + nome + ", origem=" + origem + "]";
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
}
