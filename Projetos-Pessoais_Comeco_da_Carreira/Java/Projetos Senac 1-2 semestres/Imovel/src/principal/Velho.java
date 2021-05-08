package principal;

public class Velho extends Imovel{
	private double desconto;

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
public String imprimirDesconto() {
	return "Valor original= "+this.getPreco()+" - Desconto ="+ this.getDesconto()+ " Valor com Desconto= " +(this.getPreco()-this.getDesconto());
}
}
