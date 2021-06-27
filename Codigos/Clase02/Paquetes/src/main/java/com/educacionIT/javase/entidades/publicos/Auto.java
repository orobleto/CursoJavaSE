package com.educacionIT.javase.entidades.publicos;

/**
 * @author EducacionIT
 * @class Auto
 * @date 10 jun. 2020 
 * Clase con modificador de acceso por publico, sus atributos
 * y metodos son de tipo publicos puede ser declarado, instanciado 
 * desde cualquier clase incluyendo la utilizacion de sus atributos y metodos
 */
public class Auto {
	public String color;
	public String marca;
	public String patente;
	public boolean encendido;

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

	// cambia el estado del atributo encendido sin devolver ningun dato por el
	// argumento enviado
	public void cambiarEstado(boolean encendido) {
		this.encendido = encendido;
	}

	// cambia el estado del atributo encendido por el valor booleano contrario
	public void cambiarEstado() {
		encendido = !encendido;
	}

}