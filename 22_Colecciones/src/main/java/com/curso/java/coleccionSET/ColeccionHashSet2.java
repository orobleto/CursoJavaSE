package com.curso.java.coleccionSET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.curso.java.entidades.Usuario;

/**
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 22_Colecciones
 * @class ColeccionSET
 * @description
 * @date 24 jun. 2020
 */
public class ColeccionHashSet2 {

	public static void main(String[] args) {

		// Declaramos la coleccion de tipo Set con Generico Usuario y la instanciamos
		// como HashSet
		Set<Usuario> usuarios = new HashSet<>();
		// preguntamos si la coleccion esta vacia
		System.out.println(usuarios.isEmpty() ? "Coleccion Vacia" : "Coleccion con Objetos");
		// agregamos a los usuarios
		usuarios.add(new Usuario("user1", "user11234"));
		usuarios.add(new Usuario("user2", "user21234"));
		usuarios.add(new Usuario("user3", "user31234"));
		usuarios.add(new Usuario("user4", "user41234"));
		usuarios.add(new Usuario("user1", "user11234"));

		// preguntamos si la coleccion esta vacia
		System.out.println(usuarios.isEmpty() ? "Coleccion Vacia" : "Coleccion con Objetos");

		System.out.println("Primer recorrido");
		// recorremos la collecion
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}

		// preguntamos si la coleccion esta vacia
		System.out.println(
				usuarios.contains(new Usuario("user2", "user21234")) ? "Contiene el user2" : "No contiene el user2");

		// removemos el user3
		usuarios.remove(new Usuario("user3", "user31234"));

		System.out.println("Segundo recorrido");
		// recorremos la collecion
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}

		// Declaramos un Iterator y lo creamos con el metodo iterator de la coleccion
		Iterator<Usuario> iterador = usuarios.iterator();

		// recorremos la coleccion mientras exista un elemento en el iterador
		while (iterador.hasNext()) {
			// lo asignamos a un objeto auxiliar
			Usuario usuario = iterador.next();

			// preguntamos si existe un user2 y de ser verdadero se elimina
			if (usuario.getUsuario().equals("user2")) {
				// se elimina el objeto de la coleccion
				iterador.remove();
			}
		}

		System.out.println("Tercer recorrido");
		// recorremos la collecion
		for (Usuario usuario : usuarios) {
			System.out.println(usuario);
		}

		// eliminamos todos los elementos de la coleccion
		usuarios.clear();

		// preguntamos si la coleccion esta vacia
		System.out.println(
				usuarios.contains(new Usuario("user2", "user21234")) ? "Contiene el user2" : "No contiene el user2");

	}
}
