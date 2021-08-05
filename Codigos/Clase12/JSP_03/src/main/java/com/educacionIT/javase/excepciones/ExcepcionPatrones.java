package com.educacionIT.javase.excepciones;

public class ExcepcionPatrones extends Exception {
	private static final long serialVersionUID = 1L;
	private Integer codigo;

	public ExcepcionPatrones(Integer codigo) {
		super();
		this.codigo = codigo;
	}

	public ExcepcionPatrones(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		switch (codigo) {
		case 1:
			return "No es un correo electronico\"";
		default:
			return super.getMessage();
		}
	}
}
