package com.educacionIT.javase.entidades;

import com.educacionIT.javase.enumerados.Colores;

public abstract class Transporte extends Auto {
	private String licencia;
	private String tipo;

	public Transporte() {
		super();
	}

	/**
	 * @param color
	 * @param marca
	 * @param patente
	 * @param puestos
	 * @param licencia
	 * @param tipo
	 */
	public Transporte(Colores color, String marca, Patente patente, int puestos, String licencia, String tipo) {
		super(color, marca, patente, puestos);
		this.licencia = licencia;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Transporte [toString()=" + super.toString() + ", licencia=" + licencia + ", tipo=" + tipo + "]";
	}

	/**
	 * @return the licencia
	 */
	public String getLicencia() {
		return licencia;
	}

	/**
	 * @param licencia the licencia to set
	 */
	public void setLicencia(String licencia) {
		this.licencia = licencia;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
