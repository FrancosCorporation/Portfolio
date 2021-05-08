package Exercicioslista6;
import java.util.Scanner;
public class exercicio06_6 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nEste programa vai calcular se o numero B e maior que o A e so fara o calculo se for nessa condicao"
				+ "e para o primeiro valor voce decidira qual o numero da tabuada fara a multiplicacao");
		
	int  numero, numero2, multiplicador, resultado;
	int inicio,fim;	
	multiplicador = 0 ;		
	
		System.out.print("\nInsira um numero para calcular sua taboada em uma faixa determinada: ");
		numero = leia.nextInt();
		System.out.print("\n\n\tInsira o numero inicial: ");
		inicio = leia.nextInt();
		
		System.out.print("\n\n\tInsira o numero final: ");
		fim = leia.nextInt();
		
		
		while ((numero <=0)) {
			System.out.print("\n\n\t Voce digitou um numero invalido, digite outro numero: ");
			numero = leia.nextInt();}
	
			while(fim<inicio) {
		System.out.print("\n\n\t voce digitou o segundo valor menor que o primeiro, digite o fim novamente: ");
	fim = leia.nextInt();}
	
		while ( fim >= inicio) {
			resultado = (fim * numero);
			System.out.print("\n\t > " + numero + " x "  + fim + " = " + resultado );
			fim--;	
			
			}
			
		
		if (numero < 0) {
			System.out.print("\n\n\tInsira um número POSITIVO para calcular sua taboada de zero a dez: ");
			numero = leia.nextInt();	
	}

		}
}

		


