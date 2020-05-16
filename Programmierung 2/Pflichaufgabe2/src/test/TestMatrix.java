package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Matrizen.Matrix;
import Matrizen.QuadraticMatrix;

public class TestMatrix {

	@Test
	public void createMatrix() {

		int[][] matrixArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Matrix matrix = new Matrix(matrixArr);

		assertNotNull(matrix);
	}

	@Test
	public void createDefaultMatrix() {

		Matrix matrix = new Matrix();

		int[][] arr = matrix.getMatrix();

		assertEquals(arr[0][0], 1);
	}

	@Test
	public void getSpalte() {

		int[][] matrixArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Matrix matrix = new Matrix(matrixArr);

		assertEquals(matrix.getColums(), 3);
	}

	@Test
	public void getZeile() {

		int[][] matrixArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Matrix matrix = new Matrix(matrixArr);

		assertEquals(matrix.getRows(), 3);
	}

	@Test
	public void getDimension() {

		int[][] matrixArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		Matrix matrix = new Matrix(matrixArr);

		assertEquals(matrix.getDimension(), 3);
	}

	@Test(expected = NullPointerException.class)
	public void createMatrixCallException() {
		int[][] matrix = null;

		Matrix m = new Matrix(matrix);
	}

	/*
	 * Normalfall is equals Bestcase
	 */
	@Test
	public void equals() {

		int[][] matrixArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrixArr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		Matrix matrix = new Matrix(matrixArr);

		assertTrue(matrix.equals(matrixArr1));
	}

	/*
	 * Normalfall Is not Equals
	 * 
	 */
	@Test
	public void IsNotEquals() {

		int[][] matrixArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrixArr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 7, 7 } };
		Matrix matrix = new Matrix(matrixArr);

		assertFalse(matrix.equals(matrixArr1));
	}

	/*
	 * Worstcase value is null Call NullpointerException
	 */
	@Test(expected = NullPointerException.class)
	public void IsEqualsNull() {

		int[][] matrixArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrixArr1 = null;
		Matrix matrix = new Matrix(matrixArr);
		matrix.equals(matrixArr1);
	}

	/*
	 * Normalfall 2 + 2 = 4; :)
	 */
	@Test
	public void add() {

		int[][] matrixArr = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		int[][] matrixArrAdd = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		int[][] actuals = { { 4, 4, 4 }, { 4, 4, 4 }, { 4, 4, 4 } };
		Matrix matrix = new Matrix(matrixArr);

		int[][] expecteds = matrix.add(matrixArrAdd);

		assertArrayEquals(expecteds, actuals);
	}

	/*
	 * Worstcase Call NullpointerException
	 */
	@Test(expected = NullPointerException.class)
	public void addNull() {

		int[][] matrixArr = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		int[][] matrixArrAdd = null;
		int[][] actuals = { { 4, 4, 4 }, { 4, 4, 4 }, { 4, 4, 4 } };
		Matrix matrix = new Matrix(matrixArr);

		int[][] expecteds = matrix.add(matrixArrAdd);

	}

	/*
	 * Worstcase Call NullpointerException
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void addNotSameMatrixLength() {

		int[][] matrixArr = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		int[][] matrixArrAdd = { { 2, 2, 2 }, { 2, 2 }, { 3, 3, 3 } };
		Matrix matrix = new Matrix(matrixArr);

		matrix.add(matrixArrAdd);

	}

	/*
	 * Normalfall Create eine Normale Matrix
	 */
	@Test
	public void createQuadratic() {
		int[][] matrix = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		QuadraticMatrix quadraticMatrix = new QuadraticMatrix(matrix);
	}

	/*
	 * Worstecase Call IllegalArgumentException
	 */
	@Test(expected = IllegalArgumentException.class)
	public void createNoQuadraticStartOfArray() {
		int[][] matrix = { { 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		QuadraticMatrix quadraticMatrix = new QuadraticMatrix(matrix);
	}

	/*
	 * Worstecase Call IllegalArgumentException
	 */
	@Test(expected = IllegalArgumentException.class)
	public void createNoQuadraticMidOfArray() {
		int[][] matrix = { { 2, 2, 2 }, { 2, 2 }, { 2, 2, 2 } };
		QuadraticMatrix quadraticMatrix = new QuadraticMatrix(matrix);
	}

	/*
	 * Worstecase Call IllegalArgumentException
	 */
	@Test(expected = IllegalArgumentException.class)
	public void createNoQuadraticEndOfArray() {
		int[][] matrix = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2 } };
		QuadraticMatrix quadraticMatrix = new QuadraticMatrix(matrix);
	}

}
