package br.com.inter.banco;
<<<<<<< HEAD

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import br.com.inter.banco.modelo.ContaPoupanca;
=======
 
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.inter.banco.modelo.ContaPoupanca;
import br.com.inter.banco.util.Constante;
import br.com.inter.banco.util.Storage;
>>>>>>> branch 'master' of https://github.com/ggmoura/treinar_11063.git
import br.com.inter.banco.visao.TelaMenu;

public class Principal {

	public static void main(String[] args) {
<<<<<<< HEAD
		String fileName = "taxa-rendimento.txt";
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			ContaPoupanca.setTaxaRendimento(Float.valueOf(stream.findFirst().get()));
			System.out.println(ContaPoupanca.getTaxaRendimento());
=======
		try (Stream<String> stream = Files.lines(Paths.get(Constante.MetaDado.PATH_TAXA_RENDIMENTO))) {
			ContaPoupanca.setTaxaRendimento(Float.valueOf(stream.findFirst().get()));
			System.out.println("Taxa de rendimeto atual: ".concat(ContaPoupanca.getTaxaRendimento().toString()));
>>>>>>> branch 'master' of https://github.com/ggmoura/treinar_11063.git
		} catch (IOException e) {
			e.printStackTrace();
		}
		TelaMenu menu = new TelaMenu();
		menu.iniciarMenu();
		Gson gson = new GsonBuilder().create();
		final Path path = Paths.get(Constante.MetaDado.PATH_CONTAS);
		String contas = gson.toJson(Storage.getInstance().getContas());
		try {
			Files.write(path, contas.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Sistema finalizou....");
	}

}
