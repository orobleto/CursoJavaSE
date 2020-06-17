/**
 * 
 */
package com.curso.java.principal;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 02_Variables
 * @class Principal
 * @description 
 * @date 10 jun. 2020
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables Primitivas en JAVA
		/**
		 * Numericos Enteros
		 */
		// byte: 8 bits de almacenamiento | valores en el rango [-128, 127]
		byte miByte = 5;
		System.out.println("miByte = " + miByte);

		// short: 2 bytes de almacenamiento | valores en el rango [-32.768, 32.767]
		short miShort = 12596;
		System.out.println("miShort = " + miShort);

		// int: 4 bytes de almacenamiento | valores en el rango [-2 elevado 31 a 2
		// elevado 31-1]
		int miInt = 10;
		System.out.println("miInt = " + miInt);

		// long: 8 bytes de almacenamiento | valores en el rango [-2 elevado a 63 a 2
		// elevado 63-1]
		long miLong = 1000000000;
		System.out.println("miLong = " + miLong);

		/**
		 * Numericos de tipo punto flotante
		 */

		// float: 4 bytes de almacenamiento | valores en el rango [1.4x10 elevado -45 a
		// 3.4028235x10 elevado 38]
		float miFloat = 10.58f;
		System.out.println("miFloat = " + miFloat);

		// double: 8 bytes de almacenamiento | valores en el rango 4.9x10 elevado -324 a
		// 1.7976931348623157x10 elevado 308.
		double miDouble = 10.58;
		System.out.println("miDouble = " + miDouble);

		/**
		 * Booleanos y caracteres
		 */
		// boolean: 1 byte de almacenamiento | valores porsibles [true/false]
		boolean miBoolean = false;
		System.out.println("miBoolean = " + miBoolean);

		// char: 2 bytes de almacenamiento | valores posibles [caracteres simples]
		char miChar = 'P';
		System.out.println("miChar = " + miChar);

		/**
		 * Datos Estructurados
		 */
		// String: cadena de caracteres
		String miString = "Hola Mundo";
		System.out.println("miString = " + miString);

		/**
		 * Constantes
		 */
		// las constantes en JAVA son variables que no cambian de Valor
		// una vez asignado el valor inicial no se puede cambiar durante la ejecucion
		// del programa
		// simplemente se usan todos los tipos de variables anteponiendo la palabra
		// reservada final
		final String VERSION = "Version 1.0";
		System.out.println("VERSION = " + VERSION);

		final double IVA = 21.5;
		System.out.println("IVA = " + IVA);

	}

}
