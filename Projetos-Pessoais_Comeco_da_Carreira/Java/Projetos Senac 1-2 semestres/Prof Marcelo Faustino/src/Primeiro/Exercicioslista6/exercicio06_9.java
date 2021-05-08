package Exercicioslista6;
import java.util.Scanner;
public class exercicio06_9 {
	public static void main (String args []) {
		Scanner in = new Scanner(System.in); 
		
	
	int n,s = 1, soma = 1;
	
	System.out.println("\nDigite um valor positivo menor igual a 100: ");
	n = in.nextInt();
	
	while (n<1 | n>=100) {
		System.out.println("\nNumero invalido. Digite um valor positivo menor que 100: ");
		n = in.nextInt();}
	while (n>=1 & n<100) {
		soma = (n*n)+s;
		System.out.println("A soma do numero anterior com o numero: "+n+" Resultou em: "+soma);
		n++;
		
	
	}
	
	
	
	}
}
