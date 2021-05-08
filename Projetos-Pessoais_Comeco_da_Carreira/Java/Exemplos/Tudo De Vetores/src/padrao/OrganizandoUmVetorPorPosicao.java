package padrao;

public class OrganizandoUmVetorPorPosicao {
	static String anexo[] = { "1", "0", "1", "1", "0", "0" };
	static String anexo2[];
	static String anexo3[];
	static int nde0 = 0;
	static int nde1 = 0;
	static int j = 0;

	public static void main(String[] args) {
		for (int i = 0; i < anexo.length; i++) {
			if (anexo[i] == "1") {
				nde0++;
			}
			if (anexo[i] == "0") {
				nde1++;
			}
		}
		anexo2 = new String[nde0];
		anexo3 = new String[nde1];
		String[] anexo4 = new String[nde0 + nde1];

		while (j < 6) {
			if (anexo[j] == "1") {
				for (int i = 0; i < anexo2.length; i++) {
					if (anexo2[i] == null) {
						anexo2[i] = anexo[j];
						break;
					}
				}
			} else if (anexo[j] == "0") {
				for (int i = 0; i < anexo3.length; i++) {
					if (anexo3[i] == null) {
						anexo3[i] = anexo[j];
						break;
					}
				}
			}
			j++;
		}
		for (int i = 0; i < anexo2.length; i++) {
			for (int j = 0; j < anexo4.length; j++) {
				if(anexo4[j]==null) {
					anexo4[j]=anexo2[i];
					break;
				}
			}
			
		}
		for (int i = 0; i < anexo3.length; i++) {
			for (int j = 0; j < anexo4.length; j++) {
				if(anexo4[j]==null) {
					anexo4[j]=anexo3[i];
					break;
				}
			}
		}

		for (int i = 0; i < anexo.length; i++) {
			System.out.print(anexo[i]);
		}
		System.out.println("");
		for (int i = 0; i < anexo2.length; i++) {
			System.out.print(anexo2[i]);
		}
		System.out.println("");
		for (int i = 0; i < anexo3.length; i++) {
			System.out.print(anexo3[i]);
		}
		System.out.println("");
		for (int i = 0; i < anexo4.length; i++) {
			System.out.print(anexo4[i]);
		}
	}
}
