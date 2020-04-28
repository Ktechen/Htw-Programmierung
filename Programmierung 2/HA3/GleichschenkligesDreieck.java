package HA3;

public class GleichschenkligesDreieck extends Dreieck implements GeometrieMath {

	public GleichschenkligesDreieck(int a, int b, Punkt anker) {
		super(a, b, anker);
	}

	public double berechneFlaeche() {
		return (double) getB() / 4 * Math.sqrt(4 * Math.pow(getA(), 2) - Math.pow(getB(), 2));
	}

	public double berechneUmfang() {
		return ((double) 2 * getA() + getB());
	}
	
	public String toString() {
		return "Fläche: " + berechneFlaeche() + " Umfang :" + berechneUmfang();
	}

}
