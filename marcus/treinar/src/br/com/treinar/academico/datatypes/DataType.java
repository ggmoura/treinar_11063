package br.com.treinar.academico.datatypes;

public class DataType {
	public static void main(String[] args) {
		byte idadePessoa = 120; // byte é numero inteiro (nome de variavel tem a 1a letra minuscula)
		System.out.println("Idade da Pessoa " + idadePessoa);
		short numCadeiras = 18000;
		System.out.println("Cadeiras: " + numCadeiras);
		int numGrande = 123456780;
		System.out.println("O numero inteiro é " + numGrande);
		long l = 1234567811;
		System.out.println("O numero longo é " + l);
		float f = (float) 12.56;
		System.out.println("numero com casa decimal ate 32bit: " + f);
		// por padrao o numero fracionado é double
		double d = 2.121;
		System.out.println("numero double: " + d);
		float _f1 = 15.1F;// idem de fazer um numero como float
		float f2 = 15.1f; // idem de fazer um numero como float
		System.out.println("numero float: " + d);
		System.out.println("float f: " + f + " _f1 " + _f1 + " f2: " + f2);
		/*
		 * comentario longo blabalbalbalablablababl
		 */
		boolean possuiCNH = false;
		System.out.println("Possui CNH: " + possuiCNH);
		char c1 = 'A'; // forma padrao de inserção
		char c2 = 66; // pela tabela
		System.out.println("c1 = " + c1 + " c2 = " + c2);
	}

}
