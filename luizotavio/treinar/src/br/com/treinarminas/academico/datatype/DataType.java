package br.com.treinarminas.academico.datatype;

public class DataType {
	public static void main(String[] args) {
		
		// TIPOS DE DADOS INTEIROS
		
		System.out.println("Exemplo do tipo byte:");
		byte idadePessoa = 120;
		System.out.println("A idade da pessoa é: " + idadePessoa);
		System.out.println("\nExemplo do tipo short:");
		short qtdCadeiras = 32000; 
		System.out.println("A capacidade total do Horto é: " + qtdCadeiras + " cadeiras");
		System.out.println("\nExemplo do tipo inteiro:");
		int i = 10;
		System.out.println("Inteiro: " + i);
		System.out.println("\nExemplo do tipo long:");
		long l = 10000;
		System.out.println("long: " + l);
		
		//TIPOS DE DADOS FRACIONADOS
		
		System.out.println("\nExemplo do tipo float:");
		float _f = (float) 15.1;
		float f1 = 15.1F;
		float f2 = 15.1f; 
		System.out.println("float _f: " + _f + " float f1: " + f1 + " float f2: " + f2);
		System.out.println("\nExemplo do tipo double:");
		double d = 15.12345;
		System.out.println("Double: " + d);
		
		//TIPOS DE DADOS LÓGICO
		
		System.out.println("\nExemplo do tipo boolean:");
		boolean possuiCNH = false;
		System.out.println("Possui CNH: " + possuiCNH);
		
		System.out.println("\nExemplo do tipo char:");
		char c = 'A';
		System.out.println("char: " + c);
		
		
	}

}
