package com.educacionIT.javase.entidades;

import com.educacionIT.javase.excepciones.ExcepcionPatrones;
import com.educacionIT.javase.interfaces.Patrones;

public final class Usuario {
	private String correo;
	private String clave;
	private Boolean activo;

	public Usuario() {
		super();
	}

	public Usuario(String correo, String clave, Boolean activo) throws ExcepcionPatrones {
		super();
		setCorreo(correo);
		setClave(clave);
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Usuario [correo=" + correo + ", clave=" + clave + ", activo=" + activo + "]";
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) throws ExcepcionPatrones {
		if (!Patrones.esCorreo(correo)) {
			this.correo = null;
		}

		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) throws ExcepcionPatrones {
		if (!Patrones.esClave(clave)) {
			this.clave = null;
		}
		this.clave = clave;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

}
