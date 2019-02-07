package br.com.inter.banco.util;

import br.com.inter.banco.modelo.core.Conta;

public class Storage {

	private static Storage instance;
	private Conta[] contas;
	private int index;
	private final int QUANTIDADE_CONTAS = 3;

	private Storage() {
		super();
		contas = new Conta[QUANTIDADE_CONTAS];
	}

	static {
		instance = new Storage();
	}

	public static Storage getInstance() {
		return instance;
	}

	public void adicionarConta(Conta conta) {
		if (index < contas.length) {
			contas = dobrarCapacidadeConta();
		}
	this.contas[this.index++] = conta;
	}
	public Conta[] dobrarCapacidadeConta() {
		Conta[] newArray = new Conta[contas.length *2];
		for (int i = 0; i < contas.length; i++) {
			newArray[i] = contas [i];
		}
		return newArray;
	
	}
	
	public Conta[] getContas() {
		int qtdContas = 0;
		for (int i = 0; i < contas.length; i++) {
			if (contas[i] != null) {
				qtdContas++;
			}
		}
		Conta[] contasPreenchidas = new Conta[qtdContas];
		for (int i = 0; i < contasPreenchidas.length; i++) {
			contasPreenchidas[i] = this.contas[i];
		}
		return contasPreenchidas;
	}

	public Conta getConta(Integer numeroConta) {
		Conta conta = null;
		for (int i = 0; i < contas.length; i++) {
			Conta c = contas[i];
			if (c != null && c.getNumero().equals(numeroConta)) {
				conta = c;
			}
		}
		return conta;
	}

}
