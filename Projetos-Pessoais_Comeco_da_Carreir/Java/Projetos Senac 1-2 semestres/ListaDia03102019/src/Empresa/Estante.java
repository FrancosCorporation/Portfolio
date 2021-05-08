package Empresa;

public class Estante extends Metal{
	private float altura;
	private float largura;

	@Override
	public String toString() {
		
		return "Esta Estante foi feita com: "+getMaterial()+
				"\nUtilidade: "+getDescricao()+
				"\nPreço: "+ getPrecoVenda()+
				"\nEsta Estante possui: "+getEspessura()+" de Espessura"+
				"\nE tambem a Largura de: "+this.largura+", e Altura de: "+this.altura;
	}

	@Override
	public void aumentarPreco(float percentual) {
		setPrecoVenda(getPrecoVenda()+(getPrecoVenda()*(percentual/100)));
		
	}
	
}
