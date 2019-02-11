package br.com.treinarminas.academico.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.treinarminas.academico.classandobject.Pessoa;

public class CollectionJ8 {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa p1 = new Pessoa("Maria Sophia", 10, 4);
		Pessoa p2 = new Pessoa("Davi Lucas", 50, 2);
		Pessoa p3 = new Pessoa("Larissa Soares", 10, 3);
		Pessoa p4 = new Pessoa("Ana Cecilia", 50, 1);
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);

		System.out.println(pessoas);

		pessoas.sort((o1, o2) -> o1.idade - o2.idade);
		
		pessoas.sort(new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				return o1.sexo - o2.sexo;
			}
		});
		
		pessoas.stream().findFirst().orElse(new Pessoa());
		
		System.out.println(pessoas);
		
		final List<Pessoa> pessoasMenoresDeDoisAnos = pessoas.stream().filter(p -> p.idade < 3).collect(Collectors.toList());
		System.out.println(pessoasMenoresDeDoisAnos);
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl", "Maria Sophia");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered);

	}

}
