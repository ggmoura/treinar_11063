package br.com.inter.banco.visao;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.inter.banco.controle.BancoControle;
import br.com.inter.banco.modelo.ContaPoupanca;
import br.com.inter.banco.modelo.core.HoraFuncionamenoException;
import br.com.inter.banco.modelo.core.IConstante;
import br.com.inter.banco.modelo.core.SaldoInsuficienteException;

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
			case 8:
				exibirTaxaRendimento();
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
	
	private void exibirTaxaRendimento() {
		StringBuilder sb = new StringBuilder();
		sb.append("A taxa de rendimento atual �: ").append(ContaPoupanca.getTaxaRendimento());
		System.out.println(sb);
	}

	private void creditarLucro() {
		controle.creditar();
	}

	private void tarifarConta() {
//		try {
//			String msg = controle.tarifar().get();
//			System.out.println(msg);
//		} catch (Exception e) {
//		}
//		
		controle.tarifar().thenAccept(resp -> {
			JOptionPane.showMessageDialog(null, resp, "Tarifa��o de contas", 1);
		});
	}

	private void definirTaxaRendimento() {
		System.out.print("Informe a nova taxa de rendimento: ");
		Float taxa = leitor.nextFloat();
		controle.alterarTaxaRendimento(taxa);
		System.out.println(ContaPoupanca.getTaxaRendimento());
	}

	private void sacar() {
		final Integer numeroConta = recuperarNumeroConta();
		System.out.print("Qual o valor voc� quer sacar: ");
		final Double valor = leitor.nextDouble();
		try {
			controle.sacar(numeroConta, valor);
			System.out.println("Saque efetuado com sucesso, novo saldo: " + controle.recuperarSaldo(numeroConta));
		} catch (SaldoInsuficienteException e) {
			System.out.println("Saldo insuficiente! Saldo atual: " + e.getSaldoAtual());
			e.printStackTrace();
		} catch (HoraFuncionamenoException e) {
			System.out.println("Voce nao pode sacar neste horario");
			e.printStackTrace();
		}
	}

	private void depositar() {
		final Integer numeroConta = recuperarNumeroConta();
		System.out.print("Informe o valor a ser depositado: ");
		controle.depositar(numeroConta, leitor.nextDouble());
		System.out.println("Deposito efetuado com sucesso, seu novo saldo �: " + controle.recuperarSaldo(numeroConta));
	}

	private Integer recuperarNumeroConta() {
		System.out.print("N�mero da conta: ");
		final Integer numeroConta = leitor.nextInt();
		return numeroConta;
	}

	private void consultarSaldo() {
		final Integer numeroConta = recuperarNumeroConta();
		System.out.println("Seu saldo atual �: " + controle.recuperarSaldo(numeroConta));
	}

	private void criarConta() {
		System.out.print(imprimirMenuConta());
		Integer tipoConta = leitor.nextInt();
		leitor.nextLine();
		System.out.print("Informe o nome do Cliente: ");
		String nomeCliente = leitor.nextLine();
		System.out.print("Informe o CPF do Cliente: ");
		Long cpf = leitor.nextLong();
		System.out.print("Informe o n�mero da Conta: ");
		Integer numeroConta = leitor.nextInt();
		leitor.nextLine();
		switch (tipoConta) {
		case 1:
			System.out.print("Informe o limite de cr�dito da Conta: ");
			Double limiteCredito = leitor.nextDouble();
			System.out.print("Informe o valor da taxa de manuten��o da Conta: ");
			Double taxaManutencao = leitor.nextDouble();
			controle.criarContaCorrente(nomeCliente, numeroConta, cpf, limiteCredito, taxaManutencao);
			break;
		case 2:
			controle.criarContaPoupanca(nomeCliente, numeroConta, cpf);
			break;
		case 3:
			System.out.print("Informe o dia do dep�sito do sal�rio: ");
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
				+ "2 - Conta Poupan�a\n\t"
				+ "3 - Conta Sal�rio\n\t"
				+ "4 - Conta Investimento\n\t"
				+ "\n==> ";
	}

	private String recuperarMenu() {
		return "Informe:\n\t"
				+ "1 - Criar Conta\n\t"
				+ "2 - Consultar Saldo\n\t"
				+ "3 - Depositar\n\t"
				+ "4 - Sacar\n\t"
				+ "5 - Definir taxa rendimento poupan�a\n\t"
				+ "6 - Tarifar\n\t"
				+ "7 - Creditar\n\t"
				+ "8 - Exibir Taxa de Rendimento\n\t"
				+ "0 - Sair\n\n==> ";
	}
	
}
