package br.com.treinarminas.operadores;

public class Operadores {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int soma = a + b;
		System.out.println("\nA soma de " + a + " + " + b + " = " + soma);
		
		int subt = b - a;
		System.out.println("\nA subtração de " + b + " - " + a + " = " + subt);
		
		int mult = a * b;
		System.out.println("\nA multiplicação de " + a + " * " + b + " = " + mult);
		
		float c = (float) 25.1;
		int d = 3;
		float div = c / d;
		System.out.println("\nA divisão de " + c + " / " + d + " = " + div);
		
		int e = 10;
		int f = 3;
		int modulo = e % f;
		System.out.println("\nO Mod de " + e + " % " + f + " = " + modulo);
		
		
		
	}
}
