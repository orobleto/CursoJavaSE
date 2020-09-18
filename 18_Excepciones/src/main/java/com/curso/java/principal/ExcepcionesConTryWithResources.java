package com.curso.java.principal;

import java.io.FileReader;

import javax.swing.JOptionPane;

/**
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 18_Excepciones
 * @class ExcepcionesConTryWithResources
 * @description
 * @date 18/09/2020
 */
public class ExcepcionesConTryWithResources {

	/**
	 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
	 * @date 18/09/2020
	 * @description
	 * @param args
	 */
	public static void main(String[] args) {

		// esto cerrara automaticamente del recurso
		try (FileReader archivo = new FileReader("datos.txt")) {

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

}
