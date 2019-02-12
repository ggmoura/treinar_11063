package br.com.inter.banco.modelo.core;

public class HoraFuncionamenoException extends Exception {

	private static final long serialVersionUID = 1L;

	private String horario;

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

}
