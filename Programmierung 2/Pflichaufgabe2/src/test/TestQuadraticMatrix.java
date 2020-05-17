package test;

import org.junit.Test;

import Matrizen.QuadraticMatrix;

public class TestQuadraticMatrix {

	/*
	 * Normalfall 
	 * Erstellen einer Quadratmatrix
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
	 * Worstcase
	 * Call NullPointerException
	 */
	@Test(expected = NullPointerException.class)
	public void QuadraticMatrixIsNull() {
		int[][] matrix = null;

		QuadraticMatrix Qmatrix = new QuadraticMatrix(matrix);
	}
	
	
}
