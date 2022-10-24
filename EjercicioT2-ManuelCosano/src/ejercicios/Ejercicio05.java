package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {
	/* He realizado 2 pruebas en este ejercicio
	* He introducido un número positivo, el 9 el cual como resultado me ha dado el 9
	* He introducido un número negativo, el -6 el cual como resultado me ha dado el 6
	*/

	public static void main(String[] args) {
		// Introducimos las variables
		int numero; // Esta variable hará referencia al número introducido por el usuario
		int vabsoluto; // Esta variable hará referencia al número en valor absoluto
		
		// Creamos el escáner que nos permitirá leer las variables
		Scanner ma = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca un número
		System.out.println("Introduzca un número por favor");
		
		numero = ma.nextInt(); // Le damos un valor a la variable número
		
		vabsoluto = numero > 0 ? numero : -numero; // Mediante un ternario obtendremos el valor del número absoluto
		
		// Imprimimos el número en valor absoluto con el mensaje
		System.out.println("Tú número en valor absoluto es "+ vabsoluto);
		
		//Cerramos el escáner
		ma.close();
	}

}
