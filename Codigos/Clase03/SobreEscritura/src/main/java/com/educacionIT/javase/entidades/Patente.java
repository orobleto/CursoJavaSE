package com.educacionIT.javase.entidades;

/**
 * @author EducacionIT
 * @class Patente
 * @date 10 jun. 2020
 *
 */
public final class Patente {
	private String numero;
	private boolean activa;

	public Patente(String numero, boolean activa) {
		super();
		this.numero = numero;
		this.activa = activa;
	}

	@Override
	public String toString() {
		return "Patente [numero=" + numero + ", activa=" + activa + "]";
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

}
