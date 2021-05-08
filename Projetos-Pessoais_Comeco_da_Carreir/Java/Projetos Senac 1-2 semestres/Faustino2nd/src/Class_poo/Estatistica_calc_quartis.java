package Class_poo;

import java.util.Scanner;

public class Estatistica_calc_quartis {
	static int n, f, op=0;
	public static void main(String[] args) {
		menu();
		
	}
	public static void menu() {
		System.out.println("0 para sair: ");
		System.out.println("1 para calculadora: ");
		System.out.println("2 para inserir um novo numero total da sequencia: ");
		op= new Scanner(System.in).nextInt();
		if(op==1) {
			calc();
		}
		if(op==2) {
			System.out.println("Digite o numero total da sequencia: ");
			n = new Scanner(System.in).nextInt();
			calc();
		}
		if(op==0) {
			System.out.println("Fim do programa.");
		}
	}
	public static void calc() {
		
		double v;
		while(true) {
		System.out.println("Digite a posição que voce deseja calcular ou (0 para sair): ");
		f = new Scanner(System.in).nextInt();
		if(f==0) {
			menu();
			break;
		}
		v= ((f-0.5)/n)*100;
		String t= String.format("%.2f", v);
		System.out.println("A sua porcentagem é: "+t);
		}
	}

}
