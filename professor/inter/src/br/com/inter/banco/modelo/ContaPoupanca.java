package br.com.inter.banco.modelo;

import br.com.inter.banco.modelo.core.Conta;

public class ContaPoupanca extends Conta {

	private Float taxaRendimento;

	public Float getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(Float taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public void depositar(Double valor) {
		setSaldo(getSaldo() + valor);
	}

}
