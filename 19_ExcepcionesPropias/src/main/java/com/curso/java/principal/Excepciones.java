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
		String[] diasSemana = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		int diaSemanaNumero = -3;
		String mensaje;
		switch (diaSemanaNumero) {
		case 1:
			mensaje = diasSemana[0];
			break;
		case 2:
			mensaje = diasSemana[1];
			break;
		case 3:
			mensaje = diasSemana[2];
			break;
		case 4:
			mensaje = diasSemana[3];
			break;
		case 5:
			mensaje = diasSemana[4];
			break;
		case 6:
			mensaje = diasSemana[5];
			break;
		case 7:
			mensaje = diasSemana[6];
			break;
		default:
			try {
				if (diaSemanaNumero < 0) {
					throw new ExcepcionesSemana(1);
				} else {
					throw new ExcepcionesSemana(2);
				}

			} catch (ExcepcionesSemana e) {
				mensaje = e.getMessage();
			}
		}

		JOptionPane.showMessageDialog(null, mensaje);

	}

}
