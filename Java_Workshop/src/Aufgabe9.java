package Aufgaben;

public class Aufgabe9 {

	public static void main(String[] args) {
		Plant p1 = new Plant("Baum", 8f, true);
		Plant p2 = new Plant("Baum", 8f, true);
		Plant p3 = new Plant("Baum", 8f, true);
		
		p1.setAttributes("Eiche", 3.5f, false);
		p2.setAttributes("Sonnenblume", 1.0f, false);
		p3.setAttributes("Roter Fingerhut", 0.1f, true);
		
		p1.displayAttributes();
		System.out.println();
		p2.displayAttributes();
		System.out.println();
		p3.displayAttributes();
	}
}
