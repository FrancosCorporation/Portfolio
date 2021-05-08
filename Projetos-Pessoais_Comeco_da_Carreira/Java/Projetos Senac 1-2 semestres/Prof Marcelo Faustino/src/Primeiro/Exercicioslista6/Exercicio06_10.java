package Primeiro.Exercicioslista6;

import java.util.Scanner;

public class Exercicio06_10 {
	public static void main (String args []) {
		Scanner in= new Scanner(System.in);
	
		float den, soma=0;
		System.out.println("Digite um valor positivo menor que 50: ");
		den = in.nextFloat();
		while (den<1 | den >50) {
			System.out.println("Voce digitou um numero invalido tente inserir um numero entre 1 e 50: ");
			den=in.nextFloat();
		}
		while (den >= 1) {
			soma = (soma+((den-1)/den));
			den--;
		}
		System.out.println("A soma da sequencia 1/2 + 2/3 + 3/4 + 4/5 ...= " + soma);

	
	}
}
