package com.educacionIT.javase.principal;

import com.educacionIT.javase.interfaces.CalculadoraTradicional;

/**
 * Hello world!
 *
 */
public class Imperativo {
	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		int resultado;

		resultado = CalculadoraTradicional.sumar(a, b);
		System.out.println("Sumar (" + a + " , " + b + "): " + resultado);
		resultado = CalculadoraTradicional.restar(a, b);
		System.out.println("Restar (" + a + " , " + b + "): " + resultado);
		resultado = CalculadoraTradicional.multiplicar(a, b);
		System.out.println("Multiplicar (" + a + " , " + b + "): " + resultado);
		resultado = CalculadoraTradicional.dividir(a, b);
		System.out.println("Dividir (" + a + " , " + b + "): " + resultado);
	}
}
