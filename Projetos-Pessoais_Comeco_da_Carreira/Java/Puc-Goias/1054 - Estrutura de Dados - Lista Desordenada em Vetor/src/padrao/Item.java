package padrao;

public class Item {

	private String nome;
	private String descricao;
	private int quantidade;
	private int prioridade;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	
	public String getItem() {
		return ("Item: "+nome+ "\nDescrição: "+descricao + "\nQnt: " + Integer.toString(quantidade) + "\nPrioridade: " + Integer.toString(prioridade));
	}

}
