package com.educacionIT.javase.entidades;

import com.educacionIT.javase.excepciones.ExcepcionAuto;
import com.educacionIT.javase.interfaces.Archivo;
import com.educacionIT.javase.interfaces.MantenimientoMecanico;

/**
 * @author EducacionIT
 * @class Auto
 * @date 10 ene. 2021
 *
 */
public abstract class Auto implements MantenimientoMecanico, Archivo {
	private String color;
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
	public Auto(String color, String marca, Patente patente, Integer puestos) {
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

	/* Metodo abstracto que se implementara obligatoriamente en las clases Hijas */
	public abstract void vender();

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
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

}