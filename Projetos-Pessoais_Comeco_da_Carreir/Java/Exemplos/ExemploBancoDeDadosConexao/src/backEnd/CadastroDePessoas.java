package backEnd;

public class CadastroDePessoas {
	private String Nome;
	private String Telefone;
	private String Cpf;
	private String Rg;
	private int Id;
	
	
	public CadastroDePessoas(int id,String nome, String telefone, String cpf, String rg) {
		super();
		Nome = nome;
		Telefone = telefone;
		Cpf = cpf;
		Rg = rg;
		Id = id;
	}
	public CadastroDePessoas(String nome, String telefone, String cpf, String rg) {
		super();
		Nome = nome;
		Telefone = telefone;
		Cpf = cpf;
		Rg = rg;
	}
	
	public int getId() {
		return Id;
	}


	public void setId(int id) {
		this.Id = id;
	}


	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getRg() {
		return Rg;
	}
	public void setRg(String rg) {
		Rg = rg;
	}
	@Override
	public String toString() {
		return "Nome=" + Nome + ", Telefone=" + Telefone + ", Cpf=" + Cpf + ", Rg=" + Rg+"\n";
	}
	
	

}
