
package com.curso.java.entidades;

import javax.swing.JOptionPane;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 14_Abstraccion
 * @class Camion
 * @description
 * @date 17 jun. 2020
 */
public class Camion extends Auto {
	private int ejes;
	private boolean disponible;

	/**
	 * 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
	 * @date 17 jun. 2020
	 * @param ejes
	 * @param disponible
	 * @param color
	 * @param marca
	 * @param patente
	 * @param encendido
	 */
	public Camion(String color, String marca, String patente, boolean encendido, int ejes, boolean disponible) {
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
