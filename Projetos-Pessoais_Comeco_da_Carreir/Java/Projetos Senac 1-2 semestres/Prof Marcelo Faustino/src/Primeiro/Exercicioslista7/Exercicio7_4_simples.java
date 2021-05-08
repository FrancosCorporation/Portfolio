package Exercicioslista7;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exercicio7_4_simples {
	public static void main(String args[]) {
		DecimalFormat d= new DecimalFormat("#.##");
		Scanner in = new Scanner(System.in);
		double totalap, totalto, soma, mototok=55000, motoap=1500 ,meses=0;
		float jurostok=0.5f, jurosap=0.89f;
		System.out.println("Este programa ira calcular em quantos anos sera superada o numero de motocicletas em Tokio por Aparecida de Goiania !!");
		System.out.println("No momento esta da seguinte forma, Existem: "+mototok+" em Tokio, e em Ap de Gyn: "+motoap);
	while (motoap<mototok) {
		mototok += (mototok*jurostok/100);
		motoap += (motoap*jurosap/100);
		System.out.println(d.format(mototok)+"\n");
		System.out.println(d.format(motoap)+"\n");
		meses++;
		System.out.println(meses);
	}
	System.out.println("Fim do programa");
	}


}