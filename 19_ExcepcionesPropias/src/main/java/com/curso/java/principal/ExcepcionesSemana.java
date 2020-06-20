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
public class ExcepcionesSemana extends Exception {

	private static final long serialVersionUID = 1L;
	private int codigoError;

	public ExcepcionesSemana(int codigoError) {
		super();
		this.codigoError = codigoError;
	}

	@Override
	public String getMessage() {

		String mensaje = "";

		switch (codigoError) {
		case 1:
			mensaje = "Error, el numero es Negativo";
			break;
		case 2:
			mensaje = "Error, el numero es Mayor a  7";
			break;
		}

		return mensaje;

	}
}
