package br.com.inter.test.conta;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;

import br.com.inter.banco.modelo.ContaPoupanca;
import br.com.inter.banco.modelo.core.Cliente;
import br.com.inter.banco.modelo.core.Conta;
import br.com.inter.banco.modelo.core.TipoPessoa;
import br.com.inter.banco.util.Constante;

public class TesteLibJson {

	public static void main(String[] args) throws JsonIOException, IOException {
		Gson gson = new GsonBuilder().create();
		Conta c = new ContaPoupanca();
		c.depositar(100d);
		Cliente cliente = new Cliente();
		cliente.setNomeCliente("Maria Sophia");
		cliente.setCpf(55546265302l);
		cliente.setTipoPessoa(TipoPessoa.FISICA);
		c.setCliente(cliente);

		gson.toJson(c, new FileWriter("contas.json"));
		String jsonInString = gson.toJson(c);
		final Path path = Paths.get(Constante.MetaDado.PATH_TAXA_RENDIMENTO);
		try {
			Files.write(path, jsonInString.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
