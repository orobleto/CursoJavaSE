package com.educacionIT.javase.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		List<String> nombres = Arrays.asList("Octavio", "Sabrina", "Sebastian", "Ariel", "Nahuel");
		List<String> nombresMayusculasTradicional = new ArrayList<>();

		System.out.println("Iteracion Tradicional:");
		// metodo tradicional iterar
		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		System.out.println("Iteracion Funcional:");
		nombres.forEach((e) -> System.out.println(e));

		System.out.println("Nombres en Mayuscula Tradicional:");

		for (String nombre : nombres) {
			nombresMayusculasTradicional.add(nombre.toUpperCase());
		}

		System.out.println("Iteracion Tradicional:");
		for (String nombre : nombresMayusculasTradicional) {
			System.out.println(nombre);
		}

		System.out.println("Nombres en Mayuscula Funcional:");
		List<String> nombresMayusculasFuncional = nombres.stream().map((e) -> e.toUpperCase())
				.collect(Collectors.toList());

		System.out.println("Iteracion Funcional:");
		nombresMayusculasFuncional.forEach((e) -> System.out.println(e));

	}

}
