package br.com.treinarminas.academico.loopcontrol;

public class ComandoRepeticaoWhile {

	public static void main(String args[]) {

		int x = 10;

		while (x < 20) {
			String parOuImpar = x % 2 == 0 ? " Par" : " Impar";
			System.out.println("valor de x: " + x + parOuImpar);				
			//x = x + 1;
			//x += 1;
			x++;
		}
		System.out.println("Fim");
	}
}