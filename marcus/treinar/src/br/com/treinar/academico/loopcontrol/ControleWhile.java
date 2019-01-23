package br.com.treinar.academico.loopcontrol;

public class ControleWhile {
	public static void main(String[] args) {
		int x = 10;

		 while (x <= 20) {
			String parOuImpar = x % 2 == 0 ? " par" : " impar"; // if ternario verdadeiro primeira condicao falso
																// segunda
			System.out.println("Valor de x: " + x + parOuImpar);
			x = x + 1;
			// x++
			// x+=1
			// ++x
		}
		System.out.println("Fim.");
	}

}
