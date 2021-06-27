package com.educacionIT.javase.Genericos;

public class GenericaDosAtributos<K, V> {

	private K codigo;
	private V numero;

	public K getCodigo() {
		return codigo;
	}

	public void setCodigo(K codigo) {
		this.codigo = codigo;
	}

	public V getNumero() {
		return numero;
	}

	public void setNumero(V numero) {
		this.numero = numero;
	}

}
