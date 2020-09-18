/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.principal;

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
 * @date 18/09/2020
 */
public class ExcepcionesVerificadasConTryCatchFinally {

	public static void main(String[] args) {
		// lo declaramos para que el finally tenga alcance del objeto
		FileReader archivo = null;

		try {
			archivo = new FileReader("datos.txt");

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Archivo no encontrado \n " + e.getMessage() + "\n " + e.toString(),
					"Error", JOptionPane.ERROR_MESSAGE);
		} finally {
			try {
				archivo.close();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "No es posible cerrar los objetos", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}

	}
}
