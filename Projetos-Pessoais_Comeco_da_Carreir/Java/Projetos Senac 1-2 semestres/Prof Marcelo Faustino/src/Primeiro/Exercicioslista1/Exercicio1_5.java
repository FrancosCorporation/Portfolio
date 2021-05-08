package Exercicioslista1;
import java.util.Scanner;
public class Exercicio1_5 {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		float n1, n2, n3, n4, result;
		String nome, nome2, nome3, nome4;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Este programa vai mostrar a primeira letra e a contagem de caracteres.\n ");
		
		System.out.print("Digite o nome: ");
		nome = leia.nextLine();
		
// calculo
		
		
		System.out.println("A primeira letra do nome e: "+nome.charAt(0));
		System.out.println("O total de caracteres do nome e: "+nome.length());
		
		
	}

}
