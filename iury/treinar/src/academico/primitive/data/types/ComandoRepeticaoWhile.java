package academico.primitive.data.types;

public class ComandoRepeticaoWhile {
	public static void main(String[] args) {

		int x = 10;

		while (x < 20) {
			System.out.println("valor de  X : " + x + (x % 2 == 0 ? "Par"  : "Impar"));
			
			//String parOuImpar = x % 2 == 0 ? "Par"  : "Impar";
			//System.out.println("valor de  X : " + x + parOuImpar);
			x++;
		}
		System.out.println("Fim");
	}
}
