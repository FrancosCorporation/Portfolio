package Logica;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
         System.out.println("Digite: ");
         String n = new Scanner(System.in).nextLine();
        int f = Integer.parseInt(n, 2); //(Conversão para Decimal)
         String hex = Integer.toHexString(f);  //(Conversão para HexaDecimal)
        String oct = Integer.toOctalString(f);  //(Conversão para octal)
         System.out.println("Decimal= "+f+"\nHexadecimal= "+hex+"\nOctal= "+oct);
	}
}
