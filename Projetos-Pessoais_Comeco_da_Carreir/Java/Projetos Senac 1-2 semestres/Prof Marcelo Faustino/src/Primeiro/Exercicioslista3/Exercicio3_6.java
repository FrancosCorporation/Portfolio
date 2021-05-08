package Exercicioslista3;
import java.util.Scanner;

public class Exercicio3_6

{

	private static Scanner leia;
	
	public static void main(String[] args) {
	
		
		float Dolar, quatidadeDolar, totalDolar, Reais;
				
		leia = new Scanner(System.in);
		
		System.out.print("Entre com valor do dolar: ");
		Dolar = leia.nextFloat();
					
		System.out.print("Entre com a quatidade de dolar: ");
		quatidadeDolar = leia.nextFloat();
		Reais = 1;
		
		totalDolar = (Dolar * quatidadeDolar);
		
		System.out.print("O valor do dolar corresponde a R$ " + totalDolar + " Reais");
	}
	

}