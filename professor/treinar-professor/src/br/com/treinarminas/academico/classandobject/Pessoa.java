package br.com.treinarminas.academico.classandobject;

public class Pessoa {

	String nome;	
	int idade;
	char sexo;
	int numeroPassoaDados;
	int caloriasPerdidas;
	Endereco endereco;
	
	void caminhar() {
//		numeroPassoaDados = numeroPassoaDados + 1;
//		numeroPassoaDados += 1;
		numeroPassoaDados++;
		if (numeroPassoaDados % 5 == 0) {
			caloriasPerdidas++;			
		}
	}
	
	void caminhar(int numeroPassos) {
//		numeroPassoaDados = numeroPassoaDados + 1;
//		numeroPassoaDados += 1;
		for (int i = 0; i < numeroPassos; i++) {
			caminhar();
		}
	}
	
	int calcularCaloriasPerdidas() {
		int indexador = idade <= 10 ? 10 : 20;
		int temp = caloriasPerdidas - indexador;
		return temp;
	}
	
	
	
}
