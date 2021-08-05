package com.educacionIT.javase.entidades;

import com.educacionIT.javase.enumerados.Colores;

public class Familiar extends Auto {
	private String categoria;

	public Familiar() {
		super();
	}

	/**
	 * @param color
	 * @param marca
	 * @param patente
	 * @param puestos
	 * @param categoria
	 */
	public Familiar(Colores color, String marca, Patente patente, int puestos, String categoria) {
		super(color, marca, patente, puestos);
		this.categoria = categoria;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


}
