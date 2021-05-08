package Exercicioslista7;
import java.util.Scanner;
public class Exercicio7_10_simples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float Altura, MaiorAlt=0, MenorAlt=9999, Perc;
		int N=0,Idade, SomaI=0, MediaI, SomaP=0, Cont_A2=0, Peso, Sexo, Cont_S=0;
		
		while (N<2) {
			System.out.print("Informe a idade: ");
			Idade = leia.nextInt();
			System.out.print("Informe o peso: ");
			Peso = leia.nextInt();
			System.out.print("Informe a altura: ");
			Altura = leia.nextFloat();
			System.out.print("Informe 1 p/ Masc. e 2 p/ Femin.: ");
			Sexo = leia.nextInt();
			SomaI += Idade;
			SomaP += Peso;
			N++;
			if ( Altura> MaiorAlt ) {
				MaiorAlt = Altura;
			}
			if (Altura < MenorAlt) {
				MenorAlt = Altura;
			}
			if (Sexo==2 && Idade <25) {
				Cont_S++;
			}
			}
		
		MediaI = SomaI/N;
		Perc = (N/Cont_S) *100;
		System.out.println(" A media das idades é: "+MediaI);
		System.out.println(" A soma dos pesos é: "+SomaP+ " KG");
		System.out.println(" A menor altura digita é: "+MenorAlt);
		System.out.println(" A maior altura digita é: "+MaiorAlt);
		System.out.println(" O percentual de mulheres abaixo de 25 anos é: "+Perc);

	}

}
