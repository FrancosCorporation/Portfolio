package Exercicioslista1;
import java.util.Scanner;
public class Exercicio1_9 {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		float reais, dolar, result;
		double soma;
		String nome1, nome2, nome3, nome4;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Este programa convertera a quantidade de reais em dolares.\n ");
		
		System.out.print("Digite aqui a quantidade de dolares a ser convertido ");
		reais = leia.nextFloat();
		System.out.print("Digite aqui a cotacao do dolar atual: ");
		dolar = leia.nextFloat();
		
// calculo
		result = reais * dolar;
		
		System.out.print("O total em reais e: "+result);
		
		
	}

}
