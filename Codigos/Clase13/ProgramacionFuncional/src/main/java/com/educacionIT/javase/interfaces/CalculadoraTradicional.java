package com.educacionIT.javase.interfaces;

public interface CalculadoraTradicional {

	public static int sumar(int a, int b) {
		return a + b;
	}

	public static int restar(int a, int b) {
		return a - b;
	}

	public static int multiplicar(int a, int b) {
		return a * b;
	}

	public static int dividir(int a, int b) {
		return (b == 0 ? 0 : a / b);
	}
}
