package principal;

import javax.swing.JOptionPane;

public class Empresa {
	private String nome, endereco, cep, fone;

	public Empresa() {

	}
	public Empresa(String nome, String endereco, String cep, String fone) {
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.fone = fone;
	}

	private String getNome() {
		return nome;
	}
	private String getEndereco() {
		return endereco;
	}
	private String getCep() {
		return cep;
	}
	private String getFone() {
		return fone;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	private void setCep(String cep) {
		this.cep = cep;
	}
	private void setFone(String fone) {
		this.fone = fone;
	}
	
	public void getDados() {
      setNome(JOptionPane.showInputDialog(null, "Insira aqui o nome da empresa: "));
	  setEndereco(JOptionPane.showInputDialog(null, "Insira aqui o Endereço da empresa: "));
	  setCep(JOptionPane.showInputDialog(null, "Insira aqui o CEP da empresa: "));
	  setFone(JOptionPane.showInputDialog(null, "Insira aqui o Telefone da empresa: "));
	}
	public void printDados() {
		JOptionPane.showMessageDialog(null, "Nome da empresa: "+getNome()+"\nEndereço da empresa: "+getEndereco()+"\nCEP da Empresa: "+getCep()+"\nTelefone da Empresa: "+getFone());
	}
}
