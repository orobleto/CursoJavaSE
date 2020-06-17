
package com.curso.java.entidades;

import javax.swing.JOptionPane;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 14_Abstraccion
 * @class Compacto
 * @description 
 * @date 17 jun. 2020
 */
public class Compacto extends Auto {

	private int puestos;

	/**
	 * 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
	 * @date 17 jun. 2020
	 * @param puestos
	 * @param color
	 * @param marca
	 * @param patente
	 * @param encendido
	 */
	public Compacto(String color, String marca, String patente, boolean encendido, int puestos) {
		super(color, marca, patente, encendido);
		this.puestos = puestos;
	}

	@Override
	public void mostrarDatos() {
		String mensaje = "El Compacto es de color " + this.getColor() + "\n" + "Marca " + this.getMarca() + "\n"
				+ "Patente " + this.getPatente() + "\n" + "Puestos " + this.getPuestos() + "\n" + "y se encuentra "
				+ ((this.isEncendido()) ? "encendido" : "apagado");

		// mostramos en pantalla con una ventana de dialogo, para esto usamos una
		// libreria como la que usamos para el scanner javax.swing
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public Compacto() {
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

}
