package br.com.inter.test.conta;

import br.com.inter.banco.modelo.ContaCorrente;
import br.com.inter.banco.modelo.ContaInvestimento;

public class TesteGenericId {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.setId(10L);
		Long idCC = (Long) cc.getId();
		System.out.println(idCC);
		
		ContaInvestimento ci = new ContaInvestimento();
		ci.setId(10481);
		Integer idCI = (Integer) ci.getId();
		System.out.println(idCI);
	}
	
}
