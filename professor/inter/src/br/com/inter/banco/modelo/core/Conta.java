package br.com.inter.banco.modelo.core;

public abstract class Conta {

	private Integer numero;
	private Double saldo;
	private Cliente cliente;
	
	public Conta() {
		this.saldo = 0.0;
	}

	public abstract void depositar(Double valor);

	public Double consultarSaldo() {
		return this.saldo;
	}
	
	public void sacar(Double valor) {
		setSaldo(getSaldo() - valor);
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	protected Double getSaldo() {
		return saldo;
	}

	protected void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
