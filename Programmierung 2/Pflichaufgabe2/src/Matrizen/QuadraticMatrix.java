package Matrizen;

public class QuadraticMatrix extends Matrix {

	public QuadraticMatrix(int[][] matrix) {
		super(matrix);

		if (matrix.length != minColums(matrix)) {
			throw new IllegalArgumentException("Die Matrix ist nicht Quadratisch");
		}

		setNameOfMatrix(QuadraticMatrix.class.getSimpleName());
	}

	public QuadraticMatrix() {
		super();

		setMatrix(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } });

		setNameOfMatrix(QuadraticMatrix.class.getSimpleName());
	}

	/*
	 * Gibt denn kleinsten Zeilenwert zurück
	 * 
	 */
	private int minColums(int[][] matrix) throws IllegalArgumentException, NullPointerException {

		if (matrix == null || matrix.length == 0) {
			throw new NullPointerException("Matrix is null or 0");
		}

		int length = 0;
		int counter = 0;

		while (counter < matrix.length) {
			length = matrix[0].length;

			if (length != matrix[counter].length) {
				throw new IllegalArgumentException("Matrix ist nicht Quadratisch");
			}

			counter++;
		}

		return length;
	}

	/*
	 * Potenziert eine Matrize
	 */
	public int[][] pow(int n) {

		int[][] matrix = super.getMatrix();
		int[][] newMatrix = new int[super.getRows()][super.getColums()];

		for (int i = 0; i < matrix.length; i++) {
			for (int e = 0; e < matrix[i].length; e++) {
				newMatrix[i][e] = (int) Math.pow(matrix[i][e], n);
			}
		}

		return newMatrix;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
