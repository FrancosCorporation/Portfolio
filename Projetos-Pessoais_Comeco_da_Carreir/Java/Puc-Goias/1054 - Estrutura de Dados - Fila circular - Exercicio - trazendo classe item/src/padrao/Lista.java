package padrao;

import javax.swing.JOptionPane;

public class Lista {
	private Item[] veritens;
	private int frente, atras, maxTam;

	public Lista() {
		this.maxTam = 100;
		this.veritens = new Item[maxTam];
		this.frente = 0;
		this.atras = this.frente;
	}

	public Lista(int tamanhoFila) {
		this.maxTam = tamanhoFila;
		this.veritens = new Item[maxTam];
		this.frente = 0;
		this.atras = this.frente;
	}

	private boolean vazia() {
		return this.frente == this.atras;

	}

	public Item verificaItem() {
		String item = JOptionPane.showInputDialog("Insira o Nome do Item a buscar !!");
		for (int i = veritens.length-1; i >= 0; i--) {
			if(veritens[i]==null) {
				continue;
			}
			else if (item.equalsIgnoreCase(veritens[i].getNome())) {
				return veritens[i];
			}
		}
		return null;
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

	public boolean enfileira(Item x) {
		if ((this.atras + 1) % this.maxTam == this.frente) {
			return false;
		}
		this.veritens[this.atras] = x;
		this.atras = (this.atras + 1) % this.maxTam;
		return true;
	}

	public Item desenfileira() {
		Item item = this.veritens[this.frente];
		if (this.vazia()) {
			return null;
		}
		if (retornapergunta("Tem certeza que deseja retirar: \n" + item.getNome())) {
			this.veritens[this.frente] = null;
			this.frente = (this.frente + 1) % this.maxTam;
			return item;
		} else
			return null;
	}

	public boolean modificarItem(Item aux) {
		if (vazia()) {
			JOptionPane.showMessageDialog(null, "Lista Vazia !!");
			return false;
		}

		else if (aux == null) {
			return false;
		} else
			for (int i = 0; i < veritens.length; i++) {
				if (aux.getNome().equalsIgnoreCase(veritens[i].getNome())) {
					JOptionPane.showMessageDialog(null,
							"Estamos prestes a modificar o item " + veritens[i].getNome() + " !!");
					Item novo = addItem();
					if (retornapergunta("Voce esta prestes a substituir o item: " + veritens[i].getNome()
							+ "\nPelo Item: " + novo.getNome() + "\nTem Certeza?")) {
						veritens[i] = novo;
						return true;
					} else
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
