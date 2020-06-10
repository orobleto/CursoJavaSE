/**
 * 
 */
package com.curso.java.principal;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 07_Clases
 * @class Principal
 * @description 
 * @HU_CU_REQ 
 * @date 10 jun. 2020
 */
public class Principal {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {


        Auto auto1 = new Auto();
        Auto auto2 = new Auto();

        //le damos valores a los atributos del auto 1
        auto1.color = "Rojo";
        auto1.marca = "Ferrari";
        auto1.patente = "ABC-188";

        //le damos valores a los atributos del auto 2
        auto2.color = "Plateado";
        auto2.marca = "Audi";
        auto2.patente = "ZBG-999";

        //les damos comportamiento
        auto1.encender();
        auto2.apagar();

        //comportamiento de mostrar datos
        auto1.mostrarDatos();
        auto2.mostrarDatos();
        
	}

}
