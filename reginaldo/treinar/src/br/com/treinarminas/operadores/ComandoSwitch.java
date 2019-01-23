package br.com.treinarminas.operadores;

public class ComandoSwitch {
	public static void main(String[] args) {
		int numero = 1;
		switch (numero) {
		case 1:
			System.out.println("Um");
			break;			
		case 2:
			System.out.println("Dois");			
			break;			
		case 3:
			System.out.println("Três");	
			break;		
		default:
			System.out.println("Inválido");
			break;
		}
	}

}
