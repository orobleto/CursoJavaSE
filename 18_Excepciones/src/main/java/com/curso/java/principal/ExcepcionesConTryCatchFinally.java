/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.principal;

import javax.swing.JOptionPane;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 18_Excepciones
 * @class ExcepcionesConTryCatchFinally
 * @description
 * @date 19 jun. 2020
 */
public class ExcepcionesConTryCatchFinally {

	public static void main(String[] args) {

		char operador = '/';
		int numero1, numero2;
		int resultado = 2;

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
			try {
				resultado = numero1 / numero2;
			} catch (ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "No se debe dividir por Cero");
			} finally {
				System.out.println("Dividir numeros");
			}
			break;
		}

		JOptionPane.showMessageDialog(null, resultado);
	}
}
