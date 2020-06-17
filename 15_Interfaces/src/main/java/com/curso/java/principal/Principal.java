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
 * @project 15_Interfaces
 * @class Principal
 * @description 
 * @date 17 jun. 2020
 */
public class Principal {

	public static void main(String[] args) {

		// creamos o instanciamos los objetos
		Compacto compacto1 = new Compacto("Azul", "Ford", "ANZ-963", true, 3);
		Camion camion1 = new Camion("Verde", "Mercedes Benz", "CAM-7896", false, 16, true);
		Compacto compacto2 = new Compacto();

		// le damos valores a los atributos del compacto 2
		compacto2.setColor("Azul");
		compacto2.setMarca("Mercedes Benz");
		compacto2.setPatente("COM-89655");
		compacto2.setPuestos(8);

		compacto1.mostrarDatos();
		compacto2.mostrarDatos();
		camion1.mostrarDatos();
		
		// Uso de los metods abstractos de la interface heredados de la clase Auto
		compacto1.lavarMotor(false);
		camion1.lavarChasis();

		// Uso de las constantesde la interface sin instanciar el objeto de Auto
		System.out.println("Cantidad de Lavados del Camion" + Auto.CANTIDAD_LAVADOS_CAMION_MES);
		System.out.println("Cantidad de Lavados del Compacto" + Auto.CANTIDAD_LAVADOS_COMPACTO_MES);

	}

}
