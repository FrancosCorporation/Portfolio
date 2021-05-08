package Exercicioslista2;
import java.util.Scanner;

public class Exercicio2_3 {


	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		String nome1, nome2;
		int ano1, ano2, ano3, resul1, resul2;
		Scanner leia = new Scanner (System.in);
	
		
		System.out.print("Este programa tem a finalidade de Calcular a idade de duas pessoas.\n ");
		System.out.print("Digite o ano atual: ");
		ano3 = leia.nextInt();
		System.out.print("Digite o nome da 1° pessoa: ");
		nome1 = leia.next();
		System.out.print("Digite o ano de nascimento da 1° pessoa: ");
		ano1 = leia.nextInt();
		System.out.print("Digite o nome da 2° pessoa: ");
		nome2 = leia.next();
		System.out.print("Digite o ano de nascimento da 2° pessoa: ");
		ano2 = leia.nextInt();
	
		resul1 = (ano3 - ano1);
		resul2 = (ano3 - ano2);
		
		if (ano1>ano2) {
		System.out.println("o " +nome1+ " é mais novo que o " +nome2+ " e tem "+resul1+ " anos.");
		}
		else if (ano1==ano2) {
			System.out.println("tanto o " +nome1+ " quanto o " +nome2+ " tem a mesma idade "+resul1+" anos.");
			}
		else  {
			System.out.println("o " +nome2+ " é mais novo que o " +nome1+" e tem " +resul2+" anos.");
			}
		
		
	}

	private static void se(boolean b) {
		// TODO Auto-generated method stub
		
	}

}