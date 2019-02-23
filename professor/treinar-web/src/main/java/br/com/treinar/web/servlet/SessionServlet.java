package br.com.treinar.web.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet  {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String nome = req.getParameter("nome");
		
		if (req.getSession().getAttribute("listaNomes") == null) {
			req.getSession().setAttribute("listaNomes", new ArrayList<String>());				
		}
		if (nome != null) {
			List<String> listaNomes = (List<String>) req.getSession().getAttribute("listaNomes");
			listaNomes.add(nome);
			req.getSession().setAttribute("listaNomes", listaNomes);				
			
		}
		//req.getSession().setAttribute("", arg1);
		
		req.getRequestDispatcher("/session.jsp").forward(req, resp);
	}
	
}
