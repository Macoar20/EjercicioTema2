package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {
	/* He hecho varias pruebas para este ejercicio:
	* He introducido un número negativo tanto en las horas, los minutos y los segundos y en todos los casos le mensaje de que ha introducido una hora imposible ha salido
	* He introducido 0 horas, 0 minutos y 59 segundos para ver si funcionaba correctamente, y ha pasado a ser 1 minutos
	* He introducido 0 horas, 59 minutos y 0 segundos para ver si funcionaba correctamente, y ha pasado a ser 1 hora
	* He introducido 23 horas, 59 minutos y 59 segundos para ver si funcionaba, y ha pasado a ser las 0:0:0
	*/
	public static void main(String[] args) {
		// Introducimos la variables
		int horas; // Variable que hará referencia a las horas
		int minutos; // Variable que hará referencia a los minutos
		int segundos; // Variable que hará referencia a los segundos
		
		//Creamos el escáner para introducir las variables
		Scanner ma = new Scanner(System.in);
		//Le pedimos al usuario que introduzca un valor para cada variable
		System.out.println("Podría introducirme una horas en este orden, horas, minutos, segundos");
		
		horas = ma.nextInt(); // variable de las horas
		minutos = ma.nextInt(); // variable de los minutos
		segundos = ma.nextInt(); // variable de los segundos
		segundos+=1; 
		//Introducimos un if para que cuando se cumplan las condiciones el número sea analizado, y se le sume 1 segundo, ya que no queremos números imposibles
		if (horas<=24&&minutos<=60&&segundos<=60) {
			if (segundos==60) {
				segundos=0;
				minutos+=1;
			}  if (minutos==60) {
				minutos=0;
				horas+=1;
			} if (horas==24) {
				horas=0;
			} 
			// Mensaje que aparecerá cuando las variables sean correctas y se les aplique la suma de un segundo
			System.out.println("Tras 1 segundo, la hora introducida pasará a ser las "+horas+":"+minutos+":"+segundos);
		} else {
			// Mensaje que aparecerá cuando alguno de los números introducidos no sea viable
			System.out.println("Ha introducido una hora imposible");
		}
		// Cerramos el escáner
		ma.close();
	}

}
