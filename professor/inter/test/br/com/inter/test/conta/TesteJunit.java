package br.com.inter.test.conta;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.inter.banco.modelo.ContaInvestimento;
import br.com.inter.banco.modelo.ContaSalario;

public class TesteJunit {
	private ContaSalario abc;
	private ContaInvestimento def;

	@Before
	public void antesTeste() {
		abc = new ContaSalario();
		def = new ContaInvestimento();
	}

	@Test
	public void testeUsuario() {
		abc.setDiaDepositoSalario(2);
		Assert.assertEquals(abc.getDiaDepositoSalario(), new Integer(20));
	}
	
	@Test
	public void testeUsuario2() {
		def.setNumero(123);
		Assert.assertEquals(def.getNumero(), new Integer(123));
	}
}
