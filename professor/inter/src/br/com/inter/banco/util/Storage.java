package br.com.inter.banco.util;

import br.com.inter.banco.modelo.core.Conta;

public class Storage {

	private static Storage instance;
	private Conta conta;

	static {
		instance = new Storage();
	}

	public static Storage getInstance() {
		return instance;
	}

	private Storage() {

	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

}
