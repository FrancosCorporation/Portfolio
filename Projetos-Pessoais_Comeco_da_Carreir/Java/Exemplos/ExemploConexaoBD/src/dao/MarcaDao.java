package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import modelo.CadastroDePessoas;

public class MarcaDao {

	public static boolean inserir(CadastroDePessoas marca) {
		try {
			String sql = "insert into marca (mar_nome, mar_origem) values (?, ?)";
			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, marca.getNome());
			pstm.setString(2, marca.getOrigem());
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print("Erro ao inserir! " + e.getMessage());
			return false;
		}
	}

	public static boolean alterar(CadastroDePessoas marca) {
		try {
			String sql = "update marca set mar_nome = ?, mar_origem = ? "
					   + " where mar_id = ?";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, marca.getNome());
			pstm.setString(2, marca.getOrigem());
			pstm.setInt(3, marca.getId());
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print("Erro ao alterar! " + e.getMessage());
			return false;
		}
	}

	public static boolean excluir(int id) {
		try {
			String sql = "delete from Marca where mar_id = ?";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.print("Erro ao excluir! " + e.getMessage());
			return false;
		}
	}
	
	public static ArrayList<CadastroDePessoas> listagem() {
		
		try {
			String sql = "select * from marca order by mar_nome";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			ArrayList<CadastroDePessoas> listaMarcas = new ArrayList<CadastroDePessoas>();
			while (rs.next()) {
				CadastroDePessoas m = new CadastroDePessoas();
				m.setId(rs.getInt("mar_id"));
				m.setNome(rs.getString("mar_nome"));
				m.setOrigem(rs.getString("mar_origem"));
				listaMarcas.add(m);
			}
			return listaMarcas;
		} catch (Exception e) {
			System.out.print("Erro ao listar! " + e.getMessage());
			return null;
		}
	}
	
	public static CadastroDePessoas retornaPorId(int id) {
		try {
			String sql = "select * from marca where mar_id = ?";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			
			rs.next();
			CadastroDePessoas m = new CadastroDePessoas();
			m.setId(rs.getInt("mar_id"));
			m.setNome(rs.getString("mar_nome"));
			return m;
		} catch (Exception e) {
			System.out.print("Erro ao listar! " + e.getMessage());
			return null;
		}
	}

	public static int retornaUltimoId() {
		try {
			String sql = "select max(mar_id) as ultimo from marca";

			Connection conn = Conexao.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			rs.next();
			return rs.getInt("ultimo");
		} catch (Exception e) {
			return 0;
		}
	}
	
}
