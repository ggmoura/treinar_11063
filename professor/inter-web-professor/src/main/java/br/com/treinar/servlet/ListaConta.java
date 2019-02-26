package br.com.treinar.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.inter.banco.util.Storage;

public class ListaConta implements IServico {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("contas", Storage.getInstance().getContas());
		return "/listaContas.jsp";
	}
	
}
