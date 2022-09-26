package básico8;

import java.util.Scanner;

public class Básico8 {

	public static void main(String[] args) {
		Scanner ma = new Scanner(System.in);
		System.out.println("¿Cómo te llamas?:");
		String nombre = ma.nextLine();
		System.out.println("¿Cúantos años tienes?:");
		int edad = ma.nextInt();
		System.out.println("Hola "+ nombre +" ,tienes "+ edad +" años, ¡Qué mayor eres!");
		

	}

}
