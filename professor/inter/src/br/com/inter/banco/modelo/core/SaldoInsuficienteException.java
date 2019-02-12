package br.com.inter.banco.modelo.core;

public class SaldoInsuficienteException extends Exception {

	// TODO falar sobre serialVersionUID
	private static final long serialVersionUID = 1L;

	private Double saldoAtual;

	public Double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(Double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

}
