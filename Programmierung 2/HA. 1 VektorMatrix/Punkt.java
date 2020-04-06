package main;

public class Punkt {

	private float x;
	private float y;
	public Punkt(float u, float v) {
		this.x = u;
		this.y = v;
	}
	
	public float getX() {return this.x;}
	public float getY() {return this.y;}
	
	public String toString() {
		return "X: " + this.x + " Y: " + this.y;
	}
	
}
