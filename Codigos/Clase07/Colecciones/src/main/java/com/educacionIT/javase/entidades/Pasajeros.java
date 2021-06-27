package com.educacionIT.javase.entidades;

import java.util.Date;

import com.educacionIT.javase.enumerados.Colores;

public class Pasajeros extends Transporte {
	private Boolean accesoEspecial;

	/**
	 * 
	 */
	public Pasajeros() {
		super();
	}

	/**
	 * @param color
	 * @param marca
	 * @param patente
	 * @param puestos
	 * @param licencia
	 * @param tipo
	 * @param accesoEspecial
	 */
	public Pasajeros(Colores color, String marca, Patente patente, int puestos, String licencia, String tipo,
			Boolean accesoEspecial) {
		super(color, marca, patente, puestos, licencia, tipo);
		this.accesoEspecial = accesoEspecial;
	}

	@Override
	public String toString() {
		return "Pasajeros [toString()=" + super.toString() + ", accesoEspecial=" + accesoEspecial + "]";
	}

	/**
	 * @return the accesoEspecial
	 */
	public Boolean getAccesoEspecial() {
		return accesoEspecial;
	}

	/**
	 * @param accesoEspecial the accesoEspecial to set
	 */
	public void setAccesoEspecial(Boolean accesoEspecial) {
		this.accesoEspecial = accesoEspecial;
	}

	public void vender() {
		// algoritmo para vender el auto
		System.out.println("Transporte de Pasajeros vendido (" + this + ")");
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
		return "Se cambio el aceite al Auto de Pasajeros " + getPatente() + " Marca " + marca + ", Tipo " + tipo
				+ " y fueron " + cantidad + " Lts.";
	}

	@Override
	public void lavar(Date fecha, String tipo) {
		System.out.println("Se lavo el Auto de Pasajeros con el metodo " + tipo + " en la fecha " + fecha);

	}

	@Override
	public boolean imprimir(String impresora) {
		System.out.println(
				"Se ha enviado la impresion del Auto de Pasajeros " + getPatente() + " a la impresora " + impresora);
		return true;
	}

	@Override
	public boolean guardar(String tipoArchivo) {
		System.out
				.println("Se ha enviado guardado del Auto de Pasajeros " + getPatente() + " en formato " + tipoArchivo);
		return true;
	}
}
