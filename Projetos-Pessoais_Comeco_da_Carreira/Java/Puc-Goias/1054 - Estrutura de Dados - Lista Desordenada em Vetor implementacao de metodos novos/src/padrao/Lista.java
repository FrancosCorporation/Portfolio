package padrao;
import javax.swing.JOptionPane;

public class Lista {
	private int tamanho;
	private int fim;
	private Item vetor[];

	public boolean setTamanho(int aux) {
		// retorna falso se a lista for menor q 2 e maior q 20
		if (aux <= 2 || aux >= 20) {
			JOptionPane.showMessageDialog(null,
					"Infelizmente voce so pode criar uma lista entre os valores 3 e 19, tente novamente !!");
			return false;
		}

		// retorna verdadeiro quando é criado uma lista de tamanho 3 a 19
		fim = -1;
		tamanho = aux;
		vetor = new Item[tamanho];
		return true;
	}

	public boolean vazia() {
		// se a lista estiver vazia, retorna a posição do fim para -1
		return (fim == -1);
	}

	public boolean cheia() {
		// se a lista estiver cheia fim + 1 será igual ao tamanho dela
		return ((fim + 1) == tamanho);
	}

	public Item verificaItem() {
		String item = JOptionPane.showInputDialog("Insira o Nome do Item a buscar !!");
		for (int i = 0; i <= vetor.length; i++) {
			if (vetor[i] == null) {
				return null;
			} else if (item.equalsIgnoreCase(vetor[i].getNome())) {
				return vetor[i];
			}
		}

		return null;

	}

	public void setTamanhoLista() {
		do {
		} while (!setTamanho(Integer.parseInt(JOptionPane.showInputDialog("Tamanho: "))));

	}

	public Item addItem() {
		String fraseQuantidade = "Insira a Quantidade de Itens: ";
		String frasePrioridade = "Insira a Prioridade (1 -- 5) do Item: ";
		Item novo = new Item();
		int valor;
		novo.setNome(JOptionPane.showInputDialog("Insira o Nome do Item: "));
		novo.setDescricao(JOptionPane.showInputDialog("Insira a Descrição: "));

		do {
			novo.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog(fraseQuantidade)));
			if (novo.getQuantidade() <= 0 || novo.getQuantidade() > 10) {
				fraseQuantidade = "Infelizmente voce digitou um valor invalido, Insira um valor entre 1 e 10: ";
			}

		} while (novo.getQuantidade() <= 0 || novo.getQuantidade() > 10);
		do {
			novo.setPrioridade(Integer.parseInt(JOptionPane.showInputDialog(frasePrioridade)));
			if (novo.getPrioridade() <= 0 || novo.getPrioridade() > 5) {
				frasePrioridade = "Infelizmente voce digitou um valor invalido, Insira um valor entre 1 e 5: ";
			}
		} while (novo.getPrioridade() <= 0 || novo.getPrioridade() > 5);
		return novo;
	}

	public void insere(Object pessoaNova) throws Exception {
		for (int i = 0; i < item.length; i++) {
			if(item[i]!=null) {
				if(item[i].toString().toLowerCase().equals(pessoaNova)) {
					JOptionPane.showMessageDialog(null, "A pessoa que voce esta tentando inserir ja esta na lista, o mesmo nome nao sera aceito, Tente diferenciar os nomes !!");
					break;
				}
				
			}
			if(item[i]==null) {
				if (p.getUltimo() >= this.item.length) {

				} else {
					this.item[p.getUltimo()] = pessoaNova;
					p.setUltimo(p.getUltimo() + 1);
				}
				break;
				}
			}
			
			
		
	}
	public boolean adicionanaFila(Item aux) {
		if (cheia() == true)
			return false;
		fim++;
		vetor[fim] = aux;
		return true;
	}

	public Item consultar(Item aux) {
		if (vazia() == true)
			return null;
		int i;
		for (i = 0; i <= fim && aux.getNome().toLowerCase() != vetor[i].getNome().toLowerCase(); i++)
			;

		if (i > fim)
			return null;

		if (vetor[i].getNome() == aux.getNome())
			return vetor[i];
		else
			return null;
	}

	public boolean retira(Item aux) {
		if (aux == null)
			return false;

		for (int i = 0; i < vetor.length; i++) {
			if (aux.getNome().equalsIgnoreCase(vetor[i].getNome())) {
				vetor[i] = null;
				fim--;
				return true;
			}
		}
		return false;
	}

	public boolean modificarItem(Item aux) {
		if (vazia()) {
			JOptionPane.showMessageDialog(null, "Lista Vazia !!");
			return false;}
			
		else if(aux == null) {
				return false;}
		else 
			for (int i = 0; i < vetor.length; i++) {
				if(aux.getNome().equalsIgnoreCase(vetor[i].getNome())) {
					JOptionPane.showMessageDialog(null, "Estamos prestes a modificar o item "+vetor[i].getNome()+" !!");
					Item novo = addItem();
					if(retornapergunta("Voce esta prestes a substituir o item: "+vetor[i].getNome()+"\nPelo Item: "+novo.getNome()+"\nTem Certeza?")) {
						vetor[i] =novo;
						return true;
					}
					else
						return false;
			}
			}
		return false;
	}

	public boolean retornapergunta(String message) {
		boolean resposta = false;
		Object[] options = { "Confirmar", "Cancelar" };
		int op = JOptionPane.showOptionDialog(null, message, "Atenção", JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, 0);
		if (op == 0) {
			return resposta = true;
		} else {
			return resposta;
		}

	}
}
