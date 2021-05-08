package Exercicioslista2;
import java.util.Scanner;
public class Exercicio2_1{

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		int n1, n2 ;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Este Programa ira comparar os 2 numero digitados pelo usuario.\n ");
		System.out.print("Digite o primeiro numero:\n ");
		n1 = leia.nextInt();
		System.out.print("Digite o segundo numero:\n ");
		n2 = leia.nextInt();
	
		if (n1>n2) {
		System.out.println("o primeiro valor é maior que o segundo");
		}
		else if (n1==n2) {
			System.out.println("os valores sao iguais");
			}
		else  {
			System.out.println("o Segundo valor é maior");
			}
		
		
	}

	private static void se(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
