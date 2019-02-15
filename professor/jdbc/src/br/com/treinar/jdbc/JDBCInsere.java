package br.com.treinar.jdbc;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException, ParseException {
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		ContatoDAO dao = new ContatoDAO();
		Contato contato = new Contato();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome: ");
		contato.setNome(sc.nextLine());
		System.out.print("E-mail: ");
		contato.setEmail(sc.nextLine());
		System.out.print("Endereço: ");
		contato.setEndereco(sc.nextLine());
		System.out.print("Data Nascimento [dd/MM/yyyy]: ");
		contato.setDataNascimento(df.parse(sc.nextLine()));
		
		dao.gravarContato(contato);
		sc.close();
		
		System.out.println("feito");
	}
}