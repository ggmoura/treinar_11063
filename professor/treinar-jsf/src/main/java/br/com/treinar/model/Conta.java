package br.com.treinar.model;

public class Conta {

	private String cliente;
	private Double saldo;

	public Conta() {
		super();
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [cliente=" + cliente + ", saldo=" + saldo + "]";
	}

}
