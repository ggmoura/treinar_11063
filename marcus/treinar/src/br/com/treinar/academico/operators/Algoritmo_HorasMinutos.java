package br.com.treinar.academico.operators;

public class Algoritmo_HorasMinutos {
	// fazer um algoritimo que calcule a quantidade de horas e minutos que um determinado numero representa
	public static void main(String[] args) {
		int num = 1942;
		int hora = num / 60;
		int rhora = num % 60; // corresponde aos minutos que é o resto da divisão das horas por 60
		System.out.println("O numero " + num + " corresponde a " + hora + " horas e " + rhora + " minutos.");
		
	}

}
