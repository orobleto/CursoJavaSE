/**
 * 
 */
package com.curso.java.principal;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 04_Condicionales
 * @class Principal
 * @description 
 * @date 10 jun. 2020
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Condicionales lo que se encuentra dentro de los paréntesis debe retornar
		 * verdadero o falso por lo que se usan los Operadores Relacionales
		 * (Comparación) vistos en la sección anterior o simplemente usando variables de
		 * tipo boolean
		 */

		System.out.println("Condicional simple: if");
		// podemos preguntar directamente sin declarar variables

		if (10 > 5) {
			System.out.println("Verdad, es mayor");
		}

		// usando variables dentro del condicional
		int num1 = 12, num2 = 6;

		if (num1 > num2) {
			System.out.println("Verdad," + num1 + " es mayor que " + num2);
		}

		// usando una variable de tipo boolean
		// se puede pensar que para este tipo if funcione se debería colocar
		// (if (variableBoolean == true)), pero al ser boolean no se necesita la
		// comparación.
		boolean variableBoolean;
		variableBoolean = true;

		if (variableBoolean) {
			System.out.println("La variable es: " + variableBoolean);
		}

		// se puede usar el if sin las llaves cuando lo que debería estar dentro solo
		// contiene una sola instruccion
		if (variableBoolean)
			System.out.println("La variable es: " + variableBoolean);

		// if reducido u operador ternario
		num1 = 2;
		num2 = 5;
		
		String consola = ((num1 > num2) ? "Es mayor" : "Es menor");

		System.out.println(consola);

		// Usando el if else con variables numéricas
		System.out.println("Condicional simple: if - else");
		num1 = 2;
		num2 = 5;
		if (num1 > num2) {
			System.out.println("Verdad," + num1 + " es mayor que " + num2);
		} else {
			System.out.println("Falso," + num2 + " es mayor que " + num1);
		}

		// usando la variable boolean
		variableBoolean = false;

		if (variableBoolean) {
			System.out.println("La variable es: " + variableBoolean);
		} else {
			System.out.println("La variable es: " + variableBoolean);
		}

		// sin las llaves
		if (variableBoolean)
			System.out.println("La variable es: " + variableBoolean);
		else
			System.out.println("La variable es: " + variableBoolean);

		// Usando el if else con variables numéricas
		System.out.println("Condicional anidado: (if - else if - else)");
		// condicional anidado
		// se usan cuando hay varias posibilidades a evaluar con comportamientos
		// diferentes
		int edad;
		edad = 19;

		if (edad >= 18) {
			System.out.println("Mayor de Edad");
		} else if (edad >= 12 && edad < 18) {
			System.out.println("Joven");
		} else {
			System.out.println("Nino");
		}

		// los casos (switch)
		char operador;
		double numero1 = 7.6, numero2 = 6, resultado = 0;

		operador = '/';

		switch (operador) {
		case '+':
			resultado = numero1 + numero2;
			// el break es importante ya que le dice al caso que debe salir de él, de lo
			// contrario entrara
			// en todas las condiciones siguientes
			break;
		case '-':
			resultado = numero1 - numero2;
			break;
		case '*':
			resultado = numero1 * numero2;
			break;
		case '/':
			if (numero2 == 0) {
				System.out.println("No es posible realizar la división por cero");
			} else {
				resultado = numero1 / numero2;
			}
			break;
		default:
			System.out.println("No es un operador valido");
		}

		System.out.println("Resultado = " + resultado);

		// los casos (switch) si no se encuentra el break podemos hacer la analogía de
		// un OR
		String salir = "s";

		switch (salir) {
		// toma las s minúscula y mayúscula
		case "s":
		case "S":
			System.out.println("Salió");
			break;
		case "n":
		case "N":
			System.out.println("Continuo");
			break;
		default:
			System.out.println("opción no valida");
		}

	}

}
