package br.com.treinar.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("*.trn")
public class ServletController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		try {
			IServico s = (IServico) Class.forName(action).newInstance();
			String destino = s.executar(request, response);
			request.getRequestDispatcher(destino).forward(request, response);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
