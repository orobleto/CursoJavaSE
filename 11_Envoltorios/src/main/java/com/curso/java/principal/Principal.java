package com.curso.java.principal;

/**
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 11_Wrapper
 * @class Principal
 * @description
 * @date 12 jun. 2020
 */
public class Principal {

	public static void main(String[] args) {
		/**
		 * Podemos usar los mismos metodos aqui presentados para cada uno de los tipos
		 * de envoltorios Primitivo | Envoltorio | Constructor -----------------|
		 * --------------| ------------------- byte | Byte | byte o String short | Short
		 * | short o String int | Integer | int o String long | Long | long o String
		 * boolean | Boolean | boolean o String float | Float | float o String double |
		 * Double | double o String char | Character | char
		 */

		// creacion de los objetos de tipo Integer
		Integer i1 = new Integer(42);
		Integer i2 = new Integer("42");
		Integer i3 = 42;

		// mostramos en la consola los valores
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);

		// Convierte el 10 (Binario) a 2 (Decimal) y le asigna el valor de 2 al objeto
		// Integer i4
		Integer i4 = Integer.valueOf("10", 2);
		System.out.println(i4);

		// le asigna el valor de 10 al objeto Integer i5
		Integer i5 = Integer.valueOf("10");
		System.out.println(i5);

		// usamos el metodo para obtener el valor primitivo del objeto i5
		int i6 = i5.intValue();
		System.out.println(i6);

		// convertimos un String a un entero
		int i7 = Integer.parseInt("85");
		System.out.println(i7);

	}

}
