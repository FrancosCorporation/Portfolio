package Exercicioslista7;
import java.util.Scanner;
public class aff {
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		int desp = 300, quantfixa= 130, aumentoing = 30;
		double valoring= 6.00,dif, lucro;
		lucro=((valoring*(quantfixa))-desp);
		dif=0.60;
		System.out.println("Este programa ira calcular se compensa que os precos do ingressos\nsejam abaixados em 0,60 centavos para que seja vendido a mais 30 ingressos");
		System.out.println("O valor do ingresso a: "+valoring+" aumentara: "+quantfixa+" Tera uma valor de lucro de: "+lucro);
	while (valoring>=1 & lucro>0) {
		lucro=((((valoring-=dif))*(quantfixa+aumentoing))-desp);
		System.out.println("O valor do ingresso a: "+valoring+" aumentara: "+aumentoing+" Tera uma valor de lucro de: "+lucro);
	}
	}


}