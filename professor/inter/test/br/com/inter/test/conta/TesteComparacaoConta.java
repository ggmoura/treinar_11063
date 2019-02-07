package br.com.inter.test.conta;

import br.com.inter.banco.modelo.ContaCorrente;
import br.com.inter.banco.modelo.core.Conta;

public class TesteComparacaoConta {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		
		System.out.println(c1 == c2);

	}

}
