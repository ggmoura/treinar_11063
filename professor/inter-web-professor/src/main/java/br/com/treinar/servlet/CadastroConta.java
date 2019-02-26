package br.com.treinar.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.inter.banco.controle.BancoControle;

public class CadastroConta implements IServico {

	@Override
	public String executar(HttpServletRequest request, HttpServletResponse response) {
		BancoControle c = new BancoControle();
		String nomeCliente = request.getParameter("cliente");
		Integer numeroConta = Integer.valueOf(request.getParameter("numero"));
		Long cpf = Long.parseLong(request.getParameter("cpf"));
		Double limiteCredito = Double.valueOf(request.getParameter("limiteCredito"));
		Double taxaManutencao = Double.valueOf(request.getParameter("taxaManutencao"));

		c.criarContaCorrente(nomeCliente, numeroConta, cpf, limiteCredito, taxaManutencao);
		return "/listaContas.jsp";
	}
	
}
