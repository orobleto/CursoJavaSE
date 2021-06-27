package com.educacionIT.javase.ficheros.bufers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

	public static void main(String[] args) {
		System.out.println("Inicio del Programa");
		// Constante que define donde se encuentran los archivos
		final String DIRECTORIO = "C:" + File.separator + "Ficheros" + File.separator;

		final String[] PARRAFO = {
				"El lenguaje de programación Java tiene una filosofía: escribir una vez, ejecutar en cualquier lugar. ",
				"Es un lenguaje moderno y orientado a objetos.\nEs ampliamente utilizado para desarrollar aplicaciones móviles en Android" };

		// se declaran e instancias los ficheros
		File archivoEscritura = new File(DIRECTORIO + "ArchivoEscritura.txt");
		// declaramos e instanciamos el objeto que escribira el archivo aprovechando el
		// try-with-resources
		try (BufferedWriter escribirFichero = new BufferedWriter(new FileWriter(archivoEscritura))) {

			for (String linea : PARRAFO) {
				escribirFichero.write(linea);
				// No todas las plataformas usan el carácter de nueva línea ('\n') para
				// terminar líneas. Por lo tanto, se prefiere llamar a este método para terminar
				// cada línea de salida a escribir un carácter de nueva línea directamente.
				escribirFichero.newLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Fin del Programa");

	}

}
