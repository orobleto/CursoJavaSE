package com.educacionIT.javase.principal;

/**
 * @author EducacionIT
 * @class Auto
 * @date 10 jun. 2020
 * 
 */
class Auto {
	String color;
	String marca;
	String patente;
	boolean encendido;

	/**
	 * constructor simple por defecto
	 */
	Auto() {

	}

	/**
	 * constructor con parametros
	 */
	Auto(String color, String marca, String patente, boolean encendido) {
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.encendido = encendido;
	}

	// devuelve una cadena de caracteres con las caracteristicas que posea el objeto
	String mostrarDatos() {
		String mensaje = "El Auto es de color " + color + ", marca " + marca + ", patente " + patente
				+ " y se encuentra " + ((encendido) ? "encendido" : "apagado");

		// la palabra reservada return le indica al metodo que finalizo su ejecuion
		// y que devuelva el objeto mensaje
		return mensaje;
		/*
		 * Tambien podemos retornar los valores sin la necesidad de una variable local,
		 * solo debe coincidir el tipo de dato
		 return "El Auto es de color " + color + ", marca " + marca + ", patente " + patente
		  + " y se encuentra " + ((encendido) ? "encendido" : "apagado");
		 */
	}

	// cambia el estado del atributo encendido sin devolver ningun dato por el
	// argumento enviado
	void cambiarEstado(boolean encendido) {
		this.encendido = encendido;
	}

	// cambia el estado del atributo encendido por el valor booleano contrario
	void cambiarEstado() {
		encendido = !encendido;
	}

}