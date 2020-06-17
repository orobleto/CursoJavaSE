/**
 * 
 */
package com.curso.java.principal;

import com.curso.java.entidades.Auto;
import com.curso.java.entidades.Camion;
import com.curso.java.entidades.Compacto;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 16_Polimorfismo
 * @class Principal
 * @description 
 * @date 17 jun. 2020
 */
public class Principal {

	public static void main(String[] args) {
		// polimorfismo por asignacion		
		Auto compacto1 = new Compacto("Azul", "Ford", "ANZ-963", true, 3);
		
		compacto1.mostrarDatos();

		// Polimorfismo por sobrecarga
		
		Auto[] estacionamiento = new Auto[2];
		estacionamiento[0] = new Compacto("Rojo", "Daewoo", "XZD-856", true, 3);
		estacionamiento[1] = new Camion("Verde", "Mercedes Benz", "CAM-7896", false, 16, true);

		for (int i = 0; i < estacionamiento.length; i++) {
			estacionamiento[i].mostrarDatos();
		}

	}

}
