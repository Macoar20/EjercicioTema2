package básico5;

import java.util.Scanner;

public class Básico5 {

	public static void main(String[] args) {
		Scanner ma = new Scanner(System.in);
		System.out.println("Escriba el radio de una circunferencia");
		double radio = ma.nextDouble();
		double longitud = radio * 2 * Math.PI;
		System.out.println("La longitud de la circunferencia es: "+ longitud );
		double area = radio * radio * 2;
		System.out.println("El área del círculo es: "+ area);

	}

}
