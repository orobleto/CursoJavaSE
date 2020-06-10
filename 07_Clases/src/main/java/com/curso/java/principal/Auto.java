/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.principal;

import javax.swing.JOptionPane;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 07_Clases
 * @class Auto
 * @description 
 * @HU_CU_REQ 
 * @date 10 jun. 2020
 */
class Auto {

	// atributos o caracteristicas
	String color;
	String marca;
	String patente;
	boolean encendido;

	// metodo 1
	void encender() {
		encendido = true;
	}

	// métodos 2
	void apagar() {
		encendido = false;
	}

	// métodos 3
	void mostrarDatos() {
		/**
		 * Aqui una diferencia entre la diapositiva y como deberia ser usando el if
		 * reducido u operador ternario
		 */
		String mensaje = "El Auto es de color " + color + ", marca " + marca + ", patente " + patente
				+ " y se encuentra " + ((encendido) ? "encendido" : "apagado");

		// mostramos en consola el mensaje
		System.out.println(mensaje);

		// mostramos en pantalla con una ventana de dialogo, para esto usamos una
		// libreria como la que usamos para el scanner javax.swing
		JOptionPane.showMessageDialog(null, mensaje);
	}

}
