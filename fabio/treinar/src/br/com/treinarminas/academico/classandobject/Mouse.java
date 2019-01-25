package br.com.treinarminas.academico.classandobject;

public class Mouse {
	private String marca;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	private String modelo;
	private String cor;
	private int numBotoes;
	private Fabricante fabricante;
	private int clkBtnBireito;
	private int clkBtnEsquerdo;
	
	// Regra clicarBtnDireito retrorna inteiro 1;
	// Regra clicarBtnEsquedo retrorna inteiro 2;
	// Regra retorna quantidade clcks botao direito 
	// Regra retorna quantidade clcks botao esquerdo c
	
	public Mouse() {
		super();
	}
	
	public Mouse(int numBotoes) {
		this.numBotoes = numBotoes;
	}
	
	public Mouse(int numBotoes, String modelo) {
		this(numBotoes);
		this.modelo = modelo;
	}
	
	

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getNumBotoes() {
		return numBotoes;
	}
	public void setNumBotoes(int numBotoes) {
		this.numBotoes = numBotoes;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public int getClkBtnBireito() {
		return clkBtnBireito;
	}
	public void setClkBtnBireito(int clkBtnBireito) {
		this.clkBtnBireito = clkBtnBireito;
	}
	public int getClkBtnEsquerdo() {
		return clkBtnEsquerdo;
	}
	public void setClkBtnEsquerdo(int clkBtnEsquerdo) {
		this.clkBtnEsquerdo = clkBtnEsquerdo;
	}
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
