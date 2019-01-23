package br.com.treinarminas.academico.decision;

public class ComandoIF {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if (a < b) {
			System.out.println("A e maior que B");
			if (b == 20) {
				System.out.println("B e igual a 21 ");
			} else {
				if (b == a) {
				System.out.println("B não e igual a 21");
			}
		}
		System.out.println("Fim do meu programa");
	}

 }
}
