package br.com.inter.test.conta;

import br.com.inter.banco.modelo.ContaCorrente;
import br.com.inter.banco.modelo.core.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		c.depositar(1000d);
		//c.setSaldo(100d);
		ContaCorrente instanciaContacorrente = (ContaCorrente) c;
		instanciaContacorrente.setLimiteCredito(100.0);
		instanciaContacorrente.setTaxaManutencao(10d);
		
		((ContaCorrente) c).setLimiteCredito(10d);

		System.out.println("Teste Depositar: " + c.consultarSaldo());
	}
	
}
