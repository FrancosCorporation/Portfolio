import java.util.Scanner;

public class Exercicio2 {

	private static Scanner leia;

	public static void main(String[] args) {

		leia = new Scanner(System.in);
		int numero[] = new int[201];
		int cont;
		numero[200] = 0;

		cont = 0;
		while (cont < 200) {
			System.out.print("Digite o " + (cont + 1) + "º numero: ");
			numero[cont] = leia.nextInt();
			numero[3] = numero[3];
			cont++;
		}

		System.out.println("-------------------------------------------------");
		// Impressão na Ordem
		cont = 0;
		while (cont < 200) {
			System.out.println("O " + (cont + 1) + "º numero digitado: " + numero[cont]);
			cont++;
		}

		System.out.println("-------------------------------------------------");
		// Impressão na Ordem Inversa
		cont = 199;
		while (cont >= 0) {
			System.out.println("O " + (cont + 1) + "º numero digitado: " + numero[cont]);
			cont--;
		}

	}

}
