package partePrincipal;

import java.util.Random;

public class Bloco {
	public static void main(String[] args) {
		Random nr = new Random();
		int n = nr.nextInt(9);
		if (n % 2 != 0) {
			n += 1;
		}
		if (n == 4) {
			n = 0;
		}
		System.out.println(n);
	}
}