package com.educacionIT.javase.principal.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import com.educacionIT.javase.entidades.Auto;
import com.educacionIT.javase.entidades.Carga;
import com.educacionIT.javase.entidades.Familiar;
import com.educacionIT.javase.entidades.Pasajeros;
import com.educacionIT.javase.entidades.Patente;
import com.educacionIT.javase.enumerados.Colores;

public class ObjetosPropiosLinkedHashSet {

	public static void main(String[] args) {

		// declaramos e instanciamos los objetos
		Familiar autoFamiliar = new Familiar(Colores.MARRON, "Audi", new Patente("ZBG-999", true), 6, "SEDAN");

		Pasajeros transportePasajeros = new Pasajeros(Colores.AMARILLO, "Mercedes Benz", new Patente("CAM-7896", true),
				24, "46873132ANSJ", "BUS", true);

		Carga transporteCarga = new Carga(Colores.NEGRO, "Tata", new Patente("ARG-32169", false), 2, "65432132DNK35463",
				"REMOLQUE", 8.5F, 6);

		// declaramos la coleccion y le agregamos los elementos
		Set<Auto> autos = new LinkedHashSet<>();
		autos.add(autoFamiliar);
		autos.add(transportePasajeros);
		autos.add(transporteCarga);

		System.out.println("Todos los elementos:");
		for (Auto auto : autos) {
			System.out.println(auto);
		}

		Iterator<Auto> iterador = autos.iterator();

		System.out.println("Sin la Marca Audi");
		while (iterador.hasNext()) {
			Auto auto = iterador.next();

			if (auto.getMarca().equals("Audi")) {
				iterador.remove();
			}
		}

		for (Auto auto : autos) {
			System.out.println(auto);
		}

	}

}
