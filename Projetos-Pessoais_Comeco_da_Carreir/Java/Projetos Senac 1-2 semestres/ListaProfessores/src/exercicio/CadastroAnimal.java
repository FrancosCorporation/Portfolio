package exercicio;

public class CadastroAnimal {
	String nome;
	String disciplina;
	String formacao;
	int periodo;
	int id;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	@Override
	public String toString() {
		return "Professor: id=" + id + ", nome=" + nome + ", disciplina=" + disciplina + ", formacao=" + formacao
				+ ", periodo=" + periodo;
	}

}
