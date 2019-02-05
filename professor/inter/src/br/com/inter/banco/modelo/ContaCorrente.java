package br.com.inter.banco.modelo;

import br.com.inter.banco.modelo.core.Conta;

public class ContaCorrente extends Conta {

	private Double limiteCredito;
	private Double taxaManutencao;
	private Double tetoLimiteCredito;
	
	@Override
	public void sacar(Double valor) {
		if (getSaldo() + limiteCredito >= valor) {
			if (getSaldo() >= valor) {
				super.sacar(valor);
			} else {
				limiteCredito = limiteCredito - (valor - getSaldo());
				setSaldo(0d);
			}
		}
		super.setSaldo(getSaldo() - valor);
	}

	@Override
	public void depositar(Double valor) {
		if (limiteCredito < tetoLimiteCredito) {
			if (valor < tetoLimiteCredito - limiteCredito) {
				limiteCredito += valor;
			} else {
				setSaldo(tetoLimiteCredito - limiteCredito);
				limiteCredito = tetoLimiteCredito;
			}
		} else {
			setSaldo(getSaldo() + valor);
		}
	}
	
	@Override
	public Double consultarSaldo() {
		return super.consultarSaldo() + limiteCredito;
	}
	
	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public Double getTaxaManutencao() {
		return taxaManutencao;
	}

	public void setTaxaManutencao(Double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}

	public Double getTetoLimiteCredito() {
		return tetoLimiteCredito;
	}

	public void setTetoLimiteCredito(Double tetoLimiteCredito) {
		this.tetoLimiteCredito = tetoLimiteCredito;
	}

}
