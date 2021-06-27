package com.educacionIT.javase.principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {

		System.out.println("Incio del Programa Basico de Java con SQL Preparado");

		// insertamos registros
		insertar();

		// Buscar por patente
		// es de suponer que solo deberiamos colocar en el string un numero de patente
		// pero podemos colocar nuestro codigo malicioso
		// CON EL OR '' = ' completaremos el SQL para no devuelva un solo registro sino
		// todos los registros
		// CON la declaracion Preparada todo el String lo tomara como el dato a insertar
		// en la patente
		String patente = "ABC-001' OR '' = '";
		buscarPorPatente(patente);

		// seleccionamos registros

		seleccionar();

		// actualizamos registros
		System.out.println(actualizar() == 1 ? "Se actualizo Correctamente" : "No se actualizaron Registros");

		// seleccionamos registros
		seleccionar();

		// eliminamos registros
		System.out.println(eliminar() == 1 ? "Se Elimino Correctamente" : "No se eliminaron Registros");

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

	private static int actualizar() {
		int patenteActivaValorNuevo = 1;
		int patenteActivaValorAnterior = 0;

		try (Connection conexion = conectarBaseDeDatos()) {
			// CREAMOS NUESTRO QUERY SQL
			String sql = "UPDATE autoFamiliar SET patenteActiva = ? WHERE patenteActiva = ?;";

			// CREAMOS NUESTRO OBJETO PreparedStatement
			PreparedStatement declaracionPreparadaSQL = conexion.prepareStatement(sql);

			// ESTABLECEMOS LOS VALORES DE LOS PARAMETROS
			declaracionPreparadaSQL.setInt(1, patenteActivaValorNuevo);
			declaracionPreparadaSQL.setInt(2, patenteActivaValorAnterior);

			// EJECUTAMOS EL SQL
			return declaracionPreparadaSQL.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	private static int insertar() {

		try (Connection conexion = conectarBaseDeDatos()) {
			// CREAMOS NUESTRO QUERY SQL
			String sql = "INSERT INTO autoFamiliar (patenteNumero, patenteActiva, marca, categoria, color, puestos) "
					+ "VALUES  (?, ?, ?, ?, ?, ?);";

			// CREAMOS NUESTRO OBJETO PreparedStatement
			PreparedStatement declaracionPreparadaSQL = conexion.prepareStatement(sql);

			// ESTABLECEMOS LOS VALORES DE LOS PARAMETROS
			declaracionPreparadaSQL.setString(1, "ABC-002");
			declaracionPreparadaSQL.setBoolean(2, true);
			declaracionPreparadaSQL.setString(3, "Ford");
			declaracionPreparadaSQL.setString(4, "COMPACTO");
			declaracionPreparadaSQL.setString(5, "AZUL");
			declaracionPreparadaSQL.setInt(6, 4);

			// EJECUTAMOS EL SQL
			return declaracionPreparadaSQL.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	private static int eliminar() {

		try (Connection conexion = conectarBaseDeDatos()) {

			// CREAMOS NUESTRO QUERY SQL
			String sql = "DELETE FROM autoFamiliar WHERE patenteActiva = ?;";

			// CREAMOS NUESTRO OBJETO PreparedStatement
			PreparedStatement declaracionPreparadaSQL = conexion.prepareStatement(sql);

			// ESTABLECEMOS LOS VALORES DE LOS PARAMETROS
			declaracionPreparadaSQL.setInt(1, 1);

			// EJECUTAMOS EL SQL
			return declaracionPreparadaSQL.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	private static void seleccionar() {

		try (Connection conexion = conectarBaseDeDatos()) {
			// CREAMOS NUESTRO QUERY SQL
			String sql = "SELECT patenteNumero, patenteActiva, marca, categoria, color, puestos FROM autoFamiliar;";

			// CREAMOS NUESTRO OBJETO PreparedStatement
			PreparedStatement declaracionPreparadaSQL = conexion.prepareStatement(sql);

			// OBTENEMOS EL CONJUNTO DE RESULTADOS
			ResultSet resultado = declaracionPreparadaSQL.executeQuery();

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

	private static void buscarPorPatente(String patente) {
		System.out.println("Buscar solo por patente...");
		try (Connection conexion = conectarBaseDeDatos()) {
			// CREAMOS NUESTRO QUERY SQL
			String sql = "SELECT patenteNumero, patenteActiva, marca, categoria, color, puestos FROM autoFamiliar WHERE patenteNumero = ?;";

			// CREAMOS NUESTRO OBJETO Statement
			PreparedStatement declaracionPreparadaSQL = conexion.prepareStatement(sql);

			// ESTABLECEMOS LOS VALORES DE LOS PARAMETROS
			declaracionPreparadaSQL.setString(1, patente);

			// OBTENEMOS EL CONJUNTO DE RESULTADOS
			ResultSet resultado = declaracionPreparadaSQL.executeQuery();

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
		System.out.println("Fin de buscar solo por patente...");

	}
}
