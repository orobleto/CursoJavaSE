package com.educacionIT.javase.interfaces;

public interface Archivo {

	String XLS = "XLS";
	String PDF = "PDF";
	String WORD = "WORD";
	String TXT = "TXT";

	boolean imprimir(String impresora);

	boolean guardar(String tipoArchivo);

	default String cargar(String ruta) {
		return "Se ha cargado el archivo desde la ruta " + ruta;
	}

	static String[] listarImpresoras() {
		String[] lista = { "HP MODEL01", "Canon MODELP11" };
		return lista;
	}
}
