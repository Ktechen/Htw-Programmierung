package hash;

public class Hash implements IHash {

	private int size;
	
	public Hash(int size) {
		super();
		this.size = size;
	}

	@Override
	public int hash(int key) {
		return Math.floorMod(key, size);
	}

	@Override
	public String toString() {
		return "Hash";
	}
}
