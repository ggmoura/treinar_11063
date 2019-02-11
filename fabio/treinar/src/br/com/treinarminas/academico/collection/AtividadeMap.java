package br.com.treinarminas.academico.collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AtividadeMap {
		public static void main(String[] args) {
			List<String> nomes = Arrays.asList("Fabio",  "João", "Andriana", "Julia", "Jeane", "Camila");
			
			//Exercicio - 	Colocar os nomes na lista em tempo de execucao pedindo o usuario para digitar.
							//Imprimir as primeiras letras dos nomes, a quantidade de letras e o nomes em cadas letra
			
			Map<Character, List<String>> nomesMap = new HashMap<>();
			
			for (String nome : nomes) {
				Character l = nome.charAt(0);
				if (!nomesMap.containsKey(l)) {
					nomesMap.put(l, new ArrayList<>());
				}
				nomesMap.get(l).add(nome);
				
			}
			System.out.println(nomesMap);
		}
}
