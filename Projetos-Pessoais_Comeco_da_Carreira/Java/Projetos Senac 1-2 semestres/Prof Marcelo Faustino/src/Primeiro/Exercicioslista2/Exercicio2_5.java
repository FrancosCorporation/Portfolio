package Exercicioslista2;
import java.util.Scanner;

public class Exercicio2_5 {
	public static void main(String[] args) {

	//Declaracao de Variaveis
	int n1, n2, result;
	Scanner leia = new Scanner (System.in);
	
	
	System.out.print ("Este programa tem a finalidade de comparar a diferença entre os valores.\n ");
	System.out.print ("Digite o 1 valor a ser comparado: ");
	n1 = leia.nextInt();
	System.out.print ("Digite o 2 valor a ser comparado: ");
	n2 = leia.nextInt();
	
	
	
if (n1>n2) {
	System.out.println("o primeiro valor foi maior !!" +n1);
	}
	
	else if (n1==n2) {
	System.out.println("os valores sao iguais !!" +n1+ "e" +n2);
	}
	else  {
		System.out.println("o segundo valor foi maior !!" +n2);
		}
	
}
	
}
