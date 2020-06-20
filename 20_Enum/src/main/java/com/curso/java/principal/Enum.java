/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.principal;

import java.util.Arrays;

import com.curso.java.enums.EnumDiaSemana;

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
		Azul, Blanco;
	}

	public static void main(String[] args) {
		// lo declaramos e instanciamos
		ColoresBandera color1 = ColoresBandera.Azul;
		System.out.println(color1);

		EnumDiaSemana diaSemana = EnumDiaSemana.Domingo;

		System.out.println(diaSemana.getDiaNumero());
		System.out.println(diaSemana.getDiaLetras());

		// imprimir los valores del EnumDiaSemana
		System.out.println(Arrays.toString(EnumDiaSemana.values()));

		switch (diaSemana) {
		case Lunes:
			System.out.println("Dia Hábil");
			break;
		case Martes:
			System.out.println("Dia Hábil");
			break;
		case Miércoles:
			System.out.println("Dia Hábil");
			break;
		case Jueves:
			System.out.println("Dia Hábil");
			break;
		case Viernes:
			System.out.println("Dia Hábil");
			break;
		case Sábado:
			System.out.println("Dia No Hábil");
			break;
		case Domingo:
			System.out.println("Dia No Hábil");
			break;
		}
        /*
        la instruccion anterior al notar que terminan haciendo lo mismo se podia resumir de una forma mas optima
        de la siguiente manera:
        
        
        case Lunes:
        case Martes:
        case Miércoles:
        case Jueves:
        case Viernes:
            System.out.println("Dia Hábil");
            break;
        case Sábado:
        case Domingo:
            System.out.println("Dia No Hábil");
            break;
        */

	}
}
