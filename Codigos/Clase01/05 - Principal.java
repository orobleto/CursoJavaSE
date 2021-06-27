/**
 * @author EducacionIT
 * @class Principal
 * @date 10 jun. 2020
 */
public class Principal {

	public static void main(String[] args) {
		/**
		 * Estructuras Repetitivas
		 */
		// while o miestras, se repite hasta que la condicion se deje de cumplir
		// es importante verificar que debe existir un momento que no se cumpla para
		// poder terminar el ciclo
		// de lo contrario quedara infinito
		int num1, num2;
		num1 = 0;
		num2 = 5;

		System.out.println("Bucle o ciclo while simple");
		while (num1 <= num2) {
			System.out.println("Veces dentro del ciclo:" + (num1 + 1));
			num1++;
		}

		System.out.println("Bucle o ciclo while con interrupcion ");
		// inicializamos de nuevo el num1
		num1 = 0;
		// break y continue dentro de while
		while (num1 <= num2) {
			num1++;
			// aqui evalua si el numero es 3. de ser asi omitir las siguientes instrucciones
			// e ir a la siguiente iteracion
			if (num1 == 3) {
				continue;
			}
			// si el numero es 5 salir del ciclo
			if (num1 == 5) {
				break;
			}
			System.out.println("Veces dentro del ciclo:" + (num1 + 1));

		}

		// bucle for
		System.out.println("Bucle o ciclo for simple ");
		for (int i = 0; i < 10; i++) {
			System.out.println("Veces dentro del ciclo:" + (i + 1));
		}

		System.out.println("Bucle o ciclo for con interrupcion ");
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			// si el numero es 5 salir del ciclo
			if (i == 5) {
				break;
			}
			System.out.println("Veces dentro del ciclo:" + (i + 1));
		}

	}

}
