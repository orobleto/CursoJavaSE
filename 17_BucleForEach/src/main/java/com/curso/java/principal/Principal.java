/**
 * 
 */
package com.curso.java.principal;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 17_BucleForEach
 * @class Principal
 * @description 
 * @date 17 jun. 2020
 */
public class Principal {

	public static void main(String[] args) {
        /*Declaracion de Arreglo de enteros*/
        int[] diaNumeros = new int[7];

        //asignacion de valores al arreglo
        diaNumeros[0] = 1;
        diaNumeros[1] = 2;
        diaNumeros[2] = 3;
        diaNumeros[3] = 4;
        diaNumeros[4] = 5;
        diaNumeros[5] = 6;
        diaNumeros[6] = 7;

        //imprimir los valores del vector usando bucle for each
        System.out.println("Usando Bucles para recorrer el Vector");
        for (int diaNumeroAux : diaNumeros) {
            System.out.println("dia de la semana en numero " + diaNumeroAux);
        }
        
        /*Declaracion de Arreglo de cadena con valores inciales*/
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        //imprimir los valores del vector usando bucle for each
        for (String diasSemanaAux : diasSemana) {
            System.out.println("dia de la semana en letras " + diasSemanaAux);
        }

	}

}
