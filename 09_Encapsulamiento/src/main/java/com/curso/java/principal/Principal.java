/**
 * 
 */
package com.curso.java.principal;

import com.curso.java.entidades.Auto;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 08_Metodos
 * @class Principal
 * @description
 * @date 10 jun. 2020
 */
public class Principal {

	public static void main(String[] args) {

        // creamos o instanciamos los objetos
        Auto auto1 = new Auto();

        //le damos valores a los atributos del auto 1
        auto1.setColor("Rojo");
        auto1.setMarca("Ferrari");
        auto1.setPatente("ABC-188");

        //Encendemos el Auto en true y apagamos el Auto en false
        auto1.encendido(true);

        //le damos valores a los atributos del auto 2
        Auto auto2 = new Auto("Plateado", "Audi", "ZBG-999", true);

        //comportamiento de mostrar datos
        auto1.mostrarDatos();
        auto2.mostrarDatos();

	}

}
