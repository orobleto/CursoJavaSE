package com.educacionIT.javase.principal;

import java.util.Arrays;

import com.educacionIT.javase.enumerados.Colores;

public class AppEnumeradoSwitch {

	public static void main(String[] args) {
		Colores color = Colores.valueOf("NEGRO");
		System.out.println(color.name());
		System.out.println(color.ordinal());
		System.out.println(color.toString());
		System.out.println(Arrays.toString(Colores.values()));

		System.out.println(color.getHEX_CODIGO());
		System.out.println(color.getRGB_CODIGO());

		switch (color) {
		case ROJO:
		case AMARILLO:
		case AZUL:
			System.out.println("Es un color primario tradicional RYB");
			break;
		case NEGRO:
		case MARRON:
		case GRIS:
		case VERDE:
		case NARANJA:
		case ROSA:
		case PURPURA:
		case BLANCO:
			System.out.println("No es un color primario tradicional RYB");
			break;
		default:
			break;
		}
	}

}
