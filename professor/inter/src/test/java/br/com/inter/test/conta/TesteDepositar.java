package br.com.inter.test.conta;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.inter.banco.modelo.ContaPoupanca;
import br.com.inter.banco.modelo.core.Conta;

public class TesteDepositar {

	private Conta c;
	
	@Before
	public void init() {
		c = new ContaPoupanca();
	}
	
	@Test
	public void testeDepositar() {
		c.depositar(200d);
		Assert.assertEquals(c.consultarSaldo(), Double.valueOf(200));
	}
	
	@Test
	public void testeHashCode() {
		c.hashCode();
	}
	
}
