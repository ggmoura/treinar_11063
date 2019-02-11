package br.com.treinarminas.academico.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.treinarminas.academico.classandobject.Pessoa;

public class AtividadeMap {

	public static void main(String[] args) {
		List<String > nomes = Arrays.asList("Maria Sophia","Manuela","Ricardo","Vanessa");
//		System.out.println(nomes);
						
		Map<Character, List<String>> pessoasMap = new HashMap<>();
		for (String nome : nomes) {
			char primeiraLetra = nome.charAt(0);
			if (!pessoasMap.containsKey(primeiraLetra)) {
				pessoasMap.put(primeiraLetra, new ArrayList<>());
			}
			pessoasMap.get(primeiraLetra).add(nome);
		}
		
		System.out.println(pessoasMap);
		
//Usuario informar nomes (separar pela primeira letra - imprimir letra / quantidade de nomes / nomes) enquanto nao escrever  (sair - camecase = charcase)		
	}
	
	
	
}
