package Empresa;

public class ArmarioBanheiro extends Plastico{
	private String verdade="Não";
	private boolean comVidro;
	@Override
	public String toString() {
		if(this.comVidro) {
			this.verdade = "Sim";
		}
		return "Este Armario de Banheiro foi feito com: "+getMaterial()+
				"\nUtilidade: "+getDescricao()+
				"\nPreço: "+ getPrecoVenda()+
				"\nEste Armario de Banheiro possui Vidro: "+this.verdade+
				"\nTem a Qualidade: "+getQualidade();
	}

	@Override
	public void aumentarPreco(float percentual) {
		setPrecoVenda(getPrecoVenda()+(getPrecoVenda()*(percentual/100)));
		
	}

}
