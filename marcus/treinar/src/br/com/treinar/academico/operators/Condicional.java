package br.com.treinar.academico.operators;

public class Condicional {
	public static void main(String[] args) {
		int idade = 17;
		boolean temIngresso = true;
		boolean peixe = true;
		System.out.println(idade >= 18 && temIngresso); //possui ingresso e � maior de 18
		System.out.println(idade >= 18 && temIngresso || peixe); //possui ingresso e � maior de 18 ou � peixe de alguem da boate
	}

}
