/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.curso.java.principal;

import com.curso.java.genericos.Generica;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 21_Clases_Genericas
 * @class ClasesGenericas
 * @description
 * @date 24 jun. 2020
 */
public class Principal {

	public static void main(String[] args) {

		// Objeto Generico con un solo argumento

		Generica<String> miGenerico1 = new Generica<>("Soy un String");
		Generica<Integer> miGenerico2 = new Generica<>(2);
		Generica<Object> miGenerico3 = new Generica<>(new Object());

		// imprimimos su clase
		miGenerico1.tipoClase();
		miGenerico2.tipoClase();
		miGenerico3.tipoClase();

		System.out.println("Generica doble argumento");

	}

}
