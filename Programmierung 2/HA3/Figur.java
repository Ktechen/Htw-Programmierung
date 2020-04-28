package HA3;

public class Figur {

	private Punkt anker;
	
	public Figur (Punkt anker) {
		this.anker = anker;
	}
	
	public void setAnker(Punkt anker) {
		this.anker = anker;
	}

	public Punkt getAnker() {
		return anker;
	}

	public void verschieberAnker(int x, int y) {
		anker.verschiebe(x, y);
	}
}
