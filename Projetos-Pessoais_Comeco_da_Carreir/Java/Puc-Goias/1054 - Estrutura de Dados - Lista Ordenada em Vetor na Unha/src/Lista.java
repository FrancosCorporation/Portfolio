
import javax.swing.JOptionPane;

public class Lista {
	private Pessoa[] item;
	private Pessoa p;

	// Construtor da classe
	public Lista(int tamanhoMax) {
		this.item = new Pessoa[tamanhoMax];
		p = new Pessoa();
		p.setPrimeiro(0);
		p.setUltimo(p.getPrimeiro());
	}

	// Verifica o tamanho da Lista
	public int tamanho() {
		return item.length;
	}

	// Insere nova pessoa
	public void insere(String pessoaNova) throws Exception {

		if (item[p.getPrimeiro()] == null) {
			if (p.getUltimo() <= this.item.length) {
				p.setNome(pessoaNova);
				item[p.getUltimo()] = p;
				p.setUltimo(p.getUltimo() + 1);
			}

		} else if (item[p.getPrimeiro()] != null) {
			if (item.length > p.ultimo + 1) {
				int aux = p.getUltimo();
				for (int i = p.getUltimo() - 1; i >= 0; i--) {
					if (pessoaNova.toLowerCase().compareTo(item[i].getNome()) < 0 && i == 0) {
						item[i + 1] = item[i];
						p = new Pessoa();
						p.setNome(pessoaNova);
						p.setUltimo(aux);
						item[i] = p;
						p = item[aux];
						break;
					} else if (pessoaNova.toLowerCase().compareTo(item[i].getNome()) > 0 && i == 0) {
						for (int j = p.getUltimo(); j > 0; j--) {
							item[j+1] = item[j];
						}
						p = new Pessoa();
						p.setNome(pessoaNova);
						p.setUltimo(aux);
						item[i + 1] = p;
						p = item[aux];
						break;
					}
					if (pessoaNova.toLowerCase().compareTo(item[i].getNome()) < 0
							&& pessoaNova.toLowerCase().compareTo(item[i - 1].getNome()) < 0 && i == 1) {
						for (int j = p.getUltimo(); j > 0; j--) {
							item[j+1] = item[j];
						}
						p = new Pessoa();
						p.setNome(pessoaNova);
						p.setUltimo(aux);
						item[i + 1] = p;
						p = item[aux];
						break;
					} else if (pessoaNova.toLowerCase().compareTo(item[i].getNome()) > 0
							&& pessoaNova.toLowerCase().compareTo(item[i - 1].getNome()) > 0 && i != 0) {
						if(item[i]!=null) {
							for (int j = p.getUltimo(); j > i; j--) {
								item[j+1] = item[j];
							}
						}
						p = new Pessoa();
						p.setNome(pessoaNova);
						item[i + 1] = p;
						p.setUltimo(aux);
						p = item[aux];
						break;
					}
				}
				p.setUltimo(p.getUltimo() + 1);
			} else {

				if (retornapergunta(
						"Atenção, foi identificado que sua lista não tem mais espaço, posso adicionar mais um espaco a lista?")) {
					Pessoa[] aux = new Pessoa[item.length + 1];
					for (int i = 0; i < item.length; i++) {
						aux[i] = item[i];
					}
					item = aux;
					insere(pessoaNova);
				} else {
					JOptionPane.showMessageDialog(null, "Blz, não vou implementar, voce é o chefe por aqui !!");
				}
			}

		}
	}

	// Verifica se esta Cheia
	public boolean cheia() {
		return (p.getUltimo() == this.tamanho());

	}

	// Verifica se a lista está vazia
	public boolean vazia() {
		return (p.getPrimeiro() == p.getUltimo());
	}

	// Imprime lista de convidados
	public void imprime() {
		if (vazia() == true) {
			JOptionPane.showMessageDialog(null, "   A lista está vazia\n");
		} else {
			int i = 0;
			String tela = "";
			for (int aux = p.getPrimeiro(); aux < p.getUltimo(); aux++) {
				tela += "\t\t Posição: " + (i + 1) + " - " + this.item[aux].toString() + "\n";
				i++;
			}
			JOptionPane.showMessageDialog(null, "\t    Serão convidados:\n" + tela);
		}
	}

	// Busca por pessoa na lista pelo nome
	public Pessoa pesquisa(String pessoa) {
		if (this.vazia() || pessoa == null)
			return null;
		for (int p = 0; p < this.p.getUltimo(); p++)
			if (this.item[p].toString().toLowerCase().equals(pessoa))
				return this.item[p];
		return null;
	}

	// Retira Pessoa
	public Pessoa retira(String pessoa) throws Exception {
		if (this.vazia() || pessoa == null)
			throw new Exception("Erro : A lista esta vazia");
		int p = 0;
		while (p < this.p.getUltimo() && !this.item[p].equals(pessoa))
			p++;
		if (p >= this.p.getUltimo())
			return null; // Chave não encontrada

		Pessoa item = this.item[p];
		this.p.setUltimo(this.p.getUltimo() - 1);
		for (int aux = p; aux < this.p.getUltimo(); aux++)
			this.item[aux] = this.item[aux + 1];
		return item;
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

	/*
	 * public void inserirEntre(String pessoaNova, int posicao) { // condicao if
	 * para que se o ultimo elemento tem o tamanho do vetor nao de erro if
	 * (item.length > this.p.getUltimo()) { // criando um objeto com uma posicao a
	 * mais Pessoa[] item2 = new Pessoa[item.length + 1];
	 * 
	 * // Incrementa o ultimo item p.setUltimo(p.getUltimo() + 1);
	 * 
	 * // este item vai servir para quando ele passar da posicao menor que a posicao
	 * // passada, pois altera int j = 0; // laco para pegar a ordem descrementando
	 * e transferindo item a item de um novo // vetor para o antigo for (int i =
	 * this.p.getUltimo(); i > this.p.getPrimeiro(); i--) { // condicao para que
	 * adicione apenas quando for igual a posicao passada para o // lugar devido no
	 * vetor if (i == (posicao - 1)) { // incrementando a posicao passada
	 * item2[i].setNome(pessoaNova); // incrementando a posicao aproveitando o index
	 * i , so que neste caso diminuindo // ambos os lados, para que eles sejam pegos
	 * no mesmo index. item2[i - 1] = this.item[i - 1]; // quando ele entra na
	 * condicao do if acima, ele precisa que esse vetor // incremente = 1 para que
	 * abaixo no else ele pegue as posicoes do vetor // inferiores as que o usuario
	 * passou j = 1; } else // ele vai passar nesse caso, toda vez antes da posicao
	 * passada pelo usuario // assim q ele chega na posicao que o usuario passa, ele
	 * entra no if acima, // depois de entrar no if ele decrementa o index do novo
	 * vetor criado // adicionando assim na posicao correnta sempre. item2[i - j] =
	 * this.item[i - 1];
	 * 
	 * } // vetor antigo recebendo vetor novo. this.item = item2; } // condicao para
	 * que se o vetor chegue ao seu limite ele nao consiga dar crash else
	 * JOptionPane.showMessageDialog(null,
	 * "Infelizmente seu vetor chegou ao limite !! "); }
	 */
}
