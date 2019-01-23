package academico.primitive.data.types;

public class Increment {
	public static void main(String[] args) {
		int idade = 10;
		//passou um ano
		idade = idade +1;
		idade += 1;
		idade++;
		
		System.out.println(idade);
		
		int novaIdade = idade;
		
		System.out.println("Nova Idade : " + novaIdade);
		
		novaIdade = idade++;
		

		System.out.println("Linha 20 : " + novaIdade);
		System.out.println("Linha 21 : " + idade);
		
		System.out.println(novaIdade++);
		System.out.println(novaIdade);
		System.out.println(++novaIdade);//quando tem pre incremento. 
	}

}
