package Exercicioslista1;
import java.util.Scanner;
public class Exercicio1_7 {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		float n1, n2, n3, n4, div, mult;
		double soma;
		String nome1, nome2, nome3, nome4;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Este programa convertera os quilometros em milhas maritimas.\n ");
		
		System.out.print("Digite aqui o numero em metros para conversao: ");
		n1 = leia.nextFloat();
		
// calculo
		div = n1/1000;
		mult = (div*1852);
		
		System.out.print("O total de milhas e: "+mult);
		
		
	}

}
