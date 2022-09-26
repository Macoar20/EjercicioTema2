package básico6;

import java.util.Scanner;

public class Básico6 {

	public static void main(String[] args) {
		Scanner ma = new Scanner(System.in);
		System.out.println("Dame un número");
		double a = ma.nextDouble();
		System.out.println("Dame otro número");
		double b = ma.nextDouble();
		double suma = a + b;
		double resta = a - b;
		double multiplicación = a * b;
		double división = a / b;
		System.out.println("La suma de estos números será: "+ suma);
		System.out.println("La resta de estos números será: "+ resta);
		System.out.println("La multiplicación de estos números será: "+ multiplicación);
		System.out.println("La división de estos números será: "+ división);

	}

}
