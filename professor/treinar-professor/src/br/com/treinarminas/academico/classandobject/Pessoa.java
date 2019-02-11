package br.com.treinarminas.academico.classandobject;

public class Pessoa implements Comparable<Pessoa> {

	public String nome;
	public int idade;
	public char sexo;
	public int numeroPassoaDados;
	public int caloriasPerdidas;
	public Endereco endereco;
	public int cpf;

	public Pessoa(String nome, char sexo) {
		this(nome);
		this.sexo = sexo;
	}
	
	public Pessoa(String nome, int cpf, int idade) {
		this(nome);
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public Pessoa(String nome, int cpf) {
		this(nome);
		this.cpf = cpf;
	}

	public Pessoa(String nome) {
		// umra regra cabulosa para validar o nome
		this.nome = nome;
	}

	public Pessoa() {
		super();
	}

	public void caminhar() {
		// numeroPassoaDados = numeroPassoaDados + 1;
		// numeroPassoaDados += 1;
		numeroPassoaDados++;
		if (numeroPassoaDados % 5 == 0) {
			caloriasPerdidas++;
		}
	}

	public void caminhar(int numeroPassos) {
		// numeroPassoaDados = numeroPassoaDados + 1;
		// numeroPassoaDados += 1;
		for (int i = 0; i < numeroPassos; i++) {
			this.caminhar();
		}
	}

	int calcularCaloriasPerdidas() {
		int indexador = idade <= 10 ? 10 : 20;
		int temp = caloriasPerdidas - indexador;
		return temp;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " = " + this.nome + " " + this.idade + " " + this.cpf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cpf;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf != other.cpf)
			return false;
		return true;
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.nome.compareTo(o.nome);
	}

}
