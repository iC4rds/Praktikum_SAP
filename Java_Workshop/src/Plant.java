package Aufgaben;

public class Plant {
	
	//Aufgabe7
	private String type;
	private float size;
	private boolean isToxic;
	
	//Aufgabe8:
	public void setAttributes(String a, float b, boolean c) {
		type = a;
		size = b;
		isToxic = c;
	}
	
	public void displayAttributes() {
		System.out.println("Art: " + type);
		System.out.println("Groeße: " + size);
		System.out.println("Giftig: " + isToxic);
	}
	
	public boolean toxic() {
		return isToxic;
	}
	
	public Plant(String type, float size, boolean isToxic) {
		this.type = type;
		this.size = size;
		this.isToxic = isToxic;
	}
}
