package Exercicioslista3;
import java.util.Scanner;
public class Exercicio3_5 {

	private static Scanner leia;

	public static void main(String[] args) {
				
		String nomeCliente;
		float valorItem1, valorItem2, valorItem3, Quatidade1, Quatidade2, Quatidade3, totalConta;
		int SomaItem, QtdItem1, QtdItem2, QtdItem3;
		
		leia = new Scanner(System.in);
		
		System.out.print("Informe o nome do cliente: ");
		nomeCliente = leia.nextLine();
		
		
		System.out.print("Coca-Cola lata 350 ML Valor R$ 5,00? ");
		valorItem1 = leia.nextFloat();
		Quatidade1 = (valorItem1 * 5);
		QtdItem1 = 1;
		
		System.out.print("MC Big Mac Valor R$ 25,00? ");
		valorItem2 = leia.nextFloat();
		Quatidade2 = (valorItem2 * 25);
		QtdItem2 = 1;
		
		System.out.print("McFlurry Valor R$ 8,00? ");
		valorItem3 = leia.nextFloat();
		Quatidade3 = (valorItem3 * 8);
		QtdItem3 = 1;
		
		SomaItem = (QtdItem1 + QtdItem2 + QtdItem3);
		totalConta = (Quatidade1 + Quatidade2 + Quatidade3);
				
		System.out.print("O cliente " + nomeCliente + " comprou um total de " + SomaItem + " itens e pagará um total de " + totalConta);

	}

}