package básico7;

import java.util.Scanner;

public class Básico7 {

	public static void main(String[] args) {
		Scanner ma = new Scanner(System.in);
		System.out.println("Dime tú nombre");
		String nombre = ma.nextLine();
		System.out.println("Dime donde vives");
		String calle = ma.nextLine();
		System.out.println("Dime tú número de teléfono");
		int teléfono = ma.nextInt();
		System.out.println("¿Me lo podrías escribir ordenado?");
		System.out.println("Nombre: "+ nombre);
		System.out.println("Calle: "+ calle);
		System.out.println("teléfono: "+ teléfono);
		
	}

}
