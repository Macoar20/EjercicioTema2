package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int numero;
		int resto;
		String numeroescrito;

		Scanner ma = new Scanner(System.in);
		
		numero = ma.nextInt();
		resto = numero%10;
		numeroescrito = "valor";
		
		switch (resto) {
		case 1 :
			numeroescrito = "uno";
		break;
		case 2 :
			numeroescrito = "Dos" ;
			break;
		case 3 :
			numeroescrito ="Tres" ;
			break;
		case 4 : 
			numeroescrito ="Cuatro";
			break;
		case 5 :
			numeroescrito = "Cinco";
			break;
		case 6 :
			numeroescrito = "Seís";
			break;
		case 7 :
			numeroescrito = "Siete";
			break;
		case 8 :
			numeroescrito = "Ocho";
			break;
		case 9 :
			numeroescrito = "Nueve";
			break;
		}
		
		if (numero>=1&& numero<100) {
			
			if (numero>=1&&numero<10) {
				System.out.println(numeroescrito);
			} else if (numero == 11) { 
				System.out.println("once");
			} else if (numero == 12) { 
				System.out.println("doce");
			} else if (numero == 13) { 
				System.out.println("trece");
			} else if (numero == 14) { 
				System.out.println("catorce");
			} else if (numero == 15) { 
				System.out.println("quince");
			} else if (numero == 10) { 
				System.out.println("diez");
			} else if (numero == 20) { 
				System.out.println("Veinte");
			} else if (numero == 30) { 
				System.out.println("Treinta");
			} else if (numero == 40) { 
				System.out.println("Cuarenta");
			} else if (numero == 50) { 
				System.out.println("Cincuenta");
			} else if (numero == 60) { 
				System.out.println("Sesenta");
			} else if (numero == 70) { 
				System.out.println("Setenta");
			} else if (numero == 80) { 
				System.out.println("Ochenta");
			} else if (numero == 90) { 
				System.out.println("Noventa");
			} else if (numero>=16&&numero<20) {
				System.out.println("dieci"+numeroescrito);
			} else if (numero>20 && numero<30) {
				System.out.println("Veinti "+numeroescrito);
			} else if (numero>30&&numero<40) {
				System.out.println("Treinta y "+numeroescrito);
			} else if (numero>40&&numero<50) {
				System.out.println("Cuarenta y "+numeroescrito);
			} else if (numero>50&&numero<60) {
				System.out.println("Cincuenta y "+numeroescrito);
			} else if (numero>60&&numero<70) {
				System.out.println("Sesenta y "+numeroescrito);
			} else if (numero>70&&numero<80) {
				System.out.println("Setenta y "+numeroescrito);
			} else if (numero>80&&numero<90) {
				System.out.println("Ochenta y "+numeroescrito);
			} else if (numero>90&&numero<100) {
				System.out.println("Noventa y "+numeroescrito);
			}else {
			System.out.println("No has elegido un número apropiado");
			}
		}
		ma.close();
	}			
}

	

