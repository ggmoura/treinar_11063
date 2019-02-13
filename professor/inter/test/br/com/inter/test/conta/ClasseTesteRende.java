package br.com.inter.test.conta;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ClasseTesteRende {
	public static void main(String[] args)throws Exception{
		String fileName = "taxa_rendimento_01.txt";
		try (Stream<String> stream = Files.lines(Paths.get("taxa_rendimento_01.txt"))) {
			String taxa = stream.findFirst().get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String content = "0.5";
		Files.write(Paths.get("taxa_rendimento_01.txt"), content.getBytes());
	}
}
