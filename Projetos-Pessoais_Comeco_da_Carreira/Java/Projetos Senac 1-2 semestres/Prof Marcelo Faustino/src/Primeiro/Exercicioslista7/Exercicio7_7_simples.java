package Exercicioslista7;

import java.util.Scanner;
public class Exercicio7_7_simples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		int N=1,var=500;
		System.out.println("Os numero multiplus de 5 do numero: "+var+", sao: ");
		while ( N <= var) {
			if (N%5==0) {
			System.out.println(N);
			}
		N++;
	}
	}
}
