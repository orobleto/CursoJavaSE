package com.educacionIT.javase.implementaciones.mariaDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.educacionIT.javase.entidades.Usuario;
import com.educacionIT.javase.excepciones.ExcepcionPatrones;
import com.educacionIT.javase.interfaces.ConexionMariaDB;
import com.educacionIT.javase.interfaces.DAO;

public class UsuarioImpl implements DAO<Usuario, Usuario>, ConexionMariaDB {
	private PreparedStatement psBuscarPorID = null;
	private PreparedStatement psInsertar = null;
	private PreparedStatement psModificar = null;
	private PreparedStatement psEliminar = null;
	private PreparedStatement psListar = null;
	private final String KEY = "cursoJavaSE";

	@Override
	public Usuario buscarPorID(Usuario usuario) {
		String query = "select activo from usuarios where correo = ? and AES_DECRYPT(clave,?) = ?";
		try {
			if (null == psBuscarPorID) {
				psBuscarPorID = getConexion().prepareStatement(query);
			}

			psBuscarPorID.setString(1, usuario.getCorreo());
			psBuscarPorID.setString(2, KEY);
			psBuscarPorID.setString(3, usuario.getClave());
			ResultSet resultado = psBuscarPorID.executeQuery();

			if (resultado.next()) {
				usuario.setActivo(resultado.getBoolean("activo"));
				return usuario;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insertar(Usuario usuario) {
		String query = "insert into usuarios (correo,clave,activo) values (?, AES_ENCRYPT( ?, ?), ?)";

		try {
			if (null == psInsertar) {
				psInsertar = getConexion().prepareStatement(query);
			}

			psInsertar.setString(1, usuario.getCorreo());
			psInsertar.setString(2, usuario.getClave());
			psInsertar.setString(3, KEY);
			psInsertar.setBoolean(4, usuario.getActivo());
			return (psInsertar.executeUpdate() == 1);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean eliminar(Usuario usuario) {
		String query = "delete from usuarios where correo = ?";
		try {
			if (null == psEliminar) {
				psEliminar = getConexion().prepareStatement(query);
			}
			psEliminar.setString(1, usuario.getCorreo());
			return (psEliminar.executeUpdate() == 1);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean actualizar(Usuario usuario) {
		String query = "update usuarios set clave = AES_ENCRYPT( ?, ?), activo= ? where correo = ?";
		try {
			if (null == psModificar) {
				psModificar = getConexion().prepareStatement(query);
			}
			psModificar.setString(1, usuario.getClave());
			psModificar.setString(2, KEY);
			psModificar.setBoolean(3, usuario.getActivo());
			psModificar.setString(4, usuario.getCorreo());
			return (psModificar.executeUpdate() == 1);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Usuario> listar() {
		List<Usuario> lista = new ArrayList<>();
		String query = "select correo, AES_DECRYPT(clave, ?) as clave, activo from usuarios";
		try {
			if (null == psListar) {
				psListar = getConexion().prepareStatement(query);
			}
			psListar.setString(1, KEY);
			ResultSet resultado = psListar.executeQuery();

			while (resultado.next()) {

				String correo = resultado.getString("correo");
				String clave = resultado.getString("clave");
				Boolean activo = resultado.getBoolean("activo");
				Usuario usuario = null;
				try {
					usuario = new Usuario(correo, clave, activo);
				} catch (ExcepcionPatrones e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lista.add(usuario);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;
	}

}
