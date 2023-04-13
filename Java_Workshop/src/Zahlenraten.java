package Aufgaben;

import java.util.Scanner;

public class Zahlenraten {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gebe deinen Namen an:");
		String name = scanner.next();
		
		Zahlenraten r = new Zahlenraten();
		r.raten();
		
		System.out.println("Möchtest du nochmal spielen? y/n");
		char w = scanner.next().charAt(0);
		while (w == 'y') {
			
			
			
			r.raten();
			System.out.println("Möchtest du nochmal spielen? y/n");
			w = scanner.next().charAt(0);
		}
		
		if (w == 'n') {
			System.out.println("Danke fürs spielen " + name + "!");
		}
		
		scanner.close();
	}
	
	public void raten() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Schätze eine Zufallszahl von 1 bis 100:");
		int guess = scanner.nextInt();
		while (guess < 1 || guess > 100) {
			System.out.println("Error: Die Zahl muss zwischen 1 und 100 sein. Gebe eine andere Zahl ein");
			guess = scanner.nextInt();
		}
		
		int z = (int)((Math.random()*99)+1);
		System.out.println(z);
		int v = 0;
		while (guess < z || guess > z) {
			if (guess < z) {
				System.out.println("Die Zufallszahl ist größer als " + guess);
			}
			else if (guess > z) {
				System.out.println("Die Zufallszahl ist kleiner als " + guess);
			}
			System.out.println("Neuer Versuch:");
			guess = scanner.nextInt();
			v++;
		}
		if (guess == z) {
			System.out.println("Glückwunsch! Du hast nach " + (v +1) + " Versuchen die richtige Zahl erraten.");
		}
	}
}
