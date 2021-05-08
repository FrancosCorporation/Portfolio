package Exemplos1.testes;

import java.util.ArrayList;
import java.util.Scanner;

import Exemplos1.classes.*;

public class TesteProduto {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		int op = -1;
		Produto prod;
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		
		do {
			System.out.println("----------------------------");
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir Produto");
			System.out.println("2 - Imprimir Lista de Produtos");
			System.out.print("Digite a opção: ");
			op = e.nextInt();
			System.out.println("----------------------------");
			
			if (op == 1) {
				System.out.println("Cadastro de Produtos");
				prod = new Produto();
				System.out.print("Digite o código do produto: ");
				prod.setId(e.nextInt());
				System.out.print("Digite o nome do produto: ");
				prod.setNome(e.next());
				listaProdutos.add(prod);
			}
			else if (op == 2) {
				System.out.println("Lista de Produtos");
				for (int i = 0; i < listaProdutos.size(); i++) {
					System.out.println(listaProdutos.get(i));
				}
			}
		} while (op != 0);
			
		
	}
}
