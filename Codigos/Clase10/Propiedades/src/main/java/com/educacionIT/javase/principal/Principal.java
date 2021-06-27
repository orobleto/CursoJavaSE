package com.educacionIT.javase.principal;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class Principal {
	public static void main(String[] args) {
		// instanciamos el objeto
		Properties propiedades = new Properties();
		try {

			// cargamos el archivo utilizando la ruta relativa donde esta el proyecto
			propiedades.load(new FileInputStream("src/database.properties"));

			// leemos las propiedades
			String driver = propiedades.getProperty("db.driver");
			String url = propiedades.getProperty("db.url");
			String user = propiedades.getProperty("db.user", "root");
			String pass = propiedades.getProperty("db.pass");

			System.out.println("El driver es: " + driver);
			System.out.println("La url es: " + url);
			System.out.println("El usuario es: " + user);
			System.out.println("La clave es: " + pass);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
