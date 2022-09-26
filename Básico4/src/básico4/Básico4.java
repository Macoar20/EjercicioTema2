package básico4;

import java.util.Scanner;

public class Básico4 {

	public static void main(String[] args) {
		Scanner ma = new Scanner(System.in);
		float nota1 = ma.nextInt();
		float nota2 = ma.nextInt();
		float notatotal = nota1 + nota2;
		float media = notatotal /2;
		System.out.println("tú nota media es "+ media);

	}

}
