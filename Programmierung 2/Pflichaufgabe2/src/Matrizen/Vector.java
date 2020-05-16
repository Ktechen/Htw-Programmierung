package Matrizen;

public class Vector extends Matrix {

	private int[] vector = null;

	public Vector(int[] vector) {
		super();

		this.vector = vector;
	}

	public Vector() {
		super();
		this.vector = new int[] { 1, 2, 3 };
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	public int length() {

		int value = 0;

		if (getVector().length == 1) {
			return vector[0];
		}

		for (int i = 0; i < vector.length; i++) {
			value += (int) Math.pow(vector[i], 2);
		}

		return (int) Math.sqrt(value);

	}

	private String vectorToString(int[] vector) {
		String text = " [ ";

		for (int i = 0; i < vector.length; i++) {
			text += vector[i];
		}

		return text + " ] ";
	}

	@Override
	public String toString() {
		return "Vector [vector=" + vectorToString(vector) + "]";
	}

}
