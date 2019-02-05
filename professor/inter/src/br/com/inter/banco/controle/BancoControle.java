package br.com.inter.banco.controle;

import br.com.inter.banco.modelo.ContaCorrente;
import br.com.inter.banco.modelo.ContaPoupanca;
import br.com.inter.banco.modelo.ContaSalario;
import br.com.inter.banco.modelo.core.Cliente;
import br.com.inter.banco.modelo.core.Conta;
import br.com.inter.banco.util.Storage;

public class BancoControle {

	public Double recuperarSaldo() {
		Conta c = Storage.getInstance().getConta();
		return c.consultarSaldo();
	}

	public void depositar(Double valor) {
		Conta c = Storage.getInstance().getConta();
		c.depositar(valor);
	}

	public void sacar(Double valor) {
		Conta c = Storage.getInstance().getConta();
		c.sacar(valor);
	}

	private void criarConta(String nomeCliente, Integer numeroConta, Long cpf) {
		Conta c = Storage.getInstance().getConta();
		c.setNumero(numeroConta);
		Cliente cliente = new Cliente();
		cliente.setNomeCliente(nomeCliente);
		cliente.setCpf(cpf);
		c.setCliente(cliente);
	}
	
	public void criarContaCorrente(String nomeCliente, Integer numeroConta, Long cpf, Double limiteCredito,
			Double taxaManutencao) {
		Storage.getInstance().setConta(new ContaCorrente());
		this.criarConta(nomeCliente, numeroConta, cpf);
		((ContaCorrente) Storage.getInstance().getConta()).setTaxaManutencao(taxaManutencao);
		((ContaCorrente) Storage.getInstance().getConta()).setTetoLimiteCredito(limiteCredito);
		((ContaCorrente) Storage.getInstance().getConta()).setLimiteCredito(limiteCredito);
	}

	public void criarContaPoupanca(String nomeCliente, Integer numeroConta, Long cpf, Float taxaRendimento) {
		Storage.getInstance().setConta(new ContaPoupanca());
		this.criarConta(nomeCliente, numeroConta, cpf);
	}

	public void criarContaSalario(String nomeCliente, Integer numeroConta, Long cpf, Integer diaDepositoSalario) {
		Storage.getInstance().setConta(new ContaSalario());
		this.criarConta(nomeCliente, numeroConta, cpf);
		((ContaSalario) Storage.getInstance().getConta()).setDiaDepositoSalario(diaDepositoSalario);
	}

	public void alterarTaxaRendimento(Float taxaRendimento) {
		ContaPoupanca.setTaxaRendimento(taxaRendimento);
	}
	
}
