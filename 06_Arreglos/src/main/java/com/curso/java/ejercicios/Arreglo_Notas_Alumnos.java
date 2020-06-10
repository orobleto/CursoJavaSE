/**
 * 
 */
package com.curso.java.ejercicios;

import java.util.Scanner;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 06_Arreglos
 * @class Arreglo_Notas_Alumnos
 * @description 
 * @HU_CU_REQ 
 * @date 10 jun. 2020
 */
public class Arreglo_Notas_Alumnos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // la clase scanner para capturar valores del teclado
        Scanner entrada_teclado = new Scanner(System.in);

        // declaracion de Variables, sin inicializarlos porque no sabemos el tamano
        double[] notas_alumnos;
        String[] nombres_alumnos;
        int cant_alumnos;

        // pregunta a usuario
        System.out.println("Ingrese la cantidad de notas que cargara: ");

        // capturamos lo que el usuario ingresa y lo asignamos como tamaño del
        // vector, recuerden Int para capturar es un entero y saber cantidad de alumnos
        cant_alumnos = entrada_teclado.nextInt();

        // con ese tamano inicamos los vectores con la variable @cant_alumnos
        notas_alumnos = new double[cant_alumnos];
        nombres_alumnos = new String[cant_alumnos];

        // usamos un for para preguntar cada uno de los nombres y las notas
        for (int i = 0; i < cant_alumnos; i++) {
            // preguntamos los nombres y notas
            System.out.println("Ingrese el nombre del alumno [" + (i + 1) + "]: ");
            nombres_alumnos[i] = entrada_teclado.next();

            // capturamos las notas colocando el nombre que nos facilitaron anteriormente
            System.out.println("Ingrese la nota del alumno [" + nombres_alumnos[i] + "]: ");
            notas_alumnos[i] = entrada_teclado.nextDouble();

        }

        System.out.println("----------------------------------");
        System.out.println();
        System.out.println();

        // mostramos las notas, en este metodo uso el .length y no la variable cantidad
        // solo a modo de ejemplo       
        System.out.println("NOTAS PARCIALES DE LOS ALUMNOS: ");
        for (int i = 0; i < nombres_alumnos.length; i++) {
            // mostramos las notas como las ingresaron
            System.out.println(nombres_alumnos[i] + " obtuvo " + notas_alumnos[i] + " pts");

        }
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println();
        // calculos generales de las notas, uso otro for porque a veces hacemos estos
        // calculos en otro momento

        // el promedio y la suma inicializamos en cero y las notas las inicializamos en
        // la primera posicion del vector
        // como vimos en clase
        double promedio = 0, suma = 0, nota_mayor = notas_alumnos[0], nota_menor = notas_alumnos[0];
        int posicion_notaMayor = 0, posicion_notaMenor = 0;

        for (int i = 0; i < cant_alumnos; i++) {
            // sumamos cada una de las notas
            suma += notas_alumnos[i];
            // aprovechemos el uso del continue
            // si es la primera iteracion del vector no necesitamos comparar
            // recuerden que las notas se inicializan con el valor de la primera nota
            // por lo que en la primera iteracion seria comparar dos numeros iguales

            if (i == 0) {
                continue;

            }

            // hago la comparacion es la nota actual es menor a la nota de la iteracion
            // si es verdad esa condicion mi nueva nota es la nota mayor
            if (nota_mayor < notas_alumnos[i]) {
                nota_mayor = notas_alumnos[i];
                posicion_notaMayor = i;
            }

            // hago la comparacion es la nota actual es mayor a la nota de la iteracion
            // si es verdad esa condicion mi nueva nota es la nota menor
            if (nota_menor > notas_alumnos[i]) {
                nota_menor = notas_alumnos[i];
                posicion_notaMenor = i;

            }

        }
        promedio = (suma / cant_alumnos);
        System.out.println("El promedio de notas es: " + promedio);
        System.out.println("El alumno con la mejor nota es " + nombres_alumnos[posicion_notaMayor] + " que obtuvo "
                + nota_mayor + " pts");
        System.out.println("El alumno con la nota menor es " + nombres_alumnos[posicion_notaMenor] + " que obtuvo "
                + nota_menor + " pts");
        
        //cerramos el flujo con la consola
        entrada_teclado.close();
    

	}

}
