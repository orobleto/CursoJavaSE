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

import javax.swing.JOptionPane;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 18_Excepciones
 * @class ExcepcionesVerificadasConTryCatchFinally
 * @description
 * @date 19 jun. 2020
 */
public class ExcepcionesVerificadasConTryCatchFinally {

	public static void main(String[] args) {
		try {
			FileReader archivo = new FileReader(new File("datos.txt"));
			BufferedReader lector = new BufferedReader(archivo);
			String linea = lector.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = lector.readLine();
			}
			lector.close();
			archivo.close();
		} catch (FileNotFoundException e) {
			String mensaje = "Archivo no encontrado \n " + e.getMessage() + "\n " + e.toString();
			JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No existe información en el archivo", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}
}
