package padrao;

public class UtilizandoVetores {

	public String[] colocandoVetorEmOrdemAlfabetica(String[] novo) {
		String[] aux = new String[novo.length];
		int a = 0;
		for (int i = 0; i < novo.length; i++) {
			for (int j = 0; j < novo.length; j++) {
				if (novo[j].toLowerCase().compareTo(novo[i].toLowerCase()) < 0) {
					a++;
				}
				if (novo[j].toLowerCase().compareTo(novo[i].toLowerCase()) == 0) {
					a--;
				}

			}
			aux[a + 1] = novo[i];
			a = 0;
		}
		return aux;

	}

	public String[] listaOrdenada(String[] novo, String nome) {
		String[] aux = new String[novo.length + 1];
		// int tamDoVetor = novo.length/2;
		if (novo[0] == null) {
			aux[0] = nome;
		}

		else if (novo.length <= 5) {
			for (int i = 0; i < novo.length; i++) {
				if (nome.toLowerCase().compareTo(novo[i]) < 0) {
					if (i == 0) {
						String ajuda = novo[0];
						novo[0] = nome;
						novo[1] = ajuda;
						return novo;
					} else {
						for (int j = 0; j < i - 1; j++) {
							aux[j] = novo[j];
						}
						aux[i - 1] = nome;
						for (int j = i; j < aux.length; j++) {
							aux[j] = novo[j - 1];
						}
						return aux;
					}

				} else if (i == novo.length - 1) {
					for (int j = 0; j < aux.length - 1; j++) {
						aux[j] = novo[j];
					}
					aux[aux.length - 1] = nome;
					return aux;
				}
			}
		}

		else if (novo.length > 5 && novo.length < 15) {
			aux[aux.length - 1] = nome;
			for (int i = 0; i < aux.length - 1; i++) {
				aux[i] = novo[i];
			}

			return novo = colocandoVetorEmOrdemAlfabetica(aux);

		} else {
			if (nome.toLowerCase().compareTo("m") < 0) {
				aux = novo;
				for (int i = 0; i <= novo.length; i++) {
					// comparando se o nome é menor que a variavel na posicao i
					// e tambem precisa ser maior que a proxima posicao i
					if (novo[i].toLowerCase().compareTo(nome) < 0 && novo[i + 1].toLowerCase().compareTo(nome) > 0) {
						for (int j = 0; j <= i; j++) {
							aux[j] = novo[j];
						}
						aux[i += 1] = nome;
						for (int j = i + 1; j < aux.length; j++) {
							aux[j] = novo[j];
						}
					}
				}
			} else if (nome.toLowerCase().compareTo("m") > 0) {
				for (int i = novo.length; i > 0; i--) {
					if (novo[i].toLowerCase().compareTo(nome) > 0 && novo[i - 1].toLowerCase().compareTo(nome) < 0) {
						for (int j = aux.length; j <= i; j--) {
							aux[j] = novo[j];
						}
						aux[i -= 1] = nome;
						for (int j = i - 1; j < aux.length; j--) {
							aux[j] = novo[j];
						}
					}

				}
			}
		}

		return aux;

	}

}
