package com.educacionIT.javase.entidades;

public class Pasajeros extends Transporte {
	private Boolean accesoEspecial;

	/**
	 * 
	 */
	public Pasajeros() {
		super();
	}

	/**
	 * @param color
	 * @param marca
	 * @param patente
	 * @param puestos
	 * @param licencia
	 * @param tipo
	 * @param accesoEspecial
	 */
	public Pasajeros(String color, String marca, Patente patente, int puestos, String licencia, String tipo,
			Boolean accesoEspecial) {
		super(color, marca, patente, puestos, licencia, tipo);
		this.accesoEspecial = accesoEspecial;
	}

	@Override
	public String toString() {
		return "Pasajeros [toString()=" + super.toString() + ", accesoEspecial=" + accesoEspecial + "]";
	}

	/**
	 * @return the accesoEspecial
	 */
	public Boolean getAccesoEspecial() {
		return accesoEspecial;
	}

	/**
	 * @param accesoEspecial the accesoEspecial to set
	 */
	public void setAccesoEspecial(Boolean accesoEspecial) {
		this.accesoEspecial = accesoEspecial;
	}

	public void vender() {
		// algoritmo para vender el auto
		System.out.println("Transporte de Pasajeros vendido (" + this + ")");
	}
}
