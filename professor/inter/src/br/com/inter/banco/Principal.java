package br.com.inter.banco;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import br.com.inter.banco.modelo.ContaPoupanca;
import br.com.inter.banco.visao.TelaMenu;

public class Principal {

	public static void main(String[] args) {
		String fileName = "taxa-rendimento.txt";
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			ContaPoupanca.setTaxaRendimento(Float.valueOf(stream.findFirst().get()));
			System.out.println(ContaPoupanca.getTaxaRendimento());
		} catch (IOException e) {
			e.printStackTrace();
		}
		TelaMenu menu = new TelaMenu();
		menu.iniciarMenu();
		System.out.println("Sistema finalizou....");
	}

}
