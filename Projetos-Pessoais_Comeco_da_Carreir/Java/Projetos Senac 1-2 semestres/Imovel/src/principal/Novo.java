package principal;

public class Novo extends Imovel{
	private double valoradcional;

	public double getValoradcional() {
		return valoradcional;
	}

	public void setValoradcional(double valoradcional) {
		this.valoradcional = valoradcional;
	}
	
public String imprimirPrecoNovo() {
	return "Valor original= "+super.getPreco()+" + Valor Adcional= "+ this.getValoradcional()+", Total= "+(super.getPreco()+this.getValoradcional());
}
}
