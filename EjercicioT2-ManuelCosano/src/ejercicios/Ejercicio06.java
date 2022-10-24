package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {
	/* He hecho distintas pruebas en esta actividad:
	* Primero he introducido la suma correctamente, y el mensaje correcto se ha mostrado
	* Después he probado a introducir la suma de forma incorrecta y el segundo mensaje se mostró de forma correcta
	*/
	public static void main(String[] args) {
		
		// Introducimos las distintas variables que vamos a utilizar
		int suma; // Esta variable hará referencia a la suma de los 2 números random 
		double numero1 = Math.random()*99; // Variable que hace referencia a un número aleatorio
		double numero2 = Math.random()*99; // Variable que hace referencia a un número aleatorio
		
		// Creeamos el escáner, que lo utilizaremos para introducir las variables
		Scanner ma = new Scanner(System.in);
		
		// Introducimos un mensaje que nos permita ver nuestros números aleatorios
		System.out.println("Nuestros números aleatorios serán "+ (int)numero1 +" y "+ (int)numero2);
		
		// Le pedimos al usuario que sume los número
		System.out.println("¿Podría sumar los números por favor?");
		
		// Permitimos al usuario introducir la suma
		suma = ma.nextInt();
		
		// Mediante este if analizaremos si la suma realizada por el usuario es correcta o incorrecta
		if (suma == (int)numero1 + (int)numero2) {
			// Esto será lo que saldrá en caso de que la suma sea efectuada correctamente
			System.out.println("Has hecho la operación correctamente, tienes un 10");
			
		} else {
			// Esto será lo que saldrá en caso de que la suma no sea efectuada correctamente 
			System.out.println("Has hecho la operación mal, eres una decepción como alumno, has suspendido");
		}
		// Cerramos el escáner
		ma.close();
		
	}

}
