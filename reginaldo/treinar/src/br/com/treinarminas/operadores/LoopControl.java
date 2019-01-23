package br.com.treinarminas.operadores;

public class LoopControl {
	public static void main(String[] args) {
		int x = 10;
		String tracejado = "----------------------------------------------------------------";
		
		while (x < 20) {
			//Resulta do mode = 0 significa numero par. Caso resultado for 1 então impar
			//Mode ex: 5/2 = 2 resta 1 - ex 0/2 = 0 resta 0
			if (x % 2 == 0) {
				System.out.println(x + " - " + "Par");
			} else
				System.out.println(x + " - " +"Impar");
			x++;
		}
		System.out.println(tracejado);
		
		//Fazendo com if ternario
		x = 10;
		while (x < 20) {
			String parOuImpar = x % 2 == 0 ? " - Par" : " - Impar";
			System.out.println("valor de x: " + x + parOuImpar);
			x++;
		}
		System.out.println(tracejado);
		
		//Fazendo repeat 	
		x = 99;
		do {
			String parOuImpar = x % 2 == 0 ? " - Par" : " - Impar";
			System.out.println("valor de x: " + x + parOuImpar);
			x++;
		} while (x < 20);		
		System.out.println("Fim WHILE");
		
		System.out.println(tracejado);
		
		System.out.println("Inicio FOR");
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			
		}
		
		for (int i = 1; i < 11; i++) {
			System.out.println("Reginaldo - " + i);
		}
			
	}

}
