package com.educacionIT.javase.principal.queue;

import java.util.ArrayDeque;

import com.educacionIT.javase.entidades.Auto;
import com.educacionIT.javase.entidades.Carga;
import com.educacionIT.javase.entidades.Familiar;
import com.educacionIT.javase.entidades.Pasajeros;
import com.educacionIT.javase.entidades.Patente;
import com.educacionIT.javase.enumerados.Colores;

public class ObjetosPropiosArrayDeque {
	public static void main(String[] args) {

		boolean trabajarComoPila = false;
		// declaramos e instanciamos los objetos
		Familiar autoFamiliar = new Familiar(Colores.MARRON, "Audi", new Patente("ZBG-999", true), 6, "SEDAN");

		Pasajeros transportePasajeros = new Pasajeros(Colores.AMARILLO, "Mercedes Benz", new Patente("CAM-7896", true),
				24, "46873132ANSJ", "BUS", true);

		Carga transporteCarga = new Carga(Colores.NEGRO, "Tata", new Patente("ARG-32169", false), 2, "65432132DNK35463",
				"REMOLQUE", 8.5F, 6);

		// declaramos la coleccion y le agregamos los elementos
		ArrayDeque<Auto> autos = new ArrayDeque<>();

		// agregar elementos con los metodos de Collection
		autos.add(autoFamiliar);

		// agregar elelemtnos con los metodos de Deque
		autos.offerFirst(transportePasajeros);
		autos.offerLast(transporteCarga);

		System.out.println(autos);
		if (trabajarComoPila) {
			while (!autos.isEmpty()) {

				// Devuelve el elemento al principio de la pila
				System.out.println(autos.peekLast());

				// Devuelve y remueve el elemento que se encuentre al principio de la pila
				System.out.println(autos.pollLast());
			}
		} else {// como cola
			while (!autos.isEmpty()) {

				// Devuelve el elemento al principio de la cola
				System.out.println(autos.peekFirst());

				// Devuelve y remueve el elemento que se encuentre al principio de la cola
				System.out.println(autos.pollFirst());
			}
		}

	}
}
