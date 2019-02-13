package br.com.inter.test.conta;

import br.com.inter.banco.modelo.ContaCorrente;
import br.com.inter.banco.modelo.core.Conta;

public class TesteComparacaoConta {

	public static void main(String[] args) {
		
		Conta c1 = new ContaCorrente();
		c1.setNumero(10481);
		
		Conta c2 = new ContaCorrente();
		c2.setNumero(10481);
		
		Conta c3 = c2;
		
		System.out.println(c1.equals(c2));
		System.out.println(c3.equals(c2));
		System.out.println(c3.equals(null));
		
	}
	
}
 