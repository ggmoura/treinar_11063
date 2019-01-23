package br.com.treinarminas.academico.datatypes;

//ctrl+m  = deixa a janela selecionada em evidencia

//ctrl+f  = arruma o trecho de codigo

//ctrl+i  = identa o trecho de codigo

public class DataType {
	public static void main(String[] args) {
		byte idadePessoa = 120;
		System.out.println("Idade Pessoa:" + idadePessoa);
		short quantidadeCadeira = 32000;
		System.out.println("Cadeiras :" + quantidadeCadeira);
		int i = 10;
		System.out.println("Inteiro :" + i);
		int l = 10000;
		System.out.println("long :" + l);
		// Tipos fracionados
		// jeito errado: float f = 15.1;//Depois da casa decimal pode ser muito
		// grande, entao é necessario
		// fazer um cast
		float f = (float) 15.1; // colocar essa forma para receber variavel, se
								// necessario

		// Tipos de cast:
		float f1 = (float) 15.1;
		float f2 = 15.1F;// HardCode
		float f3 = 15.1f;
		System.out.println("Float f:" + f + "F1:" + f1 + "F2:" + f2 + "F3:" + f3);

		//double d = 15.1; // No caso do double nao precisa de um cast pq nesse
							// caso o numero ja e grande na memoria.
		boolean possuiCNH = false;
		System.out.println(possuiCNH);
		char c = 'A';
		System.out.println("char: "+c);
		//Caracteres de linhas

		
		
		System.out.println("linha 1\n \t linha2\\"+c);
		
		

	}
}
