package Exemplos;

import java.util.Scanner;

public class aluno {
	private int matricula, idade, fone;
	private float altura;
	private String nome, cidade, sexopadrao;
	private char sexo;

	public int getMatricula() {
		return this.matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getFone() {
		return this.fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	public float getAltura() {
		return this.altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return this.sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getSexopadrao() {
		return this.sexopadrao;
	}

	public void setSexopadrao(String sexopadrao) {
		this.sexopadrao = sexopadrao;
	}

	public void inserir() {
		System.out.println("Insira a Nome do aluno: ");
		String nome = new Scanner(System.in).nextLine();
		setNome(nome);
		System.out.println("Insira a Matricula do aluno: ");
		int matricula = new Scanner(System.in).nextInt();
		setMatricula(matricula);
		System.out.println("Insira a Cidade do aluno: ");
		String cidade = new Scanner(System.in).nextLine();
		setCidade(cidade);
		System.out.println("Insira a Sexo(M= Masculino ou F= Feminino) do aluno: ");
		char sexo = new Scanner(System.in).next().charAt(0);
		verificar(sexo);
		System.out.println("Insira a Idade do aluno: ");
		int idade = new Scanner(System.in).nextInt();
		setIdade(idade);
		System.out.println("Insira a Fone do aluno: ");
		int fone = new Scanner(System.in).nextInt();
		setFone(fone);
		System.out.println("Insira a Altura do aluno: ");
		float altura = new Scanner(System.in).nextFloat();
		setAltura(altura);
	}

	public void imprimir() {
		System.out.println("\nO aluno de nome: " + getNome() + "\n" + "Mora na Cidade: " + getCidade() + "\n"
				+ "Tem a Matricula n°: " + getMatricula() + "\n" + "Tem a Idade de: " + getIdade() + " Anos.\n"
				+ "Tem o Sexo: " + getSexopadrao() + "\n" + "Tem o Telefone: " + getFone() + "\n" + "Tem a Altura de: "
				+ getAltura() + " Mt's.\n");
	}

	public void verificar(char n) {
		while (n != 'm' & n != 'M' & n != 'f' & n != 'F') {
			System.out.println("Insira a Sexo(M= Masculino ou F= Feminino) do aluno: ");
			n = new Scanner(System.in).next().charAt(0);
		}
		if (n == 'M' | n == 'm') {
			setSexopadrao("Masculino");
		}
		if (n == 'f' | n == 'F') {
			setSexopadrao("Feminino");
		}

	}

}
