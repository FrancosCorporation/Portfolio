package Exercicioslista6;
import java.util.Scanner;
public class exercicio06_5 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		
		System.out.print("Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de aceitar somente valores\n" + 
				"positivos. Após a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez.");
		
		int  numero, multiplicador, resultado;
		
		multiplicador = 0; //contador
		
		System.out.print("\n\tinsira um numero entre 1 e 10 para calcular sua taboada: ");
		numero = leia.nextInt();
		
		while (numero >10 | numero <=0) {
    		System.out.println("Voce digitou um numero de nota invalido, digite um numero entre 0 e 10: ");
    		numero = leia.nextInt(); } 
    		
		while (multiplicador>=0 && multiplicador <=10) {
			resultado = (multiplicador * numero);
			System.out.print("\n\t > " + numero + " x "  + multiplicador + " = " + resultado);
			multiplicador ++;}
		
		}
		}

			
			


