package br.com.inter.banco.visao;

import java.util.Scanner;

import br.com.inter.banco.controle.BancoControle;

public class TelaMenu {

	private BancoControle controle;
	private Scanner leitor;
	
	public TelaMenu() {
		controle = new BancoControle();
		leitor = new Scanner(System.in);
	}
	
	public void iniciarMenu() {
		System.out.print(recuperarMenu());
		Integer opcao = leitor.nextInt();
		leitor.nextLine();
		while (opcao != 0) {
			switch (opcao) {
			case 1:
				criarConta();
				break;
			case 2:
				consultarSaldo();
				break;

			default:
				System.out.println("Op��o inv�lida!");
				break;
			}
			System.out.print(recuperarMenu());
			opcao = leitor.nextInt();
		}
		leitor.close();
	}
	
	private void consultarSaldo() {
		System.out.println("Seu saldo atual �: " + controle.recuperarSaldo());
	}

	private void criarConta() {
		System.out.print("Informe o nome do Cliente: ");
		String nomeCliente = leitor.nextLine();
		System.out.print("Informe o CPF do Cliente: ");
		Long cpf = leitor.nextLong();
		System.out.print("Informe o n�mero da Conta: ");
		Integer numeroConta = leitor.nextInt();
		controle.criarConta(nomeCliente, numeroConta, cpf);
		System.out.println("\nConta criada com sucesso!\n");
	}

	private String recuperarMenu() {
		return "Informe:\n\t"
				+ "1 - Criar Conta\n\t"
				+ "2 - Consultar Saldo\n\t"
				+ "0 - Sair\n\n==> ";
	}
	
}
