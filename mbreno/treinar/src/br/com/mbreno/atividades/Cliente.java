package br.com.mbreno.atividades;

public class Cliente {
	private String nome;
	private int numero;
	//metodo construtor padr�o do inicializa��o da classe
	public Cliente() {
		
	}

	// Para fazer automatico tecla de atalho (alt + Shift + s + r)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		// this � para referenciar o nome dessa class
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
