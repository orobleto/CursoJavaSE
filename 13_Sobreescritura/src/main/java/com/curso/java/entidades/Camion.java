/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.entidades;

import javax.swing.JOptionPane;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 13_Sobreescritura
 * @class Camion
 * @description
 * @date 12 jun. 2020
 */
public class Camion extends Auto {
	private int ejes;
	private boolean disponible;

	public Camion(int ejes, boolean disponible, String color, String marca, String patente, boolean encendido) {
		super(color, marca, patente, encendido);
		this.ejes = ejes;
		this.disponible = disponible;
	}

	@Override
	public void mostrarDatos() {
		String mensaje = "El Camion es de color " + this.getColor() + "\n" + "Marca " + this.getMarca() + "\n"
				+ "Patente " + this.getPatente() + "\n" + "Ejes " + this.getEjes() + "\n" + "Esta "
				+ ((this.isEncendido()) ? "disponible" : "No disponible") + "\n" + "y se encuentra "
				+ ((this.isEncendido()) ? "encendido" : "apagado");

		// mostramos en consola el mensaje
		System.out.println(mensaje);

		// mostramos en pantalla con una ventana de dialogo, para esto usamos una
		// libreria como la que usamos para el scanner javax.swing
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public Camion() {
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
