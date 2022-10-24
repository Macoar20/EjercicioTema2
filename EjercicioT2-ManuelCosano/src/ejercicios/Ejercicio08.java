package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
			
		double precio;
		int dias;
		double km;
		 final double reducción = 0.7;
		
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("¿Cuanta distancia en km vas a recorrer?");
		
		km = ma.nextDouble();
		
		System.out.println("¿Cuantos días estarás allí?");
		
		dias = ma.nextInt();
		
		
		if (km > 800 && dias > 7 ) {
				precio = km*2.5*reducción;
				System.out.println("El precio de su viaje con la reducción de precio es igual a "+ precio);
		} else if (km > 0&& km < 800&& dias > 0&& dias < 7) {
				precio = km*2.5;
				System.out.println("El precio de su viaje será "+ precio);
		} else {
			System.out.println("Alguna de las variables que ha introducido no es una variable real, por favor introduzca de nuevo las variables");
		}
	ma.close();	

	}
	

}
