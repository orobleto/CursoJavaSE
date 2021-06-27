package com.educacionIT.javase.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		List<String> nombres = Arrays.asList("Octavio", "Sabrina", "Sebastian", "Ariel", "Nahuel");
		List<String> nombresComienzanConSTradicional = new ArrayList<>();

		System.out.println("Iteracion Tradicional:");
		// metodo tradicional iterar
		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		System.out.println("Iteracion Funcional:");
		nombres.forEach((e) -> System.out.println(e));

		System.out.println("Nombres que comiencen con la letra S Tradicional:");

		for (String nombre : nombres) {
			if (nombre.startsWith("S")) {
				nombresComienzanConSTradicional.add(nombre);
			}
		}

		System.out.println("Iteracion Tradicional:");
		for (String nombre : nombresComienzanConSTradicional) {
			System.out.println(nombre);
		}

		System.out.println("Nombres que comiencen con la letra S  Funcional:");
		List<String> nombresComienzanConSFuncional = nombres.stream().filter((e) -> e.startsWith("S"))
				.collect(Collectors.toList());

		System.out.println("Iteracion Funcional:");
		nombresComienzanConSFuncional.forEach((e) -> System.out.println(e));

	}

}
