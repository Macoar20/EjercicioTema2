package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		int horas;
		int minutos;
		int segundos;
		
		Scanner ma = new Scanner(System.in);
		
		System.out.println("Podría introducirme una horas en este orden, horas, minutos, segundos");
		
		horas = ma.nextInt();
		minutos = ma.nextInt();
		segundos = ma.nextInt();
		segundos+=1; 
		
		if (horas<=24&&minutos<=60&&segundos<=60) {
			if (segundos==60) {
				segundos=0;
				minutos+=1;
			}  if (minutos==60) {
				minutos=0;
				horas+=1;
			} if (horas==24) {
				horas=0;
			} 
			System.out.println("Tras 1 segundo, la hora introducida pasará a ser las "+horas+":"+minutos+":"+segundos);
		} else {
			System.out.println("Ha introducido una hora imposible");
		}
		ma.close();
	}

}
