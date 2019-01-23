package br.com.treinarminas.academico.Decision;

public class ComandoIf {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if (a < b){
			System.out.println("A eh menor que b");
			if (b == 21){
				System.out.println("b eh igual 21");				
			} else	{
				if (b == a){
					System.out.println("a eh igual letra!");				
				}
			}
			System.out.println("Fim do programa!");
		}
	}
}
