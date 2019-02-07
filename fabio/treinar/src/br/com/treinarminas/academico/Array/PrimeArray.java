package br.com.treinarminas.academico.Array;

public class PrimeArray {
	
	public static void main(String[] args) {
		int[] numerosPar = {0,2,4,6,8,10,12};
		for (int i=0;i<numerosPar.length;i++) {
			System.out.println("Numero:"+numerosPar[i]);
		}
	
		//matriz
		int [][] matriz = {{1,2},{3,4},{5,6}};
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] > 0 && matriz[i][j] % 2 ==0 ) {
					System.out.println("\n");
				}
				System.out.print(matriz[i][j]);
			}
		}
		
		
	}

}
