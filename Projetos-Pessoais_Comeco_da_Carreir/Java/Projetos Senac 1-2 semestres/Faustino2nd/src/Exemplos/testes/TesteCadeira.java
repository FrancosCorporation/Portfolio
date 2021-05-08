package Exemplos.testes;

import Exemplos.classes.Cadeira;
import Exemplos.classes.Mesa;

public class TesteCadeira {

	public static void main(String[] args) {
		
		Cadeira objCadeira1 = new Cadeira();
		Cadeira objCadeira2 = new Cadeira();
		Mesa objMesa = new Mesa();
		
		// Não acessar diretamente um método *** Errado ***
		objMesa.movimentar();
		//objMesa.valor = 50;
		objMesa.setNumLugares(8);
		
		System.out.println("Dados da Mesa = "+ "Nº Lugares: " + objMesa.getNumLugares());
	}
}
