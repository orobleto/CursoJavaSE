package com.educacionIT.javase.entidades;

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
	public Familiar(String color, String marca, Patente patente, int puestos, String categoria) {
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

	@Override
	public void vender() {
		// algoritmo para vender el auto
		System.out.println("Familiar vendido (" + this + ")");
	}

}
