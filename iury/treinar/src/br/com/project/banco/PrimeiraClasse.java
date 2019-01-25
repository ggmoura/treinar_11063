package br.com.project.banco;

public class PrimeiraClasse {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		p.nome = "Maria Sophia";
		p.idade = 6;
		p.sexo = 'F';
		
		Produto p1 = new Produto();
		
		p1.cproduto = 1;
		p1.descricao = "tv";
		
		System.out.println(p);
		System.out.println(p1);
		
	
	}

}
