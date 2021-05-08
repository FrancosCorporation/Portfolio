package Financeiro;

public class Vip extends Ingresso{
private double valorextra;

public double getValorExtra() {
	return valorextra;
}

public void setValorExtra(double valorextra) {
	this.valorextra = valorextra;
}

/*public String imprimirValorVip() {
	return super.imprimirValorIngresso()+ "+ Valor Extra= "+ valorextra +" Valor total= "+(super.getDinheiro()+this.valorextra);
	
}*/
}
