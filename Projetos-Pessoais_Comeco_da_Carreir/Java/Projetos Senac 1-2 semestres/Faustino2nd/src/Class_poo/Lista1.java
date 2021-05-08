package Class_poo;

import java.util.Scanner;

public class Lista1 {

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		System.out.println("\n1 para inserir a data: ");
		System.out.println("2 para a média: ");
		System.out.println("3 para verificação de nº primo: ");
		System.out.println("4 para contagem de espaços em brancos: ");
		System.out.println("5 para contagem de consoantes: ");
		System.out.println("6 para positivo, negativo e nulo: ");
		System.out.println("7 para a media do aluno: ");
		System.out.println("0 para sair");
		int n = new Scanner(System.in).nextInt();
		while (n < 0 || n > 7) {
			System.out.println("Numero invalido, tente algumas opções do menu: ");
			menu();
		}
		funcoes(n);
	}

	public static void funcoes(int n) {
		if (n == 1) {
			data();
		}
		if (n == 2) {
			media();
		}
		if (n == 3) {
			primo();
		}
		if (n == 4) {
			countwitespace();
		}
		if (n == 5) {
			countcons();
		}
		if (n == 6) {
			negposnulo();
		}
		if (n == 7) {
			mediaaluno();
		}
		if (n == 0) {
			System.out.println("Fim do Programa.");
		}
	}

	public static void data() {
		Scanner in = new Scanner(System.in);
		int dia, ano, mes;

		System.out.print("Digite o Dia: ");
		dia = in.nextInt();
		while (dia < 1 | dia > 31) {
			System.out.println("Dia Invalido, Digite novamente: ");
			dia = in.nextInt();
		}
		System.out.print("Digite o Mês: ");
		mes = in.nextInt();
		while (mes < 1 | mes > 12) {
			System.out.println("Mes Invalido, Digite novamente: ");
			mes = in.nextInt();
		}
		System.out.print("Digite o Ano: ");
		ano = in.nextInt();
		while (ano < 1000 | ano >= 2020) {
			System.out.println("Ano Invalido, Digite novamente: ");
			ano = in.nextInt();
		}
		String[] list = new String[13];
		list[1] = "Janeiro";
		list[2] = "Fevereiro";
		list[3] = "Março";
		list[4] = "Abril";
		list[5] = "Maio";
		list[6] = "Junho";
		list[7] = "Julho";
		list[8] = "Agosto";
		list[9] = "Setembro";
		list[10] = "Outubro";
		list[11] = "Novembro";
		list[12] = "Dezembro";
		String lista = list[mes];

		System.out.println("\nA data é: " + dia + " de " + lista + " de " + ano);
		menu();
	}

	public static void media() {
		int total = 0, count = 0;
		System.out.println("Digite seu numero: ");
		int n = new Scanner(System.in).nextInt();
		while (n < -1) {
			System.out.println("Numero Invalido, Digite novamente: ");
			n = new Scanner(System.in).nextInt();

		}
		while (n != 0) {
			count++;
			total += n;
			System.out.println("Digite outro numero ou (-1 para sair): ");
			n = new Scanner(System.in).nextInt();
			while (n < 0) {
				System.out.println("Numero Invalido, Digite novamente: ");
				n = new Scanner(System.in).nextInt();

			}
		}
		System.out.println("\nA media é: " + total / count);
		menu();
	}

	public static void primo() {
		int n, f = 0, count = 1;
		boolean resp = false;
		System.out.println("Digite seu numero, para verificação se é primo: ");
		n = new Scanner(System.in).nextInt();
		while (n >= count) {
			if (n % count == 0) {
				f++;
			}
			count++;
		}
		if (f == 2) {
			resp = true;
			System.out.println("\nO seu numero é primo !");
		} else {
			System.out.println("\nO seu numero não é primo !");
		}
		menu();
	}

	public static void countwitespace() {
		String n;
		boolean resp = false;
		System.out.println("Digite a frase: ");
		n = new Scanner(System.in).nextLine();

		String white = n.replaceAll(" ", "");
		int tot = n.length() - white.length();

		System.out.println("\n" + tot);
		menu();
	}

	public static void countcons() {
		String n;
		System.out.println("Digite a frase com consoantes: ");
		n = new Scanner(System.in).nextLine();
		String[] list = new String[] { "a", "A", "e", "E", "i", "I", "o", "O", "u", "U", "0", "1", "2", "3", "4", "5",
				"6", "7", "8", "9", " " };
		int cou = 0;
		while (cou < list.length) {
			n = n.replace(list[cou], "");
			cou++;
		}
		int tot = n.length();
		System.out.println("\nO Total de consoantes foi: " + tot);
		menu();
	}

	public static void negposnulo() {
		int n;
		System.out.println("Digite um numero qualquer para verificação: ");
		n = new Scanner(System.in).nextInt();
		if (n >= 1) {
			System.out.println("\n" + 1);
		}
		if (n == 0) {
			System.out.println("\n" + 0);
		}
		if (n <= -1) {
			System.out.println("\n" + -1);
		}
		menu();
	}

	public static void mediaaluno() {
		float f;
		System.out.println("Digite a media do aluno entre (0,0 e 10,0): ");
		f = new Scanner(System.in).nextFloat();
		if (f >= 0.0 && f <= 4.9) {
			System.out.println("\nO Conceito do aluno foi (D) !!");
		} else if (f >= 5.0 && f <= 6.9) {
			System.out.println("\nO Conceito do aluno foi (C) !!");
		} else if (f >= 7.0 && f <= 8.9) {
			System.out.println("\nO Conceito do aluno foi (B) !!");
		} else if (f >= 9.0 && f <= 10.0) {
			System.out.println("\nO Conceito do aluno foi (A) !!");
		}
		menu();
	}

}
