package br.com.treinar.model;

public enum TipoTelefone {

	PARTICULAR("Particular"),
	COMERCIAL("Comercial");
	
	private String descricao;
	
	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
