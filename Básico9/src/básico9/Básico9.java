package básico9;

import java.util.Scanner;

public class Básico9 {

	public static void main(String[] args) {
		Scanner ma = new Scanner(System.in);
		double pesetas;
		double euros;
		System.out.println("Dime un número de pesetas");
		pesetas = ma.nextDouble();
		euros = pesetas * 0.006D;
		System.out.println("Entonces tienes "+ euros +" euros");

	}

}
