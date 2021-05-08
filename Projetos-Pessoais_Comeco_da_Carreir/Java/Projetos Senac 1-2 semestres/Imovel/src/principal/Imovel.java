package principal;

public class Imovel {
	private String endereco;
	private double preco;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
public double imprimirValorImovel() {
	return this.getPreco();
}
public String imprimirEndereco() {
	return this.getEndereco();
}

}
