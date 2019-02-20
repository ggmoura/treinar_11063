package br.com.treinar.jdbc;

public class DeleteContato {

	public static void main(String[] args){
		ContatoDAO dao = new ContatoDAO();
		Contato c = new Contato();

		dao.remove(c);

	}
}
