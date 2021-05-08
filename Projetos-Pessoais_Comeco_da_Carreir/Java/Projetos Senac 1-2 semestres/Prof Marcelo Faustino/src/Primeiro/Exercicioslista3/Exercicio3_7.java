package Exercicioslista3;
import java.util.Scanner;
public class Exercicio3_7 {

	private static Scanner leia;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Prod1, Distribuidor;
		float Custo, ImpostosProd,Taxas_D, ImpostosTProd, ImpostosD, Impostos_total;
		
		leia = new Scanner(System.in);
		
		System.out.print("Informe o produto: ");
		Prod1 = leia.nextLine();
		
		System.out.print("Digito o percentual de impostos incidentes do produto: ");
		ImpostosProd = leia.nextFloat();
		
		System.out.print("Digito o valor do Custo do produto: ");
		Custo = leia.nextFloat();
				
		System.out.print("Informe o valor das taxas do distribuidor: ");
		Taxas_D = leia.nextFloat();
		
		ImpostosTProd = (ImpostosProd * Custo)/100;
		ImpostosD = ( Taxas_D * Custo)/100;
		Impostos_total = ( ImpostosTProd + ImpostosD + Custo );
				
		
		System.out.print("O produto " + Prod1 + " tem o seu valor de venda de R$: " + Impostos_total);
		
				

	}

}
