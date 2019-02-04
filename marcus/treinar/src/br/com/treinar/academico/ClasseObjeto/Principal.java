package br.com.treinar.academico.ClasseObjeto;

public class Principal {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();		//
		p.nome = "Maria Sophia";
		p.idade = 6;
		p.sexo = 'F';
		System.out.println("Nome: " + p.nome + "\nIdade: " + p.idade + "\tSexo: " + p.sexo);
		
		Pessoa p1 = p;					// Aponta para o mesmo lugar de memoria da variavel p
		System.out.println(p1.idade);	// a idade vai ser a mesma de p
		
	}
}
