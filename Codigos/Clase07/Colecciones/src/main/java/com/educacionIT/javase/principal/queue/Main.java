package com.educacionIT.javase.principal.queue;

public class Main {
	public static void main(String[] args) {
		K clave1, clave2, clave3, clave4;
		E elemento1, elemento2, elemento3, elemento4;

		Mapa<E> mapa1 = new Implementacion<>();
		Mapa<E> mapa2 = new Implementacion<>();

		// agrega objetos al mapa
		mapa1.put(clave1, elemento1);
		mapa1.put(clave2, elemento2);
		mapa1.put(clave3, elemento3);
		mapa1.put(clave4, elemento4);

		// Mostrar los objetos en una coleccion
		System.out.println(mapa1.values());

		// Agregar un mapa en otro mapa
		System.out.println(mapa2.putAll(mapa1));

		// Longitud o tamaño del mapa
		System.out.println(mapa1.isEmpty());

		// Longitud o tamaño del mapa
		System.out.println(mapa1.size());

		// Contiene Clave
		System.out.println(mapa1.containsKey(clave1));

		// Contiene Objeto
		System.out.println(mapa1.containsValue(elemento1));

		// Devuelve un set 
		System.out.println(mapa1.entrySet());

		// Elimina un Objeto por su clave 
		System.out.println(mapa1.remove(clave4));


		


		isEmpty()
clear()
size()
put(K key, V value)
putAll(Map<? extends K,? extends V> m)
containsKey(Object key)
containsValue(Object value)
equals(Object o)
hashCode()
remove(Object key)
entrySet()
values()

		// Agrega el elemento al principio de la cola
		coleccion.offerFirst(elemento3);

		// Agrega el elemento al principio de la cola
		coleccion.offerLast(elemento4);
		
		//Trabajar como cola
		while(!coleccion.isEmpty()) {
			// Devuelve el elemento al principio de la cola
			System.out.println(coleccion.peekFirst());

			// Devuelve y remueve el elemento que se encuentre al principio de la cola
			System.out.println(coleccion.pollFirst());	
		}

		//Trabajar como pila
		while(!coleccion.isEmpty()) {
			// Devuelve el elemento al principio de la pila
			System.out.println(coleccion.peekLast());

			// Devuelve y remueve el elemento que se encuentre al principio de la pila
			System.out.println(coleccion.pollLast());	
		}


				// Clase que implementa Comparator
				ComparadorPrioritario comparadorPrioritario =  new ComparadorPrioritario();
		
				// Cola Prioritaria con orden natural
				Queue<String> nombresA = new PriorityQueue<>();
				
				// Cola Prioritaria con orden alternativo 
				PriorityQueue<String> nombresB = new PriorityQueue<>(comparadorPrioritario);


				// como cola
				Queue<String> nombresA = new ArrayDeque<>();

				// como cola o pila
				Deque<String> nombresB = new ArrayDeque<>();

				// como cola o pila
				ArrayDeque<String> nombresC = new ArrayDeque<>();



	}

}
