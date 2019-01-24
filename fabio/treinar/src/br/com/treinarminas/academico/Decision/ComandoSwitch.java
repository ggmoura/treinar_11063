package br.com.treinarminas.academico.Decision;

public class ComandoSwitch {
	public static void main(String[] args) {
		int numero = 5;
		switch (numero) {
		case 1:
			System.out.println("Um");
			break;// Se nao tiver o break o compilador vai procurar um break se nao achar ele
					// executa tudo
					// serve para ser usado em um atualizador de banco de dados
		case 2:
			System.out.println("dois");
			break;
		case 3:
			System.out.println("três");
			break;//

		default:
			System.out.println("Numero invalido");
			break;
		}
	}

}
