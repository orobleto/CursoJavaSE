package com.educacionIT.javase.principal;

/**
 * @author EducacionIT
 * @class App
 * @date 10 ene. 2021
 *
 */
public class App {
	public static void main(String[] args) {
		String[] nombresAlumnos = { "Octavio", "Lautaro", "Daniela", "Analia" };
		
		for (String nombre : nombresAlumnos) {
			System.out.println("El nombre del Alumno es: " + nombre);
		}
	}
}
