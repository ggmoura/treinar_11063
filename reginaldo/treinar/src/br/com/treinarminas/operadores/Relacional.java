package br.com.treinarminas.operadores;

public class Relacional {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println(a == b);
		boolean valoresIguais = a == b;
		System.out.println(valoresIguais);
		
		System.out.println(a != b);
		
		boolean verdade = true;
		System.out.println(!verdade);
		
		int c = 10;
		int d = 20;
		System.out.println(c > d);
		
		int e = 5;
		int f = 0;
	    
		System.out.println(f < e);
		
		int g = 5;
		int h = 5;
		System.out.println(g >= h);

		int i = 7;
		int j = 6;
		System.out.println(i <= j);		

	}

}
