package com.educacionIT.javase.principal.queue;

import java.util.PriorityQueue;
import java.util.Queue;

import com.educacionIT.javase.comparadores.OrdenAutoMarca;
import com.educacionIT.javase.entidades.Auto;
import com.educacionIT.javase.entidades.Carga;
import com.educacionIT.javase.entidades.Familiar;
import com.educacionIT.javase.entidades.Pasajeros;
import com.educacionIT.javase.entidades.Patente;
import com.educacionIT.javase.enumerados.Colores;

public class ObjetosPropiosPriorityQueue {
	public static void main(String[] args) {

		// declaramos e instanciamos los objetos
		Familiar autoFamiliar = new Familiar(Colores.MARRON, "Audi", new Patente("ZBG-999", true), 6, "SEDAN");

		Pasajeros transportePasajeros = new Pasajeros(Colores.AMARILLO, "Mercedes Benz", new Patente("CAM-7896", true),
				24, "46873132ANSJ", "BUS", true);

		Carga transporteCarga = new Carga(Colores.NEGRO, "Tata", new Patente("ARG-32169", false), 2, "65432132DNK35463",
				"REMOLQUE", 8.5F, 6);

		OrdenAutoMarca ordenAlternativo = new OrdenAutoMarca();
		// declaramos la coleccion y le agregamos los elementos
		Queue<Auto> autos = new PriorityQueue<>(ordenAlternativo);

		// agregar elementos con los metodos de Collection
		autos.add(autoFamiliar);
		autos.add(transporteCarga);

		// agregar elelemtnos con los metodos de Queue
		autos.offer(transportePasajeros);

		System.out.println(autos);

		while (!autos.isEmpty()) {

			// Devuelve el elemento al principio de la pila
			System.out.println(autos.peek());

			// Devuelve y remueve el elemento que se encuentre al principio de la pila
			System.out.println(autos.poll());
		}

	}
}
