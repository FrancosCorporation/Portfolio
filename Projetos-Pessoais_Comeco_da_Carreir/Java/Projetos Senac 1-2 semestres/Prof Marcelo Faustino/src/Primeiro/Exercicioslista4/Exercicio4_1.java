package Exercicioslista4;
import java.util.Scanner;
public class Exercicio4_1 {

	private static Scanner leia;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float area, base, altura;
		
		leia = new Scanner(System.in);
		System.out.print("Este programa calculara se o terro e grande ou pequeno !!\n ");	
		System.out.print("Entre com a base do retangulo: ");
		base = leia.nextFloat();
		System.out.print("Entre com a altura do retangulo: ");
		altura = leia.nextFloat();
		
		area = (base * altura);
		
		if (area>100) {
		System.out.println("Terreno Grande !!");
		}
		else {
			System.out.println("Terreno pequeno !!");
		
		}
				

	}

}
