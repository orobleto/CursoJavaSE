package com.educacionIT.javase.principal.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.educacionIT.javase.entidades.Auto;
import com.educacionIT.javase.entidades.Carga;
import com.educacionIT.javase.entidades.Familiar;
import com.educacionIT.javase.entidades.Pasajeros;
import com.educacionIT.javase.entidades.Patente;
import com.educacionIT.javase.enumerados.Colores;

public class ObjetosPropiosLinkedHashMap {
	public static void main(String[] args) {

		// declaramos e instanciamos los objetos
		Familiar autoFamiliar = new Familiar(Colores.MARRON, "Audi", new Patente("ZBG-999", true), 6, "SEDAN");

		Pasajeros transportePasajeros = new Pasajeros(Colores.AMARILLO, "Mercedes Benz", new Patente("CAM-7896", true),
				24, "46873132ANSJ", "BUS", true);

		Carga transporteCarga = new Carga(Colores.NEGRO, "Tata", new Patente("ARG-32169", false), 2, "65432132DNK35463",
				"REMOLQUE", 8.5F, 6);

		Map<Patente, Auto> autos = new HashMap<>();
		Map<Patente, Auto> autos2 = new HashMap<>();

		// agrega objetos al mapa

		autos.put(autoFamiliar.getPatente(), autoFamiliar);
		autos.put(transportePasajeros.getPatente(), transportePasajeros);
		autos.put(transporteCarga.getPatente(), transporteCarga);

		Familiar autoFamiliar2 = new Familiar(Colores.GRIS, "Audi", new Patente("ZBG-999", true), 6, "DEPORTIVO");
		// agregar clave duplicada al mapa
		autos.put(autoFamiliar2.getPatente(), autoFamiliar2);

		// Devuelve el valor asiganado a la clave
		System.out.println(autos.get(new Patente("ARG-32169", false)));

		// Mostrar los objetos en una coleccion
		System.out.println(autos.values());

		// Agregar los valores de un mapa a una coleccion
		Collection<Auto> autos3 = autos.values();

		// imprimimos la coleccion
		System.out.println(autos3);

		// Agregar un mapa en otro mapa
		autos2.putAll(autos);

		// Mostrar si el mapa esta vacio o sin elementos
		System.out.println(autos.isEmpty());

		// Longitud o tamaño del mapa
		System.out.println(autos.size());

		// Contiene Clave
		System.out.println(autos.containsKey(new Patente("ZBG-999", true)));

		// Contiene Objeto
		System.out.println(autos.containsValue(transporteCarga));

		// Devuelve un set
		System.out.println(autos.entrySet());

		// Elimina un Objeto por su clave
		System.out.println(autos.remove(new Patente("CAM-7896", true)));

		// Devuelve las claves del mapa en una coleccion Set
		System.out.println(autos.keySet());

		Iterator<Patente> iterador = autos.keySet().iterator();

		// ciclamos el iterador y aprovechamos la clave para obtener el valor en el mapa
		while (iterador.hasNext()) {
			Patente patente = iterador.next();
			System.out.println("[Clave: " + patente + ", Valor: " + autos.get(patente) + "]");
		}

		// ciclamos el Map.Entry para poder recorrer el mapa y poder reemplazar segun
		// alguna condicion
		for (Entry<Patente, Auto> entrySet : autos.entrySet()) {
			Patente patente = entrySet.getKey();
			Auto auto = entrySet.getValue();
			System.out.println(patente + "  ->  " + auto);
			if (auto.equals(transportePasajeros)) {
				System.out.println("Reemplazado: " + entrySet.setValue(autoFamiliar));

			}
		}

		// Eliminar todos los objetos y sus claves del mapa
		autos.clear();

	}
}
