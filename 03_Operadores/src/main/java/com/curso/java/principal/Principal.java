/**
 * 
 */
package com.curso.java.principal;

/**
 * 
 * @author <a href="mailto:octavio.robleto@gmail.com">Ing. Octavio Robleto</a>
 * @project 03_Operadores
 * @class Principal
 * @description 
 * @date 10 jun. 2020
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
         * Operadores Aritméticos
         * (+) Suma num1 + num2 
         * (-) Resta num1 - num2 
         * (*) Multiplicación num1 * num2 
         * (/) División	num1 / num2
         * (%) Módulo o Resto num1 % num2
         */

        System.out.println("---------Aritméticos---------");
        int num1, num2, operacion;

        //asignamos valores iniciales a las variables
        num1 = 5;
        num2 = 3;

        operacion = num1 + num2;
        // imprimimos el resultado
        System.out.println("Suma:");
        System.out.println(operacion);

        operacion = num1 - num2;
        // imprimimos el resultado
        System.out.println("Resta:");
        System.out.println(operacion);

        operacion = num1 * num2;
        // imprimimos el resultado
        System.out.println("Multiplicación:");
        System.out.println(operacion);

        operacion = num1 / num2;
        // imprimimos el resultado
        //el resultado en esta operacion devolvera un numero entero ya que operamos con enteros (int)
        System.out.println("División:");
        System.out.println(operacion);

        operacion = num1 % num2;
        // imprimimos el resultado
        System.out.println("Resto:");
        System.out.println(operacion);
        /**
         * = Asignación num1 = num2
         * += Suma y asignación num1 += num2 (num1=num1 + num2)
         * -= Resta y asignación num1 -= num2 (num1=num1 - num2)
         * *= Multiplicación y asignación num1 *= num2 (num1=num1 * num2)
         * /= División y asignación num1 / num2 (num1=num1 / num2)
         * %= Módulo y asignación num1 % num2 (num1=num1 % num2)
         */
        System.out.println("---------Asignación---------");
        
        //asignamos valores nuevos a las variables
        num1 = 60;
        num2 = 15;
        
        num1 = num2;
        System.out.println("Asignación:");
        System.out.println(num1);

        num1 += num2;
        System.out.println("Suma:");
        System.out.println(num1);

        num1 -= num2;
        System.out.println("Resta:");
        System.out.println(num1);

        num1 *= num2;
        System.out.println("Multiplicación:");
        System.out.println(num1);

        num1 /= num2;
        System.out.println("División:");
        System.out.println(num1);

        num1 %= num2;
        System.out.println("Resto:");
        System.out.println(num1);     
        

        /**
         * Operadores Lógicos
         * (&&) AND op1 && op2
         * (||) OR op1 || op2
         * (!) NOT !op1
         * (|) OR op1 || op2
         */
        System.out.println("---------Lógicos---------");
        boolean op1, op2;
        //asignamos valores iniciales a las variables

        op1 = true;
        op2 = false;

        //para poder verificar estos operadores los vamos a usar en la consola
        // imprimimos la operacion 
        System.out.println("AND:");
        System.out.println(op1 && op2);

        // imprimimos la operacion 
        System.out.println("OR:");
        System.out.println(op1 || op2);

        // imprimimos la operacion 
        System.out.println("Negacion:");
        System.out.println(!op1);
        System.out.println(!op2);

        // imprimimos la operacion 
        System.out.println("OR Inclusivo:");
        System.out.println(op2 | op1);
        
        /**
         * Operadores Relacionales (Comparacion)
         * == Igualdad num1 == num2 
         * != Distinto num1 != num2
         * < Menor que num1 < num2
         * > Mayor que num1 > num2
         * <= Menor o igual que num1 <= num2
         * >= Mayor o igual que num1 >= num2
         */
        
        System.out.println("---------Relacionales---------");

        //asignamos valores nuevos a las variables
        num1 = 45;
        num2 = 43;
      
        // imprimimos la operacion 
        System.out.println("Igualdad:");
        System.out.println(num1 == num2);

        // imprimimos la operacion 
        System.out.println("Distinto:");
        System.out.println(num1 != num2);

        // imprimimos la operacion 
        System.out.println("Mayor:");
        System.out.println(num1 > num2);

        // imprimimos la operacion 
        System.out.println("Menor:");
        System.out.println(num1 < num2);
        
        // imprimimos la operacion 
        System.out.println("Mayor Igual:");
        System.out.println(num1 >= num2);

        // imprimimos la operacion 
        System.out.println("Menor Igual:");
        System.out.println(num1 <= num2);
        
        
                /**
         * Operadores Incrementales
         * (++) para incrementar de uno en uno
         * (--) para disminuir de uno en uno
         */
        System.out.println("---------Incrementales---------");
        int cantidad = 0;

        cantidad++;
        // imprimimos la operacion 
        System.out.println("Incremetar:");
        System.out.println(cantidad);
        
        // incrementar y despues usar
        System.out.println("Incremetar y despues usar:");
        System.out.println(++cantidad);
        System.out.println("cantidad = " + cantidad);
        
        // incrementar y despues usar
        System.out.println("Usar y despues incrementar:");
        System.out.println(cantidad++);
        System.out.println("cantidad = " + cantidad);
        
        cantidad--;
        // imprimimos la operacion 
        System.out.println("Disminuir:");
        System.out.println(cantidad);
        
        // incrementar y despues usar
        System.out.println("Disminuir y despues usar:");
        System.out.println(--cantidad);
        System.out.println("cantidad = " + cantidad);
        
        // incrementar y despues usar
        System.out.println("Usar y despues Disminuir:");
        System.out.println(cantidad--);
        System.out.println("cantidad = " + cantidad);
	}

}
