package br.com.treinar.controller;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.treinar.model.DiaSemana;

@ApplicationScoped
@ManagedBean(name="treinar")
public class ApplicationController {

	private DiaSemana[] dias;

	public ApplicationController() {
		dias = DiaSemana.values();
	}

	public DiaSemana[] getDias() {
		return dias;
	}

	public void setDias(DiaSemana[] dias) {
		this.dias = dias;
	}

}
