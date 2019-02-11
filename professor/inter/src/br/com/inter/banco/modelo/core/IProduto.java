package br.com.inter.banco.modelo.core;

//TODO Aula generics
public interface IProduto<T> {

	T getId();
	
	void setId(T id);

}
