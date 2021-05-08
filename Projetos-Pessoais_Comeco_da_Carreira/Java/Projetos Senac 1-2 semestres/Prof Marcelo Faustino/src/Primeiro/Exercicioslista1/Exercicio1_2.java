package Exercicioslista1;
import java.util.Scanner;
public class Exercicio1_2 {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		float n1, n2, result, rest ;

		Scanner leia = new Scanner (System.in);
		
		System.out.print("Este programa vai calcular a divisao e se existe resto.\n ");
		
		System.out.print("Digite o primeiro numero: ");
		n1 = leia.nextFloat();

		System.out.print("Digite o segundo numero: ");
		n2 = leia.nextFloat();
	
// calculo
		result = (n1/n2);
		rest	= (n1 % n2);
		
		
		System.out.println("O resultado da operacao de divisao foi: "+result);
		System.out.println("O resto da operacao de divisao por numeros inteiros: "+rest);
		
		
	}

}
