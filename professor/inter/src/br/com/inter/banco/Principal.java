package br.com.inter.banco;
 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import br.com.inter.banco.modelo.ContaPoupanca;
import br.com.inter.banco.util.Constante;
import br.com.inter.banco.visao.TelaMenu;

public class Principal {

	public static void main(String[] args) {
		try (Stream<String> stream = Files.lines(Paths.get(Constante.MetaDado.PATH_TAXA_RENDIMENTO))) {
			ContaPoupanca.setTaxaRendimento(Float.valueOf(stream.findFirst().get()));
			System.out.println("Taxa de rendimeto atual: ".concat(ContaPoupanca.getTaxaRendimento().toString()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		TelaMenu menu = new TelaMenu();
		menu.iniciarMenu();
		System.out.println("Sistema finalizou....");
	}
	
}
