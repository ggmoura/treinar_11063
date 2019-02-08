package br.com.treinarminas.academico.classandobject;

public enum DiaSemana {

	SEGUNDA_FEIRA(false, "Segunda Feira") {
		public Boolean ehDiaDeFarra() {
			return calcularDiaDeFarra(this);
		}
	},
	TERCA_FEIRA(false, "Terça Feira") {
		public Boolean ehDiaDeFarra() {
			return calcularDiaDeFarra(this);
		}
	},
	QUARTA_FEIRA(false, "Quarta Feira") {
		public Boolean ehDiaDeFarra() {
			return calcularDiaDeFarra(this);
		}
	},
	QUINTA_FEIRA(false, "Quinta Feira") {
		public Boolean ehDiaDeFarra() {
			return calcularDiaDeFarra(this);
		}
	},
	SEXTA_FEIRA(false, "Sexta Feira") {
		public Boolean ehDiaDeFarra() {
			return calcularDiaDeFarra(this);
		}
	},
	SABADO(true, "Sábado") {
		public Boolean ehDiaDeFarra() {
			return calcularDiaDeFarra(this);
		}
	},
	DOMINGO(true, "Domingo") {
		public Boolean ehDiaDeFarra() {
			return calcularDiaDeFarra(this);
		}
	};

	private static boolean calcularDiaDeFarra(DiaSemana dia) {
		return dia.toString().indexOf("_") < 0;
	}
	
	private DiaSemana(Boolean finalDeSemana, String descricao) {
		this.finalDeSemana = finalDeSemana;
		this.descricao = descricao;
	}

	public abstract Boolean ehDiaDeFarra();
	private Boolean finalDeSemana;
	private String descricao;

	public Boolean getFinalDeSemana() {
		return finalDeSemana;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
