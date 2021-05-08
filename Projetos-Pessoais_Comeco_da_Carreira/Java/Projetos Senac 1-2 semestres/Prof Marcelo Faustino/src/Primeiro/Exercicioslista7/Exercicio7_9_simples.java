package Exercicioslista7;

import java.util.Scanner;
public class Exercicio7_9_simples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float Num, Soma=0, SomaP=0, MediaI, SomaI=0, Cont=1, ContI=0;
		
		while( Cont==1) {
		System.out.print("Digite o numero: ");
		Num = leia.nextFloat();
		while (Num <0) {
		Num = leia.nextFloat();
		}
		if (Num%2==0) {
		SomaP +=Num;
		}
		else {
			SomaI += Num;
			ContI++;
		}
		System.out.print("Digite 1 para continuar ou 0 para sair ");
		Cont= leia.nextFloat();
		while (Cont <0 || Cont >1) {
			System.out.print("Você digitou um numero diferente de 1 ou 0 ");
			Cont= leia.nextFloat();
		}
		}


		MediaI = SomaI/ContI;
		System.out.println("A soma dos numero pares é "+SomaP);
		System.out.println("A media dos numeros impares é "+MediaI);
		}
	}

	

		
		
		
	


