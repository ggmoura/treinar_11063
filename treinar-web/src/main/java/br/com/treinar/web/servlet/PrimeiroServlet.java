package br.com.treinar.web.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Caso nome classe igual Servlet
//@WebServlet("TerceiroServlet")
//Caso nome servlet diferente, neste caso um array
//@WebServlet(urlPatterns= {"*.reginaldo", "casodois"})

@WebServlet("/PrimeiroServlet")
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public PrimeiroServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nomeDaPessoa");
		String idade = request.getParameter("idadeDaPessoa");
		String msg = "Olá ".concat(nome).concat(" Parabéns pelos seus ").concat(idade);
		
		java.util.List<String> nomes = new ArrayList<String>();
		nomes.add("reginaldo");
		nomes.add("vanessa");
		nomes.add("beatriz");
		nomes.add("emanuela");
		
		request.setAttribute("parabens", nomes);
		request.getRequestDispatcher("/cadastro.jsp").forward(request, response);
	}
}
//Java bin - tem get e set para todos as atributos
