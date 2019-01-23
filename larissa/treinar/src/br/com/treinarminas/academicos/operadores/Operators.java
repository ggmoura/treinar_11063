package br.com.treinarminas.academicos.operadores;

public class Operators {
	public static void main(String[] args) {
		int idade = 10; 
		//passoi um ano 
		
		idade = idade + 1;
		idade += 1;
		idade++;
		
		
		
		System.out.println(idade);
		
		int novaIdade = idade;
		
		//System.out.println("Nova Idade: " novaIdade);
		
		novaIdade = idade++;
		
		System.out.println("Linha 20: " + novaIdade);
		System.out.println("Linha 21: " + novaIdade);
		
		System.out.println(novaIdade++);
		System.out.println(novaIdade);
		System.out.println(++novaIdade);
	}

}
