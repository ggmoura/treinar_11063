package br.com.treinar.academico.decision;

public class ComandoIF {
	public static void main(String[] args) {
		int a = 10; //variaveis a e c tem o mesmo valor
		int b = 20;
		if (a < b) {
			System.out.println("a é menor que b");
			if (b == 20) {
				System.out.println("b é igual a 20");
			} else {
			
				System.out.println("b não é igual a 20");
			} 
		}
		System.out.println("fim do programa.");
	}

}
