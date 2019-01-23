package br.com.treinarminas.academico.Exercicios;

// Exercicio de controle if{} else
public class ImprimirPorExtenso {
	public static void main(String[] args) {
		int numero = 2;
		if (numero == 1) {
			System.out.println("Numero é = " + numero + "(um)");
		} else if (numero == 2) {
			System.out.println("Numero é = " + numero+ "(dois)");
		} else if (numero == 3) {
			System.out.println("Numero é = " + numero+ "(três)");
		} else {
			System.out.println("Numero é = inválido");
		}
	}
}
