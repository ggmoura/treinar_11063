package br.com.treinar.academico.operators;

public class OperatorArithimetic {
	public static void main(String[] args) {
		float a = 10;
		float b = 20;
		float soma = a + b;
		System.out.println("A soma de " + a + " mais " + b + " é " + soma + ".");
		float subt = a - b;
		System.out.println("A subtração de " + a + " menos " + b + " é " + subt);
		float mult = a * b;
		System.out.println("A multiplicação de " + a + " vezes " + b + " é " + mult);
		double div = a / b;
		System.out.println("A divisão de " + a + " dividido por " + b + " é " + div);
		double modl = b % a;
		System.out.println("O resto de " + b + " dividido por " + a + " é " + modl);
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
		// para sinal de menos é o mesmo procedimento
		int num1 = 10;
		int num2 = 11;
		boolean igual = num1 == num2;
		boolean difer = num1 != num2;
		System.out.println("num1 é igual a num2 ? " + igual);
		System.out.println("num1 é diferente de num2 ? " + difer);
		System.out.println(num1 == num2);
		boolean verdade = true;
		System.out.println(!verdade);
		boolean maior = num1 > num2 ;
		System.out.println( num1 + " é maior que " + num2 + " ? " + maior);
		boolean maiorigual = num1 >= num2 ;
		System.out.println(num1 + " é maior ou igual que " + num2 + " ? " + maiorigual);
		boolean menor = num1 < num2 ;
		System.out.println(num1 + " é menor que " + num2 + " ? " + menor);
		boolean menorigual = num1 <= num2 ;
		System.out.println(num1 + " é menor ou igual que " + num2 + " ? " + menorigual);
		
	}
	
}
