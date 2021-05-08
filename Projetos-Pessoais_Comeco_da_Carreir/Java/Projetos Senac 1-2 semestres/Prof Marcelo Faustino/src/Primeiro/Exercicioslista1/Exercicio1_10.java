package Exercicioslista1;
import java.util.Scanner;
public class Exercicio1_10 {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		float p1, p2, p3, p4, p5, result, valortotal, result2;
		double soma;
		String nome1, nome2, nome3, nome4;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Este programa somara o valor de todos os produtos.\n ");
		
		System.out.print("Digite aqui o valor do 1 produto: ");
		p1 = leia.nextFloat();
		System.out.print("Digite aqui o valor do 2 produto: ");
		p2 = leia.nextFloat();
		System.out.print("Digite aqui o valor do 3 produto: ");
		p3 = leia.nextFloat();
		System.out.print("Digite aqui o valor do 4 produto: ");
		p4 = leia.nextFloat();
		System.out.print("Digite aqui o valor do 5 produto: ");
		p5 = leia.nextFloat();
		
		System.out.print("Digite aqui o valor que voce tem para pagamento: ");
		valortotal = leia.nextFloat();
		
		
		
// calculo
		result = (p1+p2+p3+p4+p5);
		result2 = (valortotal-result);
		System.out.print("O troco a ser devolvido e: "+result2);
		
		
	}

}
