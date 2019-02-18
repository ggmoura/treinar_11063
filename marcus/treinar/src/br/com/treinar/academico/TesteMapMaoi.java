package br.com.treinar.academico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteMapMaoi {
	public static void main(String[] args) {

		List<String> estringue = Arrays.asList("Maria Sophia", "lalalala", "mah oee", "aiai hihi", "roque!", "vai pra la",
				"quem é q eu vo chamá");
		// System.out.println(strings);
		Map<Character, List<String>> nomesPessoa = new HashMap<>();

		for (String nome : estringue) {
			Character primeiraLetra = nome.charAt(0);
			// System.out.println(primeiraLetra);
			if (nomesPessoa.containsKey(primeiraLetra)) {
				nomesPessoa.put(primeiraLetra, new ArrayList<>());
			}
			nomesPessoa.get(primeiraLetra).add(nome);
		}
		System.out.println(nomesPessoa);
	}
}
