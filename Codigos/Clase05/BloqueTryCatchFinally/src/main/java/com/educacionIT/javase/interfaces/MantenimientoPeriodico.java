package com.educacionIT.javase.interfaces;

import java.util.Date;

public interface MantenimientoPeriodico {

	// constantes
	String LAVADO_MANUAL = "Lavado Manual";
	String LAVADO_ECOLOGICO = "Lavado Ecológico";
	String LAVADO_PRESION = "Lavado a Presión";
	String LAVADO_TUNEL = "Lavado Túnel";

	// metodos
	void lavar(Date fecha, String tipo);
}
