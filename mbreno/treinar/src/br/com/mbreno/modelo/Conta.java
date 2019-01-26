package br.com.mbreno.modelo;

public class Conta {

	int numAgencia;
	Double saldo;
	int numerosaque;
	String tipoConta;
	int codConta;

	void sacar() {
		numerosaque++;
	}

	void sacar(String categoria) {
		if (categoria == "vip") {
			sacar();

		} else {
			if (numerosaque < 2) {
				sacar();
			} else {
				System.out.println("Limite de saque");
			}

		}
		
	}

}
