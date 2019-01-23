package br.com.treinarminas.academico.decision;

public class ComandoSwitchCase {
	public static void main(String[] args) {
		int numero = 100;
		switch (numero) {
		case 1:
			System.out.println("Número Um");
		case 2:
			System.out.println("Número Dois");
		case 3:
			System.out.println("Número Três");
			break;

		default:
			System.out.println("Número Inválido");
			break;
		}
	}

}
