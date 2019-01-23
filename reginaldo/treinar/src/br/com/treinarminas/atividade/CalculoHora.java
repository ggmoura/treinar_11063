package br.com.treinarminas.atividade;

public class CalculoHora {
	public static void main(String[] args) {
		int Valor = 1942;
		int i = 60;
		
		int hora = Valor / i;
		int minuto = Valor % i;
		
		System.out.println(hora + " Horas " + minuto + " minutos" );
		
	}

}



