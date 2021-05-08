package Segundo.Exercicios;
import java.util.Scanner;

public class NovaCalculadora {

	// Variáveis Globais
	static Scanner leia = new Scanner(System.in);
	static int ano, idade, anoAtual = 2019;
	static int num1, num2, soma, opcao = 1;

	public static void main(String[] args) {
		
		while (opcao != 0) {
			System.out.println("0 = Sair do Programa: ");
			System.out.println("1 = Para Calcular a Idade: ");
			System.out.println("2 = Para Somar 2 números: ");
			System.out.println("3 = Para Multiplicar 2 números: ");
			System.out.println("4 = Para Subtrair 2 números: ");
			System.out.println("5 = Para Dividir 2 números: ");
			System.out.println("6 = Para Calcular o Fatorial: ");
			System.out.println("7 = Para Calcular a Soma dos numeros: ");
			System.out.println("8 = Para Calcular a Raiz Quadrada: ");
			System.out.println("9 = Para Calcular a Potenciaçâo: ");
			
			opcao = leia.nextInt();
			
			if (opcao == 1) {
				// Calcular a idade 
				System.out.print("Digite o seu ano de nascimento: ");
				ano = leia.nextInt();
				idade = anoAtual - ano;
				System.out.println("Idade = " + idade+"\n");
			}
			else if (opcao == 2){
				somar(); // chamada do método
			}
			else if (opcao == 3){
				multiplicar(); // chamada do método
			}
			else if (opcao == 4){
				subtrair(); // chamada do método
			}
			else if (opcao == 5){
				dividir(); // chamada do método
			}
			else if (opcao == 6){
				fatorial(); // chamada do método
			}
			else if (opcao == 7){
				somaale(); // chamada do método
			}
			else if (opcao == 8){
				raizquad(); // chamada do método
			}
			else if (opcao == 9){
				potenc(); // chamada do método
			}
		}
		System.out.println("Fim do Programa");
	}
	
	public static void somar() {
		ler2Numeros();
		soma = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + soma+"\n");
	}
	
	public static void multiplicar() {
		ler2Numeros();
		soma = num1 * num2;
		System.out.println(num1 + " x " + num2 + " = " + soma+"\n");
	}

	public static void subtrair() {
		ler2Numeros();
		soma = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + soma+"\n");
	}
	public static void raizquad() {
		raizquadrada();
		double total = Math.sqrt(num1);
		System.out.println("A Raiz Quadrada foi: "+total+"\n");
	}
	public static void potenc() {
		potenciacao();
		double total = Math.pow(num1, num2);
		System.out.println("O Nº Base: "+num1+" Elevado ao Nº:"+num2+" Resultou no Nº: "+total+"\n");
	}
	public static void somaale() {
		somaaleatoria();
		soma=0;
		while (num1>0) {
			System.out.println("Digite o numero a ser somado: ");
			int num2 = leia.nextInt();
			soma += num2;
			num1--;
		}
		System.out.println("A Soma dos numeros foi: "+soma+"\n");
	}
	public static void dividir() {
		dividir2n();
		soma = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + soma+"\n");
	}
	public static void fatorial() {
		fatorialden();
		soma=num1;
		String cont="";
		while (num1 > 1) {
		cont += num1+" x ";
		num1--;
		soma = num1*soma;
		}
		cont += "1 = ";
		System.out.println("O Fatorial de: "+ cont +" foi = "+soma+"\n");
	}
	
	public static void ler2Numeros() {
		// Ler 2 numeros
		System.out.print("Digite o 1º nº: ");
		num1 = leia.nextInt();
		System.out.print("Digite o 2º nº: ");
		num2 = leia.nextInt();
	}
	public static void dividir2n() {
		// Ler 2 numeros
		System.out.println("Digite o maior para dividir nº: ");
		num1 = leia.nextInt();
		System.out.println("Digite o menor para dividir nº: ");
		num2 = leia.nextInt();
	}
	public static void potenciacao() {
		// Ler 2 numeros
		System.out.println("Digite o nº para Base: ");
		num1 = leia.nextInt();
		System.out.println("Digite o nº para o Expoente: ");
		num2 = leia.nextInt();
	}
	public static void raizquadrada() {
		// Ler 2 numeros
		System.out.println("Digite o nº para calcular a raiz quadrada: ");
		num1 = leia.nextInt();
	}
	public static void fatorialden() {
		// Ler 2 numeros
		System.out.print("Digite o nº para o Fatorial:");
		num1 = leia.nextInt();
	}
	public static void somaaleatoria() {
		// Ler 2 numeros
		System.out.print("Digite a Quantidade de nº para serem digitados:");
		num1 = leia.nextInt();
	}
}
