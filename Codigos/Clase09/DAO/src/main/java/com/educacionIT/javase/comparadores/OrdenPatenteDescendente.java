package com.educacionIT.javase.comparadores;

import java.util.Comparator;

import com.educacionIT.javase.entidades.Patente;

public class OrdenPatenteDescendente implements Comparator<Patente> {

	@Override
	public int compare(Patente patente1, Patente patente2) {
		return patente2.getNumero().compareTo(patente1.getNumero());
	}

}
