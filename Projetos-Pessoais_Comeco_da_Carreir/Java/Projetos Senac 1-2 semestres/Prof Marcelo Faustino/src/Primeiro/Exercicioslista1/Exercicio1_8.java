package Exercicioslista1;
import java.util.Scanner;
public class Exercicio1_8 {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		float r, i, volt, n4, resist;
		double soma;
		String nome1, nome2, nome3, nome4;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Este programa ira fazer o calculo da voltagem do circuito.\n ");
		
		System.out.print("Digite aqui a resistencia do circuito: ");
		r = leia.nextFloat();
		System.out.print("Digite aqui a intensidade da corrente do circuito: ");
		i = leia.nextFloat();
		
// calculo
		volt = r * i;
		
		System.out.print("A voltagem do circuito e: "+volt);
		
		
	}

}
