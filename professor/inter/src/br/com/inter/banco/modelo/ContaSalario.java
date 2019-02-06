package br.com.inter.banco.modelo;

import br.com.inter.banco.modelo.core.Conta;
import br.com.inter.banco.modelo.core.IProduto;

public class ContaSalario extends Conta implements IProduto {

	private Long id;
	
	@Override
	public Object getId() {
		return id;
	}
	
	@Override
	public void setId(Object id) {
		this.id = (Long) id;
	}
	
	private Integer diaDepositoSalario;

	public Integer getDiaDepositoSalario() {
		return diaDepositoSalario;
	}

	public void setDiaDepositoSalario(Integer diaDepositoSalario) {
		this.diaDepositoSalario = diaDepositoSalario;
	}

	@Override
	public void depositar(Double valor) {
		setSaldo(super.getSaldo() + valor);
	}

}
