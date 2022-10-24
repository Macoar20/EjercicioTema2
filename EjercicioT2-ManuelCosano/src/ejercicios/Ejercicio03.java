package ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		double ccomida;
		int nanimales;
		double kcomidatotal;
		double ranimal;
		
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Podría decirme la cantidad de comida que ha comprado");
		ccomida = ma.nextDouble();
		System.out.println("Podría decirme el número de animales que posee");
		nanimales = ma.nextInt();
		System.out.println("Podría decirme la cantidad total de comida consumida hoy");
		kcomidatotal = ma.nextDouble();
		
		if (nanimales==0) {
			System.out.println("¿Si no tienes animales para qué quieres la comida?");
		} else {
		
		ranimal = kcomidatotal/nanimales;
		
		if (ccomida>=kcomidatotal) {
			System.out.println("A cada animal le corresponde un total de "+ ranimal +" K ");
		} else {
			System.out.println("No tenemos suficiente comida para alimentar a cada animal");
		}
		}
		ma.close();

	}

}
