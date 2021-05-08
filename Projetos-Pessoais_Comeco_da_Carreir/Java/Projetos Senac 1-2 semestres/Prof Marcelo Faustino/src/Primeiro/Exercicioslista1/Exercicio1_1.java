package Exercicioslista1;
import java.util.Scanner;
public class Exercicio1_1 {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		String nome, endereco, telefone, email;

		Scanner leia = new Scanner (System.in);
		
		System.out.print("Este programa vai cadastrar o usuario.\n ");
		System.out.print("Digite o nome: ");
		nome = leia.nextLine();

		System.out.print("Digite o endereco: ");
		endereco = leia.nextLine();
		
		System.out.print("Digite o telefone: ");
		telefone = leia.nextLine();
		
		System.out.print("Digite o E-mail: ");
		email = leia.nextLine();
	
// Sera impresso por esses comandos
		
		System.out.println("O nome e: "+nome);
		
		System.out.println("O endereco e: "+endereco);
		
		System.out.println("O endereco e: "+telefone);
		
		System.out.println("O E-mail e: "+email);
			}
		

	private static void se(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
