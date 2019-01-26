package br.com.mbreno.atividades;

public class CPricipal {
	public static void main(String[] args) {

		Carro c = new Carro();

		c.nome = "honda";
		c.ano = 2012;
		c.modelo = "Ret";

		System.out.println("Carro: " + c.nome);
		c = null;
		
		Carro c1 = new Carro ();
		
		c1.nome = "Ford";
		
		System.out.println(c1.nome);
		
	}
}
