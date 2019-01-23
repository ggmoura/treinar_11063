package br.com.treinarminas.academicos.operadores;

public class ComandoIF {
public static void main(String[] args) {
	int a = 10;
	int b = 20;
	if(a < b) {
		
		System.out.println("a eh mernor que b");
		if (b == 21) {
			System.out.println("b eh igual a 20");
			
			System.out.println("aprova");
			
		}else {
			if (b == a) {
				
				System.out.println(" a eh a primeira letra!");
			}
			System.out.println("b não eh igual a 21");
		}
		
	}
	System.out.println("Fim do meu programa!");
	

}
}

