package br.com.treinar.academico.operators;

public class OperatorArithimetic {
	public static void main(String[] args) {
		float a = 10;
		float b = 20;
		float soma = a + b;
		System.out.println("A soma de " + a + " mais " + b + " � " + soma + ".");
		float subt = a - b;
		System.out.println("A subtra��o de " + a + " menos " + b + " � " + subt);
		float mult = a * b;
		System.out.println("A multiplica��o de " + a + " vezes " + b + " � " + mult);
		double div = a / b;
		System.out.println("A divis�o de " + a + " dividido por " + b + " � " + div);
		double modl = b % a;
		System.out.println("O resto de " + b + " dividido por " + a + " � " + modl);
		int idade = 10;
		int novaIdade = idade;
		idade = idade + 1; //primeira maneira de incrementar 1
		idade += 1;   // segunda maneira
		idade++;     // terceira  maneira
		novaIdade = idade++;
		System.out.println("linha 23: " + novaIdade);
		System.out.println("linha 24: " + novaIdade++); //pos incremento
		System.out.println("linha 25: " + ++novaIdade); // pre incremento
		System.out.println("linha 26: " + idade);
		// para sinal de menos � o mesmo procedimento
		int num1 = 10;
		int num2 = 11;
		boolean igual = num1 == num2;
		boolean difer = num1 != num2;
		System.out.println("num1 � igual a num2 ? " + igual);
		System.out.println("num1 � diferente de num2 ? " + difer);
		System.out.println(num1 == num2);
		boolean verdade = true;
		System.out.println(!verdade);
		boolean maior = num1 > num2 ;
		System.out.println( num1 + " � maior que " + num2 + " ? " + maior);
		boolean maiorigual = num1 >= num2 ;
		System.out.println(num1 + " � maior ou igual que " + num2 + " ? " + maiorigual);
		boolean menor = num1 < num2 ;
		System.out.println(num1 + " � menor que " + num2 + " ? " + menor);
		boolean menorigual = num1 <= num2 ;
		System.out.println(num1 + " � menor ou igual que " + num2 + " ? " + menorigual);
		
	}
	
}
