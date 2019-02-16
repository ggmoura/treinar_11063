package br.com.treinar.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContatoDAO {

	public void gravarContato(Contato contato) throws SQLException {
		Connection con = ConnectionFactory.getInstance().getConnection();
		String sql = "insert into contato (nome, email, endereco, dataNascimento) values (?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, contato.getNome());
		stmt.setString(2, contato.getEmail());
		stmt.setString(3, contato.getEndereco());
		stmt.setDate(4, new java.sql.Date(contato.getDataNascimento().getTime()));
		stmt.execute();
		stmt.close();
		con.close();
	}

	public List<Contato> recuperarContatos() throws Exception {
		Connection con = ConnectionFactory.getInstance().getConnection();
		String sql = "select * from contato";
		PreparedStatement stmt = con.prepareStatement(sql);
		List<Contato> contatos = new ArrayList<>();
		ResultSet rs = stmt.executeQuery();
		Contato contato;
		while (rs.next()) {
			contato = new Contato();
			contato.setId(rs.getLong("id"));
			contato.setNome(rs.getString("nome"));
			contato.setEmail(rs.getString("email"));
			contato.setEndereco(rs.getString("endereco"));
			contato.setDataNascimento(new Date(rs.getDate("dataNascimento").getTime()));
			contatos.add(contato);
		}
		stmt.execute();
		stmt.close();
		con.close();

		return contatos;
	}

	public void excluirContato(Long id) throws Exception {
		Connection con = ConnectionFactory.getInstance().getConnection();
		PreparedStatement stmt = con.prepareStatement("delete from contato where id=?");
        stmt.setLong(1, id);
        stmt.execute();
        stmt.close();
		con.close();
	}

}