package br.com.treinarminas.academico.classandobject;

public enum DiaSemana {

	SEGUNDA_FEIRA(false),
	TERCA_FEIRA(false),
	QUARTA_FEIRA(false),
	QUINTA_FEIRA(false),
	SEXTA_FEIRA(false),
	SABADO(true),
	DOMINGO(true);
	
	private DiaSemana(Boolean finalDeSemana) {
		this.finalDeSemana = finalDeSemana;
	}
	
	private Boolean finalDeSemana;

	public Boolean getFinalDeSemana() {
		return finalDeSemana;
	}
	
	

}
