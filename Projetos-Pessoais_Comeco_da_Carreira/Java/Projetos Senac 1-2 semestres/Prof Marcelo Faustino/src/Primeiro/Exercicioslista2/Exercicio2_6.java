package Exercicioslista2;
import java.util.Scanner;

public class Exercicio2_6 {


	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		String nome1, nome2;
		float n1, n2, result;
		Scanner leia = new Scanner (System.in);
	
		
		System.out.print("Este programa tem a finalidade de Calcular se o funcionario atingiu o premio.\n ");
		System.out.print("Digite o nome do Funcionario: ");
		nome1 = leia.nextLine();
		System.out.print("Digite qual a meta estabelecida: ");
		n2 = leia.nextInt();
		System.out.print("Digite o valor da venda do funcionario: ");
		n1 = leia.nextInt();
		
		
		
		if (n1>n2) {
		System.out.println("o " +nome1+ " Ganhou.");
		}
		
		else if (n1==n2) {
		System.out.println("o " +nome1+ " Ganhou.");
		}
		else  {
			System.out.println("o " +nome1+ " Nao atingiu a meta.");
			}
		
		
	}

	private static void se(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
