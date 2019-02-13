package br.com.inter.banco.modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import br.com.inter.banco.modelo.core.Conta;
import br.com.inter.banco.modelo.core.IProdutoRentavel;

public class ContaPoupanca extends Conta implements IProdutoRentavel<Long> {

	private Long id;
	private static Float taxaRendimento;
	
	static {
		taxaRendimento = 0f;
	}

	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public void setId(Long id) {
		this.id = (Long) id;
	}
	
	public static Float getTaxaRendimento() {
		return ContaPoupanca.taxaRendimento;
	}

	public static void setTaxaRendimento(Float taxaRendimento) {
		ContaPoupanca.taxaRendimento = taxaRendimento;
		String taxaRend = taxaRendimento.toString();
		System.out.println(taxaRend);
		Files.write(Paths.get("taxa_rendimento_01.txt"), taxaRend.getBytes());
				
		System.out.println(" Taxa de Rendimento salva: " + taxaRendimento);
	}

	@Override
	public void depositar(Double valor) {
		setSaldo(getSaldo() + valor);
	}

	@Override
	public void creditar() {
		depositar(getSaldo() * taxaRendimento);
	}
	
}
