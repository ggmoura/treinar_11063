package br.com.inter.banco.visao;

import java.util.Scanner;

import br.com.inter.banco.controle.BancoControle;
import br.com.inter.banco.modelo.ContaPoupanca;
import br.com.inter.banco.modelo.core.IConstante;

//TODO - Criar schedule para cobrar e creditar as contas
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
			case 5:
				definirTaxaRendimento();
				break;
			case 6:
				tarifarConta();
				break;
			case 7:
				creditarLucro();
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
	
	private void creditarLucro() {
		controle.creditar();
	}

	private void tarifarConta() {
		controle.tarifar();
	}

	private void definirTaxaRendimento() {
		System.out.print("Informe a nova taxa de rendimento: ");
		Float taxa = leitor.nextFloat();
		controle.alterarTaxaRendimento(taxa);
		System.out.println(ContaPoupanca.getTaxaRendimento());
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
		System.out.print(imprimirMenuConta());
		Integer tipoConta = leitor.nextInt();
		leitor.nextLine();
		System.out.print("Informe o nome do Cliente: ");
		String nomeCliente = leitor.nextLine();
		System.out.print("Informe o CPF do Cliente: ");
		Long cpf = leitor.nextLong();
		System.out.print("Informe o número da Conta: ");
		Integer numeroConta = leitor.nextInt();
		leitor.nextLine();
		switch (tipoConta) {
		case 1:
			System.out.print("Informe o limite de crédito da Conta: ");
			Double limiteCredito = leitor.nextDouble();
			System.out.print("Informe o valor da taxa de manutenção da Conta: ");
			Double taxaManutencao = leitor.nextDouble();
			controle.criarContaCorrente(nomeCliente, numeroConta, cpf, limiteCredito, taxaManutencao);
			break;
		case 2:
			System.out.print("Informe a taxa de rendimento: ");
			Float taxaRendimento = leitor.nextFloat();
			
			controle.criarContaPoupanca(nomeCliente, numeroConta, cpf, taxaRendimento);
			break;
		case 3:
			System.out.print("Informe o dia do depósito do salário: ");
			Integer diaDepositoSalario = leitor.nextInt();
			controle.criarContaSalario(nomeCliente, numeroConta, cpf, diaDepositoSalario);
			break;
		case 4:
			controle.criarContaInvestimento(nomeCliente, numeroConta, cpf);
			break;

		default:
			break;
		}
		System.out.println(IConstante.Mensagem.CONTA_CRIADA_SUCESSO);
	}

	private String imprimirMenuConta() {
		return "Informe:\n\t"
				+ "1 - Conta Corrente\n\t"
				+ "2 - Conta Poupança\n\t"
				+ "3 - Conta Salário\n\t"
				+ "4 - Conta Investimento\n\t"
				+ "\n==> ";
	}

	private String recuperarMenu() {
		return "Informe:\n\t"
				+ "1 - Criar Conta\n\t"
				+ "2 - Consultar Saldo\n\t"
				+ "3 - Depositar\n\t"
				+ "4 - Sacar\n\t"
				+ "5 - Definir taxa rendimento poupança\n\t"
				+ "6 - Tarifar\n\t"
				+ "7 - Creditar\n\t"
				+ "0 - Sair\n\n==> ";
	}
	
}
