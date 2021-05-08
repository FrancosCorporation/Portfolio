package exercicio2;

public class Pikachu extends Raichu{

	public Pikachu() {
		super.setNome("Pikachu");
		super.setDano(50);
		super.setPontosDeVida(160);
	}	
	protected String aplicaGolpe(String nome,int dano) {
		setPontosDeVida(getPontosDeVida()-dano);
		return nome+" Aplicou o Golpe.\nDano: "+dano;
	}
}
