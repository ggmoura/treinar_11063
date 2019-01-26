package br.com.inter.banco;
//Importação da telamenu do pacote visão
import br.com.inter.banco.visao.TelaMenu;

public class Principal {

	public static void main(String[] args) {
		//Abrindo a estancia da tela menu
		TelaMenu menu = new TelaMenu();
		//iniciando o menu
		menu.iniciarMenu();
		System.out.println("Sistema finalizou....");
	}
	
}
