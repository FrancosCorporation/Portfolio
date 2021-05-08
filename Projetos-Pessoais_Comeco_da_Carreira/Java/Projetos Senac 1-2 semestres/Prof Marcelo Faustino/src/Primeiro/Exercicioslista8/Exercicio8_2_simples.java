package Exercicioslista8;

import java.util.Scanner;

public class Exercicio8_2_simples {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int Num=0, Soma=0, Count=1;
		float i=0;
		
		
		while (Count<=3) {
			System.out.print("Digite um numero: ");
			Num = leia.nextInt();
			Soma = Soma + Num;
			Count++;
						
			}
		if (Soma >= 100) {
			System.out.print("A soma dos números digitados é "+Soma+" e é maior que 100");
			}
		
		else{
			System.out.print("A soma dos números digitados é "+Soma+" e é menor que 100");
		}
			
			}

}
