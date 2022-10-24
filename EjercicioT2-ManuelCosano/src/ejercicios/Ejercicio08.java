package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {
	/* Para esta actividad he hecho 4 pruebas:
	* Primero he introducido una distancia y una cantidad de días para que el descuento no se aplique, y como era de esperar no se aplica
	* Después he introducido tan solo la distancia o la cantidad de días necesarios para aplicar el descuento y al ser solo 1 de las 2 no se aplica, por lo que está correctamente 
	* Seguidamente he modificado las 2 variables para que cumpliesen la condición del descuento, y este se ha aplicado correctamente
	*/ Por último he introducido número negativos, y ha aparecido en pantalla el mensaje final haciendo referencia a que se han introducido números incorrectos
	public static void main(String[] args) {
			// Introducimos las variables
		double precio; // Variable que hará referencia al precio
		int dias; // Variable que hará referencia al número de días que estarán
		double km; // Variable que hará referencia al número de km recorridos
		 final double reducción = 0.7; // Variable referente al descuento
		
		// Creamos el escáner
		Scanner ma = new Scanner(System.in);
		
		// Le preguntamos al usuario la distancia a recorrer
		System.out.println("¿Cuanta distancia en km vas a recorrer?");
		
		// El usuario introduce la distancia
		km = ma.nextDouble();
		
		// Le preguntamos al usuario por los días de estancia
		System.out.println("¿Cuantos días estarás allí?");
		
		// El usuario introduce los días
		dias = ma.nextInt();
		
		//Mediante el if encontraremos 3 posibles casos
		if (km > 800 && dias > 7 ) {
				precio = km*2.5*reducción;
				System.out.println("El precio de su viaje con la reducción de precio es igual a "+ precio); // Se cumplen las condiciones y el descuento se aplica
		} else if (km > 0&& km < 800&& dias > 0&& dias < 7) {
				precio = km*2.5;
				System.out.println("El precio de su viaje será "+ precio); // No se cumplen las condiciones y el precio será sin el descuento
		} else {
			System.out.println("Alguna de las variables que ha introducido no es una variable real, por favor introduzca de nuevo las variables"); // Ha introducido algún número erronéamente 
		}
		// Cerramos el escáner
	ma.close();	

	}
	

}
