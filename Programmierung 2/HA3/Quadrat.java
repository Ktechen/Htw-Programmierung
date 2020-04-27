package HA3;

public class Quadrat extends Figur{

	private int breite;

	public Quadrat(int breite, Punkt anker) {
		super(anker);
		this.breite = breite;
	}

	public double berechneFlaeche() {
		return (double) Math.sqrt(breite);
	}

	public int getBreite() {
		return breite;
	}

}
