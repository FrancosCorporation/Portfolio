import java.util.Scanner;

public class Calculadoradeprobabilidade {

	public static void main(String[] args) {
		
		System.out.println("insira n:");
		float n = new Scanner(System.in).nextFloat();
		System.out.println("insira x:");
		float x = new Scanner(System.in).nextFloat();
		System.out.println("insira taxa de sucesso: ");
		float sucesso = new Scanner(System.in).nextFloat();
		System.out.println("insira taxa de insucesso:");
		float insucesso = new Scanner(System.in).nextFloat();
		System.out.println("Resultado fatorial: "+probabilidade(x, n));
		System.out.println("Taxa de sucesso: "+probabilidadetaxasucesso(probabilidade(x, n),sucesso, insucesso));
		System.out.println("Taxa de insucesso: "+probabilidadetaxainsucesso(probabilidade(x, n),sucesso, insucesso));
	}
	
	
	public static double probabilidade(float x, float n) {
double fatorialn =1, fatorialx = 1,fatorialnmenosx =1 ,nmenosx=n-x;
		while(n>1) {
			fatorialn *= n;
			n--;
		}
		while(x>1) {
			fatorialx *= x;
			x--;
		}
		while(nmenosx>1) {
			fatorialnmenosx *= nmenosx;
			nmenosx--;
		}
		double resultado= fatorialn/(fatorialx*fatorialnmenosx);
		return resultado;
	}
	
	public static double probabilidadetaxasucesso(double fatorial, float sucesso, float insucesso) {
		double resultado=fatorial*Math.pow((insucesso/100), insucesso)*(fatorial*Math.pow((sucesso/100), sucesso));
		return resultado;
		
	}
	public static double probabilidadetaxainsucesso(double fatorial,float sucesso, float insucesso) {
		double resultado=Math.pow((insucesso/100), sucesso)*Math.pow((sucesso/100), insucesso);
		return resultado;
		
	}
}
