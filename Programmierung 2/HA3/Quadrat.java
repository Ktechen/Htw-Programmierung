package HA3;

public class Quadrat extends Figur implements GeometrieMath{

	private int breite;
	
	public int getBreite() {
		return breite;
	}

	public Quadrat(int breite, Punkt anker) {
		super(anker);
		this.breite = breite;
	}

	public double berechneFlaeche() {
		return (double) Math.pow(breite, 2);
	}
	
	public double berechneUmfang() {
		return 4 * breite;
	}
}
