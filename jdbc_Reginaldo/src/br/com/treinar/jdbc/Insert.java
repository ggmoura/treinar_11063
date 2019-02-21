package br.com.treinar.jdbc;

public class Insert {
	public static void main(String[] args) {
		String sql = "insert into contatos " +
                "(nome,email,endereco,dataNascimento) " +
                "values (?,?,?,?)";		
	}

}
