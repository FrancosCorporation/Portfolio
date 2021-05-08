package Exercicioslista4;
import java.util.Scanner;
public class Exercicio4_2 {

	private static Scanner leia;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float peso, altura,imc;
		
		leia = new Scanner(System.in);
		System.out.print("Este programa calculara se o peso digitado sera ideal !!\n ");	
		System.out.print("Entre com o peso: ");
		peso = leia.nextFloat();
		System.out.print("Entre com a altura: ");
		altura = leia.nextFloat();
		
		imc = (peso / ((altura*altura)));
		
		if (imc<20) {
		System.out.println("Abaixo do peso !!");
		}
		else if (imc<=25){
			System.out.println("Peso ideal !!");
			}
		else {
			System.out.println("Acima do peso !!");
		
		}
				

	}

}
