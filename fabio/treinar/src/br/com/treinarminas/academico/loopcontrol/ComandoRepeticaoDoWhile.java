package br.com.treinarminas.academico.loopcontrol;

public class ComandoRepeticaoDoWhile {
	public static void main(String[] args) {
		int x = 10;
		do {//mesmo que a condicao nao seja satisfatoria e executado o bloco pelo menos uma vez.
			String parOuImpar = (x%2 ==0) ? "Par" : "Impar";
			System.out.println("numero: " + x + " � "+parOuImpar);
			System.out.println("numero: " + x + " � "+((x%2 ==0) ? "Par" : "Impar"));
			x++;
		} while (x <= 20);
		System.out.println("Fim");	
	}
}
