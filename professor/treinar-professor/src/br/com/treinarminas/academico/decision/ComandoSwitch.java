package br.com.treinarminas.academico.decision;

public class ComandoSwitch {

	public static void main(String[] args) {
		int numero = 10;
		switch (numero) {
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Tres");
			break;
		default:
			System.out.println("Invalido");
			break;
		}
	}

}
