package dao;

import conexao.Conexao;
import interfaces.IUsuario;
import model.Usuario;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO extends Conexao implements IUsuario{
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	Statement stmt;
	
	public UsuarioDAO() throws ClassNotFoundException, SQLException {
		super();
		conn = conectar();
	}

	@Override
	public void inserir() throws Exception {
		
		String sql = "INSERT INTO Users (nome, email, login, senha) VALUES (?, ?, ?, ?)";

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "Pica Pau");
		pstmt.setString(2, "novoemail@email.com.br");
		pstmt.setString(3, "roger");
		pstmt.setString(4, "123456");

		int inserido = pstmt.executeUpdate();


		if (inserido > 0) {
		System.out.println("Usuário Inserido com Sucesso!");
		}else {
			System.out.println("Erro ao inserir");
		}
		
	}
	
	@Override
	public void excluir() throws Exception {
		
		String sql = "DELETE FROM usuario WHERE id=?";

		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 1);

		int deletado = pstmt.executeUpdate();
		
		if (deletado > 0) {
			System.out.println("Usuario deletado com sucesso!");
		}else {
			System.out.println("Erro ao deletar");
		}
		
	}

	@Override
	public void atualizar() throws Exception {
		
		String sql = "UPDATE Users SET senha=?, sobrenome=?, email=? WHERE id=?";

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "123456789");
		pstmt.setString(2, "William Henry Bill Gates");
		pstmt.setString(3, "bill.gates@microsoft.com");
		pstmt.setInt(4, 2);

		int atualizado = pstmt.executeUpdate();
		
		if (atualizado > 0) {
			System.out.println("Dados Atualizados com Sucesso!");
		}else {
			System.out.println("Erro ao atualizar");
		}
		
	}

	@Override
	public void listar() throws Exception {
		
		String sql = "SELECT * FROM usuario";

		pstmt = conn.prepareStatement("select * from usuario");
		rs = pstmt.executeQuery();

		int count = 0;

		while (rs.next()) {
			
			String nome = rs.getString("nome");
			String senha = rs.getString("senha");
			String login = rs.getString("login");
			String email = rs.getString("email");
	
			System.out.println(nome);
			System.out.println(senha);
			System.out.println(login);
			System.out.println(email);
			System.out.println("****************************************");

		}
		
	}

	@Override
	public void inserir(Usuario usuario) throws Exception {
		
		String sql = "INSERT INTO Users (nome, email, login, senha) VALUES (?, ?, ?, ?)";

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "Pica Pau");
		pstmt.setString(2, "novoemail@email.com.br");
		pstmt.setString(3, "roger");
		pstmt.setString(4, "123456");

		int inserido = pstmt.executeUpdate();


		if (inserido > 0) {
		System.out.println("Usuário Inserido com Sucesso!");
		}else {
			System.out.println("Erro ao inserir");
		}
	}
	
}
