package br.com.treinarminas.operadores;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Condicional {
	public static void main(String[] args) {
		int idade = 17;
		Boolean possuiIngresso = true;
		boolean peixe = true;
		//&& testa somente a primeira condi��o
		System.out.println(idade > 18 && possuiIngresso);
		//& testa as duas condi��es mesmo que a primeira seja false
		System.out.println(idade > 18 & possuiIngresso);
		//|| testa somente a primeira consi��o
		System.out.println((idade > 18 && possuiIngresso) || peixe);
		//| testa as duas condi��es
		System.out.println((idade > 18 && possuiIngresso) | peixe);
		
		
	}

}
