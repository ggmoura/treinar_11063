package br.com.treinarminas.operadores;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Condicional {
	public static void main(String[] args) {
		int idade = 17;
		Boolean possuiIngresso = true;
		boolean peixe = true;
		//&& testa somente a primeira condição
		System.out.println(idade > 18 && possuiIngresso);
		//& testa as duas condições mesmo que a primeira seja false
		System.out.println(idade > 18 & possuiIngresso);
		//|| testa somente a primeira consição
		System.out.println((idade > 18 && possuiIngresso) || peixe);
		//| testa as duas condições
		System.out.println((idade > 18 && possuiIngresso) | peixe);
		
		
	}

}
