package Financeiro;

public class CamaroteInferior extends Vip{
	private String localizacao;

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String imprimirLocalizacao() {
		return "A localização= "+localizacao;
	}
}
