package HA3;

public class Rechteck extends Quadrat implements GeometrieMath{

	private int laenge;

	public Rechteck(int laenge, int breite, Punkt anker) {
		super(breite, anker);
		this.laenge = laenge;
	}

	public double berechneFlaeche() {
		return (double) laenge * getBreite();
	}
	
	public double berechneUmfang() {
		return 2 * (laenge + getBreite());
	}
}
