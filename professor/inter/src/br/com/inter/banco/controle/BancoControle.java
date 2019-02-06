package br.com.inter.banco.controle;

import br.com.inter.banco.modelo.ContaCorrente;
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

	public Double recuperarSaldo() {
		Conta c = storage.getConta();
		return c.consultarSaldo();
	}

	public void depositar(Double valor) {
		Conta c = storage.getConta();
		c.depositar(valor);
	}

	public void sacar(Double valor) {
		Conta c = storage.getConta();
		c.sacar(valor);
	}

	private void criarConta(String nomeCliente, Integer numeroConta, Long cpf) {
		Conta c = storage.getConta();
		c.setNumero(numeroConta);
		Cliente cliente = new Cliente();
		cliente.setNomeCliente(nomeCliente);
		cliente.setCpf(cpf);
		c.setCliente(cliente);
	}
	
	public void criarContaCorrente(String nomeCliente, Integer numeroConta, Long cpf, Double limiteCredito,
			Double taxaManutencao) {
		storage.setConta(new ContaCorrente());
		this.criarConta(nomeCliente, numeroConta, cpf);
		((ContaCorrente) storage.getConta()).setTaxaManutencao(taxaManutencao);
		((ContaCorrente) storage.getConta()).setTetoLimiteCredito(limiteCredito);
		((ContaCorrente) storage.getConta()).setLimiteCredito(limiteCredito);
	}

	public void criarContaPoupanca(String nomeCliente, Integer numeroConta, Long cpf, Float taxaRendimento) {
		storage.setConta(new ContaPoupanca());
		this.criarConta(nomeCliente, numeroConta, cpf);
	}

	public void criarContaSalario(String nomeCliente, Integer numeroConta, Long cpf, Integer diaDepositoSalario) {
		storage.setConta(new ContaSalario());
		this.criarConta(nomeCliente, numeroConta, cpf);
		((ContaSalario) storage.getConta()).setDiaDepositoSalario(diaDepositoSalario);
	}

	public void alterarTaxaRendimento(Float taxaRendimento) {
		ContaPoupanca.setTaxaRendimento(taxaRendimento);
	}

	public void tarifar() {
		Conta c = storage.getConta();
		if (c instanceof IProdutoPagavel) {
			IProdutoPagavel p = (IProdutoPagavel) c;
			p.cobrar();
		}
	}

	public void creditar() {
		Conta c = storage.getConta();
		if (c instanceof IProdutoRentavel) {
			IProdutoRentavel p = (IProdutoRentavel) c;
			p.creditar();
		}
	}
	
}
