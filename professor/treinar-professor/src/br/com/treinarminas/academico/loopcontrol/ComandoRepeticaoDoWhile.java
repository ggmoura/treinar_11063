package br.com.treinarminas.academico.loopcontrol;

public class ComandoRepeticaoDoWhile {

	public static void main(String args[]) {

		int x = 100;

		do {
			String parOuImpar = x % 2 == 0 ? " Par" : " Impar";
			System.out.println("valor de x: " + x + parOuImpar);				
			x++;
		} while (x < 20);
		System.out.println("Fim");
	}
}