package exercicio2;

public class Ponyta extends Rapidash{

	public Ponyta() {
		super.setNome("Ponyta");
		super.setDano(60);
		super.setPontosDeVida(150);
	}
	protected String aplicaGolpe(String nome,int dano) {
		setPontosDeVida(getPontosDeVida()-dano);
		return nome+" Aplicou o Golpe.\nDano: "+dano;
	}
}
