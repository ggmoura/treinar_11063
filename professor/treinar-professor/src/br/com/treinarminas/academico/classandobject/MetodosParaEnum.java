package br.com.treinarminas.academico.classandobject;

public class MetodosParaEnum {
	public DiaSemana RetornaDiaSemana(int i) {
		DiaSemana[] dias = DiaSemana.values();		
		return dias[i];		
	}

}
