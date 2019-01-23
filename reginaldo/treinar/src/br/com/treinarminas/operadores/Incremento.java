package br.com.treinarminas.operadores;

public class Incremento {
	public static void main(String[] args) {
		int idade = 10;
		// Passou um ano
		// Formas de incremento
		idade = idade + 1;
		idade += 1;
		idade++;

		System.out.println(idade);

		int novaIdade = idade;

		System.out.println("Nova Idade = " + novaIdade);
		// Java atribui a variavel o valor de idade depois incrementa em diade
		novaIdade = idade++;
		System.out.println("Linha 20: " + novaIdade);
		System.out.println("Linha 21: " + idade);
		// Pos incremento nesse caso imrime a variavel depois incrementa
		System.out.println(novaIdade++);
		System.out.println(novaIdade);
		// Pre incremento nesse caso imprime a variavel com o incremento
		System.out.println(++novaIdade);
	}

}
