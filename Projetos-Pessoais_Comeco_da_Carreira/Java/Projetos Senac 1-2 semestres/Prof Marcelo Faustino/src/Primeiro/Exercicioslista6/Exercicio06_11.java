package Exercicioslista6;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio06_11 {
	public static void main (String args []) {
		Scanner in= new Scanner(System.in);
	
		int n=1, guardar = 0, result = 0,soma=0, media;
		while (n<=10) {
			System.out.println("Digite um numero positivo para ser seu "+n+" numero: ");
			guardar=in.nextInt();
			while(guardar<1) {
			System.out.println("Voce digitou um numero invalido, digite numeros positivos acima de 0: ");
			guardar=in.nextInt();
			}
			n++;
			soma=soma+guardar;
			if(guardar>result) {
				result=guardar;
			}}
			media = soma /(n-1);
		System.out.println("O maior valor digitado foi: "+result);
		System.out.println("A soma de todos os valores digitados foi: "+soma);
		System.out.println("A media aritmetica dos valores foi: "+media);	
	}

}
