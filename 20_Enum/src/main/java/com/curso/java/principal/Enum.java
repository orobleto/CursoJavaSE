/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.principal;

import com.curso.java.enums.DiaSemana;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 20_Enum
 * @class Enum
 * @description
 * @date 19 jun. 2020
 */
public class Enum {

	// creamos un Enum local
	enum ColoresBandera {
		AZUL, BLANCO;
	}

	public static void main(String[] args) {
		// lo declaramos e instanciamos

		ColoresBandera color = ColoresBandera.AZUL;
		System.out.println(color);

		DiaSemana diaSemana = DiaSemana.DOMINGO;

		switch (diaSemana) {
		case LUNES:
		case MARTES:
		case MIERCOLES:
		case JUEVES:
		case VIERNES:
			System.out.println("Dia Hábil");
			break;
		case SABADO:
		case DOMINGO:
			System.out.println("Dia No Hábil");
			break;
		}

		System.out.println(diaSemana.getNumero());
		System.out.println(diaSemana.getAbreviatura());

		// Values para devolver un arreglo del Enum
		for (DiaSemana diaAux : DiaSemana.values()) {
			System.out.println(diaAux.toString() + ", Abreviatura: " + diaAux.getAbreviatura() + ", Numero: "
					+ diaAux.getNumero());

		}

		// Imprime el valor de la constante si existe de lo contrario mostrara un error
		System.out.println(DiaSemana.valueOf("MARTES"));

		// Imprime la posicion de la constantes
		System.out.println(diaSemana.ordinal());

	}
}
