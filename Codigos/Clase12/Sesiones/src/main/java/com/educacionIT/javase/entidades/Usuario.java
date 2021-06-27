package com.educacionIT.javase.entidades;

import java.util.concurrent.atomic.AtomicInteger;

public class Usuario {
	private String correo;
	private String clave;
	private Integer id;
	private static AtomicInteger CANTIDAD_USUARIOS = new AtomicInteger(1);

	public Usuario() {
		this.id = CANTIDAD_USUARIOS.getAndIncrement();
	}

	/**
	 * @param correo
	 * @param clave
	 */
	public Usuario(String correo, String clave) {

		this.correo = correo;
		this.clave = clave;
		this.id = CANTIDAD_USUARIOS.getAndIncrement();
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", usuario=" + correo + ", clave=" + clave + "]";
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param usuario the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		return true;
	}

}
