package br.com.treinar.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Snippet {
	String sql;
	public void remove(Contato contato) {
		Connection con = ConnectionFactory.getInstance().getConnection();
	    try {
	    	
	    	String sql = "delete from contatos where id=?";
			PreparedStatement stmt = con.prepareStatement(sql);
	        
	        stmt.setLong(1, contato.getId());
	        stmt.execute();
	        stmt.close();
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}
}

