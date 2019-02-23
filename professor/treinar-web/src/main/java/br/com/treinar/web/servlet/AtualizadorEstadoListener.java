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

    /**
     * Default constructor. 
     */
    public AtualizadorEstadoListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
        System.out.println("Servidor desligando");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
        List<String> estados = new ArrayList<String>();
        estados.add("Minas Gerais");
        estados.add("Sao paulo");
        estados.add("Rio de janeiro");
        estados.add("Goias");        
        sce.getServletContext().setAttribute("estados", estados);
        System.out.println(estados);
    }  
	
}
