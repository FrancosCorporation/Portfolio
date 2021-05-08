package Empresa;

public class GuardaRoupa extends Madeira{
	private int numPortas;
	private float largura;
	private float altura;

	@Override
	public String toString() {
		
		return "Este produto foi feito com: "+getMaterial()+" / "+getTipoMadeira()+
				"\nUtilidade: "+getDescricao()+
				"\nPreço: "+ getPrecoVenda()+
				"\nEste Guarda Roupas possui: "+getNumPortas()+" portas"+
				"\nTem a Largura de: "+getLargura()+", e Altura de: "+getAltura();
	}

	@Override
	public void aumentarPreco(float percentual) {
		setPrecoVenda(getPrecoVenda()+(getPrecoVenda()*(percentual/100)));
		
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}


}
