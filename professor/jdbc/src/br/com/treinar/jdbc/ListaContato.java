package br.com.treinar.jdbc;

import java.util.List;

public class ListaContato {

	public static void main(String[] args) throws Exception {
		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = dao.recuperarContatos();
		contatos.forEach(System.out::println);
	}
	
}
