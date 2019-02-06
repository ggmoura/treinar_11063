package br.com.treinarminas.academico.array;

public class EstudoArray {

	public static void main(String[] args) {
		int[] numerosPar = {0, 2, 4, 6, 8, 10, 12};
		System.out.println(numerosPar.length);
		for (int i = 0; i < numerosPar.length; i++) {
			System.out.println(numerosPar[i]);
		}
		numerosPar = dobrarCapacidadeArray(numerosPar);
		System.out.println(numerosPar.length);
//		Scanner leitor = new Scanner(System.in);
//		System.out.print("Informe o 1 nome: ");
		String[] nomes = new String[10];
		System.out.println("Tamanho do array: " + nomes.length);
		nomes[9] = "Gleidson";
		nomes[0] = nomes[9];
		nomes[9] = null;
		System.out.println(nomes[9]);
//		String nome = leitor.nextLine();
//		System.out.println(nome);

		int[] numeros = new int[50];
		int par = 0;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = par;
			par += 2;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]+";");
			if (i > 0 && i % 10 == 0) {
				System.out.println();
			}
		}
		
//		
//		leitor.close();
	}
	
	
	
	
	
	
	
	public static int[] dobrarCapacidadeArray(int[] old) {
		int[] newArray = new int[old.length * 2];
		for (int i = 0; i < old.length; i++) {
			newArray[i] = old[i];
		}
		return newArray;
	}
	
	
	
	
	
	
}
