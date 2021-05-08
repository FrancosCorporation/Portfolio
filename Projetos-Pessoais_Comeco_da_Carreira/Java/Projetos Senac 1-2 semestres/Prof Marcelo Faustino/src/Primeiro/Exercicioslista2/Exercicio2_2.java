package Exercicioslista2;
import java.util.Scanner;
public class Exercicio2_2 {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		String nome1, nome2;
		int peso1, peso2 ;
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Este programa tem a finalidade de mostrar a pessoa mais pesada.\n ");
		System.out.print("Digite o nome da 1° pessoa: ");
		nome1 = leia.nextLine();
		System.out.print("Digite o peso da 1° pessoa: ");
		peso1 = leia.nextInt();
		System.out.print("Digite o nome da 2° pessoa: ");
		nome2 = leia.nextLine();
		System.out.print("Digite o peso da 2° pessoa: ");
		peso2 = leia.nextInt();
	
		if (peso1>peso2) {
		System.out.println("o " +nome1+ " é mais pesado que o " +nome2+ ".");
		}
		else if (peso1==peso2) {
			System.out.println("tanto o " +nome1+ " quanto o " +nome2+ " possuem o mesmo peso.");
			}
		else  {
			System.out.println("o " +nome2+ " é mais pesado que o " +nome1+".");
			}
		
		
	}

	private static void se(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
