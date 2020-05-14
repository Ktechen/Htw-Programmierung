
public class Matrix {

	private int dimension = 0;
	private int spalten = 0;
	private int zeilen = 0;
	private int[][] array = null;

	public Matrix(int dimension, int spalten, int zeilen) {
		super();

		if (dimension <= 0 && dimension >= 4) {
			throw new IllegalArgumentException("Dimension is unknown");
		}

		if (spalten == 0 || zeilen == 0) {
			throw new IllegalArgumentException("Zeile oder Spalte ist null");
		}

		if (dimension < zeilen) {
			throw new IllegalArgumentException("spalten x zeilen ist ungleich Dimension");
		}

		this.dimension = dimension;
		this.spalten = spalten;
		this.zeilen = zeilen;

	}
	
	public Matrix(int dimension, int spalten) {
		if (dimension >= 0) {
			throw new IllegalArgumentException("Only for Vector");
		}

		this.dimension = dimension;
		this.spalten = spalten;
	}

	public Matrix() {
		super();
		this.dimension = 1;
		this.spalten = 0;
		this.zeilen = 0;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public int getSpalten() {
		return spalten;
	}

	public void setSpalten(int spalten) {
		this.spalten = spalten;
	}

	public int getZeilen() {
		return zeilen;
	}

	public void setZeilen(int zeilen) {
		this.zeilen = zeilen;
	}

	public int[][] getArray() {
		return defaultMatrix();
	}

	public void setArray(int[][] array) {
		this.array = array;
	}
	
	/*
	 * fill all element of Matrix in 0
	 */
	private int[][] defaultMatrix(){
		int[][] array = new int[spalten][zeilen];
		
		for (int i = 0; i < array.length; i++) {
			for (int e = 0; e < array[i].length; e++) {
				array[i][e] = 0;
			}
		}
		
		return array;
	}

	public boolean equals(int[][] matrixA, int[][] matrixB) {

		if (matrixA == null || matrixB == null) {
			return false;
		}

		if (matrixA.length != matrixB.length) {
			return false;
		}

		for (int i = 0; i < matrixA.length; i++) {
			if (matrixA[i].length != matrixB[i].length) {
				return false;
			}
		}

		int counter = 0;

		for (int i = 0; i < matrixA.length; i++) {
			for (int e = 0; e < matrixA[i].length; e++) {
				if (matrixA[i][e] == matrixB[i][e]) {
					counter++;

					if (counter == (matrixA.length * matrixB.length)) {
						return true;
					}

				} else {
					return false;
				}
			}
		}

		return false;
	}

	public static int[][] add(int[][] matrixA, int[][] matrixB) throws NullPointerException, IllegalArgumentException {

		if (matrixA == null || matrixB == null) {
			throw new NullPointerException("matrix a or b is null");
		}

		if (matrixA.length != matrixB.length) {
			throw new IllegalArgumentException("matrixA ist ungleich matrixB");
		}

		for (int i = 0; i < matrixA.length; i++) {
			if (matrixA[i].length != matrixB[i].length) {
				throw new IllegalArgumentException("matrixA ist ungleich matrixB");
			}
		}

		int[][] newArray = new int[matrixA.length][matrixA[0].length];

		for (int i = 0; i < matrixA.length; i++) {
			for (int e = 0; e < matrixA[i].length; e++) {
				newArray[i][e] = matrixA[i][e] + matrixB[i][e];
			}
		}

		return newArray;

	}

	public static int multiplyScalar(int[][] matrixA, int[][] matrixB) {
		return 0;
	}

	public static int[][] multiply(int[][] matrixA, int[][] matrixB) {
		if (matrixA == null || matrixB == null) {
			throw new NullPointerException("matrix a or b is null");
		}

		if (matrixA.length != matrixB.length) {
			throw new IllegalArgumentException("matrixA ist ungleich matrixB");
		}

		for (int i = 0; i < matrixA.length; i++) {
			if (matrixA[i].length != matrixB[i].length) {
				throw new IllegalArgumentException("matrixA ist ungleich matrixB");
			}
		}

		int[][] newArray = new int[matrixA.length][matrixA[0].length];

		for (int i = 0; i < matrixA.length; i++) {
			for (int e = 0; e < matrixA[i].length; e++) {
				newArray[i][e] = matrixA[i][e] * matrixB[i][e];
			}
		}

		return newArray;
	}

	private String arrayToString(int[] array) {

		if (array != null && array.length != 0) {
			return null;
		}

		String elem = "";

		for (int i = 0; i < array.length; i++) {
			elem += array[i] + " ";
		}

		return elem;
	}

	private String arrayToString(int[][] array) {

		if (array != null && array.length != 0) {
			return null;
		}

		String elem = "";

		for (int i = 0; i < array.length; i++) {

			for (int e = 0; e < array[i].length; e++) {
				elem += array[i][e] + " ";
			}

		}

		return elem;
	}

	@Override
	public String toString() {
		return "Matrix [dimension=" + dimension + ", spalten=" + spalten + ", zeilen=" + zeilen + "]";
	}

}
