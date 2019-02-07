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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

//	@Override
//	public boolean equals(Object obj) {
//		Conta other = (Conta) obj;		
//		return this.numero.equals(other.numero);
	
//	}
	
	
}
