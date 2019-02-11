package br.com.treinarminas.academico.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import br.com.treinarminas.academico.classandobject.Pessoa;

public class TesteMap {

	public static void main(String[] args) {
		Map<Character, List<Pessoa>> pessoasMap = new HashMap<>();
		
		Pessoa p1 = new Pessoa("Maria Sophia", 10, 4);
		Pessoa p2 = new Pessoa("Davi Lucas", 50, 2);
		Pessoa p3 = new Pessoa("Larissa Soares", 10, 3);
		Pessoa p4 = new Pessoa("Ana Cecilia", 50, 1);
		
		pessoasMap.put('F', new ArrayList<>());
		pessoasMap.put('M', new ArrayList<>());
		
		pessoasMap.get('F').add(p1);
		pessoasMap.get('F').add(p3);
		pessoasMap.get('F').add(p4);
		pessoasMap.get('M').add(p2);
		
		System.out.println(pessoasMap);
		
		for (Character sexo : pessoasMap.keySet()) {
			System.out.println(sexo + " " + pessoasMap.get(sexo).size());
		}
		for (Entry<Character, List<Pessoa>> entrySet : pessoasMap.entrySet()) {
			System.out.println(entrySet.getKey() + " = " + entrySet.getValue().size());
		}
		
		System.out.println("Gleidson".charAt(0));
		
	}

}
