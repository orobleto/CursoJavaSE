package com.educacionIT.javase.principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {

		System.out.println("Incio del Programa Basico de Java con SQL");

		// insertamos registros
		insertar();

		// seleccionamos registros
		seleccionar();

		// actualizamos registros
		actualizar();

		// seleccionamos registros
		seleccionar();

		// eliminamos registros
		eliminar();

		System.out.println("Fin del Programa");

	}

	private static Connection conectarBaseDeDatos() throws SQLException {
		Connection conexion = null;
		try {

			String driver = "org.mariadb.jdbc.Driver";
			String url = "jdbc:mariadb://localhost:3306/autosEducacionIT";
			String usuario = "root";
			String clave = "";
			Class.forName(driver);

			// CREAMOS LA CONEXION
			conexion = DriverManager.getConnection(url, usuario, clave);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conexion;
	}

	private static void actualizar() {

		try (Connection conexion = conectarBaseDeDatos()) {
			// CREAMOS NUESTRO QUERY SQL
			String sql = "UPDATE autoFamiliar SET patenteActiva = 0 WHERE patenteActiva = 1;";

			// CREAMOS NUESTRO OBJETO Statement
			Statement declaracionSQL = conexion.createStatement();

			// EJECUTAMOS EL SQL
			declaracionSQL.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void insertar() {

		try (Connection conexion = conectarBaseDeDatos()) {
			// CREAMOS NUESTRO QUERY SQL
			String sql = "INSERT INTO autoFamiliar (patenteNumero, patenteActiva, marca, categoria, color, puestos) "
					+ "VALUES  ('ABC-001', 1, 'Audi', 'SEDAN', 'MARRON', 6);";

			// CREAMOS NUESTRO OBJETO Statement
			Statement declaracionSQL = conexion.createStatement();

			// EJECUTAMOS EL SQL
			declaracionSQL.execute(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void eliminar() {

		try (Connection conexion = conectarBaseDeDatos()) {
			// CREAMOS NUESTRO QUERY SQL
			String sql = "DELETE FROM autoFamiliar WHERE patenteActiva <> 0;";

			// CREAMOS NUESTRO OBJETO Statement
			Statement declaracionSQL = conexion.createStatement();

			// EJECUTAMOS EL SQL
			declaracionSQL.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void seleccionar() {

		try (Connection conexion = conectarBaseDeDatos()) {
			// CREAMOS NUESTRO QUERY SQL
			String sql = "SELECT patenteNumero, patenteActiva, marca, categoria, color, puestos FROM autoFamiliar;";

			// CREAMOS NUESTRO OBJETO Statement
			Statement declaracionSQL = conexion.createStatement();

			// OBTENEMOS EL CONJUNTO DE RESULTADOS
			ResultSet resultado = declaracionSQL.executeQuery(sql);

			// RECORREMOS EL RESULTADO
			while (resultado.next()) {
				System.out.println(resultado.getString("patenteNumero"));
				System.out.println(resultado.getBoolean("patenteActiva"));
				System.out.println(resultado.getString("marca"));
				System.out.println(resultado.getString("categoria"));
				System.out.println(resultado.getString("color"));
				System.out.println(resultado.getInt("puestos"));
				System.out.println();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
