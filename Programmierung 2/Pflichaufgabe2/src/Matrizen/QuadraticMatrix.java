package Matrizen;

public class QuadraticMatrix extends Matrix {

	public QuadraticMatrix(int[][] matrix) throws IllegalArgumentException {
		super(matrix);

		if (matrix.length != minColums(matrix)) {
			throw new IllegalArgumentException("Die Matrix ist nicht Quadratisch");
		}
	}

	private int minColums(int[][] matrix) throws IllegalArgumentException {

		int length = 0;
		int checkLength = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int e = 0; e < matrix[i].length; e++) {
				
				length = matrix[i].length;
				
				if (length > checkLength) {
					checkLength = length;
				} else if (length == checkLength) {
					checkLength = length;
				} else {
					throw new IllegalArgumentException("Die Matrix ist nicht Quadratisch");
				}
			}
		}

		return length;
	}

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
