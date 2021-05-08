package Exercicioslista6;

import java.util.Scanner;

public class louco {
	public static void main (String args []) {
	Scanner leia = new Scanner (System.in);
	
	int n,n2, n1,soma, resultado, result;
	
	
	n1 = 1;
	n2 = 1;
	resultado = 0;
	result = 0;
	
	System.out.println("\n\tInsira a quantidade de numeros que serão somados na sequencia acima: ");
	n = leia.nextInt();
	
		
	while  (n != 0) {
		if (n < 1) {
		System.out.println("\tNumero invalido por ser negativo. \n\tDigite um Numero: ");
		n = leia.nextInt();
		} else if (n > 100) { 
		System.out.println("\tNumero invalido por ser maior que 100. \n\tDigite um Numero: ");
		n = leia.nextInt();
		}
	
// numeros da sequencia sao somados a numeros impares para obter o proximo termo
// 1+1=2 2+3=5 5+5=10 10+7=17 1,3,5,7,9,11,13,15,17 
			
		while (n2 % 2 != 0) { // o n2 tem q ser um numero impar
		
		resultado = n1 + n2;
		result = resultado + n2;
		
		System.out.println("\n\t " + n1 + " + " + n2 + " = " + resultado);}
		System.out.println("\n\t " + resultado + " + " + n2 + " = " + result);
		
	}
	
	n2 ++;
	
		
			}
		}