package br.com.inter.banco.controle;

import br.com.inter.banco.modelo.core.Cliente;
import br.com.inter.banco.modelo.core.Conta;

public class BancoControle {

	private Conta c;

	public void criarConta(String nomeCliente, Integer numeroConta, Long cpf) {
		c = new Conta();
		c.setNumero(numeroConta);
		
		Cliente cliente = new Cliente();
		cliente.setNomeCliente(nomeCliente);
		cliente.setCpf(cpf);
		
		c.setCliente(cliente);
	}

	public Double recuperarSaldo() {
		return c.consultarSaldo();
	}

	public void depositar(Double valor) {
		c.depositar(valor);
	}

	public void sacar(Double valor) {
		c.sacar(valor);
	}
	
}
