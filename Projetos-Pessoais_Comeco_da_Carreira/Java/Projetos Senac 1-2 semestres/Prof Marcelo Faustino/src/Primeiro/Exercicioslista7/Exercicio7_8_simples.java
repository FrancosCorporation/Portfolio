package Exercicioslista7;

import java.util.Scanner;

public class Exercicio7_8_simples {
	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int conta = 0,contb=0,contc=0,contd=0,conte=0,respruim = 0,maioridr=0,maioridp = 0, maiorido=0,ida;     
	float cap=100, var=0;
	     String op,x;
	     x ="\nNota----------Significado"
	     		+ "\nA            | Otimo"
	     		+ "\nB            | Bom"
	     		+ "\nC            | Regular"
	     		+ "\nD            | Ruim"
	     		+ "\nE            | Pessimo";
	     
         while(cap>var) {
        	 System.out.println("Qual a sua idade? ");
        	 ida = in.nextInt();
        	 while(ida<=0) {
        		System.out.println("Idade errada, digite um numero positivo !! ");
            	ida = in.nextInt();
        	 }
        	 System.out.println("Digite sua opinião em relação ao filme, segundo as seguintes notas: ");
        	 System.out.println(x);
        	 op= in.next();
        	 while (!op.equalsIgnoreCase("a")&&!op.equalsIgnoreCase("b")&&!op.equalsIgnoreCase("c")&&!op.equalsIgnoreCase("d")&&!op.equalsIgnoreCase("e")) {
        		 System.out.println("Voce digitou uma letra errada, apenas (A,B,C,D ou E): ");
        		 System.out.println(x);
            	 op= in.next();}
        	 if(op.equalsIgnoreCase("a")) {
        		 if(ida>maiorido) {
        			 maiorido = ida; 
        		 }
        		 conta++;
        	 }
             if(op.equalsIgnoreCase("b")) {
            	 contb++;
        	 }
             if(op.equalsIgnoreCase("c")) {
            	 contc++;
        	 }
             if(op.equalsIgnoreCase("d")) {
            	 if(ida>maioridr) {
        			 maioridr = ida; 
        		 }
            	 respruim+=ida;
            	 contd++;
        	 }
             if(op.equalsIgnoreCase("e")) {
            	 if(ida>maioridp) {
            		 maioridp=ida;
            		 
            	 }
            	 conte++;
             }
        	 
        	var++;}
        	 System.out.println("\nEstas foram as quantidades de opinioes 'Otimas' : "+conta);
        	 System.out.println("A diferença percentual entre respostas bom e regular e: "+(((contb+contc)/cap)*100)+"%");
        	 System.out.println("A média de idade das pessoas que respondeu ruim: "+(respruim/cap));
        	 System.out.println("A percentagem de respostas péssimo: "+((conte/cap)*100)+" %"+" e a maior idade que utilizou esta opção: "+(maioridp));
        	 System.out.println("A maior idade que respondeu Otimo: "+maiorido+" E a maior idade que respondeu ruim: "+maioridr+" Logo a diferenca entre as duas e: "+((maioridr-maiorido)*1)+" anos.");
        	 }
         	}
         
