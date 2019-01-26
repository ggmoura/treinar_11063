package br.com.mbreno.modelo;

public class CPrincipal {
	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.categoria = new Categoria();
		c.conta = new Conta();

		c.nomeCliente = "Márcio";
		c.cpf = 102415;
		c.categoria.nomecat = "vip";
		c.conta.saldo = 200.00;
		c.conta.codConta = 15830;
		c.conta.tipoConta = "Correte";
		c.conta.numAgencia = 2610;
		
		for (int i = 0; i < 6; i++) {
			c.conta.sacar(c.categoria.nomecat);
						
		}
		System.out.println("Numero de saque do cliente: " + c.nomeCliente + " é: " + c.conta.numerosaque + " Valor : " + c.conta.saldo);
		
	}
}
// nodificador de acesso, para mostra as variaveis 
//public - publico 
//private  privado
//protected - 
//deafull - dentro da propria pasta e pacote
