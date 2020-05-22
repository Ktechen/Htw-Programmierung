package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Matrizen.Matrix;

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
	 * Normalfall Matrix A.length[2] != B.length[2]
	 */
	@Test
	public void EqualsIsNotSameLengthPart1() {
		int[][] matrixArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8 } };
		int[][] matrixArr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		Matrix matrix = new Matrix(matrixArr);

		assertFalse(matrix.equals(matrixArr1));
	}

	/*
	 * Normalfall Matrix A.length[1] != B.length[1]
	 */
	@Test
	public void EqualsIsNotSameLengthPart2() {
		int[][] matrixArr = { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9 } };
		int[][] matrixArr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		Matrix matrix = new Matrix(matrixArr);

		assertFalse(matrix.equals(matrixArr1));
	}

	/*
	 * Normalfall Matrix A.length[0] != B.length[0]
	 */
	@Test
	public void EqualsIsNotSameLengthPart3() {
		int[][] matrixArr = { { 1, 2 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] matrixArr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		Matrix matrix = new Matrix(matrixArr);

		assertFalse(matrix.equals(matrixArr1));
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
	 * Normalfall 2 + 2 = 4; :) Addieren von zwei Matrizen
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
	 * Fehlerfall Voraussetzung für die Addition von Matrizen wird nicht erfüllt
	 */
	@Test(expected = IllegalArgumentException.class)
	public void addNoEqualsMatrix() {
		int[][] matrixArr = { { 2, 2 }, { 2, 2 }, { 2, 2 } };
		int[][] matrixArrAdd = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };

		Matrix matrix = new Matrix(matrixArr);

		matrix.add(matrixArrAdd);
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
	 * Normalfall Multiplizieren mit eine Scalar
	 */
	@Test
	public void multiplyScalar() {
		int[][] matrixArr = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		Matrix matrix = new Matrix(matrixArr);

		int[][] matrixArrCheck = { { 4, 4, 4 }, { 4, 4, 4 }, { 4, 4, 4 } };

		assertArrayEquals(matrix.multiplyScalar(2), matrixArrCheck);
	}

	/*
	 * Normalfall Multiplizieren mit einen anderen Array
	 */
	@Test
	public void multiply() {
		int[][] matrixArr = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		int[][] matrixArrMulti = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		Matrix matrix = new Matrix(matrixArr);

		int[][] matrixArrCheck = { { 4, 4, 4 }, { 4, 4, 4 }, { 4, 4, 4 } };

		assertArrayEquals(matrix.muliply(matrixArrMulti), matrixArrCheck);
	}

	/*
	 * Worstcase Es wird eine Null Array übergeben
	 */
	@Test(expected = NullPointerException.class)
	public void multiplyIsNull() {
		int[][] matrixArr = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		Matrix matrix = new Matrix(matrixArr);

		int[][] matrixArrMulti = null;
		matrix.muliply(matrixArrMulti);
	}

	/*
	 * Badcase A(6,3) B(2,4) 3 != 2
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void multiplyIsLengthNotEquals() {

		int[][] matrixArr = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
		Matrix matrix = new Matrix(matrixArr);

		int[][] matrixArrMulti = { { 2, 2 }, { 2, 2 }, { 2, 2 } };

		matrix.muliply(matrixArrMulti);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void multiplyWithNoEqualsSize() {
		int[][] matrixArr = { { 2, 2 }, { 2 }, { 2 } };

		Matrix matrix = new Matrix(matrixArr);

		int[][] matrixArrMulti = { { 2, 2 }, { 2, 2 }, { 2, 2 } };

		int[][] test = matrix.muliply(matrixArrMulti);

	}

}
