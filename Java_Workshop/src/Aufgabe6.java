package Aufgaben;

public class Aufgabe6 {

	public static void main(String[] args) {
		System.out.println("Zweierpotenzen:");
		int[] potenzen = new int[8];
		int x;
		for(int i = 0; i < potenzen.length ; i++) {
			x = (int)Math.pow(2, i);
			potenzen[i] = x;
			System.out.println(potenzen[i]);
		}
	}
}
