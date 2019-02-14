package br.com.inter.banco.modelo.core;

public interface IProdutoPagavel<T> extends IProduto<T> {

	Double cobrar();

}
