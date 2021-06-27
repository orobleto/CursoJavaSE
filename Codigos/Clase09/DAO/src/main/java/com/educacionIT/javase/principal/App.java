package com.educacionIT.javase.principal;

import java.util.List;

import com.educacionIT.javase.entidades.Auto;
import com.educacionIT.javase.entidades.Carga;
import com.educacionIT.javase.entidades.Familiar;
import com.educacionIT.javase.entidades.Pasajeros;
import com.educacionIT.javase.entidades.Patente;
import com.educacionIT.javase.enumerados.Colores;
import com.educacionIT.javase.excepciones.ExcepcionAuto;
import com.educacionIT.javase.implementaciones.mariaDB.FamiliarImpl;

/**
 * @author EducacionIT
 * @class App
 * @date 10 ene. 2021
 *
 */
public class App {

	public static void main(String[] args) {

		System.out.println("Inicio de Programa");
		// instanciamos solo los objetos de las clases concretas no de las abstractas
		Familiar autoFamiliar1 = new Familiar();

		// le damos valores a los atributos al autoFamiliar
		autoFamiliar1.setColor(Colores.AZUL);
		autoFamiliar1.setMarca("Mercedes Benz");
		autoFamiliar1.setPatente(new Patente("COM-89655", false));
		autoFamiliar1.setCategoria("COMPACTO");
		try {
			autoFamiliar1.setPuestos(4);
		} catch (ExcepcionAuto e) {
			e.printStackTrace();
		}

		Familiar autoFamiliar2 = new Familiar(Colores.MARRON, "Audi", new Patente("ZBG-999", true), 6, "SEDAN");

		Pasajeros transportePasajeros = new Pasajeros(Colores.AMARILLO, "Mercedes Benz", new Patente("CAM-7896", true),
				24, "46873132ANSJ", "BUS", true);

		Carga transporteCarga = new Carga(Colores.NEGRO, "Tata", new Patente("ARG-32169", false), 2, "65432132DNK35463",
				"REMOLQUE", 8.5F, 6);

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

		// Construccion de un Objeto Auto instanciado como alguno de sus hijos

		Auto autoCarga;

		autoCarga = new Carga(Colores.NARANJA, "Mercedez", new Patente("ARG-32165", true), 2, "321D65463DDD", "GRUA",
				9.7F, 8);

		System.out.println(autoCarga);

		autoCarga = new Familiar(Colores.BLANCO, "FIAT", new Patente("ARG-86132", true), 4, "Compacto");

		Familiar autoFamiliar3 = (Familiar) autoCarga;

		System.out.println(autoCarga);

		System.out.println(autoFamiliar3);

		// creamos el objeto que transfiere la informacion entre nuestro software y la
		// base de datos

		FamiliarImpl familiarImpl = new FamiliarImpl();

		// insertamos el objeto
		familiarImpl.insertar(autoFamiliar1);

		// lo buscamos en la base de datos
		Familiar autoFamiliarAuxiliar = familiarImpl.buscarPorID("COM-89655");

		// cambiamos atributos y lo actualizamos en la base de datos
		autoFamiliarAuxiliar.setMarca("TATA");

		familiarImpl.actualizar(autoFamiliarAuxiliar);

		// listamos los objetos de la base de datos y los recorremos
		List<Familiar> listaFamiliar = familiarImpl.listar();

		for (Familiar familiar : listaFamiliar) {
			System.out.println(familiar);
		}

		// eliminamos el objeto
		familiarImpl.eliminar(autoFamiliar1);

		System.out.println("Fin del Programa");

	}
}
