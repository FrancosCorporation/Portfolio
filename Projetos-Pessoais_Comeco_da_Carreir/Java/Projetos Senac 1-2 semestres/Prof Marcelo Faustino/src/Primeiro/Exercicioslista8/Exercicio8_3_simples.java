package Exercicioslista8;

import java.util.Scanner;

public class Exercicio8_3_simples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		double P=12, J=3, M=5.280, Pes;
		
		System.out.print("Informe o número para conversão: ");
		Pes = leia.nextDouble();
		
		P = Pes * P;
		J = Pes / J;
		M = Pes * M;
		
		System.out.println("Segue abaixo os dados convertidos");
		System.out.println(" O valor digitado em pés corresponde à "+P+" polegadas.");
		System.out.println(" O valor digitado em pés corresponde à "+J+" jardas.");
		System.out.println(" O valor digitado em pés corresponde à "+M+" milhas.");
	}

}
