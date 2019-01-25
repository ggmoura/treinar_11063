package br.com.inter.banco.controle;

import br.com.inter.banco.modelo.core.Cliente;
import br.com.inter.banco.modelo.core.Conta;

public class BancoControle {

	public void criarConta(String nomeCliente, Integer numeroConta, Long cpf) {
		Conta c = new Conta();
		c.setCliente(new Cliente());
		c.getCliente().setNomeCliente(nomeCliente);
		c.getCliente().setCpf(cpf);
		c.setNumero(numeroConta);
	}
	
}
