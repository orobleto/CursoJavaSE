package com.educacionIT.javase.principal;

import com.educacionIT.javase.interfaces.CalculadoraFuncional;

/**
 * Hello world!
 *
 */
public class Declarativo {
	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		int resultado;

		CalculadoraFuncional operaracion;

		operaracion = (numA, numB) -> numA + numB;
		resultado = operaracion.operar(a, b);
		System.out.println("Sumar (" + a + " , " + b + "): " + resultado);

		operaracion = (numA, numB) -> numA - numB;
		resultado = operaracion.operar(a, b);
		System.out.println("Restar (" + a + " , " + b + "): " + resultado);

		operaracion = (numA, numB) -> numA * numB;
		resultado = operaracion.operar(a, b);
		System.out.println("Multiplicar (" + a + " , " + b + "): " + resultado);

		operaracion = (numA, numB) -> (numB == 0 ? 0 : numA / numB);
		resultado = operaracion.operar(a, b);
		System.out.println("Dividir (" + a + " , " + b + "): " + resultado);

		operaracion = (numA, numB) -> numA % numB;
		resultado = operaracion.operar(a, b);
		System.out.println("Modulo (" + a + " , " + b + "): " + resultado);

	}
}
