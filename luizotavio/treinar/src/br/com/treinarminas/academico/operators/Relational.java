package br.com.treinarminas.academico.operators;

public class Relational {
	public static void main(String[] args) {
	// == (igual a)  ! = (não igual a)
		int a = 10;
		int b = 10;
		System.out.println(a == b);
		boolean ValoresIguais = a ==b;
		System.out.println(ValoresIguais);
		System.out.println(a != b);
		boolean verdade = true;
		System.out.println(verdade);
	// > (maior que) <(menor que) > = (maior que ou igual a) <= (menor ou igual a)
		int x = 10;
		int y = 20;
		System.out.println(x < y);
		System.out.println(x > y);
		System.out.println(x >= y);
		System.out.println(x <= y);
		
	}
}
