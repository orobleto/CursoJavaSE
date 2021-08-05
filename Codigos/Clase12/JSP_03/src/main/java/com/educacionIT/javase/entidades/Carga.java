package com.educacionIT.javase.entidades;

import com.educacionIT.javase.enumerados.Colores;

public class Carga extends Transporte {

	private Float capacidad;
	private Integer ejes;

	/**
	 * 
	 */
	public Carga() {
		super();
	}

	/**
	 * @param color
	 * @param marca
	 * @param patente
	 * @param puestos
	 * @param licencia
	 * @param tipo
	 * @param capacidad
	 * @param ejes
	 */
	public Carga(Colores color, String marca, Patente patente, int puestos, String licencia, String tipo,
			Float capacidad, Integer ejes) {
		super(color, marca, patente, puestos, licencia, tipo);
		this.capacidad = capacidad;
		this.ejes = ejes;
	}

	@Override
	public String toString() {
		return "Carga [toString()=" + super.toString() + ", capacidad=" + capacidad + ", ejes=" + ejes + "]";
	}

	/**
	 * @return the capacidad
	 */
	public Float getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(Float capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the ejes
	 */
	public Integer getEjes() {
		return ejes;
	}

	/**
	 * @param ejes the ejes to set
	 */
	public void setEjes(Integer ejes) {
		this.ejes = ejes;
	}

}