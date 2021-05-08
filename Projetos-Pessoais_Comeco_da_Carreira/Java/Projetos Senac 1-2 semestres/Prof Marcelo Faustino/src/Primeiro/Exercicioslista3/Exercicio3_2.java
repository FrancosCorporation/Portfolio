package Exercicioslista3;
import java.util.Scanner;
public class Exercicio3_2 {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		float hora, minutos, segundos, conversao;
		String m;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Este programa vai verificar quantos segundos existem dentro das horas inseridas.\n ");
	//Systema	
		System.out.print("Digite aqui a quantidade de horas: ");
		hora = leia.nextFloat();
		System.out.print("Digite aqui a quantidade de minutos: ");
		minutos = leia.nextFloat();
		System.out.print("Digite aqui a quantidade de segundos: ");
		segundos = leia.nextFloat();
		
	// calculo
		
		conversao = (((hora*60)*60)+(minutos*60)+(segundos));
		
		
		
		System.out.print("o total de segundos convertidos foram de: "+conversao);
	
	}

}
