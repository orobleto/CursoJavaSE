package com.educacionIT.javase.principal;

import com.educacionIT.javase.entidades.Auto;

/**
 * @author EducacionIT
 * @class Auto
 * @date 10 jun. 2020
 *
 */
public class App {
	static String version;
	
	static {
		version = "V 1.0";
		System.out.println("Asignacion de valores antes de iniciar");
	}
	
	public static void main(String[] args) {
		// creamos o instanciamos los objetos
		Auto auto1 = new Auto();

		// le damos valores a los atributos del auto 1 a traves de sus metodos
		auto1.setColor("Rojo");
		auto1.setMarca("Ferrari");
		auto1.setPatente("ABC-188");

		// Encendemos el Auto1
		auto1.setEncendido(true);

		// le damos valores a los atributos del auto 2
		Auto auto2 = new Auto("Plateado", "Audi", "ZBG-999", true);

		// Apagamos el Auto2
		auto2.setEncendido(false);

		// mostramos en consola el mensaje
		System.out.println("La patente del Auto1 es :" + auto1.getPatente());
		System.out.println("La patente del Auto2 es :" + auto2.getPatente());

		// mostrmos sus atributos
		System.out.println(auto1.mostrarDatos());
		System.out.println(auto2.mostrarDatos());

		Auto.setConcesionaria("Autos Argentina S.A");
		// mostrmos sus atributos
		System.out.println(auto1.mostrarDatos());
		System.out.println(auto2.mostrarDatos());
	}
}
