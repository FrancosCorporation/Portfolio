package Exercicioslista1;
import java.util.Scanner;
public class Exercicio1_4 {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		float n1, n2, n3, n4, result;
		String nome1, nome2, nome3, nome4;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Este programa vai calcular a media de peso das pessoas.\n ");
		
		System.out.print("Digite o peso da 1 pessoa: ");
		n1 = leia.nextFloat();
		System.out.print("Digite o peso da 2 pessoa: ");
		n2 = leia.nextFloat();
		System.out.print("Digite o peso da 3 pessoa: ");
		n3 = leia.nextFloat();
		System.out.print("Digite o peso da 4 pessoa: ");
		n4 = leia.nextFloat();
		
// calculo
		result = ((n1+n2+n3+n4)/4);
		
		
		System.out.println("A media de peso foi: "+result);
		
		
	}

}
