package padrao;

public class Pilha {
	public class No {
		Pessoa dados;
		No prox;

		public No(Pessoa novo2) {
			dados = novo2;
			prox = null;
		}
	}

	private int tam;
	No topo;

	public Pilha() {
		tam = 0;
		topo = null;
	}

	public int getTam() {
		return tam;
	}

	public boolean vazia() {
		return (topo == null);
	}

	public void push(Pessoa novo2) {
		No novo = new No(novo2);
		if (vazia()) {
			topo = novo;
			tam++;
		} else {
			novo.prox = topo;
			topo = novo;
			tam++;
		}
	}

	public Pessoa pop() {
		if (!vazia()) {
			Pessoa aux = topo.dados;
			topo = topo.prox;
			tam--;
			return aux;
		}
		return null;
	}
}