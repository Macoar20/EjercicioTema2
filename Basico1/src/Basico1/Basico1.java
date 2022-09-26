package Basico1;

import java.util.Scanner;

public class Basico1 {

	public static void main(String[] args) {
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Escriba un número por favor:");
		int numero = ma.nextInt();
		ma.close();
		System.out.println("Ha escrito " + numero);
	}

}
