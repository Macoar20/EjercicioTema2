package Básico3;

import java.util.Scanner;

public class Básico3 {

	public static void main(String[] args) {
		Scanner ma = new Scanner(System.in);
		System.out.println("¿En qué año naciste?");
		int año = ma.nextInt();
		System.out.println("¿En qué año estamos?");
		int año2 = ma.nextInt();
		int edad = año2-año;
		System.out.println("Por lo tanto tienes "+ edad +" años");
		
	}

}
