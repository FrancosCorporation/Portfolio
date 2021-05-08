package remedio;

import java.util.Date;

public class Medicamento {
	private static int id;
	private static String nome;
	private static String principioAtivo;
	private static String und;
	private static int qtdeEstoque;
	private static Date dataValidade;

	public Medicamento(int id, String nome, String principioAtivo, String und, int qtdeEstoque, Date dataValidade) {
		this.id = id;
		this.nome = nome;
		this.principioAtivo = principioAtivo;
		this.und = und;
		this.qtdeEstoque = qtdeEstoque;
		this.dataValidade = dataValidade;
	}

	public Medicamento() {
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Medicamento.id = id;
	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Medicamento.nome = nome;
	}

	public static String getPrincipioAtivo() {
		return principioAtivo;
	}

	public static void setPrincipioAtivo(String principioAtivo) {
		Medicamento.principioAtivo = principioAtivo;
	}

	public static String getUnd() {
		return und;
	}

	public static void setUnd(String und) {
		Medicamento.und = und;
	}

	public static int getQtdeEstoque() {
		return qtdeEstoque;
	}

	public static void setQtdeEstoque(int qtdeEstoque) {
		Medicamento.qtdeEstoque = qtdeEstoque;
	}

	public static Date getDataValidade() {
		return dataValidade;
	}

	public static void setDataValidade(Date data) {
		Medicamento.dataValidade = data;
	}

}
