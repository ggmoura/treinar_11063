package br.com.treinarminas.academico.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestReadFile {

	public static void main(String args[]) {
		String fileName = "data.txt";
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.forEach(System.out::println);
			//final String text = stream.findFirst().get();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}