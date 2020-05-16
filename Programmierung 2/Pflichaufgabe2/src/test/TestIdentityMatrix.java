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
	public void createNoIdentityMatrix() {

		int[][] matrix = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		IdentityMatrix identityMatrix = new IdentityMatrix(matrix);
		
	}

}
