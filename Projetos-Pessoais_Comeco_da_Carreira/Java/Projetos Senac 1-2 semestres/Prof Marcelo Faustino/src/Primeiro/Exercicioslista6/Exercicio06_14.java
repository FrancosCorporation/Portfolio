package Exercicioslista6;

import java.math.BigDecimal;
import java.util.Scanner;

import ListasTestes.Teste;

public class Exercicio06_14 {
	public static void main (String args []) {
		Scanner in= new Scanner(System.in);
		float y,soma;
		double fator=1,x;
	 String afirma;	
		afirma="S";
		while(afirma.equalsIgnoreCase("S")) {
	System.out.println("Digite qualquer numero positivo: ");
		x=in.nextLong();
		while(x<=0) {
			System.out.println("Voce digitou um numero invalido, digite um numero positivo: ");
		x=in.nextLong();}
		while(x>=2) {
		fator=(fator)*x;
		x--;
		}
		System.out.println("o fatorial foi: "+fator);
		fator=1;
		System.out.println("\nDeseja continuar com o programa digite (S ou N): ");
		afirma = in.next();
		}
		System.out.println("\nEste programa foi finalizado!! ");
	
}
}

