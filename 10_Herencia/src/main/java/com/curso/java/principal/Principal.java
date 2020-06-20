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
 * @project 08_Metodos
 * @class Principal
 * @description
 * @date 10 jun. 2020
 */
public class Principal {

	public static void main(String[] args) {

		// creamos o instanciamos los objetos
		Auto auto1 = new Auto();
		Compacto compacto1 = new Compacto("Azul", "Ford", "ANZ-963", true, 3);
		Camion camion1 = new Camion("Verde", "Mercedes Benz", "CAM-7896", false, 16, true);
		Compacto compacto2 = new Compacto();

		// le damos valores a los atributos del auto 1
		auto1.setColor("Rojo");
		auto1.setMarca("Ferrari");
		auto1.setPatente("ABC-188");

		// le damos valores a los atributos del compacto 2
		compacto2.setColor("Azul");
		compacto2.setMarca("Mercedes Benz");
		compacto2.setPatente("COM-89655");
		compacto2.setPuestos(8);

		// Encendemos el Auto en true y apagamos el Auto en false
		auto1.encendido(true);

		auto1.mostrarDatos();
		compacto1.mostrarDatos();
		compacto2.mostrarDatos();
		camion1.mostrarDatos();


	}

}
