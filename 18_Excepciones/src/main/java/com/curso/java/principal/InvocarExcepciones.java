package com.curso.java.principal;

import javax.swing.JOptionPane;

/**
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 18_Excepciones
 * @class InvocarExcepciones
 * @description
 * @date 18/09/2020
 */
public class InvocarExcepciones {

	public static void main(String[] args) throws Exception {

		int numero = -2;

		if (numero > 0) {
			JOptionPane.showMessageDialog(null, "El numero es Positivo");
		} else {
			// invocamos la excepcion
			throw new Exception("El numero es negativo");
		}

	}

}
