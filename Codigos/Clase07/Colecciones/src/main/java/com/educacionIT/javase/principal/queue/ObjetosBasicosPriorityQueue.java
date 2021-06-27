package com.educacionIT.javase.principal.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ObjetosBasicosPriorityQueue {

	public static void main(String[] args) throws InterruptedException {

		Queue<String> nombres = new PriorityQueue<>();

		System.out.println("ArrayDeque con Metodos de Collection");

		// Agregar elementos
		nombres.add("Mariana");
		nombres.add("Analia");
		nombres.add("Octavio");

		// devuelve el elemento al principio de la cola
		System.out.println(nombres.element());

		// Agrega el elemento al principio de la cola
		nombres.offer("Sabrina");

		while (!nombres.isEmpty()) {
			// Devuelve el elemento al principio de la cola
			System.out.println(nombres.peek());

			// Devuelve y remueve el elemento que se encuentre al principio de la cola
			System.out.println(nombres.poll());
		}

	}

}
