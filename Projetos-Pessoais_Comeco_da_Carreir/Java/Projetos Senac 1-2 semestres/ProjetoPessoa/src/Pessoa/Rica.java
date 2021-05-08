package Pessoa;

public class Rica extends Pessoa {

	private double dinheiro;

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public void fazCompras() {

	}

	@Override
	public String toString() {
		return super.toString() + ", dinheiro= " + dinheiro +"\n";
	}
}
