package Básico2;

import java.util.Scanner;

public class Básico2 {

	public static void main(String[] args) {
		Scanner ma = new Scanner(System.in);
		System.out.println("Qué edad tienes?");
		int numero = ma.nextInt();
		int suma = numero + 1;
		System.out.println("El año que viene tendrás "+ suma);
		ma.close();

	}

}
