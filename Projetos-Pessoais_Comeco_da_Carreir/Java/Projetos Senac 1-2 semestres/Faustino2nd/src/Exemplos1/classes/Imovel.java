package Exemplos1.classes;

public class Imovel {
	
	private int matricula;
	private String rua;
	private String cep;
	private String bairro;
	private String cidade;
	private String uf;
	private String tamanho;
	private String comodos;
	private String garagem;
	private int valor;
	private String tipo;
	private String status;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getComodos() {
		return comodos;
	}
	public void setComodos(String comodos) {
		this.comodos = comodos;
	}
	public String getGaragem() {
		return garagem;
	}
	public void setGaragem(String garagem) {
		this.garagem = garagem;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Imovel(int matricula, String rua, String cep, String bairro, String cidade, String uf, String tamanho,
			String comodos, String garagem, int valor, String tipo, String status) {
		this.matricula = matricula;
		this.rua = rua;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.tamanho = tamanho;
		this.comodos = comodos;
		this.garagem = garagem;
		this.valor = valor;
		this.tipo = tipo;
		this.status = status;
	}
	
	public Imovel() {
	}
	
	@Override
	public String toString() {
		return "Imovel [matricula=" + matricula + ", rua=" + rua + ", cep=" + cep + ", bairro=" + bairro + ", cidade="
				+ cidade + ", uf=" + uf + ", tamanho=" + tamanho + ", comodos=" + comodos + ", garagem=" + garagem
				+ ", valor=" + valor + ", tipo=" + tipo + ", status=" + status + "]";
	}

	
}
