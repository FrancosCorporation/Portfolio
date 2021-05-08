import java.util.Scanner;

public class Exercicio5 {

	private static Scanner leia;

	public static void main(String[] args) {

		leia = new Scanner(System.in);
		int codigoProduto[] = new int[400];
		int quatidadeProduto[] = new int[400];
		int cont;
		
		cont = 0;
		while (cont < 400) {
			System.out.print("O codigo do " + (cont + 1) + "º produto: ");
			codigoProduto[cont] = leia.nextInt();
			System.out.print("Digite a quatidade em estoque do " + (cont + 1) + "º produto: ");
			quatidadeProduto[cont] = leia.nextInt();
			cont++;
		}

		System.out.println("-------------------------------------------------");
		// Impressão na Ordem
		cont = 0;
		while (cont < 400) {
			System.out.println(
					"O produto com codigo: " + codigoProduto[cont] + " tem: " + quatidadeProduto[cont] + " unidades em estoque!");
			cont++;
		}

	}

}
