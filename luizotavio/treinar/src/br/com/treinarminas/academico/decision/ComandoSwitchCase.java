package br.com.treinarminas.academico.decision;

public class ComandoSwitchCase {
	public static void main(String[] args) {
		int numero = 100;
		switch (numero) {
		case 1:
			System.out.println("N�mero Um");
		case 2:
			System.out.println("N�mero Dois");
		case 3:
			System.out.println("N�mero Tr�s");
			break;

		default:
			System.out.println("N�mero Inv�lido");
			break;
		}
	}

}
