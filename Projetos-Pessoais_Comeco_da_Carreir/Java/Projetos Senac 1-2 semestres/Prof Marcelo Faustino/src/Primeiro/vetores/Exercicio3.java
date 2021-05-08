package vetores;

import java.util.Scanner;

public class Exercicio3 {

	private static Scanner leia;

	public static void main(String[] args) {

		leia = new Scanner(System.in);
		int v=2;
		int numeroA[] = new int[v+1];
		int numeroB[] = new int[v+1];
		int cont;
		numeroA[v] = 0;

		cont = 0;
		while (cont < v) {
			System.out.print("Digite o " + (cont + 1) + "º numero: ");
			numeroA[cont] = leia.nextInt();
			numeroB[cont] = numeroA[cont] * 3;
			cont++;
		}

		System.out.println("-------------------------------------------------");
		// Impressão na Ordem
		cont = 0;
		while (cont < v) {
			System.out.println("O " + (cont + 1) + "º numero digitado vetor A: " + numeroA[cont]);
			cont++;
		}

		System.out.println("-------------------------------------------------");
		// Impressão na Ordem
		cont = 0;
		while (cont < v) {
			System.out.println("O " + (cont + 1) + "º numero do vetor A multiplicado por 3: " + numeroB[cont]);
			cont++;
		}

	}

}
