package br.com.inter.banco.modelo.core;

public class Conta {

	private Integer numero;
	private Double saldo;
	private Cliente cliente;
	
	public Conta() {
		this.saldo = 0.0;
	}

	public void depositar(Double valor) {
		this.saldo += valor;
	}
	
	public Double consultarSaldo() {
		return this.saldo;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
