package br.com.treinar.academico.decision;

public class Algoritmo_NumeroIntervalo {
	public static void main(String[] args) {
		int n = 1;
		if (n >= 1 && n <= 3) {
			if (n == 1) {
				System.out.println("o numero � um");
			} else if (n == 2) {
				System.out.println("o numero � dois");
			} else if (n == 3) {
				System.out.println("o numero � tres");
			}
		} else {
			System.out.println("o numero n�o est� no intervalo ");
		}
	}

}
