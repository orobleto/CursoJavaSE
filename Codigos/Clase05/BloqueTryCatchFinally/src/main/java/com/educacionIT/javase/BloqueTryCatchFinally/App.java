package com.educacionIT.javase.BloqueTryCatchFinally;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Inicio del Programa");

		Integer a = 15;
		Integer b = 0;
		try {
			System.out.println("El resultado de la division es: " + (a / b));
		} catch (ArithmeticException e) {
			System.out.println("Error: " + e.getMessage() + ", Causa: " + e.getCause() + ", Clase: " + e.getClass());
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Fin del Programa");
		}

	}
}
