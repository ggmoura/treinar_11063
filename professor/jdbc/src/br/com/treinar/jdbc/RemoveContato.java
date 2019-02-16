package br.com.treinar.jdbc;

public class RemoveContato {

	public static void main(String[] args) throws Exception {
		ContatoDAO dao = new ContatoDAO();
		dao.excluirContato(1L);
	}
	
}
