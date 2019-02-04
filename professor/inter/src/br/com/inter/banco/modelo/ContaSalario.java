package br.com.inter.banco.modelo;

import br.com.inter.banco.modelo.core.Conta;

public class ContaSalario extends Conta {

	private Integer diaDepositoSalario;

	public Integer getDiaDepositoSalario() {
		return diaDepositoSalario;
	}

	public void setDiaDepositoSalario(Integer diaDepositoSalario) {
		this.diaDepositoSalario = diaDepositoSalario;
	}

}
