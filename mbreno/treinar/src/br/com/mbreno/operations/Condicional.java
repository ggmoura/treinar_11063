package br.com.mbreno.operations;

public class Condicional {
	public static void main(String[] args) {
		int idade = 17;
		boolean possuiIngresso = true;
		boolean peixe = true;
		// && nesse caso somente a primeira premissa ja
		// condena a expressao
		System.out.println((idade > 18 && possuiIngresso) || peixe);
		// & nesse caso a segunda condicao sera executada tambem
		System.out.println(idade > 18 & possuiIngresso);
	}
}
