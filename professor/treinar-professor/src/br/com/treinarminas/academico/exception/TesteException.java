package br.com.treinarminas.academico.exception;

import java.util.Scanner;

public class TesteException {

	public static void main(String[] args) {
		chefeMandaPagarConta();
	}
	
	private static void chefeMandaPagarConta() {
		//Scanner sc = new Scanner(System.in);
		System.out.println("mandei pagar a conta");
		try (Scanner sc = new Scanner(System.in)) {
			try {
				String teste = sc.nextLine();
				System.out.println(teste);
				secretariaMandaPagarConta();
			} catch (Exception e) {
				System.out.println("Calote");
			}
		}
		System.out.println("final");
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
