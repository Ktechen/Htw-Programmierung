package Matrizen;

public class IdentityMatrix extends QuadraticMatrix {

	public IdentityMatrix(int[][] matrix) {
		super(matrix);

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][i] != 1) {
				throw new IllegalArgumentException("Es besteht keine Einheitsmatrix");
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int e = 0; e < matrix[i].length; e++) {
				if (!(matrix[i][e] == 0 || matrix[i][e] == 1 && (i + e) % 2 == 0)) {
					throw new IllegalArgumentException("Es besteht keine Einheitsmatrix");
				}
			}
		}
	}

	@Override
	public String toString() {
		return MatrixToString(getMatrix());
	}

	/*
	 * 
	 * @ ---------
	 * 
	 * @ | 1 0 0 |
	 * 
	 * @ | 0 1 0 |
	 * 
	 * @ | 0 0 1 |
	 * 
	 * @ ---------
	 */

}
