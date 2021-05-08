package Exercicioslista8;

import java.util.Scanner;

public class Exercicio8_1_simples {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,soma,sub,sub1,mult,dv1,dv,elev;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entra com o valor com o primeiro numero: ");
		n1 = leia.nextInt();
		
		System.out.print("Entra com o valor com o segundo valor numero: ");
		n2 = leia.nextInt();
		
		soma = n1 + n2;
		mult = n1 * n2;
		dv = n1 / n2;
		dv1 = n2 / n1;
		sub = n1 - n2;
		sub1  = n2 - n1;
		elev = n1 * n1;
		
		System.out.println("Soma: " +soma+ "\nDivisão do 1/2: " +dv+ "\nDivisão 2/1: " +dv1+ "\nMultiplicação: " +mult+ "\nSubtração do 1/2: "+sub+"\nSubtração 2/1: " +sub1+ "\nElevação: "+elev);
		
	}

}
