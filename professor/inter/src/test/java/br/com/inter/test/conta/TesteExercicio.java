package br.com.inter.test.conta;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import br.com.inter.banco.modelo.core.Cliente;

public class TesteExercicio {
	Cliente p = new Cliente();

	@Test
	public void TestNomeCliente() {
		p.setNomeCliente("Reginaldo Veloso");
		Assert.assertEquals(p.getNomeCliente(), "Reginaldo Veloso");
	}
	
	@Test
	public void TestCpf() {
		p.setCpf(3593213648L);
		Assert.assertEquals(p.getCpf(), new Long(3593213648L));
		
	}

}
