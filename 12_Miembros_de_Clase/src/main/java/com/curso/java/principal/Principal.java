/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.principal;

import java.util.Arrays;

import com.curso.java.utilidades.Calculos;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 12_Miembros_de_Clase
 * @class Static
 * @description
 * @date 12 jun. 2020
 */

public class Principal {

	public static void main(String[] args) {

		// accedemos a las constantes y las imprimimos
		System.out.println("IVA: " + Constantes.IVA);
		System.out.println(Arrays.toString(Constantes.DIAS_SEMANA));

		// modificamos la variable estatica y la imprimimos
		Variables.CANTIDAD_USUARIOS = 8;
		System.out.println("Cantidad de usuarios:" + Variables.CANTIDAD_USUARIOS);

		// usamos los metos estaticos
		System.out.println("Opero:" + Calculos.operarDosNumeros('+', 26, 85));

	}

}
