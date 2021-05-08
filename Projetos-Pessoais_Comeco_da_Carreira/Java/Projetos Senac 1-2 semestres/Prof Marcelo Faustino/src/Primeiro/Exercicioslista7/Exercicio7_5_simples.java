package Exercicioslista7;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio7_5_simples {
	public static void main(String args[]) {
		DecimalFormat d= new DecimalFormat("#.##");
		float n,contm=0,contf=0,meses,nmes = 0;
		String c = "S",s;
		Scanner in = new Scanner(System.in);
		
		//enunciado
		System.out.println("Este programa vai fazer a leitura de criancas mortas e vai imprimir os valores antes solicitados!!");
		
		//programa
		System.out.println("Insira a quantidade de criancas a serem lidas !!");
        n = in.nextInt();
        
        while (n<=0) {
			System.out.println("O numero digitado e invalido, digite um numero positivo: ");
			n=in.nextInt();}
        
        // Programa de incremetacao de sexo para cada bebe
        
        while (c.equalsIgnoreCase("S")) {
        	System.out.println("Digite o sexo do bebe (M ou F) !!");
        	s=in.next();
        while(!s.equalsIgnoreCase("M") && !s.equalsIgnoreCase("F")) {
        		System.out.println("Sexo invalido, digite apenas (M ou F) !!");
            	s=in.next();
            	}
        
         System.out.println("Digite agora em meses um numero de quantos meses viveu a crianca. ");
         meses=in.nextInt();	
                 
        while(meses<=0) {
            System.out.println("Meses invalidos, digite um numero positivo. ");
            meses=in.nextInt();}
        
        	System.out.println("Deseja continuar? ");
        	c=in.next();
        	
        	while(!c.equalsIgnoreCase("S") && !c.equalsIgnoreCase("N")) {
        		System.out.println("Letra errada, digite apenas (S ou N)");
            	c=in.next();}
        if(meses<=24) {
      	nmes++; }
    	if(s.equalsIgnoreCase("M")) {
        	contm++; }
        	else{
        	contf++;}}
        System.out.println("A porcentagem de criancas mortas foi: "+(((contm+contf)/n)*100)+"%");
        System.out.println("A porcentagem de criancas mortas do sexo masculino foi: "+(((contm)/n)*100)+"%");
        System.out.println("A porcentagem de criancas que viveram menos de 24 meses foi: "+(((nmes)/n)*100)+"%"); 
        }
	}
