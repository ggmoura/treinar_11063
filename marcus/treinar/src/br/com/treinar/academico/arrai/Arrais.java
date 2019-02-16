package br.com.treinar.academico.arrai;

public class Arrais {

	public static void main(String[] args) {
		int[] numPar = new int[50]; // é criada a array com os espaços para os numeros pares de 0 a 100
		int par = 0; // o primeiro numero é 2
		for (int i = 0; i < numPar.length; i++) {
			numPar[i] = par;
			System.out.print(numPar[i] + "; ");
			par = par + 2;
		}
		System.out.println("Fim.");
	}
	

	
	
	
}
