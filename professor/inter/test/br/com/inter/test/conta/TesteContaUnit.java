package br.com.inter.test.conta;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.inter.banco.modelo.ContaCorrente;
import br.com.inter.banco.modelo.core.Cliente;

public class TesteContaUnit {

	private ContaCorrente tx;

	@Before
	public void junit() {
		tx = new ContaCorrente();
	}

	@Test
	public void teste() {
		//tx.setCliente(new Cliente());
		Assert.assertNotNull(tx.getCliente());
 
	}
}
