package ListasTestes;
import java.util.Scanner;

public class ExemploEnquanto2 {

	public static void main(String[] args) {
		
		int cont = 1, num; // opcao = variável flag
		Boolean opcao;
		Scanner leia = new Scanner(System.in);
		
		// while = enquanto
		while (opcao = true) {
			System.out.print("Digite o " + cont + "º nº: ");
			num = leia.nextInt();
			System.out.println("O " + cont + "º nº = " + num);
			//cont = cont + 1; // Variável Acumuladora
			cont++;
			
			System.out.print("Deseja continuar (s/n): ");
			opcao = leia.nextBoolean();
		}
		System.out.println("Fim do Programa");
	}
	
}
