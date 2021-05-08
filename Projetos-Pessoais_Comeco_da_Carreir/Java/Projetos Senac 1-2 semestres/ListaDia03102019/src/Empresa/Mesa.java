package Empresa;

public class Mesa extends Plastico{
	private String cor;
	private int qtdeCadeiras;
	@Override
	public String toString() {
		
		return "Esta Mesa foi feita com: "+getMaterial()+
				"\nUtilidade: "+getDescricao()+
				"\nPreço: "+ getPrecoVenda()+
				"\nEsta Mesa tem a cor: "+this.cor+", e possui: "+this.qtdeCadeiras+" Lugares"+
				"\nTem a Qualidade: "+getQualidade();
	}

	@Override
	public void aumentarPreco(float percentual) {
		setPrecoVenda(getPrecoVenda()+(getPrecoVenda()*(percentual/100)));
		
	}
	}
