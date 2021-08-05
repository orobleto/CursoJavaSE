package com.educacionIT.javase.interfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.educacionIT.javase.excepciones.ExcepcionPatrones;

public interface Patrones {

	static boolean esCorreo(String correo) throws ExcepcionPatrones {
		Pattern patron = Pattern.compile("([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))");

		Matcher comparacion = patron.matcher(correo);
		// orobleto.h
		if (!comparacion.find()) {
			throw new ExcepcionPatrones(1);
		}

		return true;
	}

	static boolean esClave(String clave) throws ExcepcionPatrones {
		Pattern patron = Pattern.compile("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$");

		Matcher comparacion = patron.matcher(clave);

		if (!comparacion.find()) {
			throw new ExcepcionPatrones(
					"La contraseña debe tener al entre 8 y 16 caracteres, al menos un dígito, al menos una minúscula y al menos una mayúscula. NO puede tener otros símbolos.");
		}

		return false;
	}

}
