package com.educacionIT.javase.entidades;

import java.util.Date;

import com.educacionIT.javase.enumerados.Colores;

public class Familiar extends Auto {
	private String categoria;

	public Familiar() {
		super();
	}

	/**
	 * @param color
	 * @param marca
	 * @param patente
	 * @param puestos
	 * @param categoria
	 */
	public Familiar(Colores color, String marca, Patente patente, int puestos, String categoria) {
		super(color, marca, patente, puestos);
		this.categoria = categoria;
	}

	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public void vender() {
		// algoritmo para vender el auto
		System.out.println("Familiar vendido (" + this + ")");
	}
	// Para este ejemplo los metodos tienen practicamente el mismo comportamiento
	// pero la idea es que cada clase implemente su algoritmo sugn la necesidad

	@Override
	public boolean reparar(Date fecha, String autoParte, String mecanico) {
		System.out.println(
				"Reparación de " + autoParte + " " + this.getPatente() + " en la fecha " + fecha + " por " + mecanico);
		return true;
	}

	@Override
	public boolean cambioPieza(Date fecha, String autoParte) {

		System.out.println("Cambio de " + autoParte + " " + this.getPatente() + " en la fecha " + fecha);
		return true;
	}

	@Override
	public String cambioAceite(Date fecha, String autoParte, String marca, String tipo, Float cantidad) {
		return "Se cambio el aceite al Auto de Familiar " + getPatente() + " Marca " + marca + ", Tipo " + tipo
				+ " y fueron " + cantidad + " Lts.";
	}

	@Override
	public void lavar(Date fecha, String tipo) {
		System.out.println("Se lavo el Auto de Familiar con el metodo " + tipo + " en la fecha " + fecha);

	}

	@Override
	public boolean imprimir(String impresora) {
		System.out.println(
				"Se ha enviado la impresion del Auto de Familiar " + getPatente() + " a la impresora " + impresora);
		return true;
	}

	@Override
	public boolean guardar(String tipoArchivo) {
		System.out
				.println("Se ha enviado guardado del Auto de Familiar " + getPatente() + " en formato " + tipoArchivo);
		return true;
	}
}
