package com.educacionIT.javase.principal;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {

	public static void main(String[] args) {
		List<String> nombres = Arrays.asList("Octavio", "Sabrina", "Sebastian", "Ariel", "Nahuel");
		String cadenaNombresTradicional = "";

		System.out.println("Iteracion Tradicional:");
		// metodo tradicional iterar
		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		System.out.println("Iteracion Funcional:");
		nombres.forEach((e) -> System.out.println(e));

		System.out.println("Convertir lista a cadena Tradicional:");

		for (String nombre : nombres) {
			cadenaNombresTradicional += nombre + " ";
		}

		System.out.println("Cadena de Nombres Tradicional: " + cadenaNombresTradicional);

		System.out.println("Convertir lista a cadena Funcional:");
		String cadenaNombresFuncional = nombres.stream().reduce("", (a, b) -> a + " " + b);

		System.out.println("Cadena de Nombres Funcional: " + cadenaNombresFuncional);

	}

}
