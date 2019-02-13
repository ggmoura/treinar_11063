package br.com.inter.banco.modelo;

import br.com.inter.banco.modelo.core.Conta;
import br.com.inter.banco.modelo.core.IProdutoPagavel;
import br.com.inter.banco.modelo.core.IProdutoRentavel;

public class ContaInvestimento extends Conta implements IProdutoRentavel<Integer>, IProdutoPagavel<Integer> {

	private Integer id;
	
	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = (Integer) id;
	}

	@Override
	public void depositar(Double valor) {
		setSaldo(super.getSaldo() + valor);
	}

	@Override
	public void cobrar() {
		System.out.println("cobrando");
	}

	@Override
	public void creditar() {
		System.out.println("creditando");
	}
}
