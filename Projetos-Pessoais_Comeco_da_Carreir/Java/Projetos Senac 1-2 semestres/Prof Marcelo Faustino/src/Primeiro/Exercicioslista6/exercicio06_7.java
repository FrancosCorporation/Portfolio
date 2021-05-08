package Exercicioslista6;

import java.util.Scanner;

public class exercicio06_7 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		String enter;

		System.out.println("\n\tExibir a tabuada dos valores de um a vinte, no intervalo de um a dez. "
				+ "\n\tEntre as tabuadas, solicitar que o usuário pressione uma tecla. \n");
		enter = leia.nextLine();
		
		int numero, multiplicador, resposta;
		numero = 1; // 1 a 10
		multiplicador = 0; // 1 a 20
		resposta = 0;


		while (enter.equals("")) {
			while (multiplicador <= 19 && multiplicador >= 1) {
				resposta = numero * multiplicador;
				if (numero >= 0) {
				
				System.out.println("\t" + numero + " X " + multiplicador + " = " + resposta);
				multiplicador++;
			}

			System.out.println("\n\tPressione <enter> para imprimir a proxima tabuada: ");
			enter = leia.nextLine();
			numero++;
		}
		}
	}}