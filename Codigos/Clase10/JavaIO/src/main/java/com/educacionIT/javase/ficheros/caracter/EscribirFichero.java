package com.educacionIT.javase.ficheros.caracter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

	public static void main(String[] args) {
		System.out.println("Inicio del Programa");
		// Constante que define donde se encuentran los archivos
		final String DIRECTORIO = "C:" + File.separator + "Ficheros" + File.separator;

		final String PARRAFO = "El lenguaje de programación Java tiene una filosofía: escribir una vez, ejecutar en cualquier lugar. \nEs un lenguaje moderno y orientado a objetos.\nEs ampliamente utilizado para desarrollar aplicaciones móviles en Android";

		// se declaran e instancias los ficheros
		File archivoEscritura = new File(DIRECTORIO + "ArchivoEscritura.txt");
		// declaramos e instanciamos el objeto que escribira el archivo aprovechando el
		// try-with-resources

		// El constructor esta sobrecargada para recibir un booleano que indicara si
		// quiere que el archivo escriba desde el principio (borre lo que esta en él si
		// existe dicho archivo) o por el contrario escribir al final de lo que
		// contenga (true). (File file, boolean append)
		try (FileWriter escribirFichero = new FileWriter(archivoEscritura)) {

			// recorremos el String caracter por caracter
			for (int i = 0; i < PARRAFO.length(); i++) {
				escribirFichero.write(PARRAFO.charAt(i));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Fin del Programa");

	}

}
