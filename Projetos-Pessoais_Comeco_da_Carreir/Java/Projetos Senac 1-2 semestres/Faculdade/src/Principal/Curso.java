package Principal;


public class Curso {
	private int codigo,cargaHora;
    private String nome, preRequisito;
    private double valor;
    
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getCargaHora() {
		return cargaHora;
	}
	public void setCargaHora(int cargaHora) {
		this.cargaHora = cargaHora;
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
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
}
