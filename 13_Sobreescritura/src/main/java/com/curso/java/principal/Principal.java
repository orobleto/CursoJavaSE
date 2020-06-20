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
		Compacto compacto1 = new Compacto(3, "Azul", "Ford", "ANZ-963", true);
		Camion camion1 = new Camion(16, true, "Verde", "Mercedes Benz", "CAM-7896", false);

		// le damos valores a los atributos del auto 1
		auto1.setColor("Rojo");
		auto1.setMarca("Ferrari");
		auto1.setPatente("ABC-188");

		// Encendemos el Auto en true y apagamos el Auto en false
		auto1.encendido(true);

		auto1.mostrarDatos();
		compacto1.mostrarDatos();
		camion1.mostrarDatos();

	}

}
