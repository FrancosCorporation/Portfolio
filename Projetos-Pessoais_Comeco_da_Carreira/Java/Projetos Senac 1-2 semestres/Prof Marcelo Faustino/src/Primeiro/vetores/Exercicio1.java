import java.util.Scanner;

public class Exercicio1 {

	private static Scanner leia;

	public static void main(String[] args) {

		leia = new Scanner(System.in);
		int v=100;
		String nome[] = new String[v];
		int matricula[] = new int[v];
		int cont;
		matricula[v] = 0;

		cont = 0;
		while (cont < 100) {
			System.out.print("Digite o nome do " + (cont + 1) + "º aluno: ");
			nome[cont] = leia.next();
			System.out.print("Digite a matricula do " + (cont + 1) + "º aluno: ");
			matricula[cont] = leia.nextInt();
			cont++;
		}

		System.out.println("-------------------------------------------------");
		// Impressão na Ordem
		cont = 0;
		while (cont < 100) {
			System.out.println("Aluno: " + nome[cont] + " tem matricula numero: " + matricula[cont]);
			cont++;
		}

	}

}
