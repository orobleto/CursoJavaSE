package com.educacionIT.javase.principal;

import com.educacionIT.javase.entidades.Auto;
import com.educacionIT.javase.entidades.Carga;
import com.educacionIT.javase.entidades.Familiar;
import com.educacionIT.javase.entidades.Pasajeros;
import com.educacionIT.javase.entidades.Patente;

/**
 * @author EducacionIT
 * @class App
 * @date 10 ene. 2021
 *
 */
public class App {

	public static void main(String[] args) {
		// instaNciamos solo los objetos de las clases concretas no de las abstractas
		Familiar autoFamiliar1 = new Familiar();

		// le damos valores a los atributos al autoFamiliar
		autoFamiliar1.setColor("Azul");
		autoFamiliar1.setMarca("Mercedes Benz");
		autoFamiliar1.setPatente(new Patente("COM-89655", false));
		autoFamiliar1.setPuestos(4);
		autoFamiliar1.setCategoria("COMPACTO");

		Familiar autoFamiliar2 = new Familiar("Plateado", "Audi", new Patente("ZBG-999", true), 6, "SEDAN");

		autoFamiliar2.vender();

		Pasajeros transportePasajeros = new Pasajeros("Verde", "Mercedes Benz", new Patente("CAM-7896", true), 24,
				"46873132ANSJ", "BUS", true);

		transportePasajeros.vender();

		Carga transporteCarga = new Carga("Negro", "Tata", new Patente("ARG-32169", false), 2, "65432132DNK35463",
				"REMOLQUE", 8.5F, 6);

		transporteCarga.vender();

		// mostramos en consola el mensaje
		System.out.println("La patente del autoFamiliar1 es :" + autoFamiliar1.getPatente());
		System.out.println("La patente del autoFamiliar2 es :" + autoFamiliar2.getPatente());
		System.out.println("La patente del transportePasajeros es :" + transportePasajeros.getPatente());
		System.out.println("La patente del transporteCarga es :" + transporteCarga.getPatente());

		// imprimimos todos los atributos aprovehcando el toString

		System.out.println(autoFamiliar1);
		System.out.println(autoFamiliar2);
		System.out.println(transportePasajeros);
		System.out.println(transporteCarga);

		Auto.setConcesionaria("Autos Argentina S.A");

		// imprimimos todos los atributos aprovehcando el toString

		System.out.println(autoFamiliar1);
		System.out.println(autoFamiliar2);
		System.out.println(transportePasajeros);
		System.out.println(transporteCarga);

	}
}
