package br.com.treinarminas.academico.collection;

import java.util.Comparator;

import br.com.treinarminas.academico.classandobject.Pessoa;

public class ComparadorPorPessoaIdade implements Comparator<Pessoa>{

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		return o1.idade - o2.idade;
	}

}
