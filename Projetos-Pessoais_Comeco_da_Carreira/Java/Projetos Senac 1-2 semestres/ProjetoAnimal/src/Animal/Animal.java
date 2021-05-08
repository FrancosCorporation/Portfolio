package Animal;

public class Animal {
	private String nome;
	private String raca;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public Animal(){
		
	}
	public Animal(String nome, String raca) {
		super();
		this.nome = nome;
		this.raca = raca;
	}
	public String caminha() {
		String c = "caminhando..";
		return c;
		
	}
	@Override
	public String toString() {
		return "Nome=" + nome + ", Raca=" + raca;
	}
}
