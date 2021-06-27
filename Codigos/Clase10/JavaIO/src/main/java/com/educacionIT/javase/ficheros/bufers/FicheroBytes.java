package com.educacionIT.javase.ficheros.bufers;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FicheroBytes {

	public static void main(String[] args) {

		System.out.println("Inicio del Programa");
		// Constante que define donde se encuentran los archivos
		final String DIRECTORIO = "C:" + File.separator + "Ficheros" + File.separator + "Directorio Interno"
				+ File.separator;

		// se declaran e instancias los ficheros
		File archivoLectura = new File(DIRECTORIO + "Conoce nuestra plataforma Alumni.mp4");
		File archivoEscritura = new File(DIRECTORIO + "Conoce nuestra plataforma Alumni-copia.mp4");

		if (archivoLectura.exists()) {
			System.out.println(copiar(archivoEscritura, leer(archivoLectura))
					? "Se creo correctamente el archivo en: " + archivoEscritura.getAbsolutePath()
					: "No se pudo crear el archivo...");
		} else {
			System.out.println("El archivo a copiar no existe");
		}

		System.out.println("Fin del Programa");

	}

	static byte[] leer(File fichero) {

		// declaramos e instanciamos el objeto que leera el archivo en bytes
		// aprovechando el
		// try-with-resources
		try (BufferedInputStream archivoBinario = new BufferedInputStream(new FileInputStream(fichero))) {
			return archivoBinario.readAllBytes();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	static boolean copiar(File fichero, byte[] bytes) {
		// declaramos e instanciamos el objeto que creara el archivo aprovechando el
		// try-with-resources
		try (BufferedOutputStream archivoBinario = new BufferedOutputStream(new FileOutputStream(fichero))) {
			archivoBinario.write(bytes);
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
