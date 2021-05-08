package backEnd;

public class CadastroAnimal {
	private int id =0;
	private String nome;
	private String tipo;
	private String raca;
	private String cor;
	private float peso;
	private float altura;
	private int anoNasc;
	
	public CadastroAnimal() {
		
	}
	public CadastroAnimal(String nome, String tipo, String raca, String cor, float peso, float altura,
			int anoNasc) {
		this.id += 1;
		this.nome = nome;
		this.tipo = tipo;
		this.raca = raca;
		this.cor = cor;
		this.peso = peso;
		this.altura = altura;
		this.anoNasc = anoNasc;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	
}
