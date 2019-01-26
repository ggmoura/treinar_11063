package br.com.mbreno.banco;

public class Pessoa {

	int idade;
	char sexo;
	String nome;
	int numeroPassosDados;
	int caloriasPerdidas;
	Endereco endereco;

	// funcionalidade muda a caracteristica mas não precisa ter um retorno(metodo)
	void caminhar() {
		numeroPassosDados++;
		if (numeroPassosDados % 5 == 2) {
			caloriasPerdidas++;

		}
	}
	//Sobre carga de metados
	void caminhar(int numeroPassos) {
		for (int i = 0; i < numeroPassos; i++) {
			caminhar();
		}

		}

	}

//MVC
// modelo = regra de negocio(coisas importantes do negocio )
// visão = a maneira com o qual interragem com o sistema
// controle = String, int, var, float, 
