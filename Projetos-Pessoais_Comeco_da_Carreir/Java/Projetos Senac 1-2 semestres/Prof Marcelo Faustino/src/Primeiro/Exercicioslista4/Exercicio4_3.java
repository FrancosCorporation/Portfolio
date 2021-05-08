package Exercicioslista4;
import java.util.Scanner;
public class Exercicio4_3 {

	private static Scanner leia;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float lado1, lado2, lado3;
		
		leia = new Scanner(System.in);
		System.out.print("Este programa vai verificar se formam ou nao um triangulo a partir dos valores inseridos !!\n ");	
		System.out.print("Informe o lado 1 do triangulo: ");
		lado1 = leia.nextFloat();
		System.out.print("Informe o lado 2 do triangulo: ");
		lado2 = leia.nextFloat();
		System.out.print("Informe o lado 3 do triangulo: ");
		lado3 = leia.nextFloat();
		
		
		if (lado1 < lado2+lado3 & lado2<lado1+lado3 & lado3<lado1+lado2){
		System.out.println("Estes valores formam um triangulo !!");
		}
		if(lado1==lado2 & lado1==lado3) {
				System.out.println("Triangulo Equilatero !!");
				}
		else if(lado1==lado2 | lado2==lado3 | lado1==lado3) {
			System.out.println("Triangulo Isosceles");
			}
		else if (lado1!=lado2 & lado1!=lado3) {
			System.out.println("Triangulo Isosceles");
			}
		
		else {
			System.out.println("Estes valores nao formam um triangulo !!");
		
		}
				
	}
	}
