package br.com.treinar.academico.decision;

public class ComandoSwitchCase {
	public static void main(String[] args) {
		int numero = 1;
		switch (numero) {
		case 1:
			System.out.println("Um");
			break;// o break serve se a condição estiver ok ele não executa as outras condições
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Tres");
			break;
		default: //diferente das condicoes anteriores
			System.out.println("Invalido");
			break;
		}
	}

}
