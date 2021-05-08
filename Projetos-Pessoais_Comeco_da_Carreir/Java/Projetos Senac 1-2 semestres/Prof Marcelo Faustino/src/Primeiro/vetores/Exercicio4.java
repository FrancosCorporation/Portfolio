import java.util.Scanner;

public class Exercicio4 {

	private static Scanner leia;

	public static void main(String[] args) {

		leia = new Scanner(System.in);
		String nomeProfessor[] = new String[50];
		int tempoProfissao[] = new int[50];
		int cont;
	
		cont = 0;
		while (cont < 50) {
			System.out.print("Digite o nome do " + (cont + 1) + "º professor: ");
			nomeProfessor[cont] = leia.next();
			System.out.print("Tempo de profissao " + (cont + 1) + "º professor: ");
			tempoProfissao[cont] = leia.nextInt();
			cont++;
		}

		System.out.println("-------------------------------------------------");
		// Impressão na Ordem
		cont = 0;
		while (cont < 50) {
			System.out.println(
					"PROFESSOR: " + nomeProfessor[cont] + " TEMPO DE PROFISSÃO: " + tempoProfissao[cont]);
			cont++;
		}

	}

}
