package com.educacionIT.javase.entidades;

/**
 * @author EducacionIT
 * @class Auto
 * @date 10 jun. 2020 
 * Clase con modificador de acceso publico y sus metodos con el mismo modificador de acceso.
 * Atributos privados para garantizar seguridad y estandar, podemos modificar y obtener sus valores a traves de los getter y setter (Encapsulamiento)
 */
public class Auto {
	private String color;
	private String marca;
	private String patente;
	private boolean encendido;

	/**
	 * constructor simple por defecto
	 */
	public Auto() {

	}

	/**
	 * constructor con parametros
	 */
	public Auto(String color, String marca, String patente, boolean encendido) {
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.encendido = encendido;
	}

	// devuelve una cadena de caracteres con las caracteristicas que posea el objeto
	public String mostrarDatos() {
		String mensaje = "El Auto es de color " + color + ", marca " + marca + ", patente " + patente
				+ " y se encuentra " + ((encendido) ? "encendido" : "apagado");

		// la palabra reservada return le indica al metodo que finalizo su ejecuion
		// y que devuelva el objeto mensaje
		return mensaje;
		/*
		 * Tambien podemos retornar los valores sin la necesidad de una variable local,
		 * solo debe coincidir el tipo de dato return "El Auto es de color " + color +
		 * ", marca " + marca + ", patente " + patente + " y se encuentra " +
		 * ((encendido) ? "encendido" : "apagado");
		 */
	}

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
	public String getPatente() {
		return patente;
	}

	/**
	 * @param patente the patente to set
	 */
	public void setPatente(String patente) {
		this.patente = patente;
	}

	/**
	 * @return the encendido
	 */
	public boolean isEncendido() {
		return encendido;
	}

	/**
	 * @param encendido the encendido to set
	 */
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

}