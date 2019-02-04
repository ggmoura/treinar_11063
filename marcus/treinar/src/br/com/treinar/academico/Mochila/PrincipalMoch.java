package br.com.treinar.academico.Mochila;

public class PrincipalMoch {
	public static void main(String[] args) {
		Mochila m = new Mochila();
		// Mochila m1 = m;
		m.tamanho = 'p';
		m.material = "Poliéster";
		m.peso = 10;
		m.vidaUtil = 20;
		m.desgastar(6);

		System.out.println("a vida útil atual é de " + m.vidaUtil + " Anos.");
		int c = m.peso();
		System.out.println(c);
		// System.out.println("A mochila m1 é feita de " + m1.material + " ,tamanho " +
		// m1.tamanho + " e peso " + m1.peso);

		// m.tamanho = 'm';
		// m.material = "Algodão";
		// m.peso = 2;

		// System.out.println("A mochila m é feita de " + m.material + " ,tamanho " +
		// m.tamanho + " e peso " + m.peso);

	}
}
