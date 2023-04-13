package Aufgaben;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Gebe sechs Zahlen, jeweil zwischen 1 und 49, hintereinander ein: ");
		int b1 = scanner.nextInt();
		int b2 = scanner.nextInt();
		int b3 = scanner.nextInt();
		int b4 = scanner.nextInt();
		int b5 = scanner.nextInt();
		int b6 = scanner.nextInt();
		
		int benutzerZahlen[] = {b1, b2, b3, b4, b5, b6};
		for (int l = 0; l < 6; l++) {
			if (benutzerZahlen[l] > 49 || benutzerZahlen[l] < 1) {
				System.out.println("Error Zahl " + benutzerZahlen[l] + " nicht gültig");
				System.out.println("Gebe eine neue Zahl an:");
				benutzerZahlen[l] = scanner.nextInt();
			}
		}
		int lotto[] = new int[6];
		int z;
		System.out.println("Lottozahlen:");
		for(int i = 0; i < lotto.length ; i++) {
			z = (int)((Math.random()*49)+1);
			lotto[i] = z;
			System.out.println(lotto[i]);
		}
		
		int g = 0;
		for (int j = 0; j < 6; j++) {
			if (benutzerZahlen[j] == lotto[0] || benutzerZahlen[j] == lotto[1] || benutzerZahlen[j] == lotto[2] || benutzerZahlen[j] == lotto[3] || benutzerZahlen[j] == lotto[4] || benutzerZahlen[j] == lotto[5]) {
				g++;
			}
		}
		
		System.out.println("Du hast " + g + " Treffer");
		
		scanner.close();
	}

}
