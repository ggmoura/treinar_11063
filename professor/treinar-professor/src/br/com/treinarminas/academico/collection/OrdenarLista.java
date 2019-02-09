package br.com.treinarminas.academico.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.treinarminas.academico.classandobject.Pessoa;

public class OrdenarLista {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa p1 = new Pessoa("Maria Sophia", 1000, 6);
		Pessoa p2 = new Pessoa("Davi Lucas", 200, 9);
		Pessoa p3 = new Pessoa("Larissa Soares", 90, 22);
		Pessoa p4 = new Pessoa("Ana Cecilia", 50, 14);
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		
		List<String> pessoasStr = new ArrayList<>();
		pessoasStr.add("Maria Sophia");
		pessoasStr.add("Davi Lucas");
		pessoasStr.add("Larissa Soares");
		pessoasStr.add("Ana Cecilia");
		
		Collections.sort(pessoas);
		Collections.sort(pessoasStr);
		
		System.out.println(pessoas);
		System.out.println(pessoasStr);
		
		ComparadorPorPessoaCPF comparadorCpf = new ComparadorPorPessoaCPF();
		
		Collections.sort(pessoas, comparadorCpf);
		System.out.println(pessoas);
		
		ComparadorPorPessoaIdade comparadorIdade = new ComparadorPorPessoaIdade();
		Collections.sort(pessoas, comparadorIdade);
		System.out.println(pessoas);
		
		Comparator<Pessoa> comparadorPorCaloria = new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.caloriasPerdidas - o2.caloriasPerdidas;
			}
		};
		Collections.sort(pessoas, comparadorPorCaloria);
		
		Collections.sort(pessoas, new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.sexo - o2.sexo;
			}
		});
		

	}
	
}
