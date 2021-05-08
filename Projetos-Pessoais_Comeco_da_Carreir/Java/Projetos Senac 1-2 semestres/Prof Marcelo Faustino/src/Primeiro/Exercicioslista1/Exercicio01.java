package Exercicioslista1;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		// Isso é um comentário
		// Declaração de Variáveis
		// String = literal
		String nome, endereco, email, fone;
		Scanner leia = new Scanner(System.in);
		
		// Leitura dos Dados
		//System.out.print = escreva
		System.out.print("Digite o nome da pessoa: ");
		// leia.next() = leia
		// = atribuição <-
		nome = leia.nextLine();

		System.out.print("Digite o endereço da pessoa: ");
		endereco = leia.nextLine();
		
		System.out.print("Digite o email da pessoa: ");
		email = leia.next();
		
		System.out.print("Digite o telefone da pessoa: ");
		fone = leia.next();
		
		// Impressão dos dados
		System.out.printf("O nome digitado foi: %s \n" , nome);
		System.out.println("O endereço digitado foi: " + endereco);
		System.out.println("O email digitado foi: " + email);
		System.out.println("O telefone digitado foi: " + fone);

	}

}
