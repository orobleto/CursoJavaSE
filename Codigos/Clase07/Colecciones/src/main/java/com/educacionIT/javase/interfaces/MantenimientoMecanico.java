package com.educacionIT.javase.interfaces;

import java.util.Date;

public interface MantenimientoMecanico extends MantenimientoPeriodico {

	boolean reparar(Date fecha, String autoParte, String mecanico);

	boolean cambioPieza(Date fecha, String autoParte);

	String cambioAceite(Date fecha, String autoParte, String marca, String tipo, Float cantidad);

}
