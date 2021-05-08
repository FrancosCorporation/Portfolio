package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
	private String razaoSocial;
	private List<Produto> listaProdutos;

	public Mercado(String razaoSocial) {
		listaProdutos = new ArrayList<Produto>();
		this.razaoSocial = razaoSocial;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public boolean addProduto(Produto x) {
		for (int i = 0; i < listaProdutos.size(); i++) {
			if(x.getNome().equalsIgnoreCase(listaProdutos.get(i).getNome())) {
				return false;
			}
		}
		
		listaProdutos.add(x);
		return true;
		
	}
	public String verProdutos() {
		String ajuda = "";
		for (int i = 0; i < listaProdutos.size(); i++) {
			ajuda+= listaProdutos.get(i).toString();
		}
		return ajuda;
		
	}
	public String consulta(String nomeProduto) {
		String ajuda = "";
		for (int i = 0; i < listaProdutos.size(); i++) {
			if(listaProdutos.get(i).getNome().equalsIgnoreCase(nomeProduto)) {
				return listaProdutos.get(i).toString();
			}
		}
		return "Não foi possivel achar o item que esta procurando, ele não esta na lista !!";
	}
	

}
