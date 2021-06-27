package com.educacionIT.javase.entidades;

/**
 * @author EducacionIT
 * @class Compacto
 * @date 10 jun. 2020
 *
 */
public class Compacto extends Auto {
	private int puestos;

	public Compacto() {

	}

	public Compacto(String color, String marca, Patente patente, boolean encendido, int puestos) {
		super(color, marca, patente, encendido);
		this.puestos = puestos;
	}

	@Override
	public String toString() {
		return "Compacto [toString()=" + super.toString() + ", puestos=" + puestos + "]";
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

}
