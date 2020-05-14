
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMatrix {

	/*
	 * Bestcase Normalfall
	 * 
	 */
	@Test
	public void equals() {
		Matrix matrix = new Matrix();

		int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrixB = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };


		assertTrue(matrix.equals(matrixA, matrixB));
	}
	
	@Test
	public void notEquals() {
		Matrix matrix = new Matrix();

		int[][] matrixA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrixB = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8 } };
		
		assertFalse(matrix.equals(matrixA, matrixB));
		
	}
	
	@Test
	public void createMatrix() {
		Matrix matrix = new Matrix(3, 3, 3);

		
		int[][] test = matrix.getArray();
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + " ");
			}
			System.out.println();
		}

	}

}
