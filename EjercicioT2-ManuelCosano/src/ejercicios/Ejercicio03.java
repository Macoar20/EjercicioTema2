package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {
	/*Las pruebas realizadas en esta actividad han sido:
	* Lo primero era introducir números que cumpliesen con las condiciones para asegurar que la aplicación funcionaba bien, y tras introducir 20, 5 y 10 respectivamente, obteniendo como resultado el esperado 2kilos por animal
	* Después probé a introducir un número negativo  en la ccomida, dando como resultado que no teníamos suficiente comida para alimentar a los animales
	* Como última prueba introducí un número negativo de animales, al cual me apareció el mensaje de "¿Si no tienes animales para que quieres la comida?"
	*/
	public static void main(String[] args) {
		//Introducimos las variables que utilizaremos en el problema
		double ccomida; // Esta hace referencia a la cantidad de comida que hemos comprado
		int nanimales; // Esta hace referencia a la cantidad de animales que poseemos
		double kcomidatotal; // Aquí encontraremos la cantidad total de comida consumida por todos los animales en un día
		double ranimal; // Esta variable se encargará de decirnos la ración que le pertenece a cada animal
		
		// Creamos el escáner que utilizaremos para las variables más tarde
		Scanner ma = new Scanner(System.in);
		// Le pedimos al usuario que introduzca la primera variable
		System.out.println("Podría decirme la cantidad de comida que ha comprado");
		ccomida = ma.nextDouble(); // Esta variable que introducimos hace referencia a la comida total comprada
		// Le pedimos al usuario que introduzca la segunda variable
		System.out.println("Podría decirme el número de animales que posee");
		nanimales = ma.nextInt(); // Esta variable que introducimos hace referencia a la cantidad de animales que poseemos
		// Le pedimos al usuario que introduzca la tercera variable
		System.out.println("Podría decirme la cantidad total de comida consumida hoy");
		kcomidatotal = ma.nextDouble(); // Esta variable que introducimos hace referencia a los kilos totales consumidos
		// Mediante este if analizaremos los posibles casos que nos encontraremos en función del valor de las variables
		if (nanimales<=0) {
			// Este sería el caso en el que el número de animales fuese igual o menor que 0 cosa que no tendría sentido
			System.out.println("¿Si no tienes animales para qué quieres la comida?");
		} else {
			// Para cuando el número de animales sea mayor a 0 tenemos esta situación
			// Realizamos el cálculo necesario para encontrar el valor de la ración para cada animal que será la cantidad de comida consumida entre le número de animales
		ranimal = kcomidatotal/nanimales;
			//  Con este if sabremos qeu si la cantidad de comida total es mayor que la consumida podremos realizar la operación y se mostrará en pantalla, sin embargo en caso contrario, no tendremos suficiente comida
		if (ccomida>=kcomidatotal) {
			System.out.println("A cada animal le corresponde un total de "+ ranimal +" K ");
		} else {
			System.out.println("No tenemos suficiente comida para alimentar a cada animal");
		}
		}
		// Cerramos el escáner
		ma.close();

	}

}
