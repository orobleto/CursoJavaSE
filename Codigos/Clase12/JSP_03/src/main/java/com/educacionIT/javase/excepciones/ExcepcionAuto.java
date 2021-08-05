package com.educacionIT.javase.excepciones;

public class ExcepcionAuto extends Exception {
	private static final long serialVersionUID = 1L;
	private Integer codigo;

	public ExcepcionAuto(Integer codigo) {
		super();
		this.codigo = codigo;
	}

	public ExcepcionAuto(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		switch (codigo) {
		case 1:
			return "La patente debe contener 8 caracteres";
		case 2:
			return "El Auto debe poseer puestos";
		case 3:
			return "Solo esta permitido que el Auto tenga 1 o mas puestos";
		default:
			return super.getMessage();
		}
	}
}
