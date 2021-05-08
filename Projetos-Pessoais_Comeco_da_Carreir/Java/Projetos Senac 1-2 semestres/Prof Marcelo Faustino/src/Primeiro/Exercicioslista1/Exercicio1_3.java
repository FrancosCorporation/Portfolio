package Exercicioslista1;
import java.util.Scanner;
public class Exercicio1_3 {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		float base, altura, result;

		Scanner leia = new Scanner (System.in);
		
		System.out.print("Este programa vai calcular a area do retangulo.\n ");
		
		System.out.print("Digite a base do retangulo: ");
		base = leia.nextFloat();

		System.out.print("Digite a altura do retangulo: ");
		altura = leia.nextFloat();
	
// calculo
		result = (base*altura);
		
		
		System.out.println("A area calculada foi: "+result);
		
		
	}

}
