package Exemplos1;

import java.util.Scanner;
import Exemplos.*;

public class Teste_aluno {

	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		aluno aluno= new aluno();
		System.out.println("Numero 1 para Inserir os dados do aluno: ");
		System.out.println("Numero 0 para Sair do programa: ");
		System.out.println("Insira a Opção: ");
	    int op = new Scanner(System.in).nextInt();
	    while(op<0 || op>1) {
	    	System.out.println("Opção Errada, Insira uma opção correta!! ");
	    	System.out.println("Numero 1 para Inserir os dados do aluno: ");
			System.out.println("Numero 0 para Sair do programa: ");
			System.out.println("Insira a Opção: ");
	    	op = new Scanner(System.in).nextInt();
	    }
	    if(op == 0) {
    		System.out.println("Fim do programa !!");
    	}
	    if(op == 1) {
    		aluno.inserir();
        	aluno.imprimir();
        	menu();
    	}
	    
		
	}

}
