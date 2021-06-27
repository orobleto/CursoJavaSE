package com.educacionIT.javase.principal.map;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ObjetosBasicosLinkedHashMap {
	public static void main(String[] args) {
		Map<Integer, String> nombres = new LinkedHashMap<>();
		AbstractMap<Integer, String> nombresA = new LinkedHashMap<>();

		// agrega objetos al mapa

		nombres.put(2, "Mariana");
		nombres.put(4, "Sebastian");
		nombres.put(5, "Sabrina");
		nombres.put(1, "Octavio");
		nombres.put(3, "Analia");

		// agregar clave duplicada al mapa
		nombres.put(5, "Macarena");

		// Devuelve el valor asiganado a la clave
		System.out.println(nombres.get(2));

		// Mostrar los objetos en una coleccion
		System.out.println(nombres.values());

		// Agregar los valores de un mapa a una coleccion
		Collection<String> nombresB = nombres.values();

		// imprimimos la coleccion
		System.out.println(nombresB);

		// Agregar un mapa en otro mapa
		nombresA.putAll(nombres);

		// Mostrar si el mapa esta vacio o sin elementos
		System.out.println(nombres.isEmpty());

		// Longitud o tamaño del mapa
		System.out.println(nombres.size());

		// Contiene Clave
		System.out.println(nombres.containsKey(2));

		// Contiene Objeto
		System.out.println(nombres.containsValue("Sabrina"));

		// Devuelve un set
		System.out.println(nombres.entrySet());

		// Elimina un Objeto por su clave
		System.out.println(nombres.remove(4));

		// Devuelve las claves del mapa en una coleccion Set
		System.out.println(nombres.keySet());

		Iterator<Integer> iterador = nombres.keySet().iterator();

		// ciclamos el iterador y aprovechamos la clave para obtener el valor en el mapa
		while (iterador.hasNext()) {
			Integer auxiliar = iterador.next();
			System.out.println("[Clave: " + auxiliar + ", Valor: " + nombres.get(auxiliar) + "]");
		}

		// ciclamos el Map.Entry para poder recorrer el mapa y poder reemplazar segun
		// alguna condicion
		for (Entry<Integer, String> entrySet : nombres.entrySet()) {
			Integer clave = entrySet.getKey();
			String valor = entrySet.getValue();
			System.out.println(clave + "  ->  " + valor);
			if (valor.equals("Macarena")) {
				System.out.println("Reemplazado: " + entrySet.setValue("Macarena"));

			}
		}

		// Eliminar todos los objetos y sus claves del mapa
		nombres.clear();

	}
}
