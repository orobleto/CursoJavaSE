package com.educacionIT.javase.principal.set;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ObjetosBasicosLinkedHashSet {

	public static void main(String[] args) {

		AbstractSet<String> nombres = new LinkedHashSet<>();
		Set<String> nombresA = new LinkedHashSet<>();
		HashSet<String> nombresB = new LinkedHashSet<>();

		// Agregar elementos
		nombresA.add("Mariana");
		nombresA.add("Analia");
		nombresB.add("Octavio");
		nombresB.add("Jose");

		// elemento duplicado (No se agrega)
		nombresB.add("Jose");

		// Agregar una Coleccion en Otra
		nombres.addAll(nombresA);
		nombres.addAll(nombresB);

		// verificar que contenga el elemento
		System.out.println(nombres.contains("Sabrina"));

		// verificar la coleccion contenga todos los elementos de otra coleccion
		System.out.println(nombres.containsAll(nombresA));

		// verificar si son iguales dos colecciones
		System.out.println(nombresA.equals(nombresB));

		// remover un elemento de la coleccion
		nombres.remove("Mariana");

		// remover los elementos de una coleccion que existan en otra
		nombres.removeAll(nombresA);

		// conocer el tamaño de la coleccion
		System.out.println(nombres.size());

		// recorrer una coleccion
		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		// convertir una coleccion en un arreglo convencional
		Object[] objetos = nombres.toArray();

		for (Object nombre : objetos) {
			System.out.println(nombre);
		}

		String[] arregloNombres = new String[nombres.size()];
		nombres.toArray(arregloNombres);

		for (String nombre : arregloNombres) {
			System.out.println(nombre);
		}

		// iteramos los elementos y evaluamos lo necesario
		Iterator<String> iterador = nombres.iterator();

		while (iterador.hasNext()) {
			String nombre = iterador.next();

			if (nombre.equals("Octavio")) {
				// eliminamos el elemento
				iterador.remove();
			}
		}

		// limpiar la coleccion
		nombres.clear();

		// preguntamos si la coleccion esta vacia
		System.out.println(nombres.isEmpty());

	}

}
