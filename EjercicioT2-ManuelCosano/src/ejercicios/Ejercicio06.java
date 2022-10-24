package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		int suma;
		double numero1 = Math.random()*99;
		double numero2 = Math.random()*99;
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Nuestros números aleatorios serán "+ (int)numero1 +" y "+ (int)numero2);
		
		System.out.println("¿Podría sumar los números por favor?");
		
		suma = ma.nextInt();
		
		if (suma == (int)numero1 + (int)numero2) {
			System.out.println("Has hecho la operación correctamente, tienes un 10");
			
		} else {
			System.out.println("Has hecho la operación mal, eres una decepción como alumno, has suspendido");
		}
		
		ma.close();
		
	}

}
