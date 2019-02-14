package br.com.inter.test.conta;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.inter.banco.modelo.ContaCorrente;
import br.com.inter.banco.modelo.ContaInvestimento;

public class TesteGenericIdJUnit {

	private ContaInvestimento ci;
	
	@Before
	public void antesDoTeste() {
		ci = new ContaInvestimento();
	}
	
	@Test
	public void teste() {
		ci.setId(10481);
		//Integer idCI = (Integer) ci.getId();
		Assert.assertEquals(ci.getId(), new Integer(678));
	}
	
}
