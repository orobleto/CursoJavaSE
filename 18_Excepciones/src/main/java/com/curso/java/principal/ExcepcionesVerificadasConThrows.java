/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.principal;

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

	// delegamos la excepciones, en este caso el error no podra ser manejado por el
	// software
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// acceso a un archivo
		FileReader archivo = new FileReader("datos.txt");
		archivo.close();
	}
}
