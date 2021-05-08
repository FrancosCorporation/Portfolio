package ListasTestes;
import java.util.Scanner;
public class Teste {

	public static void main(String[] args) {
	
		//Declaracao de Variaveis
		int m;
		float maior = -999999,menor = 11;
		float soma = 0,calc,n1, n2;
		Scanner in = new Scanner (System.in);
		m=1;
		
		while(m<=3){
		System.out.print("\nDigite a primeira nota do aluno "+m+" : ");
		n1 = in.nextInt();
		while (n1 >10 | n1 <0) {
    		System.out.println("Voce digitou um numero de nota invalido, digite um numero entre 0 e 10:");
    		n1 = in.nextInt();  } 
		System.out.print("\nDigite a segunda nota do aluno "+m+" : ");
		n2 = in.nextInt();
		while (n2 >10 | n2 <0) {
    		System.out.println("Voce digitou um numero de nota invalido, digite um numero entre 0 e 10:");
    		n2 = in.nextInt();  } 
		calc=((n1+n2)/2);
		soma = ((calc*m)/m);	
		if (calc>maior) {
			maior=calc;
		if (calc<menor) {
				menor=calc;
			}}
	m++;}

				
		System.out.print("o numero de media geral foi: "+soma);
		System.out.print("\nA maior media foi: "+maior);
		System.out.print("\nA menor media foi: "+menor);
} static void se(boolean b) {
		// TODO Auto-generated method stub
		
		 }}
