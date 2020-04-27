package HA3;

public class Kreis extends Figur {

	private int radius;
	private static final double PI = Math.PI;

	public Kreis(int radius, Punkt anker) {
		super(anker);
		this.radius = radius;
	}

	public double berechneFlaeche() {
		return PI * (double) radius;
	}
}
