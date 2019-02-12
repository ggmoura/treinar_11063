package br.com.treinarminas.academico.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class TestaEntrada2 {
	public static void main(String[] args) throws IOException {
		try (InputStream is = new FileInputStream("output.txt");
			 InputStreamReader isr = new InputStreamReader(is)) {
			int c = isr.read();
			System.out.println(c);
		}
	}
}