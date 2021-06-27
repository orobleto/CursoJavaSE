package com.educacionIT.javase.principal.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ObjetosBasicosArrayDeque {

	public static void main(String[] args) throws InterruptedException {

		// como cola
		Queue<String> nombresA = new ArrayDeque<>();

		System.out.println("ArrayDeque con Metodos de Queue");

		// Agregar elementos
		nombresA.add("Mariana");
		nombresA.add("Analia");
		nombresA.add("Octavio");

		// devuelve el elemento al principio de la cola
		System.out.println(nombresA.element());

		// Agrega el elemento al principio de la cola
		nombresA.offer("Sabrina");

		System.out.println(nombresA);

		while (!nombresA.isEmpty()) {
			// Devuelve el elemento al principio de la cola
			System.out.println(nombresA.peek());

			// Devuelve y remueve el elemento que se encuentre al principio de la cola
			System.out.println(nombresA.poll());
		}

		// como cola o pila
		Deque<String> nombresB = new ArrayDeque<>();
		System.out.println("ArrayDeque con Metodos de Deque");

		// Agregar elementos
		nombresB.add("Mariana");
		nombresB.add("Analia");
		nombresB.add("Octavio");

		// devuelve el elemento al principio de la cola
		System.out.println(nombresB.element());

		// Agrega el elemento al principio de la cola
		nombresB.offerFirst("Sabrina");

		// Agrega el elemento al final de la cola
		nombresB.offerLast("Sebastian");

		System.out.println(nombresB);

		while (!nombresB.isEmpty()) {

			// Devuelve el elemento al principio de la cola
			System.out.println(nombresB.peekFirst());

			// Devuelve y remueve el elemento que se encuentre al principio de la cola
			System.out.println(nombresB.pollFirst());
		}

		// como cola o pila
		Deque<String> nombresC = new ArrayDeque<>();
		System.out.println("ArrayDeque con Metodos de Deque");

		// Agregar elementos
		nombresC.add("Mariana");
		nombresC.add("Analia");
		nombresC.add("Octavio");

		// devuelve el elemento al principio de la cola
		System.out.println(nombresC.element());

		// Agrega el elemento al principio de la cola
		nombresC.offerFirst("Sabrina");

		// Agrega el elemento al final de la cola
		nombresC.offerLast("Sebastian");

		System.out.println(nombresC);

		while (!nombresC.isEmpty()) {

			// Devuelve el elemento al principio de la pila
			System.out.println(nombresC.peekLast());

			// Devuelve y remueve el elemento que se encuentre al principio de la pila
			System.out.println(nombresC.pollLast());
		}

	}

}
