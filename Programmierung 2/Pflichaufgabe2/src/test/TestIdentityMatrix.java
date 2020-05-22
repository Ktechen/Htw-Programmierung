package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import Matrizen.IdentityMatrix;

public class TestIdentityMatrix {

	/*
	 * Normalfall Erstellen einer { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } } Matrix
	 */
	@Test
	public void createIdentityMatrix() {

		int[][] matrix = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		IdentityMatrix identityMatrix = new IdentityMatrix(matrix);

		assertArrayEquals(identityMatrix.getMatrix(), matrix);
	}

	/*
	 * Worstcase call NullpointerException
	 */
	@Test(expected = NullPointerException.class)
	public void createIdentityNullMatrix() {

		int[][] matrix = null;

		IdentityMatrix identityMatrix = new IdentityMatrix(matrix);
	}

	/*
	 * Erstellen einer nicht Einheitsmatrix Worstecase call exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void createNoIdentityMatrixPart1() {

		int[][] matrix = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		IdentityMatrix identityMatrix = new IdentityMatrix(matrix);

	}

	/*
	 * Erstellen einer nicht Einheitsmatrix Worstecase call exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void createNoIdentityMatrixPart2() {

		int[][] matrix = { { 1, 0, 1 }, { 0, 0, 0 }, { 0, 0, 1 } };

		IdentityMatrix identityMatrix = new IdentityMatrix(matrix);

	}

	/*
	 * Erstellen einer nicht Einheitsmatrix Worstecase call exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void createNoIdentityMatrixPart3() {

		int[][] matrix = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };

		IdentityMatrix identityMatrix = new IdentityMatrix(matrix);

	}

	/*
	 * Erstellen einer nicht Einheitsmatrix Worstecase call exception
	 */
	@Test(expected = IllegalArgumentException.class)
	public void createNoIdentityMatrixPart4() {

		int[][] matrix = { { 2, 3, 4 }, { 0, 1, 2 }, { 0, 0, 0 } };

		IdentityMatrix identityMatrix = new IdentityMatrix(matrix);

	}

}
