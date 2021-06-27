package com.educacionIT.javase.entidades.privados;

/**
 * @author EducacionIT
 * @class App
 * @date 10 jun. 2020
 * clase para poder instanciar objetos de tipo auto con clase por defecto y miembros de instancia (atributos y metodos) por protegidos
 */
public class AppPrivado {
	public static void main(String[] args) {
		// declaramos el objeto auto1 de la Clase Auto del paquete com.educacionIT.javase.entidades.protegidas
		// pero no podemos instanciar ni usar sus atributos por que son todos privados. 
		// esto lo solucionaremos con el punto siguiente, el primer pilar (Encapsulamiento)
		Auto auto1;
	}
}
