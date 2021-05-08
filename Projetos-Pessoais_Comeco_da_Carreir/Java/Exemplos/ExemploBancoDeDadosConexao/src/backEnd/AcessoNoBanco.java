package backEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AcessoNoBanco {
	public static boolean inserir(CadastroDePessoas pessoa) {
		try {
			String sql = "insert into pessoa (nome, telefone, cpf, rg) values (?, ?, ?, ?)";
			Connection conn = ConexaoBd.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, pessoa.getNome());
			pstm.setString(2, pessoa.getTelefone());
			pstm.setString(3, pessoa.getCpf());
			pstm.setString(4, pessoa.getRg());
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Não foi possivel inserir, o Banco de Dados pode estar Desconectado !!");
			return false;
		}
	}
	public static boolean alterar(CadastroDePessoas pessoa) {
		try {
			int id =Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o numero do Id: "));
			String sql = "update pessoa set nome = ?, telefone = ?, cpf = ?, rg = ? "
					   + " where id = ?";
			Connection conn = ConexaoBd.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, pessoa.getNome());
			pstm.setString(2, pessoa.getTelefone());
			pstm.setString(3, pessoa.getCpf());
			pstm.setString(4, pessoa.getRg());
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro a achar o cadastro, verifique se a posição corresponde a um item valido !!");
			return false;
		}
	}

	public static boolean excluir() {
		try {
			int id =Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o numero do Id: "));
			String sql = "delete from pessoa where id = ?";
			Connection conn = ConexaoBd.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.executeUpdate();
			return true;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao excluir, verifique se a posição corresponde a um item valido !!");
			return false;
		}
	}
	
	public static ArrayList<CadastroDePessoas> listagem() {
		
		try {
			String sql = "select * from pessoa order by nome";

			Connection conn = ConexaoBd.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			
			ArrayList<CadastroDePessoas> listaMarcas = new ArrayList<CadastroDePessoas>();
			while (rs.next()) {
				CadastroDePessoas p = new CadastroDePessoas(Integer.parseInt(rs.getString("id")),rs.getString("nome"), rs.getString("telefone"), rs.getString("cpf"), rs.getString("rg"));
				listaMarcas.add(p);
			}
			return listaMarcas;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao Listar, o Banco de Dados pode estar Desconectado !!");
			return null;
		}
	}
	
	public static CadastroDePessoas retornaPorId() {
		try {
			int id =Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o numero do Id: "));
			String sql = "select * from pessoa where id = ?";
			Connection conn = ConexaoBd.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			ResultSet rs = pstm.executeQuery();
			rs.next();
			CadastroDePessoas p = new CadastroDePessoas(rs.getString("nome"), rs.getString("telefone"), rs.getString("cpf"), rs.getString("rg"));
			return p;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao Listar, verifique se a posição corresponde a um item valido !!");
			return null;
		}
	}

	public static int retornaUltimoId() {
		try {
			String sql = "select max(id) as ultimo from pessoa";
			Connection conn = ConexaoBd.getConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			rs.next();
			return rs.getInt("ultimo");
		} catch (Exception e) {
			return 0;
		}
	}
	
}
