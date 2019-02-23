package br.com.treinar.web.servlet;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class AtualizadorEstadoListener
 *
 */
@WebListener
public class AtualizadorEstadoListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0)  { 
         System.out.println("e-mail falando o servidor foi desligado");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  {
    	List<String> estados = new ArrayList<>();
    	estados.add("Minas Gerais");
    	estados.add("Tocantins");
    	estados.add("Rio de Janeiro");
    	estados.add("São Paulo");
        sce.getServletContext().setAttribute("estados", estados);
        System.out.println(estados);
    }
	
}
