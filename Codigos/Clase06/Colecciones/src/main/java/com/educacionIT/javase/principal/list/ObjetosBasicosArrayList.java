package com.educacionIT.javase.principal.list;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ObjetosBasicosArrayList {

	public static void main(String[] args) {

		AbstractList<String> nombres = new ArrayList<>();
		List<String> nombresA = new ArrayList<>();
		ArrayList<String> nombresB = new ArrayList<>();

		System.out.println("ArrayList con Metodos de Collection");
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

		if (nombres.isEmpty()) {
			// agregamos nuevamente para los nuevos metodos
			nombres.addAll(nombresB);
			nombres.addAll(nombresB);
		}

		System.out.println("ArrayList con Metodos de List y AbstractList");

		// se agrega elemento en los indice
		nombres.add(1, "Lautaro");

		// recorrido de lista con for comun
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}

		// se reemplaza elemento de la lista
		nombres.set(0, "Ariel");

		// se remueve elemento en la posicion indicada, devuelve el elemento eliminado
		System.out.println(nombres.remove(2));

		// devuelve el indice de la primera aparicion de Ariel
		System.out.println(nombres.indexOf("Ariel"));

		// devuelve el indice de la ultima aparicion de Ariel
		System.out.println(nombres.lastIndexOf("Ariel"));

		// creamos una sublista a partir de un rango
		List<String> subLista = nombres.subList(1, 3);

		// creamos un iterador mejorado
		ListIterator<String> iteradorLista = subLista.listIterator();

		// recorrer el iterador
		while (iteradorLista.hasNext()) {
			String nombre = iteradorLista.next();

			if (nombre.equals("Octavio")) {
				// eliminamos el elemento
				iteradorLista.remove();
			}

			if (nombre.equals("Ariel")) {
				// sustituimos el elemento
				iteradorLista.set("Fabian");
			}
		}

		// recorrer el iterador en reversa
		while (iteradorLista.hasPrevious()) {
			String nombre = iteradorLista.previous();

			if (nombre.equals("Fabian")) {
				// eliminamos el elemento
				iteradorLista.add("Laura");
			}
		}

	}

}
