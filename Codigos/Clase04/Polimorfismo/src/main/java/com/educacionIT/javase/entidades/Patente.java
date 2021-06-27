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

	/**
	 * @param numero
	 * @param activa
	 */
	public Patente(String numero, boolean activa) {
		super();
		this.numero = numero;
		this.activa = activa;
	}

	@Override
	public String toString() {
		return "Patente [numero=" + numero + ", activa=" + activa + "]";
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the activa
	 */
	public boolean isActiva() {
		return activa;
	}

	/**
	 * @param activa the activa to set
	 */
	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	public void vender() {
		System.out.println("Patente vendida (" + this + ")");
	}

}
