package comparacoes;

import javax.swing.JOptionPane;

public class MetodoCompareTo {

	public static String[] retornaVetorOrganizado(String[] aux) {
		String[] nome2 = new String[aux.length];
		int vet = 0;

		// Criando um laço para fazer a leitura do tamanho do vetor1 a ser comparado
		for (int i = 0; i < aux.length; i++) {
			// Segundo laço vetor de comparacao
			for (int j = 0; j < aux.length; j++) {
				// comparacao do item primeiro com o primeiro. primeiro com segundo.....
				if (aux[i].compareToIgnoreCase(aux[j]) > 0) {
					// quando a comparacao der um resultado com numero positivo, significa q o vetor
					// que esta sendo comparado é menor que o vetor comparado, assim ele recebe
					// indice
					// com o vet, esse numero do vet, servirá para colocar ele na posicao correta do
					// vetor;
					vet++;
				}
				// condicao se o vetor comparado for igual o vetor de comparacao ele segue para
				// uma proxima etapa
				if (aux[i].compareToIgnoreCase(aux[j]) == 0) {
					// ele vai comparar novamente para vetirifcar se a comparacao realmente é igual
					// com letras maiuculas
					// e minusculas, normalmente segue o mesmo padrao da diferenciacao entre Strings
					// se for com um valor igual eles sao exatamente iguais entre em mais uma
					// condicao
					if (aux[i].compareTo(aux[j]) == 0) {
						// temos que fazer um laco de repeticao para verificar o vetor que criamos para
						// saber aonde o primeiro nome igual foi inserido.
						for (int l = 0; l < nome2.length; l++) {
							// essa condicao nao verifica os itens nulos
							if (nome2[l] != null) {
								// esta condicao verifica qual nome inserido foi igual ao solicitado, quando ele
								// acha
								if (nome2[l].compareTo(aux[i]) == 0) {
									// ele faz a insercao com uma casa a mais para o vetor
									nome2[l + 1] = aux[i];
									// e para o laco pois se nao ele continua infinitamente ate terminar
									break;
								}
							}
						}
					}
					// essa condicao pega os itens que sao menores e tambem atribuiem um indice
					// neles, tem que estar nesta posicao pois se nao ela nao
					// pega as comparacoes dentro do == e vira uma baderna
					else if (aux[i].compareTo(aux[j]) < 0) {
						vet++;
					}

				}
			}
			// atribuindo a comparacao no vetor principal
			nome2[vet] = aux[i];
			// zeramos o indice, para que ele faca a contagem do zero dnv!!
			vet = 0;

		}

		return nome2;

	}

	public static void main(String[] args) {
		String[] nome1 = { "yan", "yan", "woney", "zumbi", "rodolfo", "sonia", "ana", "Leticia", "elisa", "franco",
				"bete", "Rodolfo", "Leticia" };
		String[] nome2 = null;

		// nome1 = retornaVetorOrganizado(nome1);
		do {
			nome2 = retornaFilaOrdenadaUmaUm(nome2, JOptionPane.showInputDialog("Qual nome deseja inserir ?"));
		} while (Integer.parseInt(JOptionPane.showInputDialog("Para Continuar Insira um numero diferente de 1, ou digite 1 para sair !!"))!= 1);
		for (int i = 0; i < nome2.length; i++) {
			System.out.println(nome2[i]);
		}

	}

	public static String[] retornaFilaOrdenadaUmaUm(String[] aux, String nome) {
		if (aux == null) {
			aux = new String[1];
			aux[0] = nome;
			return aux;
		} else {
			String[] nova = new String[aux.length + 1];
			nova = aux;
			
            
			

			return nova;
		}

	}
}
