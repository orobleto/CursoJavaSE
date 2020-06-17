/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.utilidades;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 12_Miembros_de_Clase
 * @class Calculos
 * @description
 * @HU_CU_REQ
 * @date 12 jun. 2020
 */

public class Calculos {
	/**
	 * 
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a> 
	 * @date 12 jun. 2020
	 * @description 
	 * @param operador
	 * @param numero1
	 * @param numero2
	 * @return resultado
	 */
	public static double operarDosNumeros(char operador, double numero1, double numero2) {
		double resultado = 0;
		switch (operador) {
		case '+':
			resultado = numero1 + numero2;
			// el break es importante ya que le dice al caso que debe salir de el, de lo
			// contrario entrara
			// en todas las condiciones siguientes
			break;
		case '-':
			resultado = numero1 - numero2;
			break;
		case '*':
			resultado = numero1 * numero2;
			break;
		case '/':
			if (numero2 == 0) {
				System.out.println("No es posible realizar la division por cero");
			} else {
				resultado = numero1 / numero2;
			}
			break;
		default:
			System.out.println("No es un operador valido");
		}
		return resultado;
	}
}
