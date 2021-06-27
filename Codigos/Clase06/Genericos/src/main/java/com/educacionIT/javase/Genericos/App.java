package com.educacionIT.javase.Genericos;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		GenericaDosAtributos<Integer, Integer> telefono = new GenericaDosAtributos<>();
		GenericaDosAtributos<String, Integer> documento = new GenericaDosAtributos<>();
		GenericaDosAtributos<String, String> direccion = new GenericaDosAtributos<>();

		telefono.setCodigo(50);
		telefono.setNumero(50124478);

		documento.setCodigo("DNI");
		documento.setNumero(95853000);

		direccion.setCodigo("CABA");
		direccion.setNumero("Villa del Parque");

	}
}
