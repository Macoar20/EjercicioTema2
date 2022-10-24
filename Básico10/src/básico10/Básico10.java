package básico10;

import java.util.Scanner;

public class Básico10 {

	public static void main(String[] args) {
		Scanner ma = new Scanner(System.in);
		final int IVA = 21;
		double precio1;
		double precio2;
		System.out.println("Dame un precio");
		precio1 = ma.nextInt();
		precio2 = precio1 * IVA /100 + precio1;
		System.out.println("El precio con el IVA aplicado será: "+ precio2);
		ma.close();

	}

}
