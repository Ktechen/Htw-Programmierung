package test;

import static org.junit.Assert.assertArrayEquals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Matrizen.QuadraticMatrix;

/**
 * 
 * @author Kevin Techen 0573111
 *
 */
public class TestQuadraticMatrix {

	/*
	 * Normalfall Erstellen einer Quadratmatrix
	 */
	@Test
	public void createQuadraticMatrix() {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		QuadraticMatrix Qmatrix = new QuadraticMatrix(matrix);
	}

	/*
	 * 
	 * Es fehlt eine Element in einer Reihe
	 */
	@Test(expected = IllegalArgumentException.class)
	public void createNoQuadraticMatrixPart1() {

		int[][] matrix = { { 1, 2 }, { 4, 5, 6 }, { 7, 8, 9 } };

		QuadraticMatrix Qmatrix = new QuadraticMatrix(matrix);
	}

	/*
	 * 
	 * Es fehlt eine Element in einer Reihe
	 */
	@Test(expected = IllegalArgumentException.class)
	public void createNoQuadraticMatrixPart2() {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5 }, { 7, 8, 9 } };

		QuadraticMatrix Qmatrix = new QuadraticMatrix(matrix);
	}

	/*
	 * 
	 * Es fehlt eine Element in einer Reihe
	 */
	@Test(expected = IllegalArgumentException.class)
	public void createNoQuadraticMatrixPart3() {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8 } };

		QuadraticMatrix Qmatrix = new QuadraticMatrix(matrix);
	}

	/*
	 * Worstcase Call NullPointerException
	 */
	@Test(expected = NullPointerException.class)
	public void QuadraticMatrixIsNull() {
		int[][] matrix = null;

		QuadraticMatrix Qmatrix = new QuadraticMatrix(matrix);
	}

	/*
	 * Normalfall Matrix wurde Potenziert
	 */
	@Test
	public void pow() {
		int[][] matrix = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };

		QuadraticMatrix Qmatrix = new QuadraticMatrix(matrix);

		int[][] test = Qmatrix.pow(2);
		int[][] test1 = { { 4, 4, 4 }, { 4, 4, 4 }, { 4, 4, 4 } };

		assertArrayEquals(test, test1);
	}

	/*
	 * Normalfall erstellt die Einheitsmatrix
	 */
	@Test
	public void powIs0() {
		int[][] matrix = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };

		QuadraticMatrix Qmatrix = new QuadraticMatrix(matrix);

		int[][] test = Qmatrix.pow(0);
		int[][] test1 = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		assertArrayEquals(test, test1);
	}

	/*
	 * Worstcase methode pow wird ein negativen werden übergeben
	 */
	@Test(expected = IllegalArgumentException.class)
	public void powIsNegative() {
		int[][] matrix = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };

		QuadraticMatrix Qmatrix = new QuadraticMatrix(matrix);

		int[][] test = Qmatrix.pow(-2);
		int[][] test1 = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

	}
}
