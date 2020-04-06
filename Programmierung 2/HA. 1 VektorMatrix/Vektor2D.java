package main;

public class Vektor2D {

	private float delX, delY;
	private Punkt anker;
	
	public Vektor2D(float delX, float delY, Punkt anker) {
		this.delX = delX;
		this.delY = delY;
		this.anker = anker;
	}
	
	public void add(Vektor2D vektor) {
		delX = delX + vektor.delX;
		delY = delY + vektor.delY;
	}
	
	public float betrag() {
		return ((float) Math.sqrt(this.delX*this.delX + this.delY*this.delY));
	}
	
	public static float betrag(Vektor2D vektor) {
		return ((float) Math.sqrt(vektor.delX*vektor.delX + vektor.delY*vektor.delY));
	}
	
	public String toString() {
		return "delX: " + this.delX + " delY: " + this.delY + " anker: " + anker;
	}
	
	public void printVektor() {
		Vektor2D[] array = { new Vektor2D(delX, delY, anker) };
		
		for (Vektor2D vektor2d : array) {
			System.out.println(vektor2d.toString());
		}
		
	}
}
