package br.com.treinarminas.academico.exception;

import javax.management.RuntimeErrorException;

public class TesteException {

	public static void main(String[] args) {
		chefeMandaPagarConta();
	}
	
	private static void chefeMandaPagarConta() {
		System.out.println("mandei pagar a conta");
		try {
			secretariaMandaPagarConta();
		} catch (Exception e) {
			System.out.println("Calote");
		}
	}
	
	private static void secretariaMandaPagarConta() throws Exception {
		System.out.println("");
		motobyMandaPagarConta();
		
	}
	
	private static void motobyMandaPagarConta() throws Exception {
		System.out.println("motoboy - vou pagar");
		if ("a".equals("a")) {
			throw new Exception();
		}
		
	}

}
