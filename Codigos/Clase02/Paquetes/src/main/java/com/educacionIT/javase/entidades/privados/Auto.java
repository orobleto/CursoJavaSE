package com.educacionIT.javase.entidades.privados;

/**
 * @author EducacionIT
 * @class Auto
 * @date 10 jun. 2020 
 * Clase con modificador de acceso por defecto, sus atributos
 * y metodos son de tipo privador Solo puede ser instanciada en el mismo
 * paquete por otras clases, y sus atributos no pueden ser accedidos por nadie.
 */
class Auto {
	private String color;
	private String marca;
	private String patente;
	private boolean encendido;

	/**
	 * constructor simple por defecto
	 */
	private Auto() {

	}

	/**
	 * constructor con parametros
	 */
	private Auto(String color, String marca, String patente, boolean encendido) {
		this.color = color;
		this.marca = marca;
		this.patente = patente;
		this.encendido = encendido;
	}

	// devuelve una cadena de caracteres con las caracteristicas que posea el objeto
	private String mostrarDatos() {
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
	private void cambiarEstado(boolean encendido) {
		this.encendido = encendido;
	}

	// cambia el estado del atributo encendido por el valor booleano contrario
	private void cambiarEstado() {
		encendido = !encendido;
	}

}