package Exercicioslista2;
import java.util.Scanner;

public class Exercicio2_4 {

	public static void main(String args[]) {
		
		// inteiro = int
		int n1, result, d, r;
		Scanner leia = new Scanner(System.in);
		

		System.out.print ("Este programa tem a finalidade verificar se o numero que voce vai digitar seja par ou impar.\n ");
		System.out.print ("Digite o numero: ");
		n1 = leia.nextInt();
		
	result = (n1 % 2);
		
		
		if (result == 0) {
		System.out.println("o seu numero digitado foi par: "+n1);
		}
		else  {
			System.out.println("o seu numero digitado foi impar: "+n1);
		}
	}
}
