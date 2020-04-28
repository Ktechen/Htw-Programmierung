package HA3;

public class Kreis extends Figur implements GeometrieMath{

	private int radius;
	private static final double PI = Math.PI;

	public Kreis(int radius, Punkt anker) {
		super(anker);
		this.radius = radius;
	}

	public double berechneFlaeche() {
		return PI * (double) radius;
	}
	
	public double berechneUmfang() {
		return 2 * PI * radius;
	}

	public int getRadius() {
		return radius;
	}

}
