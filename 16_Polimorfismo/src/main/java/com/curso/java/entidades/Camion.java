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
 * @project 15_Interfaces
 * @class Camion
 * @description
 * @HU_CU_REQ
 * @date 17 jun. 2020
 */
public class Camion extends Auto {

	private int ejes;
	private boolean disponible;

	public Camion(String color, String marca, String patente, boolean encendido, int ejes, boolean disponible) {
		super(color, marca, patente, encendido);
		this.ejes = ejes;
		this.disponible = disponible;
	}

	/**
	 * 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
	 * @date 17 jun. 2020
	 * @see com.curso.java.entidades.Auto#mostrarDatos()
	 */
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

	/**
	 * 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
	 * @date 17 jun. 2020
	 * @see com.curso.java.interfaces.MetodosLavado#lavarCarroceria()
	 */
	@Override
	public void lavarCarroceria() {
		// aqui va la accion
	}

	/**
	 * 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
	 * @date 17 jun. 2020
	 * @return
	 * @see com.curso.java.interfaces.MetodosLavado#lavarChasis()
	 */
	@Override
	public int lavarChasis() {
		return 0;
	}

	/**
	 * 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
	 * @date 17 jun. 2020
	 * @param conEspuma
	 * @see com.curso.java.interfaces.MetodosLavado#lavarMotor(boolean)
	 */
	@Override
	public void lavarMotor(boolean conEspuma) {
		// aqui va la accion
	}
}
