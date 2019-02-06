package br.com.treinarminas.academico.array;

public class Matriz {

	public static void main(String[] args) {
		int[][] matriz = {{0, 1}, {2, 3}, {4, 5}};
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}	
}
