package br.com.inter.banco.controle;

import br.com.inter.banco.modelo.ContaCorrente;
import br.com.inter.banco.modelo.ContaInvestimento;
import br.com.inter.banco.modelo.ContaPoupanca;
import br.com.inter.banco.modelo.ContaSalario;
import br.com.inter.banco.modelo.core.Cliente;
import br.com.inter.banco.modelo.core.Conta;
import br.com.inter.banco.modelo.core.IProdutoPagavel;
import br.com.inter.banco.modelo.core.IProdutoRentavel;
import br.com.inter.banco.util.Storage;

public class BancoControle {

	private Storage storage;
	
	public BancoControle() {
		storage = Storage.getInstance();
	}

	public Double recuperarSaldo(Integer numeroConta) {
		Conta c = storage.getConta(numeroConta);
		return c.consultarSaldo();
	}

	public void depositar(Integer numeroConta, Double valor) {
		Conta c = storage.getConta(numeroConta);
		c.depositar(valor);
	}

	public void sacar(Integer numeroConta, Double valor) {
		Conta c = storage.getConta(numeroConta);
		if (c != null) {
			c.sacar(valor);
		}
	}

	private void criarConta(Conta conta, String nomeCliente, Integer numeroConta, Long cpf) {
		conta.setNumero(numeroConta);
		Cliente cliente = new Cliente();
		cliente.setNomeCliente(nomeCliente);
		cliente.setCpf(cpf);
		conta.setCliente(cliente);
	}
	
	public void criarContaCorrente(String nomeCliente, Integer numeroConta, Long cpf, Double limiteCredito,
			Double taxaManutencao) {
		final ContaCorrente conta = new ContaCorrente();
		this.criarConta(conta, nomeCliente, numeroConta, cpf);
		conta.setTaxaManutencao(taxaManutencao);
		conta.setTetoLimiteCredito(limiteCredito);
		conta.setLimiteCredito(limiteCredito);
		storage.adicionarConta(conta);
	}

	public void criarContaPoupanca(String nomeCliente, Integer numeroConta, Long cpf, Float taxaRendimento) {
		ContaPoupanca conta = new ContaPoupanca();
		this.criarConta(conta, nomeCliente, numeroConta, cpf);
		storage.adicionarConta(conta);
	}

	public void criarContaSalario(String nomeCliente, Integer numeroConta, Long cpf, Integer diaDepositoSalario) {
		ContaSalario conta = new ContaSalario();
		this.criarConta(conta, nomeCliente, numeroConta, cpf);
		conta.setDiaDepositoSalario(diaDepositoSalario);
		storage.adicionarConta(conta);
	}
	
	public void criarContaInvestimento(String nomeCliente, Integer numeroConta, Long cpf) {
		ContaInvestimento conta = new ContaInvestimento();
		this.criarConta(conta, nomeCliente, numeroConta, cpf);
		storage.adicionarConta(conta);
	}

	public void alterarTaxaRendimento(Float taxaRendimento) {
		ContaPoupanca.setTaxaRendimento(taxaRendimento);
	}

	public void tarifar() {
		Conta[] contas = storage.getContas();
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] instanceof IProdutoPagavel) {
				IProdutoPagavel p = (IProdutoPagavel) contas[i];
				p.cobrar();
			}
		}
	}

	public void creditar() {
		Conta[] contas = storage.getContas();
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] instanceof IProdutoRentavel) {
				IProdutoRentavel p = (IProdutoRentavel) contas[i];
				p.creditar();
			}
		}
	}

}
