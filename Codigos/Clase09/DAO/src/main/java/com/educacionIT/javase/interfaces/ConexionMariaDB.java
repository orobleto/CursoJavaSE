package com.educacionIT.javase.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConexionMariaDB {

	default Connection getConexion() {
		Connection aux = null;

		try {
			final String DRIVER = "org.mariadb.jdbc.Driver";
			final String URL = "jdbc:mariadb://localhost:3306/autosEducacionIT";
			final String USER = "root";
			final String PASS = "Surat3c1803";

			Class.forName(DRIVER);
			aux = DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return aux;
	}
}
