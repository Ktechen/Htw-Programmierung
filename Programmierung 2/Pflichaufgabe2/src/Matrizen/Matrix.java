package Matrizen;

public class Matrix {

	private int matrix[][] = null;
	private int rows = 0; // zeilen
	private int colums = 0; // spalten
	private int dimension = 0;

	public Matrix(int[][] matrix) throws NullPointerException {
		super();

		if (matrix == null || matrix.length == 0) {
			throw new NullPointerException("Matrix is null or 0");
		}

		this.matrix = matrix;
		this.rows = matrix.length;
		this.colums = columsLength(matrix);
		this.dimension = dimensionLength();
	}

	public Matrix() {
		super();
		this.rows = 2;
		this.colums = 2;
		this.dimension = 2;
		this.matrix = new int[][] { { 1, 2 }, { 3, 4 } };
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int matrix[][]) {
		this.matrix = matrix;
	}

	public int getRows() {
		return rows;
	}

	public int getColums() {
		return colums;
	}

	public int getDimension() {
		return dimension;
	}

	/*
	 * Gibt die Dimension der Matrix zurück return dimension
	 */
	public int dimensionLength() {
		if (rows == colums) {
			return this.dimension = rows;
		} else if (rows < colums) {
			return this.dimension = colums;
		} else {
			return this.dimension = rows;
		}
	}

	/*
	 * Gibt die Länge der Spalten zurück return length
	 */
	public int columsLength(int[][] matrix) throws NullPointerException {

		if (matrix == null || matrix.length == 0) {
			throw new NullPointerException("Matrix null or 0");
		}

		int length = 0;
		int checkValue = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int e = 0; e < matrix[i].length; e++) {
				checkValue = matrix[i].length;
				if (checkValue > length) {
					length = checkValue;
				}
			}
		}

		return length;
	}

	/*
	 * Prüft ob zwei Matrizen gleich sind return boolean
	 */
	public boolean equals(int[][] matrix) throws NullPointerException {

		if (matrix == null || matrix.length == 0) {
			throw new NullPointerException("Matrix null or 0");
		}

		int[][] currentMatrix = getMatrix();

		// Prüfung der Zeilen length
		if (currentMatrix.length != matrix.length) {
			return false;
		}

		// Prüfung der Spalten length
		for (int i = 0; i < currentMatrix.length; i++) {
			if (currentMatrix[i].length != matrix[i].length) {
				return false;
			}
		}

		int counter = 0;

		// Prüfung der Elemente
		for (int i = 0; i < currentMatrix.length; i++) {
			for (int e = 0; e < currentMatrix[i].length; e++) {
				if (currentMatrix[i][e] == matrix[i][e]) {
					counter++;

					if (counter == (currentMatrix.length * matrix.length)) {
						return true;
					}

				} else {
					return false;
				}
			}
		}

		return false;
	}

	/*
	 * Addiert zwei Matrizen miteinander return new Matrix
	 */
	public int[][] add(int[][] matrix) throws NullPointerException, ArrayIndexOutOfBoundsException {

		int[][] currentMatrix = getMatrix();

		if (matrix == null || matrix.length == 0) {
			throw new NullPointerException("matrix a or b is null");
		}

		if (getRows() != matrix.length) {
			throw new ArrayIndexOutOfBoundsException("Matrix A und B müssen die Gleich Zeilen length haben");
		}

		if (getColums() != columsLength(matrix)) {
			throw new ArrayIndexOutOfBoundsException("Matrix A und B müssen die Gleich Spalten length haben");
		}

		int[][] newArray = new int[currentMatrix.length][columsLength(currentMatrix)];

		for (int i = 0; i < currentMatrix.length; i++) {
			for (int e = 0; e < currentMatrix[i].length; e++) {
				newArray[i][e] = currentMatrix[i][e] + matrix[i][e];
			}
		}

		return newArray;
	}

	/*
	 * Multipiziert eine Matrix mit einen Scalar return new Matrix return new Matrix
	 */
	public int[][] multiplyScalar(int scalar) {

		int[][] currentMatrix = getMatrix();

		int[][] newArray = new int[currentMatrix.length][columsLength(currentMatrix)];

		for (int i = 0; i < currentMatrix.length; i++) {
			for (int e = 0; e < currentMatrix[i].length; e++) {
				newArray[i][e] = currentMatrix[i][e] * scalar;
			}
		}

		return newArray;
	}

	/*
	 * Multipiziert zwei Matrizen miteinander return new Matrix
	 */
	public int[][] muliply(int[][] matrix) throws NullPointerException, ArrayIndexOutOfBoundsException {

		int[][] currentMatrix = getMatrix();

		if (matrix == null || matrix.length == 0) {
			throw new NullPointerException("matrix a or b is null");
		}

		if (getColums() != matrix.length) {
			throw new ArrayIndexOutOfBoundsException("Matrix A: " + getColums()
					+ " Zeilen length ist ungleich Matrix B: " + matrix.length + " Zeilen length ");
		}

		int[][] newArray = new int[currentMatrix.length][];

		for (int i = 0; i < currentMatrix.length; i++) {
			for (int e = 0; e < currentMatrix[i].length; e++) {
				newArray[i][e] = currentMatrix[i][e] * matrix[i][e];
			}
		}

		return newArray;
	}

	public String MatrixToString(int[][] matrix) throws NullPointerException {

		if (matrix == null || matrix.length == 0) {
			throw new NullPointerException("matrix a or b is null");
		}

		String text = "";

		for (int i = 0; i < matrix.length; i++) {
			for (int e = 0; e < matrix[i].length; e++) {
				text += " [" + matrix[i][e] + "] ";
			}
		}

		return text;
	}

	@Override
	public String toString() {
		return "Matrix [matrix=" + MatrixToString(matrix) + ",\n" + " rows=" + rows + ", colums=" + colums
				+ ", dimension=" + dimension + "]";
	}

}
