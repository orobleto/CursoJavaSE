package com.curso.java.principal;

import javax.swing.JOptionPane;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 18_Excepciones
 * @class ExcepcionesConError
 * @description
 * @date 19 jun. 2020
 */
public class ExcepcionesConError {

	public static void main(String[] args) {

		char operador = '/';
		int numero1, numero2;
		int resultado = 0;

		numero1 = 10;
		numero2 = 0;
		switch (operador) {
		case '+':
			resultado = numero1 + numero2;
			break;
		case '-':
			resultado = numero1 - numero2;
			break;
		case '*':
			resultado = numero1 * numero2;
			break;
		case '/':
			// aqui se presentara error al dividir por cero
			resultado = numero1 / numero2;
			break;
		}

		JOptionPane.showMessageDialog(null, resultado);
	}
}
