package com.educacionIT.javase.entidades;

/**
 * @author EducacionIT
 * @class Camion
 * @date 10 jun. 2020
 *
 */
public class Camion extends Auto {
	private int ejes;
	private boolean disponible;

	public Camion() {

	}

	public Camion(String color, String marca, Patente patente, boolean encendido, int ejes, boolean disponible) {
		super(color, marca, patente, encendido);
		this.ejes = ejes;
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Camion [toString()=" + super.toString() + ", ejes=" + ejes + ", disponible=" + disponible + "]";
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

}
