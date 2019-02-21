package br.com.inter.test.conta;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.inter.banco.modelo.ContaInvestimento;
import br.com.inter.banco.modelo.core.Cliente;

public class TesteGenericIdJUnit {
	private ContaInvestimento ci;
	private Cliente c;
	
	@Before
	public void antesDoTeste() {
		ci = new ContaInvestimento();
		c  = new Cliente(); 
		c.setNomeCliente("Fabio");
		c.setCpf((long) 06694.);
	}
	
	@Test
	public void teste() {
		ci.setId(10481);
		Assert.assertEquals(ci.getId(), new Integer(10481));
	}
	
	@Test
	public void testeSetNome() {		
		Assert.assertEquals(c.getNomeCliente(), "Fabio");
	}
	@Test
	public void testeSetCfp() {		
		Assert.assertEquals(c.getCpf(), new Long((long) 06694.));
	}
}
