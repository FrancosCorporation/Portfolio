package Exercicioslista8;

import java.util.Scanner;

public class Exercicio8_6_simples {
     public static void main(String[]args) {
     Scanner in = new Scanner(System.in);
    	 int a,l,p,volume;
    	 
    	 System.out.println("Insira a Altura da sua caixa Dagua: ");
    	 a=in.nextInt();
    	 while(a<0) {
    		 System.out.println("Altura invalida, digite novamente um numero positivo ou zero: ");
        	 a=in.nextInt();
    	 }
    	
    	 System.out.println("Insira a Largura da sua caixa Dagua: ");
    	 l=in.nextInt();
    	 while(l<0) {
    		 System.out.println("Largura invalida, digite novamente um numero positivo ou zero: ");
        	 l=in.nextInt();
    	 }
    	
    	 System.out.println("Insira a Comprimento da sua caixa Dagua: ");
    	 p=in.nextInt();
    	 while(p<0) {
    		 System.out.println("Comprimento invalido, digite novamente um numero positivo ou zero: ");
        	 p=in.nextInt();
    	 }
    	 if(a==0&l==0&p==0) {
    		 System.out.println("Voce digitou todos os valores igual a 0, consequentimente, nao temos litragem de caixa !!");;
    	 }
    	 if(a==0) {
    		 a=1;	 
    	 }
    	 if(l==0) {
    		 l=1;
    		 }
    	 if(p==0) {
    		 p=1;	 
    	 }
    	 
    	 volume=a*l*p;
    	if(a>=1|l>=1|p>=1) {
    		System.out.println("O volume de armazenamento da sua caixa Dagua foi: "+volume+"m³");
    	}
    	 
    	 
     }

}
