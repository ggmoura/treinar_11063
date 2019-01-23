package br.com.treinar.academico.decision;

public class Algoritmo_NumeroIntervalo {
	public static void main(String[] args) {
		int n = 1;
		if (n >= 1 && n <= 3) {
			if (n == 1) {
				System.out.println("o numero é um");
			} else if (n == 2) {
				System.out.println("o numero é dois");
			} else if (n == 3) {
				System.out.println("o numero é tres");
			}
		} else {
			System.out.println("o numero não está no intervalo ");
		}
	}

}
