package br.com.treinar.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.treinar.web.model.Pessoa;

@WebServlet("/ServletJSTL")
public class ServletJSTL extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public ServletJSTL() {
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		for (int i = 0; i < 6; i++) {
			pessoas.add(new Pessoa("Pessoa " + (i + 1), "Sobrenome " + (i + 1)));
		}

		request.setAttribute("pessoas", pessoas);
		request.getRequestDispatcher("/taglib.jsp").forward(request, response);

	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPut(req, resp);
	}

}
