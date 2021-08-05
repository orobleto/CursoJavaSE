package com.educacionIT.javase.interfaces;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public interface ConexionMariaDB {

	default Connection getConexion() {
		Connection aux = null;

		// instanciamos el objeto
		Properties propiedades = new Properties();
		try {
		
			// cargamos el archivo utilizando la ruta relativa donde esta el proyecto
			propiedades.load(new FileInputStream("resources/database.properties"));
			//propiedades.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("database.properties"));

			// leemos las propiedades
			String DRIVER = propiedades.getProperty("db.driver");
			String URL = propiedades.getProperty("db.url");
			String USER = propiedades.getProperty("db.user", "root");
			String PASS = propiedades.getProperty("db.pass");

			Class.forName(DRIVER);
			aux = DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return aux;
	}
}
