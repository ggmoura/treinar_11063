package br.com.treinarminas.academico.file;

import java.io.FileInputStream;
import java.io.InputStream;

class TestaEntrada1 {
	public static void main(String[] args) throws Exception {
		try (InputStream is = new FileInputStream("output.txt")) {
			int b = is.read();
			System.out.println(b);
		}
	}
}