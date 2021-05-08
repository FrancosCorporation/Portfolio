package Exemplos1.testes;

import java.util.ArrayList;

import Exemplos1.classes.*;

public class TesteImovel {

	public static void main(String[] args) {
		
		// Vetor ou Array Fixo - Tamanho
		int[] vetor = new int[3];
		
		vetor[0] = 10;
		vetor[1] = 20;
		vetor[2] = 30;
		
		Imovel[] lista = new Imovel[3];
		
		System.out.println(vetor[0]);

		System.out.println(lista[0]);
		lista[0] = new Imovel();
		System.out.println(lista[0]);
		
		lista[0].setMatricula(1212121);
		
		
		Imovel imo1 = new Imovel();
//		listaImoveis.add(imo1);
		
		
		// Array Dinâmico
		ArrayList<Imovel> listaImoveis = new ArrayList<Imovel>();
		
		for (int i = 0; i < 4; i++) {
			Imovel imo = new Imovel();
			imo.setMatricula(i);
			imo.setRua("Rua " + i);
			listaImoveis.add(imo);
		}
		
		for (int i = 0; i < 4; i++) {
			System.out.println(listaImoveis.get(i)); 
		}
		
	}
}
