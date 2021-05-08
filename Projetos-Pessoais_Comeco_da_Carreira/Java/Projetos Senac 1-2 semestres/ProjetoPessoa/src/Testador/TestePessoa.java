package Testador;

import java.util.ArrayList;

import Pessoa.Pessoa;
import Pessoa.Pobre;
import Pessoa.Rica;

public class TestePessoa {
	public static void main(String[] args) {
		ArrayList<Pessoa> listapessoa = new ArrayList<>();
		Rica rica = new Rica();
		rica.setNome("Maria");
		rica.setIdade(54);
		rica.setDinheiro(1589856);
		listapessoa.add(rica);
		Rica rica1= new Rica();
		rica1.setNome("Joao");
		rica1.setIdade(37);
		rica1.setDinheiro(1589);
		listapessoa.add(rica1);
		Pobre pobre = new Pobre();
		pobre.setNome("Antonio");
		pobre.setIdade(75);
		listapessoa.add(pobre);
		System.out.println(listapessoa);
	}
}
