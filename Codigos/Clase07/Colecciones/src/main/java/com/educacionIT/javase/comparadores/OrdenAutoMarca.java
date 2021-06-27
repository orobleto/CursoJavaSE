package com.educacionIT.javase.comparadores;

import java.util.Comparator;

import com.educacionIT.javase.entidades.Auto;

public class OrdenAutoMarca implements Comparator<Auto> {

	@Override
	public int compare(Auto auto1, Auto auto2) {
		return auto1.getMarca().compareTo(auto2.getMarca());
		// return auto1.puestos - auto2.puestos;
	}

}
