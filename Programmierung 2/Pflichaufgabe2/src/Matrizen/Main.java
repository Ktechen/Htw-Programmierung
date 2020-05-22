package Matrizen;


public class Main {

	public static void main(String[] args) {
		int[][] value1 = { { 1, 0, 0, 0, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 1 } };

		int[][] value0 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] value2 = { { 1 }, { 4, 5 }, { 7, 8 } };

		int[][] vector1 = { { 1, 2, 3 } };

		Matrix vector = new Vector(vector1);
		
		System.out.println(vector.toString());
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
