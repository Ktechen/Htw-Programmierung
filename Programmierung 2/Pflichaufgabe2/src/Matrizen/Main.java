package Matrizen;

public class Main {

	public static void main(String[] args) {
		int[][] value1 = { { 1, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 1 } };

		int[][] value0 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] value2 = { { 1 }, { 4, 5 }, { 7, 8 } };

		int[][] vector1 = { { 1, 2, 3 } };

		int[][][] run = { value0, value1, value2 };

		try {
			Matrix matrix = new Matrix(value2);
			Matrix matrix1 = new QuadraticMatrix(value0);
			Matrix matrix2 = new IdentityMatrix(value1);
			Matrix vector = new Vector(vector1);
			
			System.out.println(matrix.toString());
			System.out.println(matrix1.toString());
			System.out.println(matrix2.toString());
			System.out.println(vector.toString());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}


	}
}
