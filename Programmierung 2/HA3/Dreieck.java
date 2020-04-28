package HA3;

public class Dreieck extends Figur{

	private int a;
	private int b;
	private int c;
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
	
	public Dreieck(int a, int b, Punkt anker) {
		super(anker);
		this.a = a;
		this.b = b;
	}
	
	public Dreieck(int a, int b, int c, Punkt anker) {
		super(anker);
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
