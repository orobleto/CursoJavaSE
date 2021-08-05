package com.educacionIT.javase.entidades;

import com.educacionIT.javase.enumerados.Colores;
import com.educacionIT.javase.excepciones.ExcepcionAuto;

/**
 * @author EducacionIT
 * @class Auto
 * @date 10 ene. 2021
 *
 */
public abstract class Auto implements Comparable<Auto> {
	private Colores color;
	private String marca;
	private Patente patente;
	public static String concesionaria = "Autos EducacionIT";
	private Integer puestos;

	/**
	 * constructor simple por defecto
	 */
	public Auto() {

	}

	/**
	 * @param color
	 * @param marca
	 * @param patente
	 * @param puestos
	 */
	public Auto(Colores color, String marca, Patente patente, Integer puestos) {
		super();
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.puestos = puestos;
	}

	/*
	 * Sobreescribimos el metodo toString para tener las caracteristicas mas
	 * genericas de un Auto en dado caso que un hijo no sobreescriba dicho metodo
	 */
	@Override
	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", patente=" + patente + ", puestos=" + puestos + "]";
	}

	/**
	 * @return the color
	 */
	public Colores getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Colores color) {
		this.color = color;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the patente
	 */
	public Patente getPatente() {
		return patente;
	}

	/**
	 * @param patente the patente to set
	 */
	public void setPatente(Patente patente) {
		try {
			if (patente == null) {
				throw new ExcepcionAuto("No puede estar nulo");
			} else if (patente.getNumero().length() != 8) {
				throw new ExcepcionAuto(1);
			}
		} catch (ExcepcionAuto e) {
			System.out.println(e.getMessage());
		}
		this.patente = patente;
	}

	/**
	 * @return the puestos
	 */
	public Integer getPuestos() {
		return puestos;
	}

	/**
	 * @param puestos the puestos to set
	 * @throws Exception
	 */
	public void setPuestos(Integer puestos) throws ExcepcionAuto {
		if (puestos == null) {
			throw new ExcepcionAuto(2);
		} else if (puestos < 1) {
			throw new ExcepcionAuto(2);
		}
		this.puestos = puestos;
	}

	/**
	 * @param concesionaria the concesionaria to set
	 */
	public static void setConcesionaria(String concesionaria) {
		Auto.concesionaria = concesionaria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patente == null) ? 0 : patente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (patente == null) {
			if (other.patente != null)
				return false;
		} else if (!patente.equals(other.patente))
			return false;
		return true;
	}

	@Override
	public int compareTo(Auto auto) {
		return this.patente.getNumero().compareTo(auto.getPatente().getNumero());
		// return this.puestos - auto.puestos;
	}

}