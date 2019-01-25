package br.com.treinarminas.academico.classandobject;

public class Mouse {
	String marca;
	String modelo;
	String cor;
	int numBotoes;
	Fabricante fabricante;
	int clkBtnBireito;
	int clkBtnEsquerdo;
	
	// Regra clicarBtnDireito retrorna inteiro 1;
	// Regra clicarBtnEsquedo retrorna inteiro 2;
	// Regra retorna quantidade clcks botao direito 
	// Regra retorna quantidade clcks botao esquerdo c

	public void clicarBtnDireito(){
		clkBtnBireito +=1;
	}
	public void clicarBtnEsquerdo(){
		clkBtnEsquerdo +=1;
	}
	public int retornaQtdclickBtndireito(){
		return clkBtnBireito;
	}
	
	public int retornaQtdclickBtnEsquerdo(){
		return clkBtnEsquerdo;
	}
	
 
}
