package com.educacionIT.javase.principal;

/**
 * @author EducacionIT
 * @class AppCasteo
 * @date 10 jun. 2020
 *
 */
public class AppCasteo {
	public static void main(String[] args) {
		/*
		 * Casteo Implicito
		 */

		// un byte el elemento numerico mas pequeño en Java
		byte miByte = 37;

		short miShort = miByte;

		int miInt = miShort;

		long miLong = miInt;

		float miFloat = miLong;

		double miDouble = miFloat;

		char miChar = 'P';

		miDouble = miChar;

		System.out.println("Casteo Implicito");

		System.out.println(miInt);

		System.out.println(miDouble);

		/*
		 * Casteo Explicito
		 */

		// un double el elemento numerico mas grande en Java
		double miDouble2 = 2.9856;

		float miFloat2 = (float) miDouble2;

		long miLong2 = (long) miFloat2;

		int miInt2 = (int) miLong2;

		short miShort2 = (short) miInt2;

		byte miByte2 = (byte) miShort2;

		char miChar2 = (char) miInt2;

		System.out.println("Casteo Explicito");

		System.out.println(miByte2);

		System.out.println(miChar2);

	}
}
