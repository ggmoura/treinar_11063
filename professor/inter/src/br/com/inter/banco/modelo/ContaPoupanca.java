package br.com.inter.banco.modelo;

import br.com.inter.banco.modelo.core.Conta;

public class ContaPoupanca extends Conta {

	static {
		taxaRendimento = 0f;
	}

	private static Float taxaRendimento;

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

}
