package padrao;

import javax.swing.JOptionPane;

public class Lista {

	public class No {
		private Item dados;
		private No prox;

		public No(Item aux) {
			dados = aux;
			prox = null;
		}
	}

	private int tam;
	private No inicio;

	public Lista() {
		tam = 0;
		inicio = null;
	}

	public boolean vazia() {
		return (inicio == null);
	}

	public int getTam() {
		return tam;
	}

	public Item busca(Item aux) {
		if (vazia())
			return null;
		No i = null;
		for (i = inicio; i != null && !aux.getDescricao().equals(i.dados.getDescricao()); i = i.prox)
			;
		if (i == null) {
			return null;
		}
		Item novo = new Item(i.dados.getDescricao(), i.dados.getQuantidade(), i.dados.getPrioridade());
		return novo;
	}

	public boolean adicionaOrdenado(Item aux) {
		Item buscado = busca(aux);
		if (buscado != null)
			return false;
		No novo = new No(aux);
		if (vazia()) {
			inicio = novo;
			tam++;
			return true;
		}
		No i = inicio;
		No ant = inicio;
		for (; i != null && aux.getDescricao().compareTo(i.dados.getDescricao()) > 0; ant = i, i = i.prox)
			;
		if (i == ant) {
			novo.prox = inicio;
			inicio = novo;
		} else {
			ant.prox = novo;
			novo.prox = i;
		}
		tam++;
		return true;
	}

	public Item retira(Item aux) {

		if (vazia())
			return null;

		No i = inicio;
		No ant = inicio;

		for (; i != null && !aux.getDescricao().equals(i.dados.getDescricao()); ant = i, i = i.prox);

		if (i == null) {
			JOptionPane.showMessageDialog(null, "Erro! lista vazia !!");
			return null;
		}
		else {
			
			if(retornapergunta("Voce esta prestes a deletar: "+i.dados.getDescricao()+" ?")) {
				Item novo = i.dados;

				if (i == ant) {
					inicio = inicio.prox;
				}

				else {
					ant.prox = i.prox;
				}

				tam--;
				return novo;
			}
			else {
				JOptionPane.showMessageDialog(null, "Voce escolheu nao deletar.. voltando ao menu !!");
			return null;
			}
			
		}
		
	}

	public String imprima() {
		String aux = new String("");

		if (vazia()) {
			aux = "Lista vazia.";
		}

		else {
			for (No i = inicio; i != null; i = i.prox) {
				aux = aux + i.dados.toString();
			}
		}

		return aux;
	}
	
	public boolean retornapergunta(String message) {
		boolean resposta = false;
		Object[] options = { "Confirmar", "Cancelar" };
		int op = JOptionPane.showOptionDialog(null, message, "Atenção",
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, 0);
		if (op == 0) {
			return resposta = true;
		} else {
			return resposta;
		}
	}
	
	
}
