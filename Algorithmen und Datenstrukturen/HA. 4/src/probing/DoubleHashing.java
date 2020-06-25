package probing;

public class DoubleHashing implements IProbing {

	private int m2;

	public DoubleHashing(int m2) {
		super();
		this.m2 = m2;
	}

	@Override
	public int probe(int key, int j) {
		return j * (1 + Math.floorMod(key, m2));
	}

	@Override
	public String toString() {
		return "DoubleHashing";
	}

}
