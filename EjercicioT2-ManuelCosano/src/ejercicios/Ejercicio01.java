package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
	/* He realizado diversas pruebas, entre ellas encontramos:
	 * He utilizado el número 6 ya que necesitaba comprobar con un número positivo de una cifra
	 * He probado con un número negativo de una sola unidad, el -9
	 * He probado con un número positivo capícua de 2 unidades el 33
	 * He probado con un número positivo de 2 unidades el 15
	 * He probado con un número negativo de 2 unidades el -18
	 * He probado con un número positivo capícua de 3 unidades el 787
	 * He probado con un número positivo de 3 unidades el 543
	 * He probado con un número positivo capícua de 4 unidades el 2332
	 * He probado con un número positivo de 4 unidades el 1231
	 */
	public static void main(String[] args) {
		// Introducimos las variables que utilizaremos más tarde
		int numero; // Esta variable hará referencia al número que introduzca el usuario
		int resto; // Esta variable hará referencia a la parte de las unidades del número introducido
		int restod; // Esta variable hará referencia a la parte de las decenas del número introducido
		int restoc; // Esta variable hará referencia a la parte de las centenas del número introducido
		Scanner ma = new Scanner(System.in); // Creamos el escáner que nos permitirá imprimir las variables
		
		System.out.println("Dame un número entre 0 y 9999"); //Le pedimos al usuario que introduzca un número 
		
		numero = ma.nextInt(); // Con el escáner el usuario introducirá su número
		
		//Creamos un if con el que seremos capaces de plantear distintos escenarios y por lo tanto distintas soluciones
		if (numero > 0&& numero < 10) {
			System.out.println("El número es capicua"); //Este caso siempre será capícua 
		} else if (numero >= 10 && numero < 100) {
			resto = numero %10; // Esta será la condición utilizada para cuando el número introducido sea de 2 cifras, y por lo tanto lo único que necesitaremos será igualar la primera cifra del número con su segunda cifra
			numero /= 10;
			if (resto == numero) {
				System.out.println("El número que ha introducido es capicua"); //Este será el caso en el que los números sean iguales y por lo tanto sea capícua
			} else {
				System.out.println("El número no es capicua"); //Este será el caso en el que los números no sean iguales y por lo tanto no sea capícua
			}
		} else if (numero >= 100 && numero < 1000) {
			resto = numero %10;
			numero /= 100; // Esta será la condición utilizada para cuando el número introducido sea de 3 cifras, y por lo tanto lo único que necesitaremos será igualar la primera cifra del número con la tercera, es decir necesitamos que el número que hace referencia a las centenas y el número que hace referencia a las unidades sean iguales              
			if (resto == numero) {
				System.out.println("El número que ha introducido es capicua"); //Este será el caso en el que los números sean iguales y por lo tanto sea capícua
			} else {
				System.out.println("El número no es capicua"); //Este será el caso en el que los números no sean iguales y por lo tanto no sea capícua
			}
		} else if (numero >= 1000 && numero < 9999 ) {
			resto = numero %10;
			restod = (numero/10)%10;
			restoc = (numero/100)%10; // Esta será la condición utilizada para cuando el número introducido sea de 4 cifras, y por lo tanto lo que tenemos que iguales es el número que hace referencia a las decenas con el número que hace referencia a las centenas por un lado, y el número que hace referencia a las unidades con el número que hace referencia a las unidades de millar
			numero = numero/=1000;
			if (resto == numero && restod == restoc) {
				System.out.println("El número que ha introducido es capicua"); //Este será el caso en el que los números sean iguales y por lo tanto sea capícua
			} else {
				System.out.println("El número no es capicua"); // Este será el caso en el que los números no sean iguales y por lo tanto no sea capícua
		}
		
	} else {
		System.out.println("El número introducido no cumple los requisitos especificados con anterioridad"); // Este será el caso en el que el usuario ha introducido un número que no viene registrado en ninguno de los casos, y por lo tanto debería introducir uno distinto
	}
	ma.close(); // Cerramos el escáner
	}

}
