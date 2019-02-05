package br.com.inter.banco.controle;

import br.com.inter.banco.modelo.ContaCorrente;
import br.com.inter.banco.modelo.ContaPoupanca;
import br.com.inter.banco.modelo.ContaSalario;
import br.com.inter.banco.modelo.core.Cliente;
import br.com.inter.banco.modelo.core.Conta;

public class BancoControle {

	private Conta c;

	public Double recuperarSaldo() {
		return c.consultarSaldo();
	}

	public void depositar(Double valor) {
		c.depositar(valor);
	}

	public void sacar(Double valor) {
		c.sacar(valor);
	}

	private void criarConta(String nomeCliente, Integer numeroConta, Long cpf) {
		c.setNumero(numeroConta);
		Cliente cliente = new Cliente();
		cliente.setNomeCliente(nomeCliente);
		cliente.setCpf(cpf);
		c.setCliente(cliente);
	}
	
	public void criarContaCorrente(String nomeCliente, Integer numeroConta, Long cpf, Double limiteCredito,
			Double taxaManutencao) {
		c = new ContaCorrente();
		this.criarConta(nomeCliente, numeroConta, cpf);
		((ContaCorrente) c).setTaxaManutencao(taxaManutencao);
		((ContaCorrente) c).setTetoLimiteCredito(limiteCredito);
		((ContaCorrente) c).setLimiteCredito(limiteCredito);
	}

	public void criarContaPoupanca(String nomeCliente, Integer numeroConta, Long cpf, Float taxaRendimento) {
		c = new ContaPoupanca();
		this.criarConta(nomeCliente, numeroConta, cpf);
		((ContaPoupanca) c).setTaxaRendimento(taxaRendimento);
		
	}

	public void criarContaSalario(String nomeCliente, Integer numeroConta, Long cpf, Integer diaDepositoSalario) {
		c = new ContaSalario();
		this.criarConta(nomeCliente, numeroConta, cpf);
		((ContaSalario) c).setDiaDepositoSalario(diaDepositoSalario);
	}
	
}
