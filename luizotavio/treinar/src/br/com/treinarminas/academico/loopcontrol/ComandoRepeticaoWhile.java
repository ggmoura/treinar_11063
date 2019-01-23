package br.com.treinarminas.academico.loopcontrol;

public class ComandoRepeticaoWhile {
	public static void main(String[] args) {
		System.out.println("Escreva x incrementando 1 até que seja menor que 20");
		int x = 10;

		while (x < 20) {
			//System.out.println("valor de x: " + x +(x % 2 ==0 ? "Par" : "Impar");
		
			System.out.println("\nValor de x: " + x);
			if (x % 2 == 0) {
				System.out.println(x + "- PAR");
			} else {
				System.out.println(x + "- IMPAR");
			}
			x += 1;
		}
		System.out.println("Fim");
	}

}
