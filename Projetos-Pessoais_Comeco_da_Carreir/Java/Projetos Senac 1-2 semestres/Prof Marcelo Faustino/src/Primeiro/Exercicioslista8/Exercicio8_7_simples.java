package Exercicioslista8;

import java.util.Scanner;

public class Exercicio8_7_simples {
public static void main(String[]args){
	Scanner in= new Scanner(System.in);
	int contm=0,contf=0,n=1,pessoas=2;
	String sexo;
	float altura,maioralt=-1,menoralt=10,alturafem=0,mediaaltfem;
	
	while(n<=pessoas) {
		    System.out.println("Insira o Sexo da Pessoa: ");
		    sexo= in.next();
		while(!sexo.equalsIgnoreCase("M")&!sexo.equalsIgnoreCase("F")) {
		    System.out.println("Voce digitou um sexo invalido: ");
			sexo= in.next();}
        if(sexo.equalsIgnoreCase("M")) {
        	contm++;    }
		    System.out.println("Insira a altura da Pessoa: ");
		    altura= in.nextFloat();
		while(altura<=0) {
		    System.out.println("Uma pessoa nao pode ter tamanho menor que zero, digite novamente: ");
			altura= in.nextFloat();}
		if(sexo.equalsIgnoreCase("F")) {
			contf++;alturafem+=altura;}
		if(altura>maioralt) {
			maioralt=altura;}
		if(altura<menoralt) {
			menoralt=altura;}
		n++;
	}

	mediaaltfem= alturafem/contf;
	System.out.println("A maior altura foi: "+maioralt+" A menor altura foi: "+menoralt);
	System.out.println("A media de altura das mulheres foi: "+mediaaltfem);
	System.out.println("O Total de Homens foi: "+contm);
	
}

}
