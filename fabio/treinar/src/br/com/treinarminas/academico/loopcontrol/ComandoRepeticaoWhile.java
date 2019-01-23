package br.com.treinarminas.academico.loopcontrol;

public class ComandoRepeticaoWhile {
	public static void main(String[] args) {
		int x = 10;
		while (x <= 20) {
			System.out.println("Value of x: " + x);
			if ((x % 2) == 0) {  //if comum 
				System.out.println("numero: " + x + " é par");
			} else {
				System.out.println("numero: " + x + " é ímpar");
			}
			// Comando if Ternario
			
			String parOuImpar = (x%2 ==0) ? "Par" : "Impar";
			System.out.println("numero: " + x + " é "+parOuImpar);
			System.out.println("numero: " + x + " é "+((x%2 ==0) ? "Par" : "Impar"));
			x++;
		}
		System.out.println("Fim");
	}
}
