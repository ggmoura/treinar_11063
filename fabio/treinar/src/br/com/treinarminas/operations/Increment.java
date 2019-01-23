package br.com.treinarminas.operations;

public class Increment {
	public static void main(String[] args) {
		int idade = 10;
		//formas de incrementar variaveis
		idade = idade +1;
		idade+=1;
		idade++; //posIncremento
		++idade; //PreIncremento
		System.out.println("incrementos: "+idade);
		
		
		int novaIdade = idade;
		System.out.println("Nova idade: "+novaIdade);
		novaIdade=idade++; //nesse caso aqui ele atribui primeiro depois que ele incrementa
		System.out.println("linha 20: "+novaIdade);
		System.out.println("Linha 21: "+idade);
		System.out.println(novaIdade++); //pos incremento
		System.out.println(novaIdade); //sem incremento
		System.out.println(++novaIdade);//preincremento
	} //Este codigo pode ser feito com todos os operadores, nao so com o operador +
	// pode ser com --,
	
	//pode usar idade %=1
	//pode usar idade /=1
	//pode usar idade -=1
	//pode usar idade +=1
	

}
