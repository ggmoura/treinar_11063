package br.com.treinarminas.datatypes;

public class DataType {
	public static void main(String[] args) {
		// Comentarios curtos
		/* Comentarios extendidos */

		// Variavel deve iniciar letra minuscula e entre junções maiusculo
		// Pode ser usado somente caracter especial '_' nas variaveis, inclusive para
		// formatar valores como long 100_000 (valor representado 100.000)
		byte idadePessoa = 120;
		System.out.println("Idade:" + idadePessoa);
		short quantidadeCadeiras = 32000;
		System.out.println("Cadeiras:" + quantidadeCadeiras);
		int i = 10;
		System.out.println("Inteiro:" + i);
		long l = 10000;
		System.out.println("Long:" + l);
		// Tipos de dados fracionados
		// Tipos conversão do double em float (necessario devido tamnho do float, casas
		// decimais após a virgula)
		float f = (float) 15.1;
		float f1 = 15.1F;
		float f2 = 15.1f;
		System.out.println("Float f" + f + ' ' + "f1" + ' ' +f1 + "f2" + ' ' + f2);
		double d = 15.1;
		System.out.println("Double" + d);
		boolean possuiCNH = true;
		System.out.println("boolean" + possuiCNH);
		char c = 'V';
		System.out.println("Char:" + c);
		//Caracter especial na impressão
		char novaLinha = '\n';
		System.out.println("\\" + novaLinha + "\\");
	}

}
