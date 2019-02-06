package br.com.treinarminas.academico.datatypes;

//import br.com.treinarminas.academico.classandobject.Pessoa;

public class DataType {

	public static void main(String[] args) {
		
		//Pessoa xpto = new Pessoa();
		
		//xpto.caloriasPerdidas = 100;
		
		// tipos de dados inteiros
		byte idadePessoa = 120;
		System.out.println("Idade da pessoa: " + idadePessoa);
		short quantidadeCadeiras = 32000;
		System.out.println("Cadeiras: " + quantidadeCadeiras);
		int i = 10;
		System.out.println("Inteiro: " + i);
		long l = 100_000;
		System.out.println("Long: " + l);
		// tipos de dados fracionados
		float f = (float) 15.1;
		float f1 = 15.1F;
		float f2 = 15.1f;
		System.out.println("Floar f " + f + " f1: " + f1 + " f2: " + f2);
		double d = 15.1;
		System.out.println("Double d: " + d);

		// tipo de dado logico
		boolean possuiCNH = false;
		System.out.println("Possui CNH: " + possuiCNH);
		
		//char c = 'A';
		char novaLinha = '\n';
		
		System.out.println("Char c:" + novaLinha);
		
		System.out.println("linha 1\n\tlinha2\\");

	}

}
