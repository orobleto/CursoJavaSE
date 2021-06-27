package com.educacionIT.javase.entidades;

/**
 * @author EducacionIT
 * @class Auto
 * @date 10 jun. 2020
 *
 */
public class Auto {
	private String color;
	private String marca;
	private Patente patente;
	private boolean encendido;
	public static String concesionaria = "Autos EducacionIT";

	/**
	 * constructor simple por defecto
	 */
	public Auto() {

	}

	/**
	 * Constructor para Instanciar los objetos e inicializar los atributos al mismo
	 * tiempo
	 *
	 * @param color
	 * @param marca
	 * @param patente
	 * @param encendido
	 */
	public Auto(String color, String marca, Patente patente, boolean encendido) {
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.encendido = encendido;

	}

	@Override
	public String toString() {
		return "Auto [color=" + color + ", marca=" + marca + ", patente=" + patente + ", encendido=" + encendido + "]";
	}

	public final void guardar() {
		System.out.println("Guardando Auto");
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
	public Patente getPatente() {
		return patente;
	}

	/**
	 * @param patente the patente to set
	 */
	public void setPatente(Patente patente) {
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

	public static void setConcesionaria(String concesionaria) {
		Auto.concesionaria = concesionaria;
	}

}