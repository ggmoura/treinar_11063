package br.com.inter.banco;
//Importa��o da telamenu do pacote vis�o
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
