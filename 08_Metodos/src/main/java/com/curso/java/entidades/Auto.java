package com.curso.java.entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 08_Metodos
 * @class Auto
 * @description
 * @date 10 jun. 2020
 */
public class Auto {

	// atributos o caracteristicas
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

	// metodo 1
	public void encendido(boolean parametroEncendido) {
		encendido = parametroEncendido;
	}

	// metodo 3
	public void mostrarDatos() {
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
