package com.curso.java.coleccionSET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 22_Colecciones
 * @class ColeccionSET
 * @description
 * @date 24 jun. 2020
 */
public class ColeccionHashSet4 {

	public static void main(String[] args) {

		// Declaramos la coleccion de tipo Set con Generico Usuario y la instanciamos
		// como HashSet
		Set<String> nombres = new HashSet<>();
		// preguntamos si la coleccion esta vacia
		System.out.println(nombres.isEmpty() ? "Coleccion Vacia" : "Coleccion con Objetos");
		// agregamos a los usuarios
		nombres.add("Octavio");
		nombres.add("Mariana");
		nombres.add("Rafael");
		nombres.add("Jose");
		nombres.add("Analia");

		// preguntamos si la coleccion esta vacia
		System.out.println(nombres.isEmpty() ? "Coleccion Vacia" : "Coleccion con Objetos");

		System.out.println("Primer recorrido");
		// recorremos la collecion
		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		// preguntamos si la coleccion esta vacia
		System.out.println(nombres.contains("Rafael") ? "Contiene el Rafael" : "No contiene el Rafael");

		// removemos el Jose
		nombres.remove("Jose");

		System.out.println("Segundo recorrido");
		// recorremos la collecion
		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		// Declaramos un Iterator y lo creamos con el metodo iterator de la coleccion
		Iterator<String> iterador = nombres.iterator();

		// recorremos la coleccion mientras exista un elemento en el iterador
		while (iterador.hasNext()) {
			// lo asignamos a un objeto auxiliar
			String nombre = iterador.next();

			// preguntamos si existe un Mariana y de ser verdadero se elimina
			if (nombre.equals("Mariana")) {
				// se elimina el objeto de la coleccion
				iterador.remove();
			}
		}

		// preguntamos si la coleccion esta vacia
		System.out.println(nombres.contains("Mariana") ? "Contiene el Mariana" : "No contiene el Mariana");

		System.out.println("Tercer recorrido");
		// recorremos la collecion
		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		// eliminamos todos los elementos de la coleccion
		nombres.clear();

	}
}
