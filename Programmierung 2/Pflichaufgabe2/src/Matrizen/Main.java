package Matrizen;


public class Main {

	public static void main(String[] args) {
		int[][] value1 = { { 1, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 1 } };

		int[][] value0 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] value2 = { { 1 }, { 4, 5 }, { 7, 8 } };

		int[][] vector1 = { { 1, 2, 3 } };

		int[][][] run = { value0, value1, value2 };

		Matrix matrix = new Matrix(value2);
		Matrix matrix0 = new Matrix(value0);
		Matrix matrix1 = new QuadraticMatrix(value0);
		Matrix matrix2 = new IdentityMatrix(value1);
		Matrix vector = new Vector(vector1);
		
		Matrix matrix3 = new QuadraticMatrix();
		
		System.out.println(matrix3.toString());

		vector.setMatrix(value0);
		matrix1.setMatrix(value2);
		
		System.out.println(vector.toString());
		System.out.println(matrix1.toString());
		
		/*
		print(matrix0);
		muliply(matrix, matrix0.getMatrix());

		print(matrix0);
		print(matrix1);
		print(matrix2);
		print(vector);
		*/
	}

	private static void print(Matrix matrix) {
		System.out.println("Name: " + matrix.getNameOfMatrix());
		System.out.println("Rows: " + matrix.getRows() + " : Colums:" + matrix.getColums());
		System.out.println();
	}

	private static void muliply(Matrix matrix, int[][] addToMatrix) {
		print(matrix);

		try {

			int[][] test = matrix.muliply(addToMatrix);

			for (int i = 0; i < test.length; i++) {
				for (int j = 0; j < test[i].length; j++) {
					System.out.print(test[i][j] + " ");
				}
				System.out.println();
			}

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
