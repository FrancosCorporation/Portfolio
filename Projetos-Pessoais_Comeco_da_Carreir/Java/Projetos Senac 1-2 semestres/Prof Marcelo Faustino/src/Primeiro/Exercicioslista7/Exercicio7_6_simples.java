package Exercicioslista7;

import java.util.Scanner;
public class Exercicio7_6_simples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		float Idade, Sexo, Cand;
		float Cont_E=0, Cont_A=0, Cont_B=0, Cont_C=0, Cont_M=0, Cont_P=0, Media_I, Cont_S=0, Cand_A=0, Cand_B=0, Cand_C=0;
		String e="S";
		
		while (e.equalsIgnoreCase("S") ) {
		Cont_E++;
		System.out.print("Informe sua idade: ");
		Idade = leia.nextFloat();
		while(Idade<=0) {
			System.out.print("Voce nao pode uma idade a 0 ou menor que isso, digite novamente: ");
			Idade = leia.nextFloat();
		}
		System.out.print("Informe 1 p/ Masculino e 2 p/ Feminino: ");
		Sexo = leia.nextFloat();
		while(Sexo<=0 ||Sexo>2) {
			System.out.print("Voce digitou um numero diferente de 1 ou 2, digite novamente: ");
			Sexo = leia.nextFloat();
		}
		System.out.print("Informe 1 p/ o candidato A, 2 p/ o candidato B e 3 p/ candidato C:" );
		Cand = leia.nextFloat();
		while(Cand<=0 ||Cand>3) {
			System.out.print("Voce digitou um numero diferente de 1 ou 2, digite novamente: ");
			Cand = leia.nextFloat();
		}
		Cont_M += Idade;
		
		
		if (Cand ==1) {
			Cont_A++;
		}
		if (Cand ==2) {
			Cont_B++;
		}
		if (Cand ==3) {
			Cont_C++;
		}
		
		if (Sexo ==1 && Cand ==1)  {
			Cand_A++;
		}
		if (Sexo ==1 && Cand ==2)  {
			Cand_B++;
		}
		if (Sexo ==1 && Cand ==3)  {
			Cand_C++;
		}
		System.out.println("Deseja continuar com o programa? (S ou N) !!");
		e=leia.next();
		while(!e.equalsIgnoreCase("S")&&!e.equalsIgnoreCase("N")) {
			System.out.println("Letra invalida, apenas (S ou N) !!");
			e=leia.next();
		}
		}
		
		Media_I = Cont_M/Cont_E;
		
		if ( Cand_A > Cand_B && Cand_A > Cand_C) {
			System.out.println("O Candidato preferido dos homens é o A");
		}
		if ( Cand_B > Cand_A && Cand_B > Cand_C) {
			System.out.println("O Candidato preferido dos homens é o B");
		}
		if (Cand_C > Cand_A && Cand_C > Cand_B ) {
			System.out.println("O Candidato preferido dos homens é o C");
		}
		if(Cand_A==Cand_B && Cand_A==Cand_C) {
			System.out.println("Houve empate nos votos aos candidatos !!");
		}
		if ( Cont_A > Cont_B && Cont_A > Cont_C) {
			System.out.println("O Candidato mais votado foi o candidato A com "+Cont_A+ " votos");
		}
		if ( Cont_B > Cont_A && Cont_B > Cont_C) {
			System.out.println("O Candidato mais votado foi o candidato B com "+Cont_B+ " votos");
		}
		if (Cont_C > Cont_A && Cont_C > Cont_B ) {
			System.out.println("O Candidato mais votado foi o candidato C com "+Cont_C+ " votos");
		}
		
		System.out.println("A média de idade dos eleitores é "+Media_I);

}
		
}
