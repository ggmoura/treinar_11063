package inter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.inter.banco.modelo.ContaCorrente;
import br.com.inter.banco.modelo.ContaSalario;

public class TesteGunit {

	public ContaCorrente cc;
	public ContaSalario cs;

	@Before
	public void antesTest() {
		cc = new ContaCorrente();
		cs = new ContaSalario();
	}
	@Test
	public void teste() {
		cc.setTetoLimiteCredito(2000d);
		Assert.assertEquals(cc.getTetoLimiteCredito(), new Double(2000d));
		cc.setTaxaManutencao(20d);
		Assert.assertEquals(cc.getTaxaManutencao(), new Double(20d));
	}
	@Test
	public void testecs(){
		cs.setDiaDepositoSalario(10);
		Assert.assertEquals(cs.getDiaDepositoSalario(), new Integer(10));
		
		
	}
}
