package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int dni;
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Introduzca su número de DNI sin la letra");
		
		dni = ma.nextInt();
		
		switch (dni%23) {
		case 0:
			System.out.println("La letra que posee su DNI es la letra T" );
		break;
		case 1:
			System.out.println("La letra que posee su DNI es la letra R" );
		break;
		case 2:
			System.out.println("La letra que posee su DNI es la letra W" );
		break;
		case 3:
			System.out.println("La letra que posee su DNI es la letra A" );
		break;
		case 4:
			System.out.println("La letra que posee su DNI es la letra G" );
		break;
		case 5:
			System.out.println("La letra que posee su DNI es la letra M" );
		break;
		case 6:
			System.out.println("La letra que posee su DNI es la letra Y" );
		break;
		case 7:
			System.out.println("La letra que posee su DNI es la letra F" );
		break;
		case 8:
			System.out.println("La letra que posee su DNI es la letra P" );
		break;
		case 9:
			System.out.println("La letra que posee su DNI es la letra D" );
		break;
		case 10:
			System.out.println("La letra que posee su DNI es la letra X" );
		break;
		case 11:
			System.out.println("La letra que posee su DNI es la letra B" );
		break;
		case 12:
			System.out.println("La letra que posee su DNI es la letra N" );
		break;
		case 13:
			System.out.println("La letra que posee su DNI es la letra J" );
		break;
		case 14:
			System.out.println("La letra que posee su DNI es la letra Z" );
		break;
		case 15:
			System.out.println("La letra que posee su DNI es la letra S" );
		break;
		case 16:
			System.out.println("La letra que posee su DNI es la letra Q" );
		break;
		case 17:
			System.out.println("La letra que posee su DNI es la letra V" );
		break;
		case 18:
			System.out.println("La letra que posee su DNI es la letra H" );
		break;
		case 19:
			System.out.println("La letra que posee su DNI es la letra L" );
		break;
		case 20:
			System.out.println("La letra que posee su DNI es la letra C" );
		break;
		case 21:
			System.out.println("La letra que posee su DNI es la letra K" );
		break;
		case 22:
			System.out.println("La letra que posee su DNI es la letra E" );
		break;
		
			
		}
		ma.close();
	}

}
