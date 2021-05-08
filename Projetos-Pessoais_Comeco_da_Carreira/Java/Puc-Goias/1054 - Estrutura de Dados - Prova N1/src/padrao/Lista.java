package padrao;

public class Lista {
	private Item inicio;
	private Item fim;


public class No{
	private Item it;
	private No p;
	public No(Item it) {
		this.it = it;
		p =null;
	}
	
}
public class Item {
	private String a;
	private int k;
	private float s;

	public Item(String a, int k, float s) {
		this.a = a;
		this.k = k;
		this.s = s;
	}

	public void ld_inserir_no_inicio(String a, int k, float s) {
		Lista lista = new Lista();
		No no = new No(new Item(a, k, s));
		if(lista.inicio==null) {
			lista.inicio = no.it;
			lista.fim = lista.inicio;
		}
		else {
			lista.fim = no.it;
			no.p = no ;
		}
		
		
	}
}
}