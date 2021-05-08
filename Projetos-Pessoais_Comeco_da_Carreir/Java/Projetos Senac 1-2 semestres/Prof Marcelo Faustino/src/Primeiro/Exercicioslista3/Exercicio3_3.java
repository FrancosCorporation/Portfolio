package Exercicioslista3;
import java.util.Scanner;
public class Exercicio3_3 {

	private static Scanner leia;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float Vda1, Vda2, Vda3, Vda4, Vda5, Vda6, Vda7, Vda8, Vda9, Vda10, Vda11, Vda12, TSemestre1, TSemestre2;
		String NomeLoja;
		leia = new Scanner(System.in);
		
		System.out.print("Informe o nome da Loja: ");
		NomeLoja = leia.nextLine();
		System.out.print("Informe o valor de vendas referente a Janeiro: ");
		Vda1 = leia.nextFloat();
		System.out.print("Informe o valor de vendas referente a Fevereiro: ");
		Vda2 = leia.nextFloat();
		System.out.print("Informe o valor de vendas referente a Março: ");
		Vda3 = leia.nextFloat();
		System.out.print("Informe o valor de vendas referente a Abril: ");
		Vda4 = leia.nextFloat();
		System.out.print("Informe o valor de vendas referente a Maio: ");
		Vda5 = leia.nextFloat();
		System.out.print("Informe o valor de vendas referente a Junho: ");
		Vda6 = leia.nextFloat();
		System.out.print("Informe o valor de vendas referente a Julho: ");
		Vda7 = leia.nextFloat();
		System.out.print("Informe o valor de vendas referente a Agosto: ");
		Vda8 = leia.nextFloat();
		System.out.print("Informe o valor de vendas referente a Setembro: ");
		Vda9 = leia.nextFloat();
		System.out.print("Informe o valor de vendas referente a Outubro: ");
		Vda10 = leia.nextFloat();
		System.out.print("Informe o valor de vendas referente a Novembro: ");
		Vda11 = leia.nextFloat();
		System.out.print("Informe o valor de vendas referente a Dezembro: ");
		Vda12 = leia.nextFloat();
		
		TSemestre1 = (Vda1 +  Vda2 +  Vda3 +  Vda4 +  Vda5 +  Vda6);
		TSemestre2 = (Vda7 +  Vda8 +  Vda9 +  Vda10 +  Vda11 +  Vda12);
		
		System.out.println("A loja " + NomeLoja + " vendeu no primeiro semestre um total de " + TSemestre1 + " e no segundo semestre um total de " + TSemestre2 );

	}

}