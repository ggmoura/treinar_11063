package br.com.inter.banco.modelo;

import br.com.inter.banco.modelo.core.Conta;
import br.com.inter.banco.modelo.core.IProdutoRentavel;

public class ContaPoupanca extends Conta implements IProdutoRentavel<Long> {

	private Long id;
	private static Float taxaRendimento;
	
	static {
		taxaRendimento = 0f;
	}

	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public void setId(Long id) {
		this.id = (Long) id;
	}
	
	public static Float getTaxaRendimento() {
		return ContaPoupanca.taxaRendimento;
	}

	public static void setTaxaRendimento(Float taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
	}

	@Override
	public void depositar(Double valor) {
		setSaldo(getSaldo() + valor);
	}

	@Override
	public void creditar() {
		depositar(getSaldo() * taxaRendimento);
	}
	
}
