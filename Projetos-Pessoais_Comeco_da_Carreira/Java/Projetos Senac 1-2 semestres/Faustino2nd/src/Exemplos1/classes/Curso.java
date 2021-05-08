package Exemplos1.classes;

public class Curso {
	
	private int codigo;
	private String nome;
	private String preRequisito;
	private int cargaHora;
	private double valor;
	
	public Curso() {
		
	}
	
	public Curso(int cod, String nome) {
		this.codigo = cod;
		this.nome = nome;
	}

	public int getCodigo() {
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPreRequisito() {
		return preRequisito;
	}
	public void setPreRequisito(String preRequisito) {
		this.preRequisito = preRequisito;
	}
	public int getCargaHora() {
		return cargaHora;
	}
	public void setCargaHora(int cargaHora) {
		this.cargaHora = cargaHora;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Curso [Código=" + codigo + ", Nome=" + nome + ", Pré-Requisito=" + preRequisito + ", Carga Hora="
				+ cargaHora + ", Valor=" + valor + "]";
	}

	
}
