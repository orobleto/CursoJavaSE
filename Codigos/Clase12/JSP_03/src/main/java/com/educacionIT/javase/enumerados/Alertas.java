package com.educacionIT.javase.enumerados;

public enum Alertas {
	DANGER("Credenciales incorrectas, intente nuevamente", "alertDanger"),
	WARNING("Usuario Inactivo, comuniquese con el administrador", "alertWarning"),
	CLOSE_SESSION("ha cerrado sesion correctamente", "alertWarning"),
	DELETE("Se ha eliminado correctamente", "alertSuccess"),
	ERROR("No se ha realizado correctamente la accion", "alertDanger"),
	INSERT("Se ha creado correctamente", "alertSuccess"), UPDATE("Se ha actualizado correctamente", "alertSuccess");

	private String mensaje;
	private String clase;

	private Alertas(String mensaje, String clase) {
		this.mensaje = mensaje;
		this.clase = clase;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

}
