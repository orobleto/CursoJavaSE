package com.educacionIT.javase.ficheros.caracter;

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
		try (FileReader leerFichero = new FileReader(archivoLectura)) {
			System.out.println("Codificación de caracteres: " + leerFichero.getEncoding());
			int c;
			// al tratar de leer el fichero el metodo read retornara un numero entero
			// positivo si existe algun caracter de lo contrario si llego al final de la
			// lectura retornara -1

			while ((c = leerFichero.read()) != -1) {
				// debemos hacer un casting ya que el numero que devuelve es una representacion
				// ASCII del caracter
				char caracter = (char) c;
				System.out.print(caracter);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Fin del Programa");

	}

}
