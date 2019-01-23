package br.com.treinarminas.academico.operators;

public class Increment {
	public static void main(String[] args) {
		int idade = 10;
		//passou um ano
		idade = idade + 1;
		idade += 1; 
		idade ++;
		System.out.println("A idade hoje é: " + idade);
		int novaIdade = idade;
		System.out.println("Nova idade: " + novaIdade);
		novaIdade = idade++;
		System.out.println("Linha 41: " + novaIdade);
		System.out.println("Linha 42: " + idade);
		System.out.println(novaIdade++);
		System.out.println(novaIdade);
		System.out.println(++novaIdade);
	}

}
