package Exercicioslista6;
import java.util.Scanner;
public class exercicio06_8 {
	public static void main (String args []) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\tExibir a tabuada dos valores de um a vinte, no intervalo de um a dez. "
				+ "\n\tEntre as tabuadas, solicitar que o usuário pressione uma tecla.\n");
		
		int num, mult, result, i, n;
		String enter;
		
		num = 1;
		n = 0;
		
		while (num>=1 && num<=100) {				
			System.out.println("\to resultado foi: "+ n + " + " + num);
			num = n+num;
			
			n++;
		}
		}
}