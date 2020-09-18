/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.principal;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 19_ExcepcionesPropias
 * @class ExcepcionesSemana
 * @description
 * @date 19 jun. 2020
 */
public class ExcepcionSemana extends Exception {

	private static final long serialVersionUID = 1L;
	private int codigoError;

	public ExcepcionSemana(int codigoError) {
		super();
		this.codigoError = codigoError;
	}

	@Override
	public String getMessage() {
		switch (codigoError) {
		case 1:
			return "Número Negativo, validos del [1-7]";
		case 2:
			return "Número Fuera del Rango, validos del [1-7]";
		default:
			return "Fuera del Rango";
		}
	}
}
