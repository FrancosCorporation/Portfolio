package Exercicioslista3;
import java.util.Scanner;

public class Exercicio3_4 {

	private static Scanner leia;

	public static void main(String[] args) {
			
		String nomeCliente, nomeBanco, numeroConta, agenciaCliente;
		float chequesDebitar, totalDinheiro, chequesCreditar, limiteCredito, saldoAtual, saldoFinal, Total;
				
		leia = new Scanner(System.in);
		
		System.out.print("Informe o nome do correntista: ");
		nomeCliente = leia.nextLine();
		
		System.out.print("Informe o número da conta corrente: ");
		numeroConta = leia.nextLine();
		
		System.out.print("Informe o nome do Banco: ");
		nomeBanco= leia.nextLine();
		
		System.out.print("Informe o numero da Agencia: ");
		agenciaCliente = leia.nextLine();
				
		System.out.print("Informe o valor total de cheques a Debitar: ");
		chequesDebitar = leia.nextFloat();
		
		System.out.print("Informe o total de dinheiro: ");
		totalDinheiro = leia.nextFloat();
		
		System.out.print("Informe o valor de cheques a Creditar: ");
		chequesCreditar = leia.nextFloat();
		
		System.out.print("Informe o limite de crédito: ");
		limiteCredito = leia.nextFloat();
		
		System.out.print("Digite o saldo atual ");
		saldoAtual = leia.nextFloat();
		
		saldoFinal = (chequesDebitar + totalDinheiro + chequesCreditar + limiteCredito);
		Total = (saldoFinal - chequesDebitar);
				
		System.out.print("O correntista " + nomeCliente + " do banco " + nomeBanco + " conta corrente " + numeroConta + " possui um saldo disponível de: " + Total);
		

	}

}