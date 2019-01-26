package br.com.mbreno.banco;

public class Principal {
	public static void main(String[] args) {
		Pessoa p = new Pessoa ();
		
		p.nome = "Mária Sofia";
		p.idade = 6;
		p.sexo = 'F';
		
		System.out.println(p.nome);
		
		Pessoa p1 = p;
		
		System.out.println(p1.nome);
		p.nome ="Larissa";
		System.out.println(p1.nome);
		p = null;
		System.out.println(p1.sexo);
		p = new Pessoa();
	}
}
