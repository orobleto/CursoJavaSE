package com.educacionIT.javase.ficheros;

import java.io.File;
import java.io.IOException;

public class Fichero {
	public static void main(String[] args) throws IOException {

		File fichero1 = new File("C:\\Ficheros");
		File fichero2 = new File("C:\\Ficheros\\ArchivoEscritura.txt");
		File fichero3 = new File("C:\\Ficheros", "ArchivoLectura.txt");
		File fichero4 = new File("C:\\Ficheros\\Multimedia");
		File fichero5 = new File("C:\\Ficheros\\profesor.png");

		// invocar metodo para leer los ficheros de un directorio
		imprimirListaFichero(fichero1);

		System.out.println("Separador de ficheros del sistema operativo: " + File.separator);

		System.out.println("El fichero se puede leer?" + fichero1.canRead());
		System.out.println("El fichero se puede escribir?" + fichero1.canWrite());
		System.out.println("El archivo se creo correctamente? " + fichero1.createNewFile());
		System.out.println("Se elimino correctamente el fichero? " + fichero1.delete());
		System.out.println("El fichero existe? " + fichero1.exists());
		System.out.println("Nombre del fichero: " + fichero1.getName());
		System.out.println("Ruta completa del fichero: " + fichero2.getAbsolutePath());
		System.out.println("El fichero es un directorio? " + fichero1.isDirectory());
		System.out.println("El fichero es un archivo? " + fichero3.isFile());
		System.out.println("El fichero esta oculto? " + fichero5.isHidden());
		System.out.println("El Directorio se creo correctamente?" + fichero4.mkdir());

	}

	
	static void imprimirListaFichero(File file) {
		File[] ficheros = file.listFiles();

		for (File fichero : ficheros) {
			System.out.println((fichero.isDirectory() ? "Directorio" : "Archivo") + " -> " + fichero.getAbsolutePath());

			// metodo recursivo para listar si es un directorio lo que estamos leyendo
			if (fichero.isDirectory()) {
				imprimirListaFichero(fichero);
			}
		}

	}
}
