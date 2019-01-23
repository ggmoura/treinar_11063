package br.com.treinarminas.academico.loopcontrol;

public class ComandoRepeticaoWhile {

	public static void main(String[] args) {
		int x = 100;
		do {
			String parOuImpar = x % 2 == 0 ? " Par" : " Impar";// if TERNÁRIO
			System.out.println("Valor de X:" + x + parOuImpar);
			x = x + 1;
			// x += 1;
			// x++;
		} while (x < 20);
		System.out.println("Fim");
	}
} // PARA do while A VERIFICAÇÃO É REALIZADA NO FINAL DA ESTRUTURA GARANTINDO QUE
	// AO MENOS UMA VEZ SEJA EXECUTADO O BLOCO
