package test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import Matrizen.IdentityMatrix;

public class TestIdentityMatrix {

	@Test
	public void createIdentityMatrix() {

		int[][] matrix = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		IdentityMatrix identityMatrix = new IdentityMatrix(matrix);
		
		assertArrayEquals(identityMatrix.getMatrix(), matrix);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createNoIdentityMatrixPart1() {

		int[][] matrix = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		IdentityMatrix identityMatrix = new IdentityMatrix(matrix);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createNoIdentityMatrixPart2() {

		int[][] matrix = { { 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };

		IdentityMatrix identityMatrix = new IdentityMatrix(matrix);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createNoIdentityMatrixPart3() {

		int[][] matrix = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };

		IdentityMatrix identityMatrix = new IdentityMatrix(matrix);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void createNoIdentityMatrixPart4() {

		int[][] matrix = { { 2, 3, 4 }, { 0, 1, 2 }, { 0, 0, 0 } };

		IdentityMatrix identityMatrix = new IdentityMatrix(matrix);
		
	}

}
