package principal;

public class TestandoImoveis {

	public static void main(String[] args) {
		Imovel imovel1= new Imovel();
		imovel1.setEndereco("Rua antonio");
		imovel1.setPreco(1500000);
		Novo imovelmaiscaro = new Novo();
		imovelmaiscaro.setPreco(2000000);
		imovelmaiscaro.setValoradcional(20000);
		System.out.println(imovelmaiscaro.imprimirPrecoNovo());
		Velho imovelmaisbarato= new Velho();
		imovelmaisbarato.setPreco(2000000);
		imovelmaisbarato.setDesconto(20000);
		System.out.println(imovelmaisbarato.imprimirDesconto());
	}

}
