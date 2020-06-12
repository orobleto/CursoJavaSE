/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.entidades;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 10_Herencia
 * @class Camion
 * @description
 * @HU_CU_REQ
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
