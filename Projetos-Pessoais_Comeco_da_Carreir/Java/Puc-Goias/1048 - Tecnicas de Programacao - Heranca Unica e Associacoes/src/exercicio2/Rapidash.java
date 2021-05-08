package exercicio2;

public class Rapidash extends Pokemon{

	public Rapidash() {
		super.setNome("Rapidash");
		super.setDano(60);
		super.setPontosDeVida(250);
	}
	protected String aplicaGolpe(String nome,int dano) {
		setPontosDeVida(getPontosDeVida()-dano);
		return nome+" Aplicou o Golpe.\nDano: "+dano;
	}
	
}
