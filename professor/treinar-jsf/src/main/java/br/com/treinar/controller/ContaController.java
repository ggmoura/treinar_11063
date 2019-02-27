package br.com.treinar.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

import br.com.treinar.model.Conta;
import br.com.treinar.model.DiaSemana;
import br.com.treinar.model.Telefone;

@ViewScoped
@ManagedBean
public class ContaController {

	private Conta conta;
	private Boolean mostrar;
	private DiaSemana dia;
	private List<SelectItem> blahs;
	private List<Integer> selecionados;
	private Telefone telefone;

	public ContaController() {
		conta = new Conta();
		conta.setCliente("Maria Sophia");
		conta.setSaldo(100000d);
		System.out.println(conta);
		mostrar = new Random().nextBoolean();
		blahs = new ArrayList<SelectItem>();

		for (int i = 0; i < 10; i++) {
			blahs.add(new SelectItem(i, "Item ".concat(String.valueOf(i))));
		}

		telefone = new Telefone();
		telefone.setDdd(31);
		telefone.setNumero(987749131);

	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String salvar() {
		System.out.println(conta);
		System.out.println(dia.ordinal());
		return "index";
	}

	public Boolean getMostrar() {
		return mostrar;
	}

	public void setMostrar(Boolean mostrar) {
		this.mostrar = mostrar;
	}

	public DiaSemana getDia() {
		return dia;
	}

	public void setDia(DiaSemana dia) {
		this.dia = dia;
	}

	public List<SelectItem> getBlahs() {
		return blahs;
	}

	public void setBlahs(List<SelectItem> blahs) {
		this.blahs = blahs;
	}

	public List<Integer> getSelecionados() {
		return selecionados;
	}

	public void setSelecionados(List<Integer> selecionados) {
		this.selecionados = selecionados;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

}
