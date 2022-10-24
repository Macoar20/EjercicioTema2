package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		int numero;
		int vabsoluto;
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Introduzca un número por favor");
		
		numero = ma.nextInt();
		
		vabsoluto = numero > 0 ? numero : -numero;
		
		System.out.println("Tú número en valor absoluto es "+ vabsoluto);
		
		ma.close();
	}

}
