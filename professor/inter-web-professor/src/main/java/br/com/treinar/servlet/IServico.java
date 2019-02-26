package br.com.treinar.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IServico {

	String executar(HttpServletRequest request, HttpServletResponse response);
	
}
