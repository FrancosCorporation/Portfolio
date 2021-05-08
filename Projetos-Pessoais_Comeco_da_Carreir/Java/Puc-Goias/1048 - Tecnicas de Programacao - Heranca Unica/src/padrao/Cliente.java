package padrao;

public class Cliente extends ContaPoupanca {

	public Cliente() {
	}

	protected Cliente(int n, String estado) {
		super(n, estado);
		}

	private String cpf;
	private String nome;
	private String telefone;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
