package com.educacionIT.javase.principal;

/**
 * @author EducacionIT
 * @class AppEnvoltorio
 * @date 10 jun. 2020
 *
 */
public class AppEnvoltorio {
	public static void main(String[] args) {

		// enteros
		Byte miByte1 = new Byte((byte) 1);
		Byte miByte2 = new Byte("127");

		Short miShort1 = new Short((short) 2000);
		Short miShort2 = new Short("2000");

		Integer miInteger1 = new Integer(1000);
		Integer miInteger2 = new Integer("100");

		Long miLong1 = new Long(1000);
		Long miLong2 = new Long("100");

		// decimales
		Float miFloat1 = new Float(3216.33);
		Float miFloat2 = new Float("65491.33");

		Double miDouble1 = new Double(3216.33);
		Double miDouble2 = new Double("65491.33");

		// boleeanos
		Boolean miBoolean1 = new Boolean(true);
		Boolean miBoolean2 = new Boolean("TrUe");
		Boolean miBoolean3 = new Boolean("false");
		Boolean miBoolean4 = new Boolean("8");

		// Caracter
		Character miCharacter = new Character('P');

		/* valueOf */

		// enteros
		Byte miByte3 = Byte.valueOf((byte) 1);
		Byte miByte4 = Byte.valueOf("127");

		Short miShort3 = Short.valueOf((short) 2000);
		Short miShor42 = Short.valueOf("2000");

		Integer miInteger3 = Integer.valueOf(1000);
		Integer miInteger4 = Integer.valueOf("100");

		Long miLong3 = Long.valueOf(1000);
		Long miLong4 = Long.valueOf("100");

		// decimales
		Float miFloat3 = Float.valueOf(3216.33f);
		Float miFloat4 = Float.valueOf("65491.33");

		Double miDouble3 = Double.valueOf(3216.33);
		Double miDouble4 = Double.valueOf("65491.33");

		// boleeanos
		Boolean miBoolean5 = Boolean.valueOf(true);
		Boolean miBoolean6 = Boolean.valueOf("TrUe");
		Boolean miBoolean7 = Boolean.valueOf("false");
		Boolean miBoolean8 = Boolean.valueOf("8");

		// Caracter
		Character miCharacter2 = Character.valueOf('P');

		/* value() */

		// enteros
		byte miByte = miByte1.byteValue();

		short miShort = miShort1.shortValue();

		int miInt = miInteger1.intValue();

		// decimales
		long miLong = miLong1.longValue();

		float miFloat = miFloat1.floatValue();

		double miDouble = miDouble1.doubleValue();

		// boleeanos
		boolean miBoolean = miBoolean1.booleanValue();

		// Caracter
		char miChar = miCharacter.charValue();

		/* Parse */

		// enteros
		miByte = Byte.parseByte("63");

		miShort = Short.parseShort("89");

		miInt = Integer.parseInt("896633");

		// decimales
		miLong = Long.parseLong("191513333");

		miFloat = Float.parseFloat("321654.366");

		miDouble = Double.parseDouble("25698.36985");

		// boleeanos
		miBoolean = Boolean.getBoolean("true");

		// caracteres
		miInt = Character.getNumericValue('3');

		/* boxing */
		// enteros
		Byte miByte5 = 126;

		Short miShort5 = 200;

		Integer miInteger5 = 2000;

		Long miLong5 = 3985622222L;

		// decimales
		Float miFloat5 = 36985.366f;

		Double miDouble5 = 369744.36;

		// boleeanos
		Boolean miBoolean9 = true;

		// Caracter
		Character miCharacter5 = '*';

		/* unboxing */
		// enteros
		miByte = miByte1;

		miShort = miShort1;

		miInt = miInteger1;

		// decimales
		miLong = miLong1;

		miFloat = miFloat1;

		miDouble = miDouble1;

		// boleeanos
		miBoolean = miBoolean1;

		// Caracter
		miChar = miCharacter;

	}
}
