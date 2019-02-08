package br.com.treinarminas.academico.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.treinarminas.academico.classandobject.Pessoa;

public class AtividadeCollection {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa p1 = new Pessoa("Maria Sophia", 10);
		Pessoa p2 = new Pessoa("Davi Lucas", 50);
		Pessoa p3 = new Pessoa("Larissa Soares", 10);
		Pessoa p4 = new Pessoa("Ana Cecilia", 50);
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p1);
		//pessoas.add("Juan Pablo");//rola naum {Generics salvador}
		imprimir(pessoas);
		
		System.out.println("\n\nDaqui para baixo eh set\n\n");
		Set<Pessoa> pessoasSet = new HashSet<>();
		pessoasSet.add(p1);
		pessoasSet.add(p2);
		pessoasSet.add(p3);
		pessoasSet.add(p4);
		pessoasSet.add(p1);
		imprimir(pessoasSet);
	}

	private static void imprimir(Collection<Pessoa> pessoas) {
		for (Pessoa p : pessoas) {
			System.out.println(p.nome);
		}
	}

}
