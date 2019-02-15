package br.com.inter.banco.controle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import br.com.inter.banco.modelo.ContaCorrente;
import br.com.inter.banco.modelo.ContaInvestimento;
import br.com.inter.banco.modelo.ContaPoupanca;
import br.com.inter.banco.modelo.ContaSalario;
import br.com.inter.banco.modelo.core.Cliente;
import br.com.inter.banco.modelo.core.Conta;
import br.com.inter.banco.modelo.core.HoraFuncionamenoException;
import br.com.inter.banco.modelo.core.IProdutoPagavel;
import br.com.inter.banco.modelo.core.IProdutoRentavel;
import br.com.inter.banco.modelo.core.SaldoInsuficienteException;
import br.com.inter.banco.util.Constante;
import br.com.inter.banco.util.Storage;

public class BancoControle {

	private Storage storage;
	private static final Integer DELAY = 10 * 1000;

	public BancoControle() {
		storage = Storage.getInstance();
//		iniciarRotinaCredito();
	}

	public Double recuperarSaldo(Integer numeroConta) {
		Conta c = storage.getConta(numeroConta);
		return c.consultarSaldo();
	}

	public void depositar(Integer numeroConta, Double valor) {
		Conta c = storage.getConta(numeroConta);
		c.depositar(valor);
	}

	public void sacar(Integer numeroConta, Double valor) throws SaldoInsuficienteException, HoraFuncionamenoException {
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

	public void criarContaPoupanca(String nomeCliente, Integer numeroConta, Long cpf) {
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
		final Path path = Paths.get(Constante.MetaDado.PATH_TAXA_RENDIMENTO);
		try {
			Files.write(path, taxaRendimento.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public CompletableFuture<String> tarifar() {
		CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
			@Override
			public String get() {
				Integer contador = 0;
				Double total = 0d;
				try {
					for (Conta conta : storage.getContas()) {
						if (conta instanceof IProdutoPagavel) {
							IProdutoPagavel<?> p = (IProdutoPagavel<?>) conta;
							total += p.cobrar();
							contador++;
							
						}
					}
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					throw new IllegalStateException(e);
				}
				return contador.toString() + " contas foram tarifadas."  + "Total credito: " + String.valueOf(total);
			}
		});
		System.out.println("Vou tarifar as contas, pode continuar seu trabalho, " + "quando estiver pronto te falo");
		return future;
	}

	public void creditar() {
		for (Conta conta : storage.getContas()) {
			if (conta instanceof IProdutoRentavel) {
				IProdutoRentavel<?> p = (IProdutoRentavel<?>) conta;
				p.creditar();
			}
		}
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void iniciarRotinaCredito() {
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("Executando rotina de credito");
				creditar();
				System.out.println("Terminei uma rotina de credito");
			}
		}, DELAY, DELAY);
	}

}
