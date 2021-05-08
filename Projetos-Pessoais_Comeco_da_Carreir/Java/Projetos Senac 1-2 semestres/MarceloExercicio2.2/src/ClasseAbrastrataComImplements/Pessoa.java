package ClasseAbrastrataComImplements;

import java.util.Date;

public class Pessoa {
	private String nome;
	private String endereco;
	private Date dataNascimento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void andar() {
		System.out.println(this.nome+"Estou andando.. ");
	}

}
