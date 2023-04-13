package Aufgaben;

import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Gebe eine Zahl ein: ");
		double i = scanner.nextInt();
		System.out.print("Gebe eine weitere Zahl ein: ");
		double j = scanner.nextInt();
		System.out.print("Gebe einen Operator an: ");
		char l = scanner.next().charAt(0);
		double ergebnis;
		
		if (l == '+') {
			ergebnis = i + j;
			System.out.println("Das Ergebnis lautet: " + ergebnis);
		} else if (l == '-') {
			ergebnis = i - j;
			System.out.println("Das Ergebnis lautet: " + ergebnis);
		} else if (l == '*') {
			ergebnis = i * j;
			System.out.println("Das Ergebnis lautet: " + ergebnis);
		} else if (l == '/') {
			ergebnis = i / j;
			System.out.println("Das Ergebnis lautet: " + ergebnis);
		} else if (l == '%') {
			ergebnis = i % j;
			System.out.println("Der Modulo beträgt: " + ergebnis);
		} else {
			System.out.println("Der Operator wird nicht unterstützt!");
		}
		
		scanner.close();
	}

}
