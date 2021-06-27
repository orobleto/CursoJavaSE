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

	// método 1
	void encender() {
		encendido = true;
	}

	// método 2
	void apagar() {
		encendido = false;
	}

	// método 3
	void mostrarDatos() {
		String mensaje = "El Auto es de color " + color + ", marca " + marca + ", patente " + patente
				+ " y se encuentra " + ((encendido) ? "encendido" : "apagado");

		// Muestra en pantalla los atributos o caracteristicas del auto
		System.out.println(mensaje);
	}

}