package Exercicioslista6;

import java.util.Scanner;

public class Exercicio06_13 {
	public static void main (String args []) {
		Scanner in= new Scanner(System.in);
	float soma=0,posit,nega,media, somanega=0,somaposi=0,maior = -99999999,menor = 1000000,n=1, guardar = 0, x,y = 0;
	 String afirma;	
		afirma="S";
		while(afirma.equalsIgnoreCase("S")) {
	System.out.println("Digite a quantidade de numeros a serem inseridos entre 1 e 20: ");
		x=in.nextInt();
		while(x<=0 | x>20) {
			System.out.println("Voce digitou um numero invalido, digite um numero entre 1 e 20: ");
		y=in.nextInt();
		}
		y=x;
		while (x>0) {
			System.out.println("Digite qualquer numero: ");
			guardar=in.nextInt();
			x--;
			soma=soma+guardar;
			if (guardar>=1) {
				somaposi++;
			}
			else {
				somanega++;
			}
			if(guardar>maior) {
				maior=guardar;}
			if(guardar<menor) {
				menor=guardar;
			}}
			posit = ((somaposi/y)*100);
			nega = ((somanega/y)*100);
			media = soma /(y);
		System.out.println("O maior valor digitado foi: "+maior);
		System.out.println("A soma de todos os valores digitados foi: "+soma);
		System.out.println("A media aritmetica dos valores foi: "+media);	
		System.out.println("O menor valor digitado foi: "+menor);
		System.out.println("A porcentagem de valores que são positivos foi em %: "+posit);
		System.out.println("A porcentagem de valores negativos foi em %: "+nega);
		somaposi=0;somanega=0;soma=0;
		System.out.println("\nDeseja continuar com o programa digite (S ou N): ");
		afirma = in.next();
		}
		System.out.println("\nEste programa foi finalizado: ");
	}
}


