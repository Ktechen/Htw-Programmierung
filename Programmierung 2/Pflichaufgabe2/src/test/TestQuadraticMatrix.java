package test;

import org.junit.Test;

import Matrizen.QuadraticMatrix;

public class TestQuadraticMatrix {

	@Test
	public void createQuadraticMatrix() {

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		QuadraticMatrix Qmatrix = new QuadraticMatrix(matrix);
	}


}
