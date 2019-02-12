package br.com.treinarminas.academico.file;

import java.nio.file.Files;
import java.nio.file.Paths;

public class CriarArquivo {

	public static void main(String[] args) throws Exception {
		String content = "Hello World !!";
		Files.write(Paths.get("output.txt"), content.getBytes());
	}

}
