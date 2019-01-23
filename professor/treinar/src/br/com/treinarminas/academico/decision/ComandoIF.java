package br.com.treinarminas.academico.decision;

public class ComandoIF {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if (a < b) {
			System.out.println("a eh menor que b");
			if (b == 21) {
				System.out.println("b eh igual a 21");
			} else {
				if (b == a) {
					System.out.println("a eh a primeira letra!");
				}
				System.out.println("b nao eh igual a 21");
			}
		}
		System.out.println("Fim do meu programa!");
	}
	
}
