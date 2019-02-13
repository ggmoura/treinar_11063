package br.com.inter.banco;
 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import br.com.inter.banco.modelo.ContaPoupanca;
import br.com.inter.banco.visao.TelaMenu;

public class Principal {

	public static void main(String[] args) {
		TelaMenu menu = new TelaMenu();
		try (Stream<String> stream = Files.lines(Paths.get("taxa_rendimento_01.txt"))) {
			String taxaRendimento = stream.findFirst().get();
			Float taxaRendimentoFloat = Float.valueOf(taxaRendimento);
			ContaPoupanca.setTaxaRendimento(taxaRendimentoFloat);
			System.out.println("Taxa de rendimento atualizada: " + ContaPoupanca.getTaxaRendimento());
		} catch (IOException e) {
			e.printStackTrace();
		}
		menu.iniciarMenu();
		System.out.println("Sistema finalizou....");
	}
	
}
