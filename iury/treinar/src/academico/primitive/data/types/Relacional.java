package academico.primitive.data.types;

public class Relacional {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println(a == b);
		
		boolean valoresIguais = a == b;
		
		System.out.println(valoresIguais);
		System.out.println(a != b);// diferencial 
		boolean verdade =  true;
		System.out.println(!verdade);
		
		boolean valorMaior = a > b ;
		System.out.println(valorMaior);
		boolean valorMenor = a < b ;
		System.out.println(valorMenor);
		boolean valorMaiorIgual = a >= b ;
		System.out.println(valorMaiorIgual);
		boolean valorMenorIgual = a <= b ;
		System.out.println(valorMenorIgual);
	}
	
}
