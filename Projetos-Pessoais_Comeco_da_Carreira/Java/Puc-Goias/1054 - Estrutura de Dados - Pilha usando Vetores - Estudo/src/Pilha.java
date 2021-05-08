import java.util.ArrayList;
import java.util.List;

public class Pilha {

	private List<Peca> pecas = new ArrayList<Peca>();

	public void insere(Peca peca) {

		// adiciona item no fim da lista
		// inserir na Pilha significa adicionar ao fim da lista
		this.pecas.add(peca);
	}

	public Peca remover() {

		// Para remover da Pilha basta tirar o último item
		// this - construtor pra propria classe *****
		// pecas - lista
		// remove - função java
		// this - construtor para propria classe *****
		// pecas.size() - tamanho da Lista menos 1 que seria o último da Pilha
		return this.pecas.remove(this.pecas.size() - 1);
	}

	public boolean vazia() {

		// verifica se o tamanho da Lista é zero
		// this - construtor para propria classe *****
		// pecas - lista
		// pecas.size() - tamanho da Lista
		// == 0 - igual a zero
		// retorna verdadeiro
		return this.pecas.size() == 0;

	}

	public int listarQuantidade() {
		return this.pecas.size();

	}

	public String listarItens() {
		
		int i;
		String lista = "";
		 
	      for (i = 0; i < pecas.size();i++) 
	      { 		      
	          lista = pecas.get(i).getNome() + ", "; 
	          
	      }   
	    
		return lista;
		

	}
}
