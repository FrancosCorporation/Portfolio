package Exercicioslista5;
import java.util.Scanner;

public class Exercicio5_10 {

public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    int idade, oi, full = 0,candidato = 0,contarfem = 0,contarmasc=0, i=1, m,masc = 0,fem = 0, opcao = 1,total=0;
    float totalfreq, menor=10,maior = -99999,soma = 0, count, nota2 , nota3,frequencia, calc,media;
    String qualidade, sexo, experiencia;

    while(opcao!=0){
    	i=i++;
        System.out.print("\nDigite o numero do candidato : ");
    	candidato = in.nextInt();
		candidato = candidato;
		System.out.print("\nDigite a idade do candidato "+i+" : ");
		idade = in.nextInt();
		System.out.print("\nDigite o Sexo (m ou f) do candidato "+i+" : ");
		sexo = in.next();
		while (!sexo.equalsIgnoreCase("M") && (!sexo.equalsIgnoreCase("f"))) {
    		System.out.println("Voce digitou um sexo invalido, digite apenas (M ou F) !! ");
    		sexo = in.next();}
		System.out.print("\nDigite se o candidato candidato tem experiencia (s ou n) "+i+" : ");
		experiencia = in.next();
		while (!experiencia.equalsIgnoreCase("s") && (!experiencia.equalsIgnoreCase("n"))) {
    		System.out.println("Voce digitou uma letra diferente de (s ou n), digite apenas (S ou N) !! ");
    		experiencia = in.next();}
		soma = soma + idade;
			if (sexo.equalsIgnoreCase("m")) {
			masc = masc++;}
			else {
				fem = fem++;	}
		
		if (idade >=18 && experiencia.equals("s") && (sexo.equals("m"))) {
			full = full++;}
		System.out.print("Digite 0 para saír ou 1 para continuar: ");
		opcao = in.nextInt();	
		media = soma/i;
		total=masc+fem;
    }
    System.out.print("\nA media de idade e: "+soma);
    System.out.print("\nO numero total de candidatos: "+total);
	System.out.print("\nO numero total de candidatos Masculinos foram: "+masc);
	System.out.print("\nO numero total de candidatas Femininos foram: "+fem);	
	System.out.print("\nO total de homens e mulheres maiores de idade que tem experencia sao:  "+full);	
    }}
