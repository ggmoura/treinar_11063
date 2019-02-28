package br.com.treinar.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

@ViewScoped
@ManagedBean(name="ajax")
public class AjaxEstadoCidadeController {

	private List<SelectItem> estados;
	private List<SelectItem> cidades;
	private String estado;
	private String cidade;
	
	
	public AjaxEstadoCidadeController() {
		estados = new ArrayList<SelectItem>();
		cidades = new ArrayList<SelectItem>();
		
		estados.add(new SelectItem("MG", "Minas Gerais"));
		estados.add(new SelectItem("RJ", "Rio de Janeiro"));
		estados.add(new SelectItem("SP", "São Paulo"));
	}

	public void selecionarCidades() {
		cidades.clear();
		cidade = null;
		if (estado != null && !estado.isEmpty()) {			
			switch (estado) {
			case "MG":
				cidades.add(new SelectItem("BH", "Belo Horizonte"));
				cidades.add(new SelectItem("CVO", "Curvelo"));
				break;
			case "RJ":
				cidades.add(new SelectItem("RJ", "Rio de Janeiro"));
				cidades.add(new SelectItem("BZ", "Buzios"));
				break;
			case "SP":
				cidades.add(new SelectItem("SP", "São Paulo"));
				cidades.add(new SelectItem("SJC", "Sao José"));			
				break;
			default:
				break;
			}
		}
	}
	
	
	public List<SelectItem> getEstados() {
		return estados;
	}


	public void setEstados(List<SelectItem> estados) {
		this.estados = estados;
	}


	public List<SelectItem> getCidades() {
		return cidades;
	}


	public void setCidades(List<SelectItem> cidades) {
		this.cidades = cidades;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
