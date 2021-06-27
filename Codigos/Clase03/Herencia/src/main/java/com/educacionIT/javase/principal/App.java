package com.educacionIT.javase.principal;

import com.educacionIT.javase.entidades.Auto;
import com.educacionIT.javase.entidades.Camion;
import com.educacionIT.javase.entidades.Compacto;
import com.educacionIT.javase.entidades.Patente;

/**
 * @author EducacionIT
 * @class Principal
 * @date 10 jun. 2020
 *
 */
public class App {

	public static void main(String[] args) {

		// creamos o instanciamos los objetos con sus constructores simples

		Auto auto1 = new Auto();

		Camion camion1 = new Camion();

		Compacto compacto1 = new Compacto();

		// creamos o instanciamos los objetos con sus constructores con atributos
		// iniciales

		Auto auto2 = new Auto("Plateado", "Audi", new Patente("ZBG-999", true), true);

		Compacto compacto2 = new Compacto("Azul", "Ford", new Patente("ANZ-963", true), true, 3);

		Camion camion2 = new Camion("Verde", "Mercedes Benz", new Patente("CAM-7896", true), false, 16, true);

		// le damos valores a los atributos del auto 1 a traves de sus metodos
		auto1.setColor("Rojo");
		auto1.setMarca("Ferrari");
		auto1.setPatente(new Patente("ABC-188", true));
		auto1.setEncendido(true);

		// Apagamos el Auto2 que instancio con este valor en true
		auto2.setEncendido(false);

		// le damos valores a los atributos del compacto 2
		compacto1.setColor("Azul");
		compacto1.setMarca("Mercedes Benz");
		compacto1.setPatente(new Patente("COM-89655", false));
		compacto1.setPuestos(8);

		// le damos valores a los atributos del camion 2
		camion1.setColor("Negro");
		camion1.setMarca("Tata");
		camion1.setPatente(new Patente("ARG-32169", false));
		camion1.setEjes(16);
		camion1.setDisponible(true);

		// mostramos en consola el mensaje
		System.out.println("La patente del Auto1 es :" + auto1.getPatente());
		System.out.println("La patente del Compacto1 es :" + compacto1.getPatente());
		System.out.println("La patente del Camion es :" + camion1.getPatente());

		// mostramos sus atributos
		System.out.println(auto1.mostrarDatos());
		System.out.println(auto2.mostrarDatos());

		System.out.println(compacto1.mostrarDatos());
		System.out.println(compacto2.mostrarDatos());

		System.out.println(camion1.mostrarDatos());
		System.out.println(camion2.mostrarDatos());

		Auto.setConcesionaria("Autos Argentina S.A");
		// mostrmos sus atributos

		System.out.println(auto1.mostrarDatos());
		System.out.println(auto2.mostrarDatos());

		System.out.println(compacto1.mostrarDatos());
		System.out.println(compacto2.mostrarDatos());

		System.out.println(camion1.mostrarDatos());
		System.out.println(camion2.mostrarDatos());
	}
}
