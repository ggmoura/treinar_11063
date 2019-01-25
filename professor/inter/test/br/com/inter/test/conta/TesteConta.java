package br.com.inter.test.conta;

import br.com.inter.banco.modelo.core.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.depositar(1000d);
		System.out.println("Teste Depositar: " + c.getSaldo());
	}
	
}
