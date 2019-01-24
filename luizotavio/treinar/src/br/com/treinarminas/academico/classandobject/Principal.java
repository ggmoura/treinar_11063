package br.com.treinarminas.academico.classandobject;

public class Principal {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.nome = "Maria Sophia";
		p.idade = 6;
		p.sexo = 'F';
		
		
		System.out.println(p.nome);
	}
	
}
