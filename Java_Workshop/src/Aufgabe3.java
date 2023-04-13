package Aufgaben;

import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Gebe eine Zahl ein: ");
		int i = scanner.nextInt();
		System.out.print("Gebe eine weitere Zahl ein: ");
		int j = scanner.nextInt();
		System.out.println("Das Ergebnis der Addition ist: " + (i + j));
		scanner.close();
	}

}
