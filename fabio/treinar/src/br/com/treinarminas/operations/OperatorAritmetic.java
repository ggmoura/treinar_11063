package br.com.treinarminas.operations;

public class OperatorAritmetic {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int soma = a+b;
		System.out.println("a soma de "+a+"+"+b+"="+soma);
		
		int c = 10;
		int d = 20;
		int subtracao = d-c;
		System.out.println("a subtracao de "+d+"-"+c+"="+subtracao);
		
		int e = 10;
		int f = 20;
		int mult = e*f;
		System.out.println("a multiplicacao de "+e+"*"+f+"="+mult);
		
		int g = 10;
		int h = 20;
		int div = h/g;
		System.out.println("a divisao de "+d+"-"+c+"="+div);
		//Quando divide um numero inteiro por inteir sempre vem inteiro
		
		int i = 10;
		int j = 20;
		int modulo = h%g;  // esse modulo é um é o resto da divisao entre numeros inteiros
		System.out.println("a divisao de "+i+"mod"+j+"="+modulo);
	}
}
