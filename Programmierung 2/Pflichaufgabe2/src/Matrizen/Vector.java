package Matrizen;

public class Vector extends Matrix {

	private int[] vector = null;

	public Vector(int[][] matrix) {
		super(matrix);

		for (int i = 1; i < matrix.length; i++) {
			for (int e = 0; e < matrix[i].length; e++) {
				if (matrix[i][e] != 0) {
					throw new IllegalArgumentException(
							"Es wurde keine Vector erstellt");
				}
			}
		}

		this.vector = convertToVector(matrix);
		setNameOfMatrix(Vector.class.getSimpleName());
	}

	public Vector(int[] vector) {
		super();

		if (vector == null || vector.length == 0) {
			throw new NullPointerException("Vector is null or 0");
		}

		this.vector = vector;
		setNameOfMatrix(Vector.class.getSimpleName());
	}

	public Vector() {
		super();
		this.vector = new int[] { 1, 2, 3 };
		setNameOfMatrix(Vector.class.getSimpleName());
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}

	/*
	 * Erstelle ein 1D aus einen 2D
	 */
	private int[] convertToVector(int[][] matrix) {

		int[] newVector = new int[matrix[0].length];

		for (int i = 0; i < matrix[0].length; i++) {
			newVector[i] = matrix[0][i];
		}

		return newVector;
	}

	/*
	 * Berechne denn Beitrag
	 */
	public double length() {

		double value = 0;

		if (getVector().length == 1) {
			return vector[0];
		}

		for (int i = 0; i < vector.length; i++) {
			value += Math.pow(vector[i], 2);
		}

		return Math.sqrt(value);
	}

	/*
	 * Print Vector
	 */
	public String vectorToString(int[] vector) {
		String text = "";

		for (int i = 0; i < vector.length; i++) {
			text += " [" + vector[i] + "] ";
		}

		return text;
	}

	@Override
	public String toString() {
		return getNameOfMatrix() + vectorToString(vector) + "\n" + "[parameter: rows=" + getRows() + ", colums=" + getColums()
				+ ", dimension=" + getDimension() + "]\n";
	}

}
