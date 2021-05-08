package Exercicioslista4;
import java.util.Scanner;
public class Exercicio4_4 {

	private static Scanner leia;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double hip, cos, tang, eita;
		float a,b,c;
		leia = new Scanner(System.in);
		System.out.print("Este programa calculara se os valores formam um triangulo retangulo !!\n ");	
		System.out.print("Entre com o lado A: ");
		a = leia.nextFloat();
		System.out.print("Entre com o lado B: ");
		b = leia.nextFloat();
		System.out.print("Entre com o lado C: ");
		c = leia.nextFloat();
		hip=a;
		cos=b;
		tang=c;
		
		if((a)*2 == ((b)*2)+((c)*2)){
			hip = b; cos = a; tang=c;
			}		
		if((b)*2 == ((a)*2)+((c)*2)){
			hip = b; cos = a; tang=c;
			}
		if((c)*2 == ((a)*2)+((b)*2)){
			hip = c; cos = a; tang=b;
			}

	eita = (hip*hip) - ((cos*cos)+(tang*tang));
	if (eita == 0){
		System.out.println("Estes valores formam um triangulo !!");
		}
	else {
			System.out.println("Nao forma um triangulo retangulo!");
		
		}
				
	}
	}
