package br.com.treinar.model;

public enum DiaSemana {

	SEGUNDA("Segunda Feira"),
	TERCA("Terça Feira"),
	QUARTA("Quarta Feira"),
	QUINTA("Quinta Feira"),
	SEXTA("Sexta Feira"),
	SABADO("Sabado");
	
	private String descricao;
	
	private DiaSemana(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
