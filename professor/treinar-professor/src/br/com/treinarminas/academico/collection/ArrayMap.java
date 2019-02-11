package br.com.treinarminas.academico.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayMap {
//DESAFIO MONTAR A ROTINA ONDE USUÁRIO DIGITE OS NOMES ATÉ DIGITAR SAIR
	// IMPRIMIR LETRA, QUANTIDADE E NOMES [LETRA QTD NOMES]
	public static void main(String[] args) {
		List<String> nomes = Arrays.asList("Maria Shopia", "Davi Lucas", "Larissa Soares", "Maria Joaquina", "Maria Célia","André", "Solange Cruz", "Maria Sophia");
		//System.out.println(nomes);
		Map<Character, List<String>> nomesPessoas = new HashMap<>();
		for (String nome : nomes) {
			Character primeiraLetra = nome.charAt(0);
			if (!nomesPessoas.containsKey(primeiraLetra)) {
				nomesPessoas.put(primeiraLetra, new ArrayList<>());
			}
			//System.out.println(charAt);	 
			nomesPessoas.get(primeiraLetra).add(nome);
		}
		System.out.println(nomesPessoas);
	}
}
