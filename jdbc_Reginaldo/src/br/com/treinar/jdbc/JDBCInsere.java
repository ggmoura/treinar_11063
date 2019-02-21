package br.com.treinar.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class JDBCInsere {

        public static void main(String[] args) throws SQLException {

            ConnectionFactory.getInstance();
			// conectando
            Connection con = ConnectionFactory.getConnection();

            // cria um preparedStatement
            String sql = "insert into contato" +
                    " (nome,email,endereco,dataNascimento)" +
                    " values (?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);

            // preenche os valores
            stmt.setString(1, "Vanessa");
            stmt.setString(2, "reginaldo@gmail");
            stmt.setString(3, "Av. Nova, 45");
            stmt.setDate(4, new java.sql.Date(new Date().getTime()));

            // executa
            stmt.execute();
            stmt.close();

            System.out.println("Gravado!");

            con.close();
        }
    }