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
			case 3:
				depositar();
				break;
			case 4:
				sacar();
				break;

			default:
				System.out.println("Opção inválida!");
				break;
			}
			System.out.print(recuperarMenu());
			opcao = leitor.nextInt();
		}
		leitor.close();
	}
	
	private void sacar() {
		System.out.print("Qual o valor você quer sacar: ");
		controle.sacar(leitor.nextDouble());
		System.out.println("Saque efetuado com sucesso, novo saldo: " + controle.recuperarSaldo());
	}

	private void depositar() {
		System.out.print("Informe o valor a ser depositado: ");
		controle.depositar(leitor.nextDouble());
		System.out.println("Deposito efetuado com sucesso, seu novo saldo é: " + controle.recuperarSaldo());
	}

	private void consultarSaldo() {
		System.out.println("Seu saldo atual é: " + controle.recuperarSaldo());
	}

	private void criarConta() {
		System.out.print("Informe o nome do Cliente: ");
		String nomeCliente = leitor.nextLine();
		System.out.print("Informe o CPF do Cliente: ");
		Long cpf = leitor.nextLong();
		System.out.print("Informe o número da Conta: ");
		Integer numeroConta = leitor.nextInt();
		controle.criarConta(nomeCliente, numeroConta, cpf);
		System.out.println("\nConta criada com sucesso!\n");
	}

	private String recuperarMenu() {
		return "Informe:\n\t"
				+ "1 - Criar Conta\n\t"
				+ "2 - Consultar Saldo\n\t"
				+ "3 - Depositar\n\t"
				+ "4 - Sacar\n\t"
				+ "0 - Sair\n\n==> ";
	}
	
}
