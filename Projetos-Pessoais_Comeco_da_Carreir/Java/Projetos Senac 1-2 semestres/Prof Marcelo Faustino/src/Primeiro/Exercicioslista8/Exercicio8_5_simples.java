package Exercicioslista8;

import java.util.Scanner;

public class Exercicio8_5_simples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String formaPagamento;
		float vendaCheque = 0, vendaDinheiro = 0, produto;
		float valorTotal;
		float valorProduto=0;
		int N = 1, contD =0, contC =0;
		
		
		while (N <= 25) {
			
			
			
		System.out.println("Informe o codigo do produto: ");
		produto = leia.nextFloat();
		
		
		System.out.println("Informe o valor do produto: ");
		valorProduto = leia.nextFloat();
		
		
		System.out.println("Informe a forma de pagamento 1 p/ D ou C: ");
		formaPagamento = leia.next();
			
		N++;
		
		if (formaPagamento.equalsIgnoreCase("D")) {
			contD++; 
			vendaDinheiro = contD * valorProduto;
		
		}
		if (formaPagamento.equalsIgnoreCase("C")) {
			contC++;
			vendaCheque = contC * valorProduto;
		}
		}
		
		
		valorTotal = vendaCheque + vendaDinheiro;
		
		System.out.println("Valor das vendas em dinheiro R$:" +vendaDinheiro);
		System.out.println("Valor das vendas em cheque R$:" +vendaCheque);
		System.out.println("Valor das vendas totais R$:" +valorTotal);
		
		}

}
