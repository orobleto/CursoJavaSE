package com.educacionIT.javase.implementaciones.mariaDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.educacionIT.javase.entidades.Familiar;
import com.educacionIT.javase.entidades.Patente;
import com.educacionIT.javase.enumerados.Colores;
import com.educacionIT.javase.interfaces.ConexionMariaDB;
import com.educacionIT.javase.interfaces.DAO;

public class FamiliarImpl implements DAO<Familiar, String>, ConexionMariaDB {
	private PreparedStatement psBuscarPorID = null;
	private PreparedStatement psInsertar = null;
	private PreparedStatement psModificar = null;
	private PreparedStatement psEliminar = null;
	private PreparedStatement psListar = null;

	@Override
	public Familiar buscarPorID(String patente) {
		Familiar familiar = null;
		String sql = "SELECT patenteNumero, patenteActiva, marca, categoria, color, puestos FROM autoFamiliar WHERE patenteNumero = ?;";

		try {
			if (null == psBuscarPorID) {
				psBuscarPorID = getConexion().prepareStatement(sql);
			}

			psBuscarPorID.setString(1, patente);
			ResultSet resultado = psBuscarPorID.executeQuery();

			if (resultado.next()) {

				String patenteNumero = resultado.getString("patenteNumero");
				boolean patenteActiva = resultado.getBoolean("patenteActiva");
				String marca = resultado.getString("marca");
				String categoria = resultado.getString("categoria");
				String color = resultado.getString("color");
				int puestos = resultado.getInt("puestos");

				familiar = new Familiar(Colores.valueOf(color), marca, new Patente(patenteNumero, patenteActiva),
						puestos, categoria);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return familiar;
	}

	@Override
	public boolean insertar(Familiar familiar) {

		String sql = "INSERT INTO autoFamiliar (patenteNumero, patenteActiva, marca, categoria, color, puestos) "
				+ "VALUES  (?, ?, ?, ?, ?, ?);";
		try {
			if (null == psInsertar) {
				psInsertar = getConexion().prepareStatement(sql);
			}

			psInsertar.setString(1, familiar.getPatente().getNumero());
			psInsertar.setBoolean(2, familiar.getPatente().isActiva());
			psInsertar.setString(3, familiar.getMarca());
			psInsertar.setString(4, familiar.getCategoria());
			psInsertar.setString(5, familiar.getColor().toString());
			psInsertar.setInt(6, familiar.getPuestos());
			
			System.out.println(psInsertar);
			return (psInsertar.executeUpdate() == 1);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean eliminar(Familiar familiar) {
		String sql = "DELETE FROM autoFamiliar WHERE patenteNumero = ?;";
		try {
			if (null == psEliminar) {
				psEliminar = getConexion().prepareStatement(sql);
			}
			psEliminar.setString(1, familiar.getPatente().getNumero());

			return (psEliminar.executeUpdate() == 1);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean actualizar(Familiar familiar) {
		String sql = "UPDATE autoFamiliar SET patenteActiva = ?, marca = ?, categoria = ?, color =?, puestos = ? WHERE patenteNumero = ?;";
		try {
			if (null == psModificar) {
				psModificar = getConexion().prepareStatement(sql);
			}

			psModificar.setBoolean(1, familiar.getPatente().isActiva());
			psModificar.setString(2, familiar.getMarca());
			psModificar.setString(3, familiar.getCategoria());
			psModificar.setString(4, familiar.getColor().toString());
			psModificar.setInt(5, familiar.getPuestos());
			psModificar.setString(6, familiar.getPatente().getNumero());
			return (psModificar.executeUpdate() == 1);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Familiar> listar() {
		List<Familiar> lista = new ArrayList<>();
		String sql = "SELECT patenteNumero, patenteActiva, marca, categoria, color, puestos FROM autoFamiliar;";

		try {
			if (null == psListar) {
				psListar = getConexion().prepareStatement(sql);
			}

			ResultSet resultado = psListar.executeQuery();

			while (resultado.next()) {

				String patenteNumero = resultado.getString("patenteNumero");
				boolean patenteActiva = resultado.getBoolean("patenteActiva");
				String marca = resultado.getString("marca");
				String categoria = resultado.getString("categoria");
				String color = resultado.getString("color");
				int puestos = resultado.getInt("puestos");

				Familiar familiar = new Familiar(Colores.valueOf(color), marca,
						new Patente(patenteNumero, patenteActiva), puestos, categoria);

				lista.add(familiar);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}

}
