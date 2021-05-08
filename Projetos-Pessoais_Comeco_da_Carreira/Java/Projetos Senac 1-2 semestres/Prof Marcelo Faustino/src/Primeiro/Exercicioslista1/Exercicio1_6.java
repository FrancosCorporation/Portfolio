package Exercicioslista1;
import java.util.Scanner;
public class Exercicio1_6 {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		float n1, n2, n3, n4, mult, menos;
		double raiz, soma;
		String nome1, nome2, nome3, nome4;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Este programa vai mostrar a raiz do primeiro numero, multiplicar por 10 o segundo, diminuir 1 do terceiro, e somara todos os resultados anteriores.\n ");
		
		System.out.print("Digite o 1 numero: ");
		n1 = leia.nextFloat();
		System.out.print("Digite o 2 numero: ");
		n2 = leia.nextFloat();
		System.out.print("Digite o 3 numero: ");
		n3 = leia.nextFloat();
		System.out.print("Digite o 4 numero: ");
		n4 = leia.nextFloat();
		
// calculo
		raiz = (Math.sqrt(n1));
		mult = (n2*10);
		menos = (n3-1);
		soma = (raiz+menos+mult);
		System.out.println("A raiz quadrada deu "+raiz);
		System.out.println("A multiplicacao deu "+mult);
		System.out.println("A subtracao deu "+menos);
		System.out.println("A soma dos outros resultados deu "+soma);
		
		
	}

}
