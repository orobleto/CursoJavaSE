package com.educacionIT.javase.principal;

import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Date;

import com.educacionIT.javase.entidades.Auto;
import com.educacionIT.javase.entidades.Carga;
import com.educacionIT.javase.entidades.Familiar;
import com.educacionIT.javase.entidades.Pasajeros;
import com.educacionIT.javase.entidades.Patente;
import com.educacionIT.javase.enumerados.Colores;
import com.educacionIT.javase.excepciones.ExcepcionAuto;
import com.educacionIT.javase.interfaces.Archivo;
import com.educacionIT.javase.interfaces.MantenimientoPeriodico;

/**
 * @author EducacionIT
 * @class App
 * @date 10 ene. 2021
 *
 */
public class App {

	public static void main(String[] args) {

		System.out.println(InetAddress.getLoopbackAddress());
		// instaNciamos solo los objetos de las clases concretas no de las abstractas
		Familiar autoFamiliar1 = new Familiar();

		// le damos valores a los atributos al autoFamiliar
		autoFamiliar1.setColor(Colores.AZUL);
		autoFamiliar1.setMarca("Mercedes Benz");
		autoFamiliar1.setPatente(new Patente("COM-89655", false));

		// Utilizamos el miembro de clase de la envoltorio Integer, instanciando al
		// objeto con un String
		try {
			autoFamiliar1.setPuestos(Integer.valueOf("H"));
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Menaje del Error: " + e.getMessage());
		} catch (ExcepcionAuto e) { // excepcion por setPuestos
			e.printStackTrace();
		} finally {
			try {
				autoFamiliar1.setPuestos(Integer.valueOf("4"));
			} catch (ExcepcionAuto e) { // excepcion por setPuestos
				e.printStackTrace();
			}
		}

		autoFamiliar1.setCategoria("COMPACTO");

		Familiar autoFamiliar2 = new Familiar(Colores.MARRON, "Audi", new Patente("ZBG-999", true), 6, "SEDAN");

		autoFamiliar2.vender();

		Pasajeros transportePasajeros = new Pasajeros(Colores.AMARILLO, "Mercedes Benz", new Patente("CAM-7896", true),
				24, "46873132ANSJ", "BUS", true);

		transportePasajeros.vender();

		Carga transporteCarga = new Carga(Colores.NEGRO, "Tata", new Patente("ARG-32169", false), 2, "65432132DNK35463",
				"REMOLQUE", 8.5F, 6);

		transporteCarga.vender();

		// mostramos en consola el mensaje
		System.out.println("La patente del autoFamiliar1 es :" + autoFamiliar1.getPatente());
		System.out.println("La patente del autoFamiliar2 es :" + autoFamiliar2.getPatente());
		System.out.println("La patente del transportePasajeros es :" + transportePasajeros.getPatente());
		System.out.println("La patente del transporteCarga es :" + transporteCarga.getPatente());

		// Utilizamos los metodos de las interfaces y utilizamos las constantes
		autoFamiliar1.imprimir("Impresora por defecto");
		autoFamiliar2.guardar(Archivo.PDF);
		transporteCarga.lavar(new Date(), MantenimientoPeriodico.LAVADO_MANUAL);
		transportePasajeros.reparar(new Date(), "Tren Delantero", "Analia Perez");

		// metodos por defecto

		// en este caso el metodo cargar delego a quien lo invoque a tratar o volver a
		// delegar una excepcion de tipo FileNotFoundException
		try {
			autoFamiliar1.cargar("C:/Archivos/auto.pdf");
			autoFamiliar2.cargar("C:/Archivos/auto.pdf");
			transporteCarga.cargar("C:/Archivos/auto.pdf");
			transportePasajeros.cargar("C:/Archivos/auto.pdf");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// metodos estaticos

		System.out.println(Arrays.toString(Archivo.listarImpresoras()));

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

		// Construccion de un Objeto Auto instanciado como alguno de sus hijos

		Auto autoCarga;

		autoCarga = new Carga(Colores.NARANJA, "Mercedez", new Patente("ARG-32165", true), 2, "321D65463DDD", "GRUA",
				9.7F, 8);

		autoCarga.lavar(new Date(), MantenimientoPeriodico.LAVADO_PRESION);

		System.out.println(autoCarga);

		autoCarga = new Familiar(Colores.BLANCO, "FIAT", new Patente("ARG-86132", true), 4, "Compacto");

		autoCarga.lavar(new Date(), MantenimientoPeriodico.LAVADO_TUNEL);

		Familiar autoFamiliar3 = (Familiar) autoCarga;

		System.out.println(autoCarga);

		System.out.println(autoFamiliar3);

	}
}
