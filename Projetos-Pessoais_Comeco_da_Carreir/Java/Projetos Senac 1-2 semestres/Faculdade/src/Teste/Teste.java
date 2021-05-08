package Teste;

import Principal.*;

public class Teste {

	public static void main(String[] args) {
		Curso Curso1 = new Curso();
		Aluno aluno1 = new Aluno();
		Imovel imovel1 = new Imovel();
		Curso1.setNome("Administração !!");
		Curso1.setCodigo(1);
		Curso1.setCargaHora(17);
		Curso1.setPreRequisito("Passado na prova !!");
		Curso1.setValor(200.00);
		System.out.println("O nome da materia é: " + Curso1.getNome() + "\nO seu codigo é: " + Curso1.getCodigo()
				+ "\nA carga horaria é: " + Curso1.getCargaHora() + "\nO PreRequisito é: " + Curso1.getPreRequisito()
				+ "\nO valor é: " + Curso1.getValor());
		System.out.println("\n");
		int n = 0;
		while (n <= 3) {
			System.out.println("***********************************");
			n++;
		}
		n = 0;
		aluno1.setNome("Rodolfo");
		aluno1.setCpf("011.888.99905");
		aluno1.setRg("55.855.952");
		aluno1.setEndereco("Rua joao boina.");
		aluno1.setFone("(62)987887877");

		System.out.println("\nO nome do Aluno é: " + aluno1.getNome() + "\nO seu CPF é: " + aluno1.getCpf()
				+ "\nA carga horaria do Curso é: " + aluno1.getRg() + "\nO endereco do Aluno é: "
				+ aluno1.getEndereco() + "\n Fone: " + aluno1.getFone());
		System.out.println("\n");
		while (n <= 3) {
			System.out.println("***********************************");
			n++;
		}
		imovel1.setMatricula_imo(15);
		imovel1.setRua_imo("Rua parararrarara.");
		imovel1.setCep_imo("7588800");
		imovel1.setBairro_imo("madrigerman.");
		imovel1.setCidade_imo("Goialandia.");
		imovel1.setUf_imo("Gous.");
		imovel1.setTamanho_imo("600 Mts quadrados.");
		imovel1.setComodos_imo("5 comodos.");
		imovel1.setGaragem_imo("2 garagens.");
		imovel1.setValor_imo(1500000);
		imovel1.setTipo_imo("Casa");
		imovel1.setStatus_imo("Sem morador.");

		System.out.println("\nA matricula da(o) " + imovel1.getTipo_imo() + " é: " + imovel1.getMatricula_imo()
				+ "\nCep: " + imovel1.getCep_imo() + "\nA(O) " + imovel1.getTipo_imo() + " fica localizado na: "
				+ imovel1.getRua_imo() + " no Bairo: " + imovel1.getBairro_imo() + " na Cidade: "
				+ imovel1.getCidade_imo() + " no Uf: " + imovel1.getUf_imo() + "\nO Tamanho da(o) "
				+ imovel1.getTipo_imo() + " é de: " + imovel1.getTamanho_imo() + "\nA(O) " + imovel1.getTipo_imo()
				+ " possui: " + imovel1.getComodos_imo() + "\nA(O) " + imovel1.getTipo_imo() + " possui "
				+ imovel1.getGaragem_imo() + "\nA(O) " + imovel1.getTipo_imo() + " esta avaliado em: "
				+ imovel1.getValor_imo() + "\nA(O) " + imovel1.getTipo_imo() + " no momento esta: "
				+ imovel1.getStatus_imo());

	}
}
