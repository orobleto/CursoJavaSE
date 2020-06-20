/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 18_Excepciones
 * @class ExcepcionesVerificadasConThrows
 * @description
 * @date 19 jun. 2020
 */
public class ExcepcionesVerificadasConThrows {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		FileReader archivo = new FileReader(new File("datos.txt"));
		BufferedReader lector = new BufferedReader(archivo);
		String linea = lector.readLine();
		while (linea != null) {
			System.out.println(linea);
			linea = lector.readLine();

			lector.close();
			archivo.close();
		}
		System.out.println("Fin del Programa");
	}
}
