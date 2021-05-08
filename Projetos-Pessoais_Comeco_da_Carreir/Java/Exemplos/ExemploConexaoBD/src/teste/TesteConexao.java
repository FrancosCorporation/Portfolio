package teste;

import java.util.ArrayList;

import dao.Conexao;
import dao.MarcaDao;
import modelo.CadastroDePessoas;

public class TesteConexao {

	public static void main(String[] args) {
		
		Conexao.getConnection();
		
		//Teste Inserir
		
		CadastroDePessoas m = new CadastroDePessoas();
		m.setNome("VW");
		m.setOrigem("Alemanha");
		
		MarcaDao.inserir(m);
		
		
		//Teste Alterar 
		
		CadastroDePessoas m = new CadastroDePessoas();
		m.setNome("Toyota");
		m.setOrigem("Jap�o");
		m.setId(2);
		
		MarcaDao.alterar(m);
		
		//Teste Excluir 
		
		boolean resultado = MarcaDao.excluir(3);
		if (resultado) {
			System.out.println("Marca exclu�da com sucesso!!!");
		}
		else {
			System.out.println("Erro ao excluir a Marca!!!");
		}
		
		
		ArrayList<CadastroDePessoas> lista = MarcaDao.listagem();
		for (CadastroDePessoas marca : lista) {
			System.out.println(marca.toString());
		}
		
	}

}
