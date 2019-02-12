package br.com.treinarminas.academico.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

class TestaSaida {
	public static void main(String[] args) throws IOException {
		
		String path = System.getProperty("user.dir") + File.separator + "teste.txt";
		System.out.println(path);
		OutputStream os = new FileOutputStream(path, Boolean.TRUE);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("\nMaria Sophia");

		bw.close();
	}
}