package exercicio2;


public class Raichu extends Pokemon{

	public Raichu() {
		super.setNome("Raichu");
		super.setDano(70);
		super.setPontosDeVida(200);
	}	
	protected String aplicaGolpe(String nome,int dano) {
		setPontosDeVida(getPontosDeVida()-dano);
		return nome+" Aplicou o Golpe.\nDano: "+dano;
	}
	
	
}
