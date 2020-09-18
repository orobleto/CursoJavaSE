/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.enums;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 20_Enum
 * @class DiaSemana
 * @description 
 * @date 18/09/2020
 */
public enum DiaSemana {
    //Constantes con constructor
	LUNES("Lun.",1),
	MARTES("Mar.",2),
	MIERCOLES("Mie.",3),
	JUEVES("Jue.",2),
	VIERNES("Vie.",2),
	SABADO("Sab.",2),
	DOMINGO("Dom.",2);
	
    private final String abreviatura;
    private final int numero;
	/** 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 18/09/2020 
	 * @param abreviatura
	 * @param numero 
	 * Este constructor debe ser privado ya que no se debe ni puede instanciar el objeto EnumDiaSemana
	 */ 
	private DiaSemana(String abreviatura, int numero) {
		this.abreviatura = abreviatura;
		this.numero = numero;
	}
	/** 
	 * @return the abreviatura 
	 */
	public String getAbreviatura() {
		return abreviatura;
	}
	/** 
	 * @return the numero 
	 */
	public int getNumero() {
		return numero;
	}

 
}
