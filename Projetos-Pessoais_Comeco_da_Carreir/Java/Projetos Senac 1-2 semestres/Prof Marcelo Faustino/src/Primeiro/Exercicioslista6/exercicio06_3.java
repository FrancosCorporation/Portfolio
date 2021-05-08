package Exercicioslista6;
import java.util.Scanner;
public class exercicio06_3 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Entrar via teclado com o sexo de determinado usuário, aceitar somente “F” ou “M” como respostas\n" + 
				"válidas,");
		
		String sexo;

		
		System.out.print("\n\nInsira \"f\" se for Mulher ou \"h\" se for Homem ou \"fim\" para interromper esse programa: ");
		sexo = leia.nextLine();
		
		while (!sexo.equalsIgnoreCase("fim")) {
			
			if (sexo.equals("f")) {
				System.out.print("> Mulher\n");
			} if (sexo.equals("h")) {
				System.out.print("> Homem\n");
			} if (!sexo.equals("h") & (!sexo.equals("f"))) {
				System.out.print("> Sexo nao cadastrado\n");
					
			}
			System.out.print("\nInsira \"f\" se for Mulher ou \"h\" se for Homem ou \"fim\" para interromper esse programa: ");
			sexo = leia.nextLine();	
			 if (sexo.equals("fim")) {
					System.out.print("> Fim do Programa");
			 }
	
		
		}

	}

}