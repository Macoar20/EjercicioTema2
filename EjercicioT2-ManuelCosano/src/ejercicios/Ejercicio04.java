package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {
	/* He realizado diversas pruebas, entre ellas encontramos:
	* Primero he probado a introducir el número 6 para saber si la función del resto cumplía su función
	* Después he introducido 1 número de cada decena es decir, 12, 23, 34, 45, 56, 67, 78, 89, 99 porque como el resto funcionaba solo necesitaba saber si la parte de las decenas cumplía su función también.
	* Por último he introducido 1 número negativo, el -6 y un número superior a 99, el 1234 y en ambos casos el resultado ha sido el mismo, mensaje con el número elegido no apropiada
	*/

	public static void main(String[] args) {
		// Introducimos las variables que utilizaremos más tarde
		int numero; // Esta variable hará referencia al número escrito por el usuario
		int resto; // Esta variable se encargará de sacar el valor de las unidades de cada número, y nos permitirá plasmar los número del uno al nueve
		String numeroescrito; //Este string será la encargada de plasmar los números a su forma escrita
		
		// Creamos el escáner que nos permitirá analizar las variables
		Scanner ma = new Scanner(System.in);
		
		numero = ma.nextInt(); // Esta variable será la que introducirá el número
		resto = numero%10; // Esta operación nos permitirá sacar el resto del número que utilizaremos más tarde
		numeroescrito = "valor"; // Este string será utilizado para escribir el número
		
		// Mediante el switch introduciremos los casos posibles de resto para que el string nos introduzca el número apropiado
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
		// Mediante el if introduciremos todos los casos de números restantes, además dividiremos las decenas por "dieci", "veinti", "treinta y"; "cuarenta y", "cincuenta y", "sesenta y", "setenta y", "ochenta y", "noventa y"
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
			// Este será le caso en el que el usuario no elija el número apropiado
			System.out.println("No has elegido un número apropiado");
			}
		}
		//Cerramos el escáner
		ma.close();
	}			
}

	

