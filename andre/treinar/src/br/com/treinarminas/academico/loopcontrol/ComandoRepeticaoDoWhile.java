package br.com.treinarminas.academico.loopcontrol;

public class ComandoRepeticaoDoWhile {

	public static void main(String[] args) {
		int x = 0;
		while (x < 200) {
			int modl = x % 2;
			String parOuImpar = x % 2 == 0 ? " Par" : " Impar";//if TERNÁRIO
				if (modl == 0) {
					System.out.println("Valor de X: " + x + " este número é" + " PAR");
				} else if (modl != 0) {
					System.out.println("Valor de X: " + x + " este número é" + " IMPAR");
				}
			//System.out.println("Valor de X:" + x);
			x = x + 1;
			// x += 1;
			// x++;
		}
		System.out.println("Fim");
		String parOuImpar = x % 2 == 0 ? " Par" : " Impar";//if TERNÁRIO
	}
}
