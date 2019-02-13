package br.com.inter.banco.util;

import java.util.ArrayList;
import java.util.List;

import br.com.inter.banco.modelo.core.Conta;

public class Storage {

	private static Storage instance;
	private List<Conta> contas;
	
	private Storage() {
		super();
		contas = new ArrayList<>();
	}

	static {
		instance = new Storage();
	}

	public static Storage getInstance() {
		return instance;
	}
	
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}

	public List<Conta> getContas() {
		return contas;
	}

	public Conta getConta(Integer numeroConta) {
		Conta c = new Conta() {//Classe Anoima
			@Override
			public void depositar(Double valor) {
				//stub
			}
		};
		c.setNumero(numeroConta);
		return contas.get(contas.indexOf(c));
	}
	
	public Conta getConta(Conta conta) {
		return contas.get(contas.indexOf(conta));
	}
}
