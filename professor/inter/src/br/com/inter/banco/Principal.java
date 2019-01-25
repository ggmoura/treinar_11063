package br.com.inter.banco;

import br.com.inter.banco.visao.TelaMenu;

public class Principal {

	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		menu.iniciarMenu();
		System.out.println("Sistema finalizou....");
	}
	
}
