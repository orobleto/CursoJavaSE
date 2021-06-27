package com.educacionIT.javase.entidades.protegidas;

/**
 * @author EducacionIT
 * @class App
 * @date 10 jun. 2020
 * clase para poder instanciar objetos de tipo auto con clase por defecto y miembros de instancia (atributos y metodos) por protegidos
 */
public class AppProtegido {
	public static void main(String[] args) {
		// declaramos el objeto auto1 y lo instanciamos de la Clase Auto del paquete com.educacionIT.javase.entidades.protegidas
		Auto auto1 = new Auto();

		// declaramos el objeto auto2 y lo instanciamos de la Clase Auto con valores del paquete com.educacionIT.javase.entidades.protegidas
		// iniciales
		Auto auto2 = new Auto("Plateado", "Audi", "ZBG-999", true);

		// le damos valores a los atributos del auto 1
		auto1.color = "Rojo";
		auto1.marca = "Ferrari";
		auto1.patente = "ABC-188";

		// Cambiamos el estado del auto a encendido
		auto1.cambiarEstado(true);

		// podemos cambiar los valores de los atributos
		auto2.color = "Gris";

		// en este caso utilizamos el otro metodo sobrecargado para cambiar el estado
		// del auto2 a apagado
		auto2.cambiarEstado();

		/*
		 * al cambiar mostrardatos() a un metodo de tipo funcion podemos utilizar los
		 * atributos y mostrarlos donde decidamos y no solo en una salida de consola
		 */

		// en este caso el retorno lo utilizamos para asignarle valor a una variable y
		// despues mostralo en consola
		String datosAuto1 = auto1.mostrarDatos();
		System.out.println(datosAuto1);

		// en este otro como sabemos que el dato retorna una cadena podemos pasarlo
		// directo a metodo que imprime en consola
		System.out.println(auto1.mostrarDatos());
	}
}
