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
 * @project 19_ExcepcionesPropias
 * @class Excepciones
 * @description
 * @date 19 jun. 2020
 */
public class Excepciones {

	public static void main(String[] args) {

		int diaSemanaNumero = Integer.parseInt(JOptionPane.showInputDialog("Indica un numero de la semana:"));
		// Se le resta un numero ya que los usuarios no deberian poner cero para el
		// primer dia
		diaSemanaNumero--;

		String mensaje = "";
		// Manejamos la excepción
		try {
			mensaje = diaSemana(diaSemanaNumero);
		} catch (ExcepcionSemana e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Debe ingresar un dato numerico", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "Dato no permitido", "Error", JOptionPane.ERROR_MESSAGE);
		}

		JOptionPane.showMessageDialog(null, mensaje);

	}

	// delegamos el manejo de la excepción a quien utilice el método con el throws
	public static String diaSemana(int dia) throws ExcepcionSemana {
		String[] diasSemana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };

		if (dia > 0 && dia < 7) {
			return diasSemana[dia];
		} else {
			// invocamos la excepción
			throw new ExcepcionSemana((dia < 0) ? 1 : 2);
		}

	}

}
