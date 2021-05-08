package Exercicioslista8;

import java.util.Scanner;

public class Exercicio8_4_simples {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		float Prec_A=0, Vda_M=0, Prec_Aj=0, New_P=0;
	
		while (Prec_A<=0) {
			System.out.print("Informe o preço atual: ");
			Prec_A = leia.nextFloat();
			System.out.print("Informe a venda mensal: ");
			Vda_M = leia.nextFloat();
			
		}
		if ( Prec_A <30 && Vda_M <500) {
			New_P = Prec_A + Prec_A * 0.10f;
			System.out.print(" A venda média desse produto não atingiu a meta, porém seu preço atual reajustado em 10%, tendo seu novo valor para R$"+New_P);
		}
		if (( Prec_A >=30 && Prec_A <60) && (Vda_M >=500 && Vda_M <1200)) {
			New_P = Prec_A + Prec_A * 0.15f;
			System.out.print(" A venda média desse produto atingiu a meta, e tem seu preço atual reajustado em 15%, tendo seu novo valor para R$"+New_P);
		}
		if (Prec_A >=80 && Vda_M >=1200) {
			New_P = Prec_A - (Prec_A * 20)/100f;
			System.out.print(" A venda média desse produto não atingiu a meta, e tem seu preço atual diminuido em 20%, tendo seu novo valor para R$"+New_P);
		}
			
		}

}
