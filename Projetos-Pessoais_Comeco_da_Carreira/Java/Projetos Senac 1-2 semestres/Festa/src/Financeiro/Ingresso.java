package Financeiro;

public class Ingresso {
private double valor;
public double getDinheiro() {
	return valor;
}

public void setDinheiro(double valor) {
	this.valor = valor;
}
public String imprimirValorIngresso() {
	return "Valor original= "+ valor;
}

}
