package br.com.inter.banco.modelo;

import br.com.inter.banco.modelo.core.Conta;
import br.com.inter.banco.modelo.core.HoraFuncionamenoException;
import br.com.inter.banco.modelo.core.IProdutoPagavel;
import br.com.inter.banco.modelo.core.IProdutoRentavel;
import br.com.inter.banco.modelo.core.SaldoInsuficienteException;

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
	public Double cobrar() {
		Double valorCobrado = 10d;
		try {
			sacar(valorCobrado);
		} catch (SaldoInsuficienteException | HoraFuncionamenoException e) {
			valorCobrado = 0d;
			System.out.println("Enviar email falando que nao conseguiu cobra tarifa da conta " + getId());
		}
		return valorCobrado;
	}

	@Override
	public void creditar() {
		System.out.println("creditando");
	}
}
