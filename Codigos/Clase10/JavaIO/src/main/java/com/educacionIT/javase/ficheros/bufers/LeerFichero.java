package com.educacionIT.javase.ficheros.bufers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) {
		System.out.println("Inicio del Programa");
		// Constante que define donde se encuentran los archivos
		final String DIRECTORIO = "C:" + File.separator + "Ficheros" + File.separator;

		// se declaran e instancias los ficheros
		File archivoLectura = new File(DIRECTORIO + "ArchivoLectura.txt");
		// declaramos e instanciamos el objeto que leera el archivo aprovechando el
		// try-with-resources

		// el constructor espera un objeto Reader
		try (BufferedReader leerFichero = new BufferedReader(new FileReader(archivoLectura))) {
			// al tratar de leer el archivo el metodo read retornara la cadena de caracteres
			// correspondientes de lo contrario retornara null si llego al final de la
			// lectura
			String mensaje = null;

			// preguntamos si el archivo esta listo para la lectura
			if (leerFichero.ready()) {
				while ((mensaje = leerFichero.readLine()) != null) {
					System.out.println(mensaje);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Fin del Programa");

	}

}
