package br.com.treinar.academico.Mochila;

public class Mochila {
	String material;
	char tamanho;
	int peso;
	int vidaUtil;
	int uso;

	void desgastar(int uso) {
		if (uso >= 0) {
			vidaUtil -= uso;
		}
	}

	// método que as variaveis devem estar definidas
	int peso() {
		int coefDesg = peso <= 5 ? 1 : 2;
		return vidaUtil = vidaUtil - coefDesg;
	}

}
